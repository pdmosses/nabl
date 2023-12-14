---
title: stlc.stx
hide:
  - toc
---

# `stlc.stx`

:simple-github: [pdmosses/nabl/statix.example/src/stlc.stx]

[pdmosses/nabl/statix.example/src/stlc.stx]: https://github.com/pdmosses/nabl/blob/master/statix.example/src/stlc.stx "The source file on GitHub"

<div class="stx"><table class="highlighttable"><tbody><tr><td class="linenos"><div class="linenodiv"><pre><span></span>1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
30
31
32
33
34
35
36
37
38
39
40
41
42
43
44
45
46
47
48
49
50
51
52
53
54
55
56
57
58
59
60
61
62
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <span id="stlc_1_8" title="Not referenced"><span class="token sort_Id">stlc</span></span> <span class="layout">// Static semantics of Simply Typed Lambda Calculus</span>

<span class="keyword">signature</span>
  <span class="keyword">sorts</span> <span class="cons_SortAlias"><a href="#ID_8_15" id="ID_4_9" title="Referenced at line 8, 10, 11"><span class="token sort_Id">ID</span></a> <span class="operator">=</span> <span class="cons_StringSort">string</span></span>                         <span class="layout">// $x$</span>
  <span class="keyword">sorts</span> <span class="cons_SortDecl"><a href="#BinOp_9_21" id="BinOp_5_9" title="Referenced at line 9"><span class="token sort_Id">BinOp</span></a></span>                               <span class="layout">// $op$</span>

  <span class="keyword">sorts</span> <span class="cons_SortDecl"><a href="#Exp_8_21" id="Exp_7_9" title="Referenced at line 8, 9, 10, 11, 12, 34"><span class="token sort_Id">Exp</span></a></span> <span class="keyword">constructors</span>                    <span class="layout">// $e$ :=</span>
    <span class="cons_OpDecl"><a href="#Num_36_16" id="Num_8_5" title="Referenced at line 36"><span class="token sort_Id">Num</span></a>     <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#ID_4_9" id="ID_8_15" title="Defined at line 4"><span class="token sort_Id">ID</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#Exp_7_9" id="Exp_8_21" title="Defined at line 7"><span class="token sort_Id">Exp</span></a></span></span>                     <span class="layout">//      | $n$</span>
    <span class="cons_OpDecl"><a href="#BinExp_38_16" id="BinExp_9_5" title="Referenced at line 38"><span class="token sort_Id">BinExp</span></a>  <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#Exp_7_9" id="Exp_9_15" title="Defined at line 7"><span class="token sort_Id">Exp</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#BinOp_5_9" id="BinOp_9_21" title="Defined at line 5"><span class="token sort_Id">BinOp</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#Exp_7_9" id="Exp_9_29" title="Defined at line 7"><span class="token sort_Id">Exp</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#Exp_7_9" id="Exp_9_36" title="Defined at line 7"><span class="token sort_Id">Exp</span></a></span></span>      <span class="layout">//      | $e$ $\oplus$ $e$</span>
    <span class="cons_OpDecl"><a href="#Fun_42_16" id="Fun_10_5" title="Referenced at line 42"><span class="token sort_Id">Fun</span></a>     <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#ID_4_9" id="ID_10_15" title="Defined at line 4"><span class="token sort_Id">ID</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#TypeExp_14_9" id="TypeExp_10_20" title="Defined at line 14"><span class="token sort_Id">TypeExp</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#Exp_7_9" id="Exp_10_30" title="Defined at line 7"><span class="token sort_Id">Exp</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#Exp_7_9" id="Exp_10_37" title="Defined at line 7"><span class="token sort_Id">Exp</span></a></span></span>     <span class="layout">//      | fun ($x$ : $te$) { $e$ }</span>
    <span class="cons_OpDecl"><a href="#Var_48_16" id="Var_11_5" title="Referenced at line 48"><span class="token sort_Id">Var</span></a>     <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#ID_4_9" id="ID_11_15" title="Defined at line 4"><span class="token sort_Id">ID</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#Exp_7_9" id="Exp_11_21" title="Defined at line 7"><span class="token sort_Id">Exp</span></a></span></span>                     <span class="layout">//      | $x$</span>
    <span class="cons_OpDecl"><a href="#App_51_16" id="App_12_5" title="Referenced at line 51"><span class="token sort_Id">App</span></a>     <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#Exp_7_9" id="Exp_12_15" title="Defined at line 7"><span class="token sort_Id">Exp</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#Exp_7_9" id="Exp_12_21" title="Defined at line 7"><span class="token sort_Id">Exp</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#Exp_7_9" id="Exp_12_28" title="Defined at line 7"><span class="token sort_Id">Exp</span></a></span></span>              <span class="layout">//      | $e$ $e$</span>

  <span class="keyword">sorts</span> <span class="cons_SortDecl"><a href="#TypeExp_10_20" id="TypeExp_14_9" title="Referenced at line 10, 15, 16, 58"><span class="token sort_Id">TypeExp</span></a></span> <span class="keyword">constructors</span>                <span class="layout">// $te$ :=</span>
    <span class="cons_OpDecl"><a href="#NumType_60_20" id="NumType_15_5" title="Referenced at line 60"><span class="token sort_Id">NumType</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#TypeExp_14_9" id="TypeExp_15_15" title="Defined at line 14"><span class="token sort_Id">TypeExp</span></a></span></span>                       <span class="layout">//       | num</span>
    <span class="cons_OpDecl"><a href="#FunType_62_20" id="FunType_16_5" title="Referenced at line 62"><span class="token sort_Id">FunType</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#TypeExp_14_9" id="TypeExp_16_15" title="Defined at line 14"><span class="token sort_Id">TypeExp</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#TypeExp_14_9" id="TypeExp_16_25" title="Defined at line 14"><span class="token sort_Id">TypeExp</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#TypeExp_14_9" id="TypeExp_16_36" title="Defined at line 14"><span class="token sort_Id">TypeExp</span></a></span></span>  <span class="layout">//       | $te$ -&gt; $te$</span>

  <span class="keyword">sorts</span> <span class="cons_SortDecl"><a href="#Type_19_13" id="Type_18_9" title="Referenced at line 19, 20, 23, 34, 58"><span class="token sort_Id">Type</span></a></span> <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><a href="#NUM_36_26" id="NUM_19_5" title="Referenced at line 36, 38, 39, 40, 60"><span class="token sort_Id">NUM</span></a>   <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#Type_18_9" id="Type_19_13" title="Defined at line 18"><span class="token sort_Id">Type</span></a></span></span>
    <span class="cons_OpDecl"><a href="#FUN_42_33" id="FUN_20_5" title="Referenced at line 42, 52, 62"><span class="token sort_Id">FUN</span></a>   <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#Type_18_9" id="Type_20_13" title="Defined at line 18"><span class="token sort_Id">Type</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#Type_18_9" id="Type_20_20" title="Defined at line 18"><span class="token sort_Id">Type</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#Type_18_9" id="Type_20_28" title="Defined at line 18"><span class="token sort_Id">Type</span></a></span></span>

  <span class="keyword">relations</span>
    <span class="cons_Label"><a href="#typeOfDecl_45_28" id="typeOfDecl_23_5" title="Referenced at line 45, 49"><span class="token sort_Id">typeOfDecl</span></a></span> <span class="operator">:</span> <span class="cons_OccurrenceSort">occurrence</span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#Type_18_9" id="Type_23_32" title="Defined at line 18"><span class="token sort_Id">Type</span></a></span>

  <span class="keyword">namespaces</span>
    <span class="cons_NsDecl"><a href="#Var_30_13" id="Var_26_5" title="Referenced at line 30, 45, 49"><span class="token sort_Id">Var</span></a>  <span class="operator">:</span> <span class="cons_StringSort">string</span></span>

  <span class="keyword">name-resolution</span>
    <span class="keyword">labels</span> <span class="cons_Label"><a href="#P_30_24" id="P_29_12" title="Referenced at line 30, 44"><span class="token sort_Id">P</span></a></span> <span class="cons_Label"><span id="R_29_14" title="Not referenced"><span class="token sort_Id">R</span></span></span>
    <span class="cons_NamespaceQuery"><span class="keyword">resolve</span> <a href="#Var_26_5" id="Var_30_13" title="Defined at line 26"><span class="token sort_Id">Var</span></a> <span class="cons_NamespaceFilter"><span class="keyword">filter</span> <span class="cons_Closure"><span class="cons_Label"><a href="#P_29_12" id="P_30_24" title="Defined at line 29"><span class="token sort_Id">P</span></a></span>*</span></span> <span class="cons_NamespaceMin"><span class="keyword">min</span> <span class="operator">$</span> <span class="operator">&lt;</span> <span class="cons_Label"><a href="#P_29_12" id="P_30_35" title="Defined at line 29"><span class="token sort_Id">P</span></a></span></span></span>

