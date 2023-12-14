---
title: nonlinear-patterns.stx
hide:
  - toc
---

# `nonlinear-patterns.stx`

:simple-github: [pdmosses/nabl/statix.example/src/overlapping-rules/nonlinear-patterns.stx]

[pdmosses/nabl/statix.example/src/overlapping-rules/nonlinear-patterns.stx]: https://github.com/pdmosses/nabl/blob/master/statix.example/src/overlapping-rules/nonlinear-patterns.stx "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <span id="overlapping-rules/nonlinear-patterns_1_8" title="Not referenced"><span class="token sort_Id">overlapping-rules/nonlinear-patterns</span></span>

<span class="keyword">signature</span>
  <span class="keyword">sorts</span> <span class="cons_SortDecl"><a href="#S_5_16" id="S_4_9" title="Referenced at line 5, 6, 7, 25, 39, 44, 50, 56"><span class="token sort_Id">S</span></a></span> <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><span id="F_5_5" title="Not referenced"><span class="token sort_Id">F</span></span> <span class="operator">:</span> <span class="cons_IntSort">int</span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#S_4_9" id="S_5_16" title="Defined at line 4"><span class="token sort_Id">S</span></a></span></span>
    <span class="cons_OpDecl"><a href="#G_26_9" id="G_6_5" title="Referenced at line 26, 57, 58"><span class="token sort_Id">G</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#S_4_9" id="S_6_9" title="Defined at line 4"><span class="token sort_Id">S</span></a></span></span>
    <span class="cons_OpDecl"><span id="H_7_5" title="Not referenced"><span class="token sort_Id">H</span></span> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#S_4_9" id="S_7_9" title="Defined at line 4"><span class="token sort_Id">S</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#S_4_9" id="S_7_13" title="Defined at line 4"><span class="token sort_Id">S</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#S_4_9" id="S_7_18" title="Defined at line 4"><span class="token sort_Id">S</span></a></span></span>

<span class="keyword">rules</span>

  <span class="layout">// FIXME</span>
  <a href="#p04_13_3" id="p04_12_3" title="Referenced at line 13, 14"><span class="token sort_Id">p04</span></a> <span class="operator">:</span> <span class="cons_IntSort">int</span> <span class="operator">*</span> <span class="cons_IntSort">int</span>
  <a href="#p04_12_3" id="p04_13_3" title="Defined at line 12"><span class="token sort_Id">p04</span></a><span class="operator">(</span><span class="cons_Var">x</span><span class="operator">,</span><span class="cons_Var"><span id="x_13_9" title="Not referenced"><span class="token sort_Id">x</span></span></span><span class="operator">).</span> <span class="layout">// p04(x,y) :- x == y.</span>
  <a href="#p04_12_3" id="p04_14_3" title="Defined at line 12"><span class="token sort_Id">p04</span></a><span class="operator">(</span><span class="cons_Var"><span id="x_14_7" title="Not referenced"><span class="token sort_Id">x</span></span></span><span class="operator">,</span><span class="cons_Var"><span id="y_14_9" title="Not referenced"><span class="token sort_Id">y</span></span></span><span class="operator">).</span> <span class="layout">// p04(x,y) :- x != y.</span>

<span class="keyword">rules</span>  

  <a href="#p05_19_3" id="p05_18_3" title="Referenced at line 19, 20"><span class="token sort_Id">p05</span></a> <span class="operator">:</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_IntSort">int</span><span class="operator">)</span> <span class="operator">*</span> <span class="cons_IntSort">int</span>
  <a href="#p05_18_3" id="p05_19_3" title="Defined at line 18"><span class="token sort_Id">p05</span></a><span class="operator">(</span><span class="cons_Var"><span id="xs_19_7" title="Not referenced"><span class="token sort_Id">xs</span></span></span><span class="operator">@[</span><span class="cons_Var"><span id="y_19_11" title="Not referenced"><span class="token sort_Id">y</span></span></span><span class="operator">],</span> <span class="cons_Var">y</span><span class="operator">).</span>
  <a href="#p05_18_3" id="p05_20_3" title="Defined at line 18"><span class="token sort_Id">p05</span></a><span class="operator">(</span><span class="cons_Var"><span id="xs_20_7" title="Not referenced"><span class="token sort_Id">xs</span></span></span><span class="operator">,</span> <span class="cons_Var"><span id="y_20_11" title="Not referenced"><span class="token sort_Id">y</span></span></span><span class="operator">).</span> <span class="layout">// p05(xs@[], y).</span>
              <span class="layout">// p05(xs@[_|[_|_]], y).</span>

