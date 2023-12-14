---
title: stlc.stxtest
hide:
  - toc
---

# `stlc.stxtest`

:simple-github: [pdmosses/nabl/statix.example/src/stlc.stxtest]

[pdmosses/nabl/statix.example/src/stlc.stxtest]: https://github.com/pdmosses/nabl/blob/master/statix.example/src/stlc.stxtest "The source file on GitHub"

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
63
</pre></div></td>
<td class="code"><pre><code><span class="keyword">resolve</span> <span class="operator">{</span><span class="cons_Var"><a href="#s_3_7" id="s_1_10" title="Referenced at line 3"><span class="token sort_Id">s</span></a></span> <span class="cons_Var"><a href="#T_3_29" id="T_1_12" title="Referenced at line 3"><span class="token sort_Id">T</span></a></span> <span class="cons_Var"><a href="#e_3_23" id="e_1_14" title="Referenced at line 3"><span class="token sort_Id">e</span></a></span><span class="operator">}</span>

  <span class="keyword">new</span> <span class="cons_Var"><a href="#s_1_10" id="s_3_7" title="Defined at line 1"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <a href="#typeOfExp_34_3" id="typeOfExp_3_10" title="Defined at line 34"><span class="token sort_Id">typeOfExp</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_1_10" id="s_3_20" title="Defined at line 1"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#e_1_14" id="e_3_23" title="Defined at line 1"><span class="token sort_Id">e</span></a></span><span class="operator">)</span> <span class="operator">==</span> <span class="cons_Var"><a href="#T_1_12" id="T_3_29" title="Defined at line 1"><span class="token sort_Id">T</span></a></span>