<span class="keyword">rules</span>

  <a href="#typeOfExp_36_3" id="typeOfExp_34_3" title="Referenced at line 36, 38, 39, 40, 42, 46, 48, 51, 52, 53"><span class="token sort_Id">typeOfExp</span></a> <span class="operator">:</span> <span class="cons_ScopeSort">scope</span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#Exp_7_9" id="Exp_34_23" title="Defined at line 7"><span class="token sort_Id">Exp</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#Type_18_9" id="Type_34_30" title="Defined at line 18"><span class="token sort_Id">Type</span></a></span>

  <a href="#typeOfExp_34_3" id="typeOfExp_36_3" title="Defined at line 34"><span class="token sort_Id">typeOfExp</span></a><span class="operator">(</span><span class="cons_Var"><span id="s_36_13" title="Not referenced"><span class="token sort_Id">s</span></span></span><span class="operator">,</span> <span class="cons_Op"><a href="#Num_8_5" id="Num_36_16" title="Defined at line 8"><span class="token sort_Id">Num</span></a>(_)</span><span class="operator">)</span> <span class="operator">=</span> <span class="cons_Op"><a href="#NUM_19_5" id="NUM_36_26" title="Defined at line 19"><span class="token sort_Id">NUM</span></a>()</span><span class="operator">.</span>

  <a href="#typeOfExp_34_3" id="typeOfExp_38_3" title="Defined at line 34"><span class="token sort_Id">typeOfExp</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_39_15" id="s_38_13" title="Referenced at line 39, 40"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="#BinExp_9_5" id="BinExp_38_16" title="Defined at line 9"><span class="token sort_Id">BinExp</span></a><span class="operator">(</span><span class="cons_Var"><a href="#e1_39_18" id="e1_38_23" title="Referenced at line 39"><span class="token sort_Id">e1</span></a></span><span class="operator">,</span> <span class="operator">_,</span> <span class="cons_Var"><a href="#e2_40_18" id="e2_38_30" title="Referenced at line 40"><span class="token sort_Id">e2</span></a></span>)</span><span class="operator">)</span> <span class="operator">=</span> <span class="cons_Op"><a href="#NUM_19_5" id="NUM_38_37" title="Defined at line 19"><span class="token sort_Id">NUM</span></a>()</span> <span class="operator">:-</span>
    <a href="#typeOfExp_34_3" id="typeOfExp_39_5" title="Defined at line 34"><span class="token sort_Id">typeOfExp</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_38_13" id="s_39_15" title="Defined at line 38"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#e1_38_23" id="e1_39_18" title="Defined at line 38"><span class="token sort_Id">e1</span></a></span><span class="operator">)</span> <span class="operator">==</span> <span class="cons_Op"><a href="#NUM_19_5" id="NUM_39_25" title="Defined at line 19"><span class="token sort_Id">NUM</span></a>()</span><span class="operator">,</span>
    <a href="#typeOfExp_34_3" id="typeOfExp_40_5" title="Defined at line 34"><span class="token sort_Id">typeOfExp</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_38_13" id="s_40_15" title="Defined at line 38"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#e2_38_30" id="e2_40_18" title="Defined at line 38"><span class="token sort_Id">e2</span></a></span><span class="operator">)</span> <span class="operator">==</span> <span class="cons_Op"><a href="#NUM_19_5" id="NUM_40_25" title="Defined at line 19"><span class="token sort_Id">NUM</span></a>()</span><span class="operator">.</span>

  <a href="#typeOfExp_34_3" id="typeOfExp_42_3" title="Defined at line 34"><span class="token sort_Id">typeOfExp</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_43_19" id="s_42_13" title="Referenced at line 43, 44"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="#Fun_10_5" id="Fun_42_16" title="Defined at line 10"><span class="token sort_Id">Fun</span></a><span class="operator">(</span><span class="cons_Var"><a href="#x_45_18" id="x_42_20" title="Referenced at line 45"><span class="token sort_Id">x</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#te_43_22" id="te_42_23" title="Referenced at line 43"><span class="token sort_Id">te</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#e_46_22" id="e_42_27" title="Referenced at line 46"><span class="token sort_Id">e</span></a></span>)</span><span class="operator">)</span> <span class="operator">=</span> <span class="cons_Op"><a href="#FUN_20_5" id="FUN_42_33" title="Defined at line 20"><span class="token sort_Id">FUN</span></a><span class="operator">(</span><span class="cons_Var"><a href="#S_43_29" id="S_42_37" title="Referenced at line 43, 45"><span class="token sort_Id">S</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#T_46_28" id="T_42_40" title="Referenced at line 46"><span class="token sort_Id">T</span></a></span>)</span> <span class="operator">:-</span> <span class="operator">{</span><span class="cons_Var"><a href="#s_fun_44_9" id="s_fun_42_47" title="Referenced at line 44, 45, 46"><span class="token sort_Id">s_fun</span></a></span><span class="operator">}</span>
    <a href="#typeOfTypeExp_58_3" id="typeOfTypeExp_43_5" title="Defined at line 58"><span class="token sort_Id">typeOfTypeExp</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_42_13" id="s_43_19" title="Defined at line 42"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#te_42_23" id="te_43_22" title="Defined at line 42"><span class="token sort_Id">te</span></a></span><span class="operator">)</span> <span class="operator">==</span> <span class="cons_Var"><a href="#S_42_37" id="S_43_29" title="Defined at line 42"><span class="token sort_Id">S</span></a></span><span class="operator">,</span>
    <span class="keyword">new</span> <span class="cons_Var"><a href="#s_fun_42_47" id="s_fun_44_9" title="Defined at line 42"><span class="token sort_Id">s_fun</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#s_fun_42_47" id="s_fun_44_16" title="Defined at line 42"><span class="token sort_Id">s_fun</span></a></span> <span class="operator">-</span><span class="cons_Label"><a href="#P_29_12" id="P_44_23" title="Defined at line 29"><span class="token sort_Id">P</span></a></span><span class="operator">-&gt;</span> <span class="cons_Var"><a href="#s_42_13" id="s_44_27" title="Defined at line 42"><span class="token sort_Id">s</span></a></span><span class="operator">,</span>
    <span class="token sort_Id">s_fun</span> <span class="operator">-&gt;</span> <span class="token sort_Id">Var</span><span class="operator">{</span><span class="token sort_Id">x</span><span class="operator">@</span><span class="token sort_Id">x</span><span class="operator">}</span> <span class="keyword">with</span> <span class="cons_Label"><a href="#typeOfDecl_23_5" id="typeOfDecl_45_28" title="Defined at line 23"><span class="token sort_Id">typeOfDecl</span></a></span> <span class="cons_Var"><a href="#S_42_37" id="S_45_39" title="Defined at line 42"><span class="token sort_Id">S</span></a></span><span class="operator">,</span>
    <a href="#typeOfExp_34_3" id="typeOfExp_46_5" title="Defined at line 34"><span class="token sort_Id">typeOfExp</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_fun_42_47" id="s_fun_46_15" title="Defined at line 42"><span class="token sort_Id">s_fun</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#e_42_27" id="e_46_22" title="Defined at line 42"><span class="token sort_Id">e</span></a></span><span class="operator">)</span> <span class="operator">==</span> <span class="cons_Var"><a href="#T_42_40" id="T_46_28" title="Defined at line 42"><span class="token sort_Id">T</span></a></span><span class="operator">.</span>

  <a href="#typeOfExp_34_3" id="typeOfExp_48_3" title="Defined at line 34"><span class="token sort_Id">typeOfExp</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_49_31" id="s_48_13" title="Referenced at line 49"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="#Var_11_5" id="Var_48_16" title="Defined at line 11"><span class="token sort_Id">Var</span></a><span class="operator">(</span><span class="cons_Var"><a href="#x_49_23" id="x_48_20" title="Referenced at line 49"><span class="token sort_Id">x</span></a></span>)</span><span class="operator">)</span> <span class="operator">=</span> <span class="cons_Var"><a href="#T_49_46" id="T_48_26" title="Referenced at line 49"><span class="token sort_Id">T</span></a></span> <span class="operator">:-</span>
    <span class="cons_Label"><a href="#typeOfDecl_23_5" id="typeOfDecl_49_5" title="Defined at line 23"><span class="token sort_Id">typeOfDecl</span></a></span> <span class="keyword">of</span> <span class="cons_StxOccurrence"><a href="#Var_26_5" id="Var_49_19" title="Defined at line 26"><span class="token sort_Id">Var</span></a><span class="operator">{</span><span class="cons_Var"><a href="#x_48_20" id="x_49_23" title="Defined at line 48"><span class="token sort_Id">x</span></a></span><span class="operator">@</span><span class="cons_Var"><a href="#x_48_20" id="x_49_25" title="Defined at line 48"><span class="token sort_Id">x</span></a></span>}</span> <span class="keyword">in</span> <span class="cons_Var"><a href="#s_48_13" id="s_49_31" title="Defined at line 48"><span class="token sort_Id">s</span></a></span> <span class="operator">|-&gt;</span> <span class="operator">[(_,</span> <span class="operator">(_,</span> <span class="cons_Var"><a href="#T_48_26" id="T_49_46" title="Defined at line 48"><span class="token sort_Id">T</span></a></span><span class="operator">))].</span>

  <a href="#typeOfExp_34_3" id="typeOfExp_51_3" title="Defined at line 34"><span class="token sort_Id">typeOfExp</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_52_15" id="s_51_13" title="Referenced at line 52, 53"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="#App_12_5" id="App_51_16" title="Defined at line 12"><span class="token sort_Id">App</span></a><span class="operator">(</span><span class="cons_Var"><a href="#e1_52_18" id="e1_51_20" title="Referenced at line 52"><span class="token sort_Id">e1</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#e2_53_18" id="e2_51_24" title="Referenced at line 53"><span class="token sort_Id">e2</span></a></span>)</span><span class="operator">)</span> <span class="operator">=</span> <span class="cons_Var"><a href="#T_52_32" id="T_51_31" title="Referenced at line 52"><span class="token sort_Id">T</span></a></span> <span class="operator">:-</span> <span class="operator">{</span><span class="cons_Var"><a href="#S_52_29" id="S_51_37" title="Referenced at line 52, 54"><span class="token sort_Id">S</span></a></span> <span class="cons_Var"><a href="#U_53_25" id="U_51_39" title="Referenced at line 53, 54"><span class="token sort_Id">U</span></a></span><span class="operator">}</span>
    <a href="#typeOfExp_34_3" id="typeOfExp_52_5" title="Defined at line 34"><span class="token sort_Id">typeOfExp</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_51_13" id="s_52_15" title="Defined at line 51"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#e1_51_20" id="e1_52_18" title="Defined at line 51"><span class="token sort_Id">e1</span></a></span><span class="operator">)</span> <span class="operator">==</span> <span class="cons_Op"><a href="#FUN_20_5" id="FUN_52_25" title="Defined at line 20"><span class="token sort_Id">FUN</span></a><span class="operator">(</span><span class="cons_Var"><a href="#S_51_37" id="S_52_29" title="Defined at line 51"><span class="token sort_Id">S</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#T_51_31" id="T_52_32" title="Defined at line 51"><span class="token sort_Id">T</span></a></span>)</span><span class="operator">,</span>
    <a href="#typeOfExp_34_3" id="typeOfExp_53_5" title="Defined at line 34"><span class="token sort_Id">typeOfExp</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_51_13" id="s_53_15" title="Defined at line 51"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#e2_51_24" id="e2_53_18" title="Defined at line 51"><span class="token sort_Id">e2</span></a></span><span class="operator">)</span> <span class="operator">==</span> <span class="cons_Var"><a href="#U_51_39" id="U_53_25" title="Defined at line 51"><span class="token sort_Id">U</span></a></span><span class="operator">,</span>
    <span class="cons_Var"><a href="#U_51_39" id="U_54_5" title="Defined at line 51"><span class="token sort_Id">U</span></a></span> <span class="operator">==</span> <span class="cons_Var"><a href="#S_51_37" id="S_54_10" title="Defined at line 51"><span class="token sort_Id">S</span></a></span><span class="operator">.</span>

