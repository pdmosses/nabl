---
title: bb-rules.stx
hide:
  - toc
---

# `bb-rules.stx`

:simple-github: [pdmosses/nabl/statix.example/src/busybeaver/bb-rules.stx]

[pdmosses/nabl/statix.example/src/busybeaver/bb-rules.stx]: https://github.com/pdmosses/nabl/blob/master/statix.example/src/busybeaver/bb-rules.stx "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="layout">// 3-state Busy Beaver Turing machine specification</span>
<span class="layout">// https://en.wikipedia.org/wiki/Turing_machine_examples#3-state_Busy_Beaver</span>

<span class="keyword">module</span> <a href="../bb-test.stxtest/#busybeaver/bb-rules_11_3" id="busybeaver/bb-rules_4_8" title="Referenced at ../bb-test.stxtest line 11"><span class="token sort_Id">busybeaver/bb-rules</span></a>

<span class="keyword">imports</span>

  <a href="../bb-sig.stx/#busybeaver/bb-sig_4_8" id="busybeaver/bb-sig_8_3" title="Defined at ../bb-sig.stx line 4"><span class="token sort_Id">busybeaver/bb-sig</span></a>

<span class="keyword">rules</span>

  <button class="modal-open" id="busybeaver_12_3" title="Multi-file references" data-urls="#busybeaver_14_3 line 14, 15, 17, 18, 20, 21, 23, 24, 26, 27, 29, 30, 32; ../bb-test.stxtest/#busybeaver_6_3 line 6"><span class="token sort_Id">busybeaver</span></button> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="../bb-sig.stx/#State_8_9" id="State_12_16" title="Defined at ../bb-sig.stx line 8"><span class="token sort_Id">State</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="../bb-sig.stx/#Tape_23_9" id="Tape_12_24" title="Defined at ../bb-sig.stx line 23"><span class="token sort_Id">Tape</span></a></span>

  <a href="#busybeaver_12_3" id="busybeaver_14_3" title="Defined at line 12"><span class="token sort_Id">busybeaver</span></a><span class="operator">(</span><span class="cons_Op"><a href="../bb-sig.stx/#A_9_5" id="A_14_14" title="Defined at ../bb-sig.stx line 9"><span class="token sort_Id">A</span></a>()</span><span class="operator">,</span> <span class="operator">(</span><span class="cons_Var"><a href="#left_15_27" id="left_14_20" title="Referenced at line 15"><span class="token sort_Id">left</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="../bb-sig.stx/#Zero_15_5" id="Zero_14_26" title="Defined at ../bb-sig.stx line 15"><span class="token sort_Id">Zero</span></a>()</span><span class="operator">,</span> <span class="cons_Var"><a href="#right_15_40" id="right_14_34" title="Referenced at line 15"><span class="token sort_Id">right</span></a></span><span class="operator">))</span> <span class="operator">:-</span>
    <a href="#busybeaver_12_3" id="busybeaver_15_5" title="Defined at line 12"><span class="token sort_Id">busybeaver</span></a><span class="operator">(</span><span class="cons_Op"><a href="../bb-sig.stx/#B_10_5" id="B_15_16" title="Defined at ../bb-sig.stx line 10"><span class="token sort_Id">B</span></a>()</span><span class="operator">,</span> <a href="#move_36_3" id="move_15_21" title="Defined at line 36"><span class="token sort_Id">move</span></a><span class="operator">((</span><span class="cons_Var"><a href="#left_14_20" id="left_15_27" title="Defined at line 14"><span class="token sort_Id">left</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="../bb-sig.stx/#One_16_5" id="One_15_33" title="Defined at ../bb-sig.stx line 16"><span class="token sort_Id">One</span></a>()</span><span class="operator">,</span> <span class="cons_Var"><a href="#right_14_34" id="right_15_40" title="Defined at line 14"><span class="token sort_Id">right</span></a></span><span class="operator">),</span> <span class="cons_Op"><a href="../bb-sig.stx/#R_19_5" id="R_15_48" title="Defined at ../bb-sig.stx line 19"><span class="token sort_Id">R</span></a>()</span><span class="operator">)).</span>

  <a href="#busybeaver_12_3" id="busybeaver_17_3" title="Defined at line 12"><span class="token sort_Id">busybeaver</span></a><span class="operator">(</span><span class="cons_Op"><a href="../bb-sig.stx/#A_9_5" id="A_17_14" title="Defined at ../bb-sig.stx line 9"><span class="token sort_Id">A</span></a>()</span><span class="operator">,</span> <span class="operator">(</span><span class="cons_Var"><a href="#left_18_27" id="left_17_20" title="Referenced at line 18"><span class="token sort_Id">left</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="../bb-sig.stx/#One_16_5" id="One_17_26" title="Defined at ../bb-sig.stx line 16"><span class="token sort_Id">One</span></a>()</span><span class="operator">,</span> <span class="cons_Var"><a href="#right_18_40" id="right_17_33" title="Referenced at line 18"><span class="token sort_Id">right</span></a></span><span class="operator">))</span> <span class="operator">:-</span>
    <a href="#busybeaver_12_3" id="busybeaver_18_5" title="Defined at line 12"><span class="token sort_Id">busybeaver</span></a><span class="operator">(</span><span class="cons_Op"><a href="../bb-sig.stx/#C_11_5" id="C_18_16" title="Defined at ../bb-sig.stx line 11"><span class="token sort_Id">C</span></a>()</span><span class="operator">,</span> <a href="#move_36_3" id="move_18_21" title="Defined at line 36"><span class="token sort_Id">move</span></a><span class="operator">((</span><span class="cons_Var"><a href="#left_17_20" id="left_18_27" title="Defined at line 17"><span class="token sort_Id">left</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="../bb-sig.stx/#One_16_5" id="One_18_33" title="Defined at ../bb-sig.stx line 16"><span class="token sort_Id">One</span></a>()</span><span class="operator">,</span> <span class="cons_Var"><a href="#right_17_33" id="right_18_40" title="Defined at line 17"><span class="token sort_Id">right</span></a></span><span class="operator">),</span> <span class="cons_Op"><a href="../bb-sig.stx/#L_20_5" id="L_18_48" title="Defined at ../bb-sig.stx line 20"><span class="token sort_Id">L</span></a>()</span><span class="operator">)).</span>

  <a href="#busybeaver_12_3" id="busybeaver_20_3" title="Defined at line 12"><span class="token sort_Id">busybeaver</span></a><span class="operator">(</span><span class="cons_Op"><a href="../bb-sig.stx/#B_10_5" id="B_20_14" title="Defined at ../bb-sig.stx line 10"><span class="token sort_Id">B</span></a>()</span><span class="operator">,</span> <span class="operator">(</span><span class="cons_Var"><a href="#left_21_27" id="left_20_20" title="Referenced at line 21"><span class="token sort_Id">left</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="../bb-sig.stx/#Zero_15_5" id="Zero_20_26" title="Defined at ../bb-sig.stx line 15"><span class="token sort_Id">Zero</span></a>()</span><span class="operator">,</span> <span class="cons_Var"><a href="#right_21_40" id="right_20_34" title="Referenced at line 21"><span class="token sort_Id">right</span></a></span><span class="operator">))</span> <span class="operator">:-</span>
    <a href="#busybeaver_12_3" id="busybeaver_21_5" title="Defined at line 12"><span class="token sort_Id">busybeaver</span></a><span class="operator">(</span><span class="cons_Op"><a href="../bb-sig.stx/#A_9_5" id="A_21_16" title="Defined at ../bb-sig.stx line 9"><span class="token sort_Id">A</span></a>()</span><span class="operator">,</span> <a href="#move_36_3" id="move_21_21" title="Defined at line 36"><span class="token sort_Id">move</span></a><span class="operator">((</span><span class="cons_Var"><a href="#left_20_20" id="left_21_27" title="Defined at line 20"><span class="token sort_Id">left</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="../bb-sig.stx/#One_16_5" id="One_21_33" title="Defined at ../bb-sig.stx line 16"><span class="token sort_Id">One</span></a>()</span><span class="operator">,</span> <span class="cons_Var"><a href="#right_20_34" id="right_21_40" title="Defined at line 20"><span class="token sort_Id">right</span></a></span><span class="operator">),</span> <span class="cons_Op"><a href="../bb-sig.stx/#L_20_5" id="L_21_48" title="Defined at ../bb-sig.stx line 20"><span class="token sort_Id">L</span></a>()</span><span class="operator">)).</span>

  <a href="#busybeaver_12_3" id="busybeaver_23_3" title="Defined at line 12"><span class="token sort_Id">busybeaver</span></a><span class="operator">(</span><span class="cons_Op"><a href="../bb-sig.stx/#B_10_5" id="B_23_14" title="Defined at ../bb-sig.stx line 10"><span class="token sort_Id">B</span></a>()</span><span class="operator">,</span> <span class="operator">(</span><span class="cons_Var"><a href="#left_24_27" id="left_23_20" title="Referenced at line 24"><span class="token sort_Id">left</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="../bb-sig.stx/#One_16_5" id="One_23_26" title="Defined at ../bb-sig.stx line 16"><span class="token sort_Id">One</span></a>()</span><span class="operator">,</span> <span class="cons_Var"><a href="#right_24_40" id="right_23_33" title="Referenced at line 24"><span class="token sort_Id">right</span></a></span><span class="operator">))</span> <span class="operator">:-</span>
    <a href="#busybeaver_12_3" id="busybeaver_24_5" title="Defined at line 12"><span class="token sort_Id">busybeaver</span></a><span class="operator">(</span><span class="cons_Op"><a href="../bb-sig.stx/#B_10_5" id="B_24_16" title="Defined at ../bb-sig.stx line 10"><span class="token sort_Id">B</span></a>()</span><span class="operator">,</span> <a href="#move_36_3" id="move_24_21" title="Defined at line 36"><span class="token sort_Id">move</span></a><span class="operator">((</span><span class="cons_Var"><a href="#left_23_20" id="left_24_27" title="Defined at line 23"><span class="token sort_Id">left</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="../bb-sig.stx/#One_16_5" id="One_24_33" title="Defined at ../bb-sig.stx line 16"><span class="token sort_Id">One</span></a>()</span><span class="operator">,</span> <span class="cons_Var"><a href="#right_23_33" id="right_24_40" title="Defined at line 23"><span class="token sort_Id">right</span></a></span><span class="operator">),</span> <span class="cons_Op"><a href="../bb-sig.stx/#L_20_5" id="L_24_48" title="Defined at ../bb-sig.stx line 20"><span class="token sort_Id">L</span></a>()</span><span class="operator">)).</span>

  <a href="#busybeaver_12_3" id="busybeaver_26_3" title="Defined at line 12"><span class="token sort_Id">busybeaver</span></a><span class="operator">(</span><span class="cons_Op"><a href="../bb-sig.stx/#C_11_5" id="C_26_14" title="Defined at ../bb-sig.stx line 11"><span class="token sort_Id">C</span></a>()</span><span class="operator">,</span> <span class="operator">(</span><span class="cons_Var"><a href="#left_27_27" id="left_26_20" title="Referenced at line 27"><span class="token sort_Id">left</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="../bb-sig.stx/#Zero_15_5" id="Zero_26_26" title="Defined at ../bb-sig.stx line 15"><span class="token sort_Id">Zero</span></a>()</span><span class="operator">,</span> <span class="cons_Var"><a href="#right_27_40" id="right_26_34" title="Referenced at line 27"><span class="token sort_Id">right</span></a></span><span class="operator">))</span> <span class="operator">:-</span>
    <a href="#busybeaver_12_3" id="busybeaver_27_5" title="Defined at line 12"><span class="token sort_Id">busybeaver</span></a><span class="operator">(</span><span class="cons_Op"><a href="../bb-sig.stx/#B_10_5" id="B_27_16" title="Defined at ../bb-sig.stx line 10"><span class="token sort_Id">B</span></a>()</span><span class="operator">,</span> <a href="#move_36_3" id="move_27_21" title="Defined at line 36"><span class="token sort_Id">move</span></a><span class="operator">((</span><span class="cons_Var"><a href="#left_26_20" id="left_27_27" title="Defined at line 26"><span class="token sort_Id">left</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="../bb-sig.stx/#One_16_5" id="One_27_33" title="Defined at ../bb-sig.stx line 16"><span class="token sort_Id">One</span></a>()</span><span class="operator">,</span> <span class="cons_Var"><a href="#right_26_34" id="right_27_40" title="Defined at line 26"><span class="token sort_Id">right</span></a></span><span class="operator">),</span> <span class="cons_Op"><a href="../bb-sig.stx/#L_20_5" id="L_27_48" title="Defined at ../bb-sig.stx line 20"><span class="token sort_Id">L</span></a>()</span><span class="operator">)).</span>

  <a href="#busybeaver_12_3" id="busybeaver_29_3" title="Defined at line 12"><span class="token sort_Id">busybeaver</span></a><span class="operator">(</span><span class="cons_Op"><a href="../bb-sig.stx/#C_11_5" id="C_29_14" title="Defined at ../bb-sig.stx line 11"><span class="token sort_Id">C</span></a>()</span><span class="operator">,</span> <span class="operator">(</span><span class="cons_Var"><a href="#left_30_30" id="left_29_20" title="Referenced at line 30"><span class="token sort_Id">left</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="../bb-sig.stx/#One_16_5" id="One_29_26" title="Defined at ../bb-sig.stx line 16"><span class="token sort_Id">One</span></a>()</span><span class="operator">,</span> <span class="cons_Var"><a href="#right_30_43" id="right_29_33" title="Referenced at line 30"><span class="token sort_Id">right</span></a></span><span class="operator">))</span> <span class="operator">:-</span>
    <a href="#busybeaver_12_3" id="busybeaver_30_5" title="Defined at line 12"><span class="token sort_Id">busybeaver</span></a><span class="operator">(</span><span class="cons_Op"><a href="../bb-sig.stx/#HALT_12_5" id="HALT_30_16" title="Defined at ../bb-sig.stx line 12"><span class="token sort_Id">HALT</span></a>()</span><span class="operator">,</span> <a href="#move_36_3" id="move_30_24" title="Defined at line 36"><span class="token sort_Id">move</span></a><span class="operator">((</span><span class="cons_Var"><a href="#left_29_20" id="left_30_30" title="Defined at line 29"><span class="token sort_Id">left</span></a></span><span class="operator">,</span> <span class="cons_Op"><a href="../bb-sig.stx/#One_16_5" id="One_30_36" title="Defined at ../bb-sig.stx line 16"><span class="token sort_Id">One</span></a>()</span><span class="operator">,</span> <span class="cons_Var"><a href="#right_29_33" id="right_30_43" title="Defined at line 29"><span class="token sort_Id">right</span></a></span><span class="operator">),</span> <span class="cons_Op"><a href="../bb-sig.stx/#R_19_5" id="R_30_51" title="Defined at ../bb-sig.stx line 19"><span class="token sort_Id">R</span></a>()</span><span class="operator">)).</span>

  <a href="#busybeaver_12_3" id="busybeaver_32_3" title="Defined at line 12"><span class="token sort_Id">busybeaver</span></a><span class="operator">(</span><span class="cons_Op"><a href="../bb-sig.stx/#HALT_12_5" id="HALT_32_14" title="Defined at ../bb-sig.stx line 12"><span class="token sort_Id">HALT</span></a>()</span><span class="operator">,</span> <span class="operator">(</span><span class="cons_Var"><span id="left_32_23" title="Not referenced"><span class="token sort_Id">left</span></span></span><span class="operator">,</span> <span class="cons_Var"><span id="s_32_29" title="Not referenced"><span class="token sort_Id">s</span></span></span><span class="operator">,</span> <span class="cons_Var"><span id="right_32_32" title="Not referenced"><span class="token sort_Id">right</span></span></span><span class="operator">)).</span>

