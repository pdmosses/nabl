---
title: busybeaver.stxtest
hide:
  - toc
---

# `busybeaver.stxtest`

:simple-github: [pdmosses/nabl/statix.example/src/busybeaver.stxtest]

[pdmosses/nabl/statix.example/src/busybeaver.stxtest]: https://github.com/pdmosses/nabl/blob/master/statix.example/src/busybeaver.stxtest "The source file on GitHub"

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
<td class="code"><pre><code><span class="layout">// 3-state Busy Beaver Turing machine specification</span>
<span class="layout">// https://en.wikipedia.org/wiki/Turing_machine_examples#3-state_Busy_Beaver</span>

<span class="keyword">resolve</span>

  <a href="#busybeaver_29_3" id="busybeaver_6_3" title="Defined at line 29"><span class="token sort_Id">busybeaver</span></a><span class="operator">(</span><span class="cons_Op"><a href="#A_11_5" id="A_6_14" title="Defined at line 11"><span class="token sort_Id">A</span></a>()</span><span class="operator">,</span> <span class="operator">([],</span> <span class="cons_Op"><a href="#Zero_17_5" id="Zero_6_24" title="Defined at line 17"><span class="token sort_Id">Zero</span></a>()</span><span class="operator">,</span> <span class="operator">[]))</span>

<span class="keyword">signature</span>

  <span class="keyword">sorts</span> <span class="cons_SortDecl"><a href="#State_11_12" id="State_10_9" title="Referenced at line 11, 12, 13, 14, 29"><span class="token sort_Id">State</span></a></span> <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><a href="#A_6_14" id="A_11_5" title="Referenced at line 6, 31, 34, 38"><span class="token sort_Id">A</span></a>    <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#State_10_9" id="State_11_12" title="Defined at line 10"><span class="token sort_Id">State</span></a></span></span>
    <span class="cons_OpDecl"><a href="#B_32_16" id="B_12_5" title="Referenced at line 32, 37, 40, 41, 44"><span class="token sort_Id">B</span></a>    <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#State_10_9" id="State_12_12" title="Defined at line 10"><span class="token sort_Id">State</span></a></span></span>
    <span class="cons_OpDecl"><a href="#C_35_16" id="C_13_5" title="Referenced at line 35, 43, 46"><span class="token sort_Id">C</span></a>    <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#State_10_9" id="State_13_12" title="Defined at line 10"><span class="token sort_Id">State</span></a></span></span>
    <span class="cons_OpDecl"><a href="#HALT_47_16" id="HALT_14_5" title="Referenced at line 47, 49"><span class="token sort_Id">HALT</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#State_10_9" id="State_14_12" title="Defined at line 10"><span class="token sort_Id">State</span></a></span></span>

  <span class="keyword">sorts</span> <span class="cons_SortDecl"><a href="#Symbol_17_12" id="Symbol_16_9" title="Referenced at line 17, 18, 25"><span class="token sort_Id">Symbol</span></a></span> <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><a href="#Zero_6_24" id="Zero_17_5" title="Referenced at line 6, 31, 37, 43, 57, 61"><span class="token sort_Id">Zero</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#Symbol_16_9" id="Symbol_17_12" title="Defined at line 16"><span class="token sort_Id">Symbol</span></a></span></span>
    <span class="cons_OpDecl"><a href="#One_32_33" id="One_18_5" title="Referenced at line 32, 34, 35, 38, 40, 41, 44, 46, 47"><span class="token sort_Id">One</span></a>  <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#Symbol_16_9" id="Symbol_18_12" title="Defined at line 16"><span class="token sort_Id">Symbol</span></a></span></span>

  <span class="keyword">sorts</span> <span class="cons_SortDecl"><a href="#Move_21_9" id="Move_20_9" title="Referenced at line 21, 22, 23, 53"><span class="token sort_Id">Move</span></a></span> <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><a href="#R_32_48" id="R_21_5" title="Referenced at line 32, 47, 55, 57"><span class="token sort_Id">R</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#Move_20_9" id="Move_21_9" title="Defined at line 20"><span class="token sort_Id">Move</span></a></span></span>
    <span class="cons_OpDecl"><a href="#L_35_48" id="L_22_5" title="Referenced at line 35, 38, 41, 44, 59, 61"><span class="token sort_Id">L</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#Move_20_9" id="Move_22_9" title="Defined at line 20"><span class="token sort_Id">Move</span></a></span></span>
    <span class="cons_OpDecl"><a href="#N_63_11" id="N_23_5" title="Referenced at line 63"><span class="token sort_Id">N</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#Move_20_9" id="Move_23_9" title="Defined at line 20"><span class="token sort_Id">Move</span></a></span></span>

  <span class="keyword">sorts</span> <span class="cons_SortAlias"><a href="#Tape_29_24" id="Tape_25_9" title="Referenced at line 29, 53"><span class="token sort_Id">Tape</span></a> <span class="operator">=</span> <span class="operator">(</span><span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="#Symbol_16_9" id="Symbol_25_22" title="Defined at line 16"><span class="token sort_Id">Symbol</span></a></span><span class="operator">)</span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#Symbol_16_9" id="Symbol_25_32" title="Defined at line 16"><span class="token sort_Id">Symbol</span></a></span> <span class="operator">*</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="#Symbol_16_9" id="Symbol_25_46" title="Defined at line 16"><span class="token sort_Id">Symbol</span></a></span>))</span>
  