<span class="keyword">rules</span>

  <a href="#typeOfTypeExp_43_5" id="typeOfTypeExp_58_3" title="Referenced at line 43, 60, 62"><span class="token sort_Id">typeOfTypeExp</span></a> <span class="operator">:</span> <span class="cons_ScopeSort">scope</span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#TypeExp_14_9" id="TypeExp_58_27" title="Defined at line 14"><span class="token sort_Id">TypeExp</span></a></span> <span class="operator">-&gt;</span>  <span class="cons_SimpleSort"><a href="#Type_18_9" id="Type_58_39" title="Defined at line 18"><span class="token sort_Id">Type</span></a></span>

  <a href="#typeOfTypeExp_58_3" id="typeOfTypeExp_60_3" title="Defined at line 58"><span class="token sort_Id">typeOfTypeExp</span></a><span class="operator">(</span><span class="cons_Var"><span id="s_60_17" title="Not referenced"><span class="token sort_Id">s</span></span></span><span class="operator">,</span> <span class="cons_Op"><a href="#NumType_15_5" id="NumType_60_20" title="Defined at line 15"><span class="token sort_Id">NumType</span></a>()</span><span class="operator">)</span> <span class="operator">=</span> <span class="cons_Op"><a href="#NUM_19_5" id="NUM_60_33" title="Defined at line 19"><span class="token sort_Id">NUM</span></a>()</span><span class="operator">.</span>

  <a href="#typeOfTypeExp_58_3" id="typeOfTypeExp_62_3" title="Defined at line 58"><span class="token sort_Id">typeOfTypeExp</span></a><span class="operator">(</span><span class="cons_Var">s</span><span class="operator">,</span> <span class="cons_Op"><a href="#FunType_16_5" id="FunType_62_20" title="Defined at line 16"><span class="token sort_Id">FunType</span></a><span class="operator">(</span><span class="cons_Var">te1</span><span class="operator">,</span> <span class="cons_Var"><span id="te2_62_33" title="Not referenced"><span class="token sort_Id">te2</span></span></span>)</span><span class="operator">)</span> <span class="operator">=</span> <span class="cons_Op"><a href="#FUN_20_5" id="FUN_62_41" title="Defined at line 20"><span class="token sort_Id">FUN</span></a><span class="operator">(</span><a href="#typeOfTypeExp_58_3" id="typeOfTypeExp_62_45" title="Defined at line 58"><span class="token sort_Id">typeOfTypeExp</span></a><span class="operator">(</span><span class="cons_Var">s</span><span class="operator">,</span> <span class="cons_Var"><span id="te1_62_62" title="Not referenced"><span class="token sort_Id">te1</span></span></span><span class="operator">),</span> <a href="#typeOfTypeExp_58_3" id="typeOfTypeExp_62_68" title="Defined at line 58"><span class="token sort_Id">typeOfTypeExp</span></a><span class="operator">(</span><span class="cons_Var"><span id="s_62_82" title="Not referenced"><span class="token sort_Id">s</span></span></span><span class="operator">,</span> <span class="cons_Var">te2</span>))</span><span class="operator">.</span>

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