<span class="keyword">rules</span>

  <a href="#p09_26_3" id="p09_25_3" title="Referenced at line 26, 27"><span class="token sort_Id">p09</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#S_4_9" id="S_25_9" title="Defined at line 4"><span class="token sort_Id">S</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#S_4_9" id="S_25_13" title="Defined at line 4"><span class="token sort_Id">S</span></a></span>
  <a href="#p09_25_3" id="p09_26_3" title="Defined at line 25"><span class="token sort_Id">p09</span></a><span class="operator">(</span><span class="cons_Var"><span id="x_26_7" title="Not referenced"><span class="token sort_Id">x</span></span></span><span class="operator">@</span><span class="cons_Op"><a href="#G_6_5" id="G_26_9" title="Defined at line 6"><span class="token sort_Id">G</span></a>()</span><span class="operator">,</span> <span class="cons_Var">x</span><span class="operator">).</span>
  <a href="#p09_25_3" id="p09_27_3" title="Defined at line 25"><span class="token sort_Id">p09</span></a><span class="operator">(</span><span class="cons_Var"><span id="x_27_7" title="Not referenced"><span class="token sort_Id">x</span></span></span><span class="operator">,</span> <span class="cons_Var"><span id="y_27_10" title="Not referenced"><span class="token sort_Id">y</span></span></span><span class="operator">).</span> <span class="layout">// p09(x@F(_), y).</span>
             <span class="layout">// p09(x@H(_, _), y).</span>

<span class="keyword">rules</span>

  <span class="layout">// TODO Are the inequalities necessary, and correct?</span>
  <a href="#p13_34_3" id="p13_33_3" title="Referenced at line 34, 35"><span class="token sort_Id">p13</span></a> <span class="operator">:</span> <span class="cons_IntSort">int</span> <span class="operator">*</span> <span class="cons_IntSort">int</span> <span class="operator">*</span> <span class="cons_IntSort">int</span>
  <a href="#p13_33_3" id="p13_34_3" title="Defined at line 33"><span class="token sort_Id">p13</span></a><span class="operator">(</span><span class="cons_Var"><span id="x_34_7" title="Not referenced"><span class="token sort_Id">x</span></span></span><span class="operator">,</span> <span class="cons_Var">x</span><span class="operator">,</span> <span class="cons_Var"><span id="y_34_13" title="Not referenced"><span class="token sort_Id">y</span></span></span><span class="operator">).</span> <span class="layout">// p13(x, z, y) :- x == z, x != y.</span>
  <a href="#p13_33_3" id="p13_35_3" title="Defined at line 33"><span class="token sort_Id">p13</span></a><span class="operator">(</span><span class="cons_Var"><span id="x_35_7" title="Not referenced"><span class="token sort_Id">x</span></span></span><span class="operator">,</span> <span class="cons_Var"><span id="y_35_10" title="Not referenced"><span class="token sort_Id">y</span></span></span><span class="operator">,</span> <span class="cons_Var">x</span><span class="operator">).</span> <span class="layout">// p13(x, y, z) :- x == z, x != y.</span>

<span class="keyword">rules</span>

  <span id="p14_39_3" title="Not referenced"><span class="token sort_Id">p14</span></span> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#S_4_9" id="S_39_9" title="Defined at line 4"><span class="token sort_Id">S</span></a></span>
<span class="layout">//p14(x@F(x)).</span>

<span class="keyword">rules</span>

  <span id="p15_44_3" title="Not referenced"><span class="token sort_Id">p15</span></span> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#S_4_9" id="S_44_9" title="Defined at line 4"><span class="token sort_Id">S</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#S_4_9" id="S_44_13" title="Defined at line 4"><span class="token sort_Id">S</span></a></span>
<span class="layout">//p15(H(x@F(_),G()),x).</span>
<span class="layout">//p15(H(F(_),x@G()),x).</span>

<span class="keyword">rules</span>

  <span id="p16_50_3" title="Not referenced"><span class="token sort_Id">p16</span></span> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#S_4_9" id="S_50_9" title="Defined at line 4"><span class="token sort_Id">S</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#S_4_9" id="S_50_13" title="Defined at line 4"><span class="token sort_Id">S</span></a></span>
<span class="layout">//p16(H(x@G(),G()),x).</span>
<span class="layout">//p16(H(G(),x@G()),x).</span>

<span class="keyword">rules</span>

  <a href="#p17_57_3" id="p17_56_3" title="Referenced at line 57, 58"><span class="token sort_Id">p17</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#S_4_9" id="S_56_9" title="Defined at line 4"><span class="token sort_Id">S</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#S_4_9" id="S_56_13" title="Defined at line 4"><span class="token sort_Id">S</span></a></span>
  <a href="#p17_56_3" id="p17_57_3" title="Defined at line 56"><span class="token sort_Id">p17</span></a><span class="operator">(</span><span class="cons_Var"><span id="x_57_7" title="Not referenced"><span class="token sort_Id">x</span></span></span><span class="operator">@</span><span class="cons_Op"><a href="#G_6_5" id="G_57_9" title="Defined at line 6"><span class="token sort_Id">G</span></a>()</span><span class="operator">,</span><span class="cons_Var">x</span><span class="operator">).</span>
  <a href="#p17_56_3" id="p17_58_3" title="Defined at line 56"><span class="token sort_Id">p17</span></a><span class="operator">(</span><span class="cons_Op"><a href="#G_6_5" id="G_58_7" title="Defined at line 6"><span class="token sort_Id">G</span></a>()</span><span class="operator">,</span><span class="cons_Var"><span id="x_58_11" title="Not referenced"><span class="token sort_Id">x</span></span></span><span class="operator">).</span>

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