<span class="keyword">rules</span>

  <a href="#busybeaver_6_3" id="busybeaver_29_3" title="Referenced at line 6, 31, 32, 34, 35, 37, 38, 40, 41, 43, 44, 46, 47, 49"><span class="token sort_Id">busybeaver</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#State_10_9" id="State_29_16" title="Defined at line 10"><span class="token sort_Id">State</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#Tape_25_9" id="Tape_29_24" title="Defined at line 25"><span class="token sort_Id">Tape</span></a></span>

  <a href="#busybeaver_29_3" id="busybeaver_31_3" title="Defined at line 29"><span class="token sort_Id">busybeaver</span></a><span class="operator">(</span><span class="cons_Op"><a href="#A_11_5" id="A_31_14" title="Defined at line 11"><span class="token sort_Id">A</span></a>()</span><span class="operator">,</span> <span class="operator">(</span><span class="cons_Var"><a href="#left_32_27" id="left_31_20" title="Referenced at line 32"><span class="token sort_Id">left</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="#Zero_17_5" id="Zero_31_26" title="Defined at line 17"><span class="token sort_Id">Zero</span></a>()</span><span class="operator">,</span> <span class="cons_Var"><a href="#right_32_40" id="right_31_34" title="Referenced at line 32"><span class="token sort_Id">right</span></a></span><span class="operator">))</span> <span class="operator">:-</span>
    <a href="#busybeaver_29_3" id="busybeaver_32_5" title="Defined at line 29"><span class="token sort_Id">busybeaver</span></a><span class="operator">(</span><span class="cons_Op"><a href="#B_12_5" id="B_32_16" title="Defined at line 12"><span class="token sort_Id">B</span></a>()</span><span class="operator">,</span> <a href="#move_53_3" id="move_32_21" title="Defined at line 53"><span class="token sort_Id">move</span></a><span class="operator">((</span><span class="cons_Var"><a href="#left_31_20" id="left_32_27" title="Defined at line 31"><span class="token sort_Id">left</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="#One_18_5" id="One_32_33" title="Defined at line 18"><span class="token sort_Id">One</span></a>()</span><span class="operator">,</span> <span class="cons_Var"><a href="#right_31_34" id="right_32_40" title="Defined at line 31"><span class="token sort_Id">right</span></a></span><span class="operator">),</span> <span class="cons_Op"><a href="#R_21_5" id="R_32_48" title="Defined at line 21"><span class="token sort_Id">R</span></a>()</span><span class="operator">)).</span>

  <a href="#busybeaver_29_3" id="busybeaver_34_3" title="Defined at line 29"><span class="token sort_Id">busybeaver</span></a><span class="operator">(</span><span class="cons_Op"><a href="#A_11_5" id="A_34_14" title="Defined at line 11"><span class="token sort_Id">A</span></a>()</span><span class="operator">,</span> <span class="operator">(</span><span class="cons_Var"><a href="#left_35_27" id="left_34_20" title="Referenced at line 35"><span class="token sort_Id">left</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="#One_18_5" id="One_34_26" title="Defined at line 18"><span class="token sort_Id">One</span></a>()</span><span class="operator">,</span> <span class="cons_Var"><a href="#right_35_40" id="right_34_33" title="Referenced at line 35"><span class="token sort_Id">right</span></a></span><span class="operator">))</span> <span class="operator">:-</span>
    <a href="#busybeaver_29_3" id="busybeaver_35_5" title="Defined at line 29"><span class="token sort_Id">busybeaver</span></a><span class="operator">(</span><span class="cons_Op"><a href="#C_13_5" id="C_35_16" title="Defined at line 13"><span class="token sort_Id">C</span></a>()</span><span class="operator">,</span> <a href="#move_53_3" id="move_35_21" title="Defined at line 53"><span class="token sort_Id">move</span></a><span class="operator">((</span><span class="cons_Var"><a href="#left_34_20" id="left_35_27" title="Defined at line 34"><span class="token sort_Id">left</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="#One_18_5" id="One_35_33" title="Defined at line 18"><span class="token sort_Id">One</span></a>()</span><span class="operator">,</span> <span class="cons_Var"><a href="#right_34_33" id="right_35_40" title="Defined at line 34"><span class="token sort_Id">right</span></a></span><span class="operator">),</span> <span class="cons_Op"><a href="#L_22_5" id="L_35_48" title="Defined at line 22"><span class="token sort_Id">L</span></a>()</span><span class="operator">)).</span>

  <a href="#busybeaver_29_3" id="busybeaver_37_3" title="Defined at line 29"><span class="token sort_Id">busybeaver</span></a><span class="operator">(</span><span class="cons_Op"><a href="#B_12_5" id="B_37_14" title="Defined at line 12"><span class="token sort_Id">B</span></a>()</span><span class="operator">,</span> <span class="operator">(</span><span class="cons_Var"><a href="#left_38_27" id="left_37_20" title="Referenced at line 38"><span class="token sort_Id">left</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="#Zero_17_5" id="Zero_37_26" title="Defined at line 17"><span class="token sort_Id">Zero</span></a>()</span><span class="operator">,</span> <span class="cons_Var"><a href="#right_38_40" id="right_37_34" title="Referenced at line 38"><span class="token sort_Id">right</span></a></span><span class="operator">))</span> <span class="operator">:-</span>
    <a href="#busybeaver_29_3" id="busybeaver_38_5" title="Defined at line 29"><span class="token sort_Id">busybeaver</span></a><span class="operator">(</span><span class="cons_Op"><a href="#A_11_5" id="A_38_16" title="Defined at line 11"><span class="token sort_Id">A</span></a>()</span><span class="operator">,</span> <a href="#move_53_3" id="move_38_21" title="Defined at line 53"><span class="token sort_Id">move</span></a><span class="operator">((</span><span class="cons_Var"><a href="#left_37_20" id="left_38_27" title="Defined at line 37"><span class="token sort_Id">left</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="#One_18_5" id="One_38_33" title="Defined at line 18"><span class="token sort_Id">One</span></a>()</span><span class="operator">,</span> <span class="cons_Var"><a href="#right_37_34" id="right_38_40" title="Defined at line 37"><span class="token sort_Id">right</span></a></span><span class="operator">),</span> <span class="cons_Op"><a href="#L_22_5" id="L_38_48" title="Defined at line 22"><span class="token sort_Id">L</span></a>()</span><span class="operator">)).</span>

  <a href="#busybeaver_29_3" id="busybeaver_40_3" title="Defined at line 29"><span class="token sort_Id">busybeaver</span></a><span class="operator">(</span><span class="cons_Op"><a href="#B_12_5" id="B_40_14" title="Defined at line 12"><span class="token sort_Id">B</span></a>()</span><span class="operator">,</span> <span class="operator">(</span><span class="cons_Var"><a href="#left_41_27" id="left_40_20" title="Referenced at line 41"><span class="token sort_Id">left</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="#One_18_5" id="One_40_26" title="Defined at line 18"><span class="token sort_Id">One</span></a>()</span><span class="operator">,</span> <span class="cons_Var"><a href="#right_41_40" id="right_40_33" title="Referenced at line 41"><span class="token sort_Id">right</span></a></span><span class="operator">))</span> <span class="operator">:-</span>
    <a href="#busybeaver_29_3" id="busybeaver_41_5" title="Defined at line 29"><span class="token sort_Id">busybeaver</span></a><span class="operator">(</span><span class="cons_Op"><a href="#B_12_5" id="B_41_16" title="Defined at line 12"><span class="token sort_Id">B</span></a>()</span><span class="operator">,</span> <a href="#move_53_3" id="move_41_21" title="Defined at line 53"><span class="token sort_Id">move</span></a><span class="operator">((</span><span class="cons_Var"><a href="#left_40_20" id="left_41_27" title="Defined at line 40"><span class="token sort_Id">left</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="#One_18_5" id="One_41_33" title="Defined at line 18"><span class="token sort_Id">One</span></a>()</span><span class="operator">,</span> <span class="cons_Var"><a href="#right_40_33" id="right_41_40" title="Defined at line 40"><span class="token sort_Id">right</span></a></span><span class="operator">),</span> <span class="cons_Op"><a href="#L_22_5" id="L_41_48" title="Defined at line 22"><span class="token sort_Id">L</span></a>()</span><span class="operator">)).</span>

  <a href="#busybeaver_29_3" id="busybeaver_43_3" title="Defined at line 29"><span class="token sort_Id">busybeaver</span></a><span class="operator">(</span><span class="cons_Op"><a href="#C_13_5" id="C_43_14" title="Defined at line 13"><span class="token sort_Id">C</span></a>()</span><span class="operator">,</span> <span class="operator">(</span><span class="cons_Var"><a href="#left_44_27" id="left_43_20" title="Referenced at line 44"><span class="token sort_Id">left</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="#Zero_17_5" id="Zero_43_26" title="Defined at line 17"><span class="token sort_Id">Zero</span></a>()</span><span class="operator">,</span> <span class="cons_Var"><a href="#right_44_40" id="right_43_34" title="Referenced at line 44"><span class="token sort_Id">right</span></a></span><span class="operator">))</span> <span class="operator">:-</span>
    <a href="#busybeaver_29_3" id="busybeaver_44_5" title="Defined at line 29"><span class="token sort_Id">busybeaver</span></a><span class="operator">(</span><span class="cons_Op"><a href="#B_12_5" id="B_44_16" title="Defined at line 12"><span class="token sort_Id">B</span></a>()</span><span class="operator">,</span> <a href="#move_53_3" id="move_44_21" title="Defined at line 53"><span class="token sort_Id">move</span></a><span class="operator">((</span><span class="cons_Var"><a href="#left_43_20" id="left_44_27" title="Defined at line 43"><span class="token sort_Id">left</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="#One_18_5" id="One_44_33" title="Defined at line 18"><span class="token sort_Id">One</span></a>()</span><span class="operator">,</span> <span class="cons_Var"><a href="#right_43_34" id="right_44_40" title="Defined at line 43"><span class="token sort_Id">right</span></a></span><span class="operator">),</span> <span class="cons_Op"><a href="#L_22_5" id="L_44_48" title="Defined at line 22"><span class="token sort_Id">L</span></a>()</span><span class="operator">)).</span>

  <a href="#busybeaver_29_3" id="busybeaver_46_3" title="Defined at line 29"><span class="token sort_Id">busybeaver</span></a><span class="operator">(</span><span class="cons_Op"><a href="#C_13_5" id="C_46_14" title="Defined at line 13"><span class="token sort_Id">C</span></a>()</span><span class="operator">,</span> <span class="operator">(</span><span class="cons_Var"><a href="#left_47_30" id="left_46_20" title="Referenced at line 47"><span class="token sort_Id">left</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="#One_18_5" id="One_46_26" title="Defined at line 18"><span class="token sort_Id">One</span></a>()</span><span class="operator">,</span> <span class="cons_Var"><a href="#right_47_43" id="right_46_33" title="Referenced at line 47"><span class="token sort_Id">right</span></a></span><span class="operator">))</span> <span class="operator">:-</span>
    <a href="#busybeaver_29_3" id="busybeaver_47_5" title="Defined at line 29"><span class="token sort_Id">busybeaver</span></a><span class="operator">(</span><span class="cons_Op"><a href="#HALT_14_5" id="HALT_47_16" title="Defined at line 14"><span class="token sort_Id">HALT</span></a>()</span><span class="operator">,</span> <a href="#move_53_3" id="move_47_24" title="Defined at line 53"><span class="token sort_Id">move</span></a><span class="operator">((</span><span class="cons_Var"><a href="#left_46_20" id="left_47_30" title="Defined at line 46"><span class="token sort_Id">left</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="#One_18_5" id="One_47_36" title="Defined at line 18"><span class="token sort_Id">One</span></a>()</span><span class="operator">,</span> <span class="cons_Var"><a href="#right_46_33" id="right_47_43" title="Defined at line 46"><span class="token sort_Id">right</span></a></span><span class="operator">),</span> <span class="cons_Op"><a href="#R_21_5" id="R_47_51" title="Defined at line 21"><span class="token sort_Id">R</span></a>()</span><span class="operator">)).</span>

  <a href="#busybeaver_29_3" id="busybeaver_49_3" title="Defined at line 29"><span class="token sort_Id">busybeaver</span></a><span class="operator">(</span><span class="cons_Op"><a href="#HALT_14_5" id="HALT_49_14" title="Defined at line 14"><span class="token sort_Id">HALT</span></a>()</span><span class="operator">,</span> <span class="operator">(</span><span class="cons_Var"><span id="left_49_23" title="Not referenced"><span class="token sort_Id">left</span></span></span><span class="operator">,</span> <span class="cons_Var"><span id="s_49_29" title="Not referenced"><span class="token sort_Id">s</span></span></span><span class="operator">,</span> <span class="cons_Var"><span id="right_49_32" title="Not referenced"><span class="token sort_Id">right</span></span></span><span class="operator">)).</span>