<span class="keyword">rules</span>

  <a href="#move_15_21" id="move_36_3" title="Referenced at line 15, 18, 21, 24, 27, 30, 38, 40, 42, 44, 46"><span class="token sort_Id">move</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="../bb-sig.stx/#Tape_23_9" id="Tape_36_10" title="Defined at ../bb-sig.stx line 23"><span class="token sort_Id">Tape</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="../bb-sig.stx/#Move_18_9" id="Move_36_17" title="Defined at ../bb-sig.stx line 18"><span class="token sort_Id">Move</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="../bb-sig.stx/#Tape_23_9" id="Tape_36_25" title="Defined at ../bb-sig.stx line 23"><span class="token sort_Id">Tape</span></a></span>

  <a href="#move_36_3" id="move_38_3" title="Defined at line 36"><span class="token sort_Id">move</span></a><span class="operator">((</span><span class="cons_Var">left</span><span class="operator">,</span> <span class="cons_Var">s</span><span class="operator">,</span> <span class="operator">[</span><span class="cons_Var">s'</span><span class="operator">|</span><span class="cons_Var"><span id="right_38_22" title="Not referenced"><span class="token sort_Id">right</span></span></span><span class="operator">]),</span> <span class="cons_Op"><a href="../bb-sig.stx/#R_19_5" id="R_38_31" title="Defined at ../bb-sig.stx line 19"><span class="token sort_Id">R</span></a>()</span><span class="operator">)</span> <span class="operator">=</span> <span class="operator">([</span><span class="cons_Var"><span id="s_38_40" title="Not referenced"><span class="token sort_Id">s</span></span></span><span class="operator">|</span><span class="cons_Var"><span id="left_38_42" title="Not referenced"><span class="token sort_Id">left</span></span></span><span class="operator">],</span> <span class="cons_Var"><span id="s'_38_49" title="Not referenced"><span class="token sort_Id">s'</span></span></span><span class="operator">,</span> <span class="cons_Var">right</span><span class="operator">).</span>

  <a href="#move_36_3" id="move_40_3" title="Defined at line 36"><span class="token sort_Id">move</span></a><span class="operator">((</span><span class="cons_Var"><span id="left_40_9" title="Not referenced"><span class="token sort_Id">left</span></span></span><span class="operator">,</span> <span class="cons_Var">s</span><span class="operator">,</span> <span class="operator">[]),</span> <span class="cons_Op"><a href="../bb-sig.stx/#R_19_5" id="R_40_23" title="Defined at ../bb-sig.stx line 19"><span class="token sort_Id">R</span></a>()</span><span class="operator">)</span> <span class="operator">=</span> <span class="operator">([</span><span class="cons_Var"><span id="s_40_32" title="Not referenced"><span class="token sort_Id">s</span></span></span><span class="operator">|</span><span class="cons_Var">left</span><span class="operator">],</span> <span class="cons_Op"><a href="../bb-sig.stx/#Zero_15_5" id="Zero_40_41" title="Defined at ../bb-sig.stx line 15"><span class="token sort_Id">Zero</span></a>()</span><span class="operator">,</span> <span class="operator">[]).</span>

  <a href="#move_36_3" id="move_42_3" title="Defined at line 36"><span class="token sort_Id">move</span></a><span class="operator">(([</span><span class="cons_Var">s'</span><span class="operator">|</span><span class="cons_Var">left</span><span class="operator">],</span> <span class="cons_Var">s</span><span class="operator">,</span> <span class="cons_Var">right</span><span class="operator">),</span> <span class="cons_Op"><a href="../bb-sig.stx/#L_20_5" id="L_42_31" title="Defined at ../bb-sig.stx line 20"><span class="token sort_Id">L</span></a>()</span><span class="operator">)</span> <span class="operator">=</span> <span class="operator">(</span><span class="cons_Var"><span id="left_42_39" title="Not referenced"><span class="token sort_Id">left</span></span></span><span class="operator">,</span> <span class="cons_Var"><span id="s'_42_45" title="Not referenced"><span class="token sort_Id">s'</span></span></span><span class="operator">,</span> <span class="operator">[</span><span class="cons_Var"><span id="s_42_50" title="Not referenced"><span class="token sort_Id">s</span></span></span><span class="operator">|</span><span class="cons_Var"><span id="right_42_52" title="Not referenced"><span class="token sort_Id">right</span></span></span><span class="operator">]).</span>

  <a href="#move_36_3" id="move_44_3" title="Defined at line 36"><span class="token sort_Id">move</span></a><span class="operator">(([],</span> <span class="cons_Var">s</span><span class="operator">,</span> <span class="cons_Var">right</span><span class="operator">),</span> <span class="cons_Op"><a href="../bb-sig.stx/#L_20_5" id="L_44_24" title="Defined at ../bb-sig.stx line 20"><span class="token sort_Id">L</span></a>()</span><span class="operator">)</span> <span class="operator">=</span> <span class="operator">([],</span> <span class="cons_Op"><a href="../bb-sig.stx/#Zero_15_5" id="Zero_44_36" title="Defined at ../bb-sig.stx line 15"><span class="token sort_Id">Zero</span></a>()</span><span class="operator">,</span> <span class="operator">[</span><span class="cons_Var"><span id="s_44_45" title="Not referenced"><span class="token sort_Id">s</span></span></span><span class="operator">|</span><span class="cons_Var"><span id="right_44_47" title="Not referenced"><span class="token sort_Id">right</span></span></span><span class="operator">]).</span>

  <a href="#move_36_3" id="move_46_3" title="Defined at line 36"><span class="token sort_Id">move</span></a><span class="operator">(</span><span class="cons_Var"><span id="T_46_8" title="Not referenced"><span class="token sort_Id">T</span></span></span><span class="operator">,</span> <span class="cons_Op"><a href="../bb-sig.stx/#N_21_5" id="N_46_11" title="Defined at ../bb-sig.stx line 21"><span class="token sort_Id">N</span></a>()</span><span class="operator">)</span> <span class="operator">=</span> <span class="cons_Var">T</span><span class="operator">.</span>

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