<span class="keyword">signature</span>
  <span class="keyword">sorts</span> <span class="cons_SortAlias"><a href="#ID_10_15" id="ID_6_9" title="Referenced at line 10, 11, 16"><span class="token sort_Id">ID</span></a> <span class="operator">=</span> <span class="cons_StringSort">string</span></span>                         <span class="layout">// $x$</span>

  <span class="keyword">sorts</span> <span class="cons_SortDecl"><a href="#Exp_9_15" id="Exp_8_9" title="Referenced at line 9, 10, 11, 12, 13, 16, 34"><span class="token sort_Id">Exp</span></a></span> <span class="keyword">constructors</span>                    <span class="layout">// $e$ :=</span>
    <span class="cons_OpDecl"><a href="#Unit_36_16" id="Unit_9_5" title="Referenced at line 36"><span class="token sort_Id">Unit</span></a>    <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#Exp_8_9" id="Exp_9_15" title="Defined at line 8"><span class="token sort_Id">Exp</span></a></span></span>                           <span class="layout">//      | ()</span>
    <span class="cons_OpDecl"><a href="#Fun_38_16" id="Fun_10_5" title="Referenced at line 38"><span class="token sort_Id">Fun</span></a>     <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#ID_6_9" id="ID_10_15" title="Defined at line 6"><span class="token sort_Id">ID</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#Type_18_9" id="Type_10_20" title="Defined at line 18"><span class="token sort_Id">Type</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#Exp_8_9" id="Exp_10_27" title="Defined at line 8"><span class="token sort_Id">Exp</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#Exp_8_9" id="Exp_10_34" title="Defined at line 8"><span class="token sort_Id">Exp</span></a></span></span>        <span class="layout">//      | fun ($x$ : $T$) { $e$ }</span>
    <span class="cons_OpDecl"><a href="#Var_43_16" id="Var_11_5" title="Referenced at line 43"><span class="token sort_Id">Var</span></a>     <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#ID_6_9" id="ID_11_15" title="Defined at line 6"><span class="token sort_Id">ID</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#Exp_8_9" id="Exp_11_21" title="Defined at line 8"><span class="token sort_Id">Exp</span></a></span></span>                     <span class="layout">//      | $x$</span>
    <span class="cons_OpDecl"><a href="#App_46_16" id="App_12_5" title="Referenced at line 46"><span class="token sort_Id">App</span></a>     <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#Exp_8_9" id="Exp_12_15" title="Defined at line 8"><span class="token sort_Id">Exp</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#Exp_8_9" id="Exp_12_21" title="Defined at line 8"><span class="token sort_Id">Exp</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#Exp_8_9" id="Exp_12_28" title="Defined at line 8"><span class="token sort_Id">Exp</span></a></span></span>              <span class="layout">//      | $e$ $e$</span>
    <span class="cons_OpDecl"><a href="#Let_51_16" id="Let_13_5" title="Referenced at line 51"><span class="token sort_Id">Let</span></a>     <span class="operator">:</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="#Bind_15_9" id="Bind_13_20" title="Defined at line 15"><span class="token sort_Id">Bind</span></a></span><span class="operator">)</span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#Exp_8_9" id="Exp_13_28" title="Defined at line 8"><span class="token sort_Id">Exp</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#Exp_8_9" id="Exp_13_35" title="Defined at line 8"><span class="token sort_Id">Exp</span></a></span></span>       <span class="layout">//      | let $b*$ in $e$</span>

  <span class="keyword">sorts</span> <span class="cons_SortDecl"><a href="#Bind_13_20" id="Bind_15_9" title="Referenced at line 13, 16, 57"><span class="token sort_Id">Bind</span></a></span> <span class="keyword">constructors</span>                   <span class="layout">// $b$ :=</span>
    <span class="cons_OpDecl"><a href="#Bind_59_13" id="Bind_16_5" title="Referenced at line 59"><span class="token sort_Id">Bind</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#ID_6_9" id="ID_16_12" title="Defined at line 6"><span class="token sort_Id">ID</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#Type_18_9" id="Type_16_17" title="Defined at line 18"><span class="token sort_Id">Type</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#Exp_8_9" id="Exp_16_24" title="Defined at line 8"><span class="token sort_Id">Exp</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#Bind_15_9" id="Bind_16_31" title="Defined at line 15"><span class="token sort_Id">Bind</span></a></span></span>          <span class="layout">//      | $x$ : $T$ = $e$</span>

  <span class="keyword">sorts</span> <span class="cons_SortDecl"><a href="#Type_10_20" id="Type_18_9" title="Referenced at line 10, 16, 19, 20, 23, 34"><span class="token sort_Id">Type</span></a></span> <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><a href="#UNIT_36_26" id="UNIT_19_5" title="Referenced at line 36"><span class="token sort_Id">UNIT</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#Type_18_9" id="Type_19_12" title="Defined at line 18"><span class="token sort_Id">Type</span></a></span></span>
    <span class="cons_OpDecl"><a href="#FUN_38_32" id="FUN_20_5" title="Referenced at line 38, 47"><span class="token sort_Id">FUN</span></a>  <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#Type_18_9" id="Type_20_12" title="Defined at line 18"><span class="token sort_Id">Type</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#Type_18_9" id="Type_20_19" title="Defined at line 18"><span class="token sort_Id">Type</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#Type_18_9" id="Type_20_27" title="Defined at line 18"><span class="token sort_Id">Type</span></a></span></span>

  <span class="keyword">relations</span>
    <span class="cons_Label"><a href="#typeOfDecl_40_28" id="typeOfDecl_23_5" title="Referenced at line 40, 44, 60"><span class="token sort_Id">typeOfDecl</span></a></span> <span class="operator">:</span> <span class="cons_OccurrenceSort">occurrence</span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#Type_18_9" id="Type_23_32" title="Defined at line 18"><span class="token sort_Id">Type</span></a></span>

  <span class="keyword">namespaces</span>
    <span class="cons_NsDecl"><a href="#Var_30_13" id="Var_26_5" title="Referenced at line 30, 40, 44, 60"><span class="token sort_Id">Var</span></a>  <span class="operator">:</span> <span class="cons_StringSort">string</span></span>

  <span class="keyword">name-resolution</span>
    <span class="keyword">labels</span> <span class="cons_Label"><a href="#P_30_24" id="P_29_12" title="Referenced at line 30, 39, 52"><span class="token sort_Id">P</span></a></span>
    <span class="cons_NamespaceQuery"><span class="keyword">resolve</span> <a href="#Var_26_5" id="Var_30_13" title="Defined at line 26"><span class="token sort_Id">Var</span></a> <span class="cons_NamespaceFilter"><span class="keyword">filter</span> <span class="cons_Closure"><span class="cons_Label"><a href="#P_29_12" id="P_30_24" title="Defined at line 29"><span class="token sort_Id">P</span></a></span>*</span></span> <span class="cons_NamespaceMin"><span class="keyword">min</span> <span class="operator">$</span> <span class="operator">&lt;</span> <span class="cons_Label"><a href="#P_29_12" id="P_30_35" title="Defined at line 29"><span class="token sort_Id">P</span></a></span></span></span>