<span class="keyword">rules</span>

  <a href="#move_32_21" id="move_53_3" title="Referenced at line 32, 35, 38, 41, 44, 47, 55, 57, 59, 61, 63"><span class="token sort_Id">move</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#Tape_25_9" id="Tape_53_10" title="Defined at line 25"><span class="token sort_Id">Tape</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#Move_20_9" id="Move_53_17" title="Defined at line 20"><span class="token sort_Id">Move</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#Tape_25_9" id="Tape_53_25" title="Defined at line 25"><span class="token sort_Id">Tape</span></a></span>

  <a href="#move_53_3" id="move_55_3" title="Defined at line 53"><span class="token sort_Id">move</span></a><span class="operator">((</span><span class="cons_Var">left</span><span class="operator">,</span> <span class="cons_Var">s</span><span class="operator">,</span> <span class="operator">[</span><span class="cons_Var"><span id="s'_55_19" title="Not referenced"><span class="token sort_Id">s'</span></span></span><span class="operator">|</span><span class="cons_Var"><span id="right_55_22" title="Not referenced"><span class="token sort_Id">right</span></span></span><span class="operator">]),</span> <span class="cons_Op"><a href="#R_21_5" id="R_55_31" title="Defined at line 21"><span class="token sort_Id">R</span></a>()</span><span class="operator">)</span> <span class="operator">=</span> <span class="operator">([</span><span class="cons_Var"><span id="s_55_40" title="Not referenced"><span class="token sort_Id">s</span></span></span><span class="operator">|</span><span class="cons_Var"><span id="left_55_42" title="Not referenced"><span class="token sort_Id">left</span></span></span><span class="operator">],</span> <span class="cons_Var">s'</span><span class="operator">,</span> <span class="cons_Var">right</span><span class="operator">).</span>

  <a href="#move_53_3" id="move_57_3" title="Defined at line 53"><span class="token sort_Id">move</span></a><span class="operator">((</span><span class="cons_Var"><span id="left_57_9" title="Not referenced"><span class="token sort_Id">left</span></span></span><span class="operator">,</span> <span class="cons_Var"><span id="s_57_15" title="Not referenced"><span class="token sort_Id">s</span></span></span><span class="operator">,</span> <span class="operator">[]),</span> <span class="cons_Op"><a href="#R_21_5" id="R_57_23" title="Defined at line 21"><span class="token sort_Id">R</span></a>()</span><span class="operator">)</span> <span class="operator">=</span> <span class="operator">([</span><span class="cons_Var">s</span><span class="operator">|</span><span class="cons_Var">left</span><span class="operator">],</span> <span class="cons_Op"><a href="#Zero_17_5" id="Zero_57_41" title="Defined at line 17"><span class="token sort_Id">Zero</span></a>()</span><span class="operator">,</span> <span class="operator">[]).</span>

  <a href="#move_53_3" id="move_59_3" title="Defined at line 53"><span class="token sort_Id">move</span></a><span class="operator">(([</span><span class="cons_Var">s'</span><span class="operator">|</span><span class="cons_Var">left</span><span class="operator">],</span> <span class="cons_Var">s</span><span class="operator">,</span> <span class="cons_Var">right</span><span class="operator">),</span> <span class="cons_Op"><a href="#L_22_5" id="L_59_31" title="Defined at line 22"><span class="token sort_Id">L</span></a>()</span><span class="operator">)</span> <span class="operator">=</span> <span class="operator">(</span><span class="cons_Var"><span id="left_59_39" title="Not referenced"><span class="token sort_Id">left</span></span></span><span class="operator">,</span> <span class="cons_Var"><span id="s'_59_45" title="Not referenced"><span class="token sort_Id">s'</span></span></span><span class="operator">,</span> <span class="operator">[</span><span class="cons_Var"><span id="s_59_50" title="Not referenced"><span class="token sort_Id">s</span></span></span><span class="operator">|</span><span class="cons_Var"><span id="right_59_52" title="Not referenced"><span class="token sort_Id">right</span></span></span><span class="operator">]).</span>

  <a href="#move_53_3" id="move_61_3" title="Defined at line 53"><span class="token sort_Id">move</span></a><span class="operator">(([],</span> <span class="cons_Var"><span id="s_61_13" title="Not referenced"><span class="token sort_Id">s</span></span></span><span class="operator">,</span> <span class="cons_Var">right</span><span class="operator">),</span> <span class="cons_Op"><a href="#L_22_5" id="L_61_24" title="Defined at line 22"><span class="token sort_Id">L</span></a>()</span><span class="operator">)</span> <span class="operator">=</span> <span class="operator">([],</span> <span class="cons_Op"><a href="#Zero_17_5" id="Zero_61_36" title="Defined at line 17"><span class="token sort_Id">Zero</span></a>()</span><span class="operator">,</span> <span class="operator">[</span><span class="cons_Var">s</span><span class="operator">|</span><span class="cons_Var"><span id="right_61_47" title="Not referenced"><span class="token sort_Id">right</span></span></span><span class="operator">]).</span>

  <a href="#move_53_3" id="move_63_3" title="Defined at line 53"><span class="token sort_Id">move</span></a><span class="operator">(</span><span class="cons_Var">T</span><span class="operator">,</span> <span class="cons_Op"><a href="#N_23_5" id="N_63_11" title="Defined at line 23"><span class="token sort_Id">N</span></a>()</span><span class="operator">)</span> <span class="operator">=</span> <span class="cons_Var"><span id="T_63_18" title="Not referenced"><span class="token sort_Id">T</span></span></span><span class="operator">.</span>

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