<span class="keyword">rules</span>

  <a href="#typeOfExp_3_10" id="typeOfExp_34_3" title="Referenced at line 3, 36, 38, 41, 43, 46, 47, 48, 51, 54, 61"><span class="token sort_Id">typeOfExp</span></a> <span class="operator">:</span> <span class="cons_ScopeSort">scope</span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#Exp_8_9" id="Exp_34_23" title="Defined at line 8"><span class="token sort_Id">Exp</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#Type_18_9" id="Type_34_30" title="Defined at line 18"><span class="token sort_Id">Type</span></a></span>

  <a href="#typeOfExp_34_3" id="typeOfExp_36_3" title="Defined at line 34"><span class="token sort_Id">typeOfExp</span></a><span class="operator">(_,</span> <span class="cons_Op"><a href="#Unit_9_5" id="Unit_36_16" title="Defined at line 9"><span class="token sort_Id">Unit</span></a>()</span><span class="operator">)</span> <span class="operator">=</span> <span class="cons_Op"><a href="#UNIT_19_5" id="UNIT_36_26" title="Defined at line 19"><span class="token sort_Id">UNIT</span></a>()</span><span class="operator">.</span>

  <a href="#typeOfExp_34_3" id="typeOfExp_38_3" title="Defined at line 34"><span class="token sort_Id">typeOfExp</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_39_27" id="s_38_13" title="Referenced at line 39"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="#Fun_10_5" id="Fun_38_16" title="Defined at line 10"><span class="token sort_Id">Fun</span></a><span class="operator">(</span><span class="cons_Var"><a href="#x_40_18" id="x_38_20" title="Referenced at line 40"><span class="token sort_Id">x</span></a></span><span class="operator">,</span> <span class="cons_Var">S</span><span class="operator">,</span> <span class="cons_Var"><a href="#e_41_22" id="e_38_26" title="Referenced at line 41"><span class="token sort_Id">e</span></a></span>)</span><span class="operator">)</span> <span class="operator">=</span> <span class="cons_Op"><a href="#FUN_20_5" id="FUN_38_32" title="Defined at line 20"><span class="token sort_Id">FUN</span></a><span class="operator">(</span><span class="cons_Var"><a href="#S_40_39" id="S_38_36" title="Referenced at line 40"><span class="token sort_Id">S</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#T_41_28" id="T_38_39" title="Referenced at line 41"><span class="token sort_Id">T</span></a></span>)</span> <span class="operator">:-</span> <span class="operator">{</span><span class="cons_Var"><a href="#s_fun_39_9" id="s_fun_38_46" title="Referenced at line 39, 40, 41"><span class="token sort_Id">s_fun</span></a></span><span class="operator">}</span>
    <span class="keyword">new</span> <span class="cons_Var"><a href="#s_fun_38_46" id="s_fun_39_9" title="Defined at line 38"><span class="token sort_Id">s_fun</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#s_fun_38_46" id="s_fun_39_16" title="Defined at line 38"><span class="token sort_Id">s_fun</span></a></span> <span class="operator">-</span><span class="cons_Label"><a href="#P_29_12" id="P_39_23" title="Defined at line 29"><span class="token sort_Id">P</span></a></span><span class="operator">-&gt;</span> <span class="cons_Var"><a href="#s_38_13" id="s_39_27" title="Defined at line 38"><span class="token sort_Id">s</span></a></span><span class="operator">,</span>
    <span class="token sort_Id">s_fun</span> <span class="operator">-&gt;</span> <span class="token sort_Id">Var</span><span class="operator">{</span><span class="token sort_Id">x</span><span class="operator">@</span><span class="token sort_Id">x</span><span class="operator">}</span> <span class="keyword">with</span> <span class="cons_Label"><a href="#typeOfDecl_23_5" id="typeOfDecl_40_28" title="Defined at line 23"><span class="token sort_Id">typeOfDecl</span></a></span> <span class="cons_Var"><a href="#S_38_36" id="S_40_39" title="Defined at line 38"><span class="token sort_Id">S</span></a></span><span class="operator">,</span>
    <a href="#typeOfExp_34_3" id="typeOfExp_41_5" title="Defined at line 34"><span class="token sort_Id">typeOfExp</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_fun_38_46" id="s_fun_41_15" title="Defined at line 38"><span class="token sort_Id">s_fun</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#e_38_26" id="e_41_22" title="Defined at line 38"><span class="token sort_Id">e</span></a></span><span class="operator">)</span> <span class="operator">==</span> <span class="cons_Var"><a href="#T_38_39" id="T_41_28" title="Defined at line 38"><span class="token sort_Id">T</span></a></span><span class="operator">.</span>

  <a href="#typeOfExp_34_3" id="typeOfExp_43_3" title="Defined at line 34"><span class="token sort_Id">typeOfExp</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_44_31" id="s_43_13" title="Referenced at line 44"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="#Var_11_5" id="Var_43_16" title="Defined at line 11"><span class="token sort_Id">Var</span></a><span class="operator">(</span><span class="cons_Var"><a href="#x_44_23" id="x_43_20" title="Referenced at line 44"><span class="token sort_Id">x</span></a></span>)</span><span class="operator">)</span> <span class="operator">=</span> <span class="cons_Var"><a href="#T_44_46" id="T_43_26" title="Referenced at line 44"><span class="token sort_Id">T</span></a></span> <span class="operator">:-</span> <span class="operator">{</span><span class="cons_Var"><a href="#p_44_39" id="p_43_32" title="Referenced at line 44"><span class="token sort_Id">p</span></a></span> <span class="cons_Var"><a href="#d_44_43" id="d_43_34" title="Referenced at line 44"><span class="token sort_Id">d</span></a></span><span class="operator">}</span>
    <span class="cons_Label"><a href="#typeOfDecl_23_5" id="typeOfDecl_44_5" title="Defined at line 23"><span class="token sort_Id">typeOfDecl</span></a></span> <span class="keyword">of</span> <span class="cons_StxOccurrence"><a href="#Var_30_13" id="Var_44_19" title="Defined at line 30"><span class="token sort_Id">Var</span></a><span class="operator">{</span><span class="cons_Var"><a href="#x_43_20" id="x_44_23" title="Defined at line 43"><span class="token sort_Id">x</span></a></span><span class="operator">@</span><span class="cons_Var"><a href="#x_43_20" id="x_44_25" title="Defined at line 43"><span class="token sort_Id">x</span></a></span>}</span> <span class="keyword">in</span> <span class="cons_Var"><a href="#s_43_13" id="s_44_31" title="Defined at line 43"><span class="token sort_Id">s</span></a></span> <span class="operator">|-&gt;</span> <span class="operator">[(</span><span class="cons_Var"><a href="#p_43_32" id="p_44_39" title="Defined at line 43"><span class="token sort_Id">p</span></a></span><span class="operator">,</span> <span class="operator">(</span><span class="cons_Var"><a href="#d_43_34" id="d_44_43" title="Defined at line 43"><span class="token sort_Id">d</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#T_43_26" id="T_44_46" title="Defined at line 43"><span class="token sort_Id">T</span></a></span><span class="operator">))].</span>

  <a href="#typeOfExp_34_3" id="typeOfExp_46_3" title="Defined at line 34"><span class="token sort_Id">typeOfExp</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_47_15" id="s_46_13" title="Referenced at line 47, 48"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="#App_12_5" id="App_46_16" title="Defined at line 12"><span class="token sort_Id">App</span></a><span class="operator">(</span><span class="cons_Var"><a href="#e1_47_18" id="e1_46_20" title="Referenced at line 47"><span class="token sort_Id">e1</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#e2_48_18" id="e2_46_24" title="Referenced at line 48"><span class="token sort_Id">e2</span></a></span>)</span><span class="operator">)</span> <span class="operator">=</span> <span class="cons_Var"><a href="#T_47_32" id="T_46_31" title="Referenced at line 47"><span class="token sort_Id">T</span></a></span> <span class="operator">:-</span> <span class="operator">{</span><span class="cons_Var"><a href="#S_47_29" id="S_46_37" title="Referenced at line 47, 49"><span class="token sort_Id">S</span></a></span> <span class="cons_Var"><a href="#U_48_25" id="U_46_39" title="Referenced at line 48, 49"><span class="token sort_Id">U</span></a></span><span class="operator">}</span>
    <a href="#typeOfExp_34_3" id="typeOfExp_47_5" title="Defined at line 34"><span class="token sort_Id">typeOfExp</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_46_13" id="s_47_15" title="Defined at line 46"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#e1_46_20" id="e1_47_18" title="Defined at line 46"><span class="token sort_Id">e1</span></a></span><span class="operator">)</span> <span class="operator">==</span> <span class="cons_Op"><a href="#FUN_20_5" id="FUN_47_25" title="Defined at line 20"><span class="token sort_Id">FUN</span></a><span class="operator">(</span><span class="cons_Var"><a href="#S_46_37" id="S_47_29" title="Defined at line 46"><span class="token sort_Id">S</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#T_46_31" id="T_47_32" title="Defined at line 46"><span class="token sort_Id">T</span></a></span>)</span><span class="operator">,</span>
    <a href="#typeOfExp_34_3" id="typeOfExp_48_5" title="Defined at line 34"><span class="token sort_Id">typeOfExp</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_46_13" id="s_48_15" title="Defined at line 46"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#e2_46_24" id="e2_48_18" title="Defined at line 46"><span class="token sort_Id">e2</span></a></span><span class="operator">)</span> <span class="operator">==</span> <span class="cons_Var"><a href="#U_46_39" id="U_48_25" title="Defined at line 46"><span class="token sort_Id">U</span></a></span><span class="operator">,</span>
    <span class="cons_Var"><a href="#U_46_39" id="U_49_5" title="Defined at line 46"><span class="token sort_Id">U</span></a></span> <span class="operator">==</span> <span class="cons_Var"><a href="#S_46_37" id="S_49_10" title="Defined at line 46"><span class="token sort_Id">S</span></a></span><span class="operator">.</span>

  <a href="#typeOfExp_34_3" id="typeOfExp_51_3" title="Defined at line 34"><span class="token sort_Id">typeOfExp</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_52_27" id="s_51_13" title="Referenced at line 52, 53"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="#Let_13_5" id="Let_51_16" title="Defined at line 13"><span class="token sort_Id">Let</span></a><span class="operator">(</span><span class="cons_Var"><a href="#binds_53_16" id="binds_51_20" title="Referenced at line 53, 55"><span class="token sort_Id">binds</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#e_54_22" id="e_51_27" title="Referenced at line 54"><span class="token sort_Id">e</span></a></span>)</span><span class="operator">)</span> <span class="operator">=</span> <span class="cons_Var"><a href="#T_54_28" id="T_51_33" title="Referenced at line 54"><span class="token sort_Id">T</span></a></span> <span class="operator">:-</span> <span class="operator">{</span><span class="cons_Var"><a href="#s_let_52_9" id="s_let_51_39" title="Referenced at line 52, 53, 54"><span class="token sort_Id">s_let</span></a></span><span class="operator">}</span>
    <span class="keyword">new</span> <span class="cons_Var"><a href="#s_let_51_39" id="s_let_52_9" title="Defined at line 51"><span class="token sort_Id">s_let</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#s_let_51_39" id="s_let_52_16" title="Defined at line 51"><span class="token sort_Id">s_let</span></a></span> <span class="operator">-</span><span class="cons_Label"><a href="#P_29_12" id="P_52_23" title="Defined at line 29"><span class="token sort_Id">P</span></a></span><span class="operator">-&gt;</span> <span class="cons_Var"><a href="#s_51_13" id="s_52_27" title="Defined at line 51"><span class="token sort_Id">s</span></a></span><span class="operator">,</span>
    <a href="#bindsOk_63_3" id="bindsOk_53_5" title="Defined at line 63"><span class="token sort_Id">bindsOk</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_51_13" id="s_53_13" title="Defined at line 51"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#binds_51_20" id="binds_53_16" title="Defined at line 51"><span class="token sort_Id">binds</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#s_let_51_39" id="s_let_53_23" title="Defined at line 51"><span class="token sort_Id">s_let</span></a></span><span class="operator">),</span>
    <a href="#typeOfExp_34_3" id="typeOfExp_54_5" title="Defined at line 34"><span class="token sort_Id">typeOfExp</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_let_51_39" id="s_let_54_15" title="Defined at line 51"><span class="token sort_Id">s_let</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#e_51_27" id="e_54_22" title="Defined at line 51"><span class="token sort_Id">e</span></a></span><span class="operator">)</span> <span class="operator">==</span> <span class="cons_Var"><a href="#T_51_33" id="T_54_28" title="Defined at line 51"><span class="token sort_Id">T</span></a></span><span class="operator">,</span>
    <span class="cons_Var"><a href="#binds_51_20" id="binds_55_5" title="Defined at line 51"><span class="token sort_Id">binds</span></a></span> <span class="operator">!=</span> <span class="operator">[].</span> <span class="layout">// additive</span>

  <a href="#bindOk_59_3" id="bindOk_57_3" title="Referenced at line 59, 63"><span class="token sort_Id">bindOk</span></a> <span class="operator">:</span> <span class="cons_ScopeSort">scope</span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#Bind_15_9" id="Bind_57_20" title="Defined at line 15"><span class="token sort_Id">Bind</span></a></span> <span class="operator">*</span> <span class="cons_ScopeSort">scope</span>

  <a href="#bindOk_57_3" id="bindOk_59_3" title="Defined at line 57"><span class="token sort_Id">bindOk</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_61_15" id="s_59_10" title="Referenced at line 61"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="#Bind_16_5" id="Bind_59_13" title="Defined at line 16"><span class="token sort_Id">Bind</span></a><span class="operator">(</span><span class="cons_Var"><a href="#x_60_18" id="x_59_18" title="Referenced at line 60"><span class="token sort_Id">x</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#T_60_39" id="T_59_21" title="Referenced at line 60, 61"><span class="token sort_Id">T</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#e_61_18" id="e_59_24" title="Referenced at line 61"><span class="token sort_Id">e</span></a></span>)</span><span class="operator">,</span> <span class="cons_Var"><a href="#s_bnd_60_5" id="s_bnd_59_28" title="Referenced at line 60"><span class="token sort_Id">s_bnd</span></a></span><span class="operator">)</span> <span class="operator">:-</span>
    <span class="token sort_Id">s_bnd</span> <span class="operator">-&gt;</span> <span class="token sort_Id">Var</span><span class="operator">{</span><span class="token sort_Id">x</span><span class="operator">@</span><span class="token sort_Id">x</span><span class="operator">}</span> <span class="keyword">with</span> <span class="cons_Label"><a href="#typeOfDecl_23_5" id="typeOfDecl_60_28" title="Defined at line 23"><span class="token sort_Id">typeOfDecl</span></a></span> <span class="cons_Var"><a href="#T_59_21" id="T_60_39" title="Defined at line 59"><span class="token sort_Id">T</span></a></span><span class="operator">,</span>
    <a href="#typeOfExp_34_3" id="typeOfExp_61_5" title="Defined at line 34"><span class="token sort_Id">typeOfExp</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_59_10" id="s_61_15" title="Defined at line 59"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#e_59_24" id="e_61_18" title="Defined at line 59"><span class="token sort_Id">e</span></a></span><span class="operator">)</span> <span class="operator">==</span> <span class="cons_Var"><a href="#T_59_21" id="T_61_24" title="Defined at line 59"><span class="token sort_Id">T</span></a></span><span class="operator">.</span>

  <a href="#bindsOk_53_5" id="bindsOk_63_3" title="Referenced at line 53"><span class="token sort_Id">bindsOk</span></a> <span class="keyword">maps</span> <a href="#bindOk_57_3" id="bindOk_63_16" title="Defined at line 57"><span class="token sort_Id">bindOk</span></a><span class="operator">(*,</span> <span class="keyword">list</span><span class="operator">(*),</span> <span class="operator">*)</span>

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
