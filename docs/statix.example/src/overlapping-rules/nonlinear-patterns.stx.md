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
<td class="code"><pre><code><span class="token keyword">module</span> <span id="overlapping-rules/nonlinear-patterns_7_43" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">overlapping</span>-<span class="token keyword">rules</span>/<span class="token sort_ConstraintId">nonlinear</span>-<span class="token sort_ConstraintId">patterns</span></span>

<span class="token keyword">signature</span>
  <span class="token sort_ConstraintId">sorts</span> <span class="cons_SortDecl"><a href="#S_93_94" id="S_63_64" title="Referenced at line 5, 6, 7, 7, 7, 25, 25, 39, 44, 44, 50, 50, 56, 56"><span class="token sort_OpId">S</span></a></span> <span class="token sort_ConstraintId">constructors</span>
    <span id="F_82_83" title="Not referenced locally, nor via imports"><span class="token sort_OpId">F</span></span> : <span class="token keyword">in</span><span class="token sort_ConstraintId">t</span> -&gt; <span class="cons_SimpleSort"><a href="#S_63_64" id="S_93_94" title="Defined at line 4"><span class="token sort_OpId">S</span></a></span>
    <a href="#G_384_385" id="G_99_100" title="Referenced at line 26, 57, 58"><span class="token sort_OpId">G</span></a> : <span class="cons_SimpleSort"><a href="#S_63_64" id="S_103_104" title="Defined at line 4"><span class="token sort_OpId">S</span></a></span>
    <span id="H_109_110" title="Not referenced locally, nor via imports"><span class="token sort_OpId">H</span></span> : <span class="cons_SimpleSort"><a href="#S_63_64" id="S_113_114" title="Defined at line 4"><span class="token sort_OpId">S</span></a></span> * <span class="cons_SimpleSort"><a href="#S_63_64" id="S_117_118" title="Defined at line 4"><span class="token sort_OpId">S</span></a></span> -&gt; <span class="cons_SimpleSort"><a href="#S_63_64" id="S_122_123" title="Defined at line 4"><span class="token sort_OpId">S</span></a></span>

<span class="token keyword">rules</span>

  <span class="token layout">// FIXME</span>
  <a href="#p04_163_166" id="p04_145_148" title="Referenced at line 13, 14"><span class="token sort_ConstraintId">p04</span></a> : <span class="token keyword">in</span><span class="token sort_ConstraintId">t</span> * <span class="token keyword">in</span><span class="token sort_ConstraintId">t</span>
  <a href="#p04_145_148" id="p04_163_166" title="Defined at line 12"><span class="token sort_ConstraintId">p04</span></a>(<span class="cons_Var"><span id="x_167_168" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">x</span></span></span>,<span class="cons_Var">x</span>). <span class="token layout">// p04(x,y) :- x == y.</span>
  <a href="#p04_145_148" id="p04_198_201" title="Defined at line 12"><span class="token sort_ConstraintId">p04</span></a>(<span class="cons_Var"><span id="x_202_203" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">x</span></span></span>,<span class="cons_Var"><span id="y_204_205" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">y</span></span></span>). <span class="token layout">// p04(x,y) :- x != y.</span>

<span class="token keyword">rules</span>  

  <a href="#p05_267_270" id="p05_243_246" title="Referenced at line 19, 20"><span class="token sort_ConstraintId">p05</span></a> : <span class="token sort_ConstraintId">list</span>(<span class="token keyword">in</span><span class="token sort_ConstraintId">t</span>) * <span class="token keyword">in</span><span class="token sort_ConstraintId">t</span>
  <a href="#p05_243_246" id="p05_267_270" title="Defined at line 18"><span class="token sort_ConstraintId">p05</span></a>(<span class="cons_Var"><span id="xs_271_273" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">xs</span></span></span>@[<span class="cons_Var">y</span>], <span class="cons_Var"><span id="y_279_280" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">y</span></span></span>).
  <a href="#p05_243_246" id="p05_285_288" title="Defined at line 18"><span class="token sort_ConstraintId">p05</span></a>(<span class="cons_Var"><span id="xs_289_291" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">xs</span></span></span>, <span class="cons_Var"><span id="y_293_294" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">y</span></span></span>). <span class="token layout">// p05(xs@[], y).</span>
              <span class="token layout">// p05(xs@[_|[_|_]], y).</span>

<span class="token keyword">rules</span>

  <a href="#p09_378_381" id="p09_364_367" title="Referenced at line 26, 27"><span class="token sort_ConstraintId">p09</span></a> : <span class="cons_SimpleSort"><a href="#S_63_64" id="S_370_371" title="Defined at line 4"><span class="token sort_OpId">S</span></a></span> * <span class="cons_SimpleSort"><a href="#S_63_64" id="S_374_375" title="Defined at line 4"><span class="token sort_OpId">S</span></a></span>
  <a href="#p09_364_367" id="p09_378_381" title="Defined at line 25"><span class="token sort_ConstraintId">p09</span></a>(<span class="cons_Var">x</span>@<a href="#G_99_100" id="G_384_385" title="Defined at line 6"><span class="token sort_OpId">G</span></a>(), <span class="cons_Var"><span id="x_389_390" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">x</span></span></span>).
  <a href="#p09_364_367" id="p09_395_398" title="Defined at line 25"><span class="token sort_ConstraintId">p09</span></a>(<span class="cons_Var"><span id="x_399_400" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">x</span></span></span>, <span class="cons_Var"><span id="y_402_403" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">y</span></span></span>). <span class="token layout">// p09(x@F(_), y).</span>
             <span class="token layout">// p09(x@H(_, _), y).</span>

<span class="token keyword">rules</span>

  <span class="token layout">// TODO Are the inequalities necessary, and correct?</span>
  <a href="#p13_549_552" id="p13_525_528" title="Referenced at line 34, 35"><span class="token sort_ConstraintId">p13</span></a> : <span class="token keyword">in</span><span class="token sort_ConstraintId">t</span> * <span class="token keyword">in</span><span class="token sort_ConstraintId">t</span> * <span class="token keyword">in</span><span class="token sort_ConstraintId">t</span>
  <a href="#p13_525_528" id="p13_549_552" title="Defined at line 33"><span class="token sort_ConstraintId">p13</span></a>(<span class="cons_Var">x</span>, <span class="cons_Var"><span id="x_556_557" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">x</span></span></span>, <span class="cons_Var"><span id="y_559_560" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">y</span></span></span>). <span class="token layout">// p13(x, z, y) :- x == z, x != y.</span>
  <a href="#p13_525_528" id="p13_600_603" title="Defined at line 33"><span class="token sort_ConstraintId">p13</span></a>(<span class="cons_Var"><span id="x_604_605" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">x</span></span></span>, <span class="cons_Var"><span id="y_607_608" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">y</span></span></span>, <span class="cons_Var">x</span>). <span class="token layout">// p13(x, y, z) :- x == z, x != y.</span>

<span class="token keyword">rules</span>

  <span id="p14_659_662" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">p14</span></span> : <span class="cons_SimpleSort"><a href="#S_63_64" id="S_665_666" title="Defined at line 4"><span class="token sort_OpId">S</span></a></span>
<span class="token layout">//p14(x@F(x)).</span>

<span class="token keyword">rules</span>

  <span id="p15_692_695" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">p15</span></span> : <span class="cons_SimpleSort"><a href="#S_63_64" id="S_698_699" title="Defined at line 4"><span class="token sort_OpId">S</span></a></span> * <span class="cons_SimpleSort"><a href="#S_63_64" id="S_702_703" title="Defined at line 4"><span class="token sort_OpId">S</span></a></span>
<span class="token layout">//p15(H(x@F(_),G()),x).</span>
<span class="token layout">//p15(H(F(_),x@G()),x).</span>

<span class="token keyword">rules</span>

  <span id="p16_762_765" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">p16</span></span> : <span class="cons_SimpleSort"><a href="#S_63_64" id="S_768_769" title="Defined at line 4"><span class="token sort_OpId">S</span></a></span> * <span class="cons_SimpleSort"><a href="#S_63_64" id="S_772_773" title="Defined at line 4"><span class="token sort_OpId">S</span></a></span>
<span class="token layout">//p16(H(x@G(),G()),x).</span>
<span class="token layout">//p16(H(G(),x@G()),x).</span>

<span class="token keyword">rules</span>

  <a href="#p17_844_847" id="p17_830_833" title="Referenced at line 57, 58"><span class="token sort_ConstraintId">p17</span></a> : <span class="cons_SimpleSort"><a href="#S_63_64" id="S_836_837" title="Defined at line 4"><span class="token sort_OpId">S</span></a></span> * <span class="cons_SimpleSort"><a href="#S_63_64" id="S_840_841" title="Defined at line 4"><span class="token sort_OpId">S</span></a></span>
  <a href="#p17_830_833" id="p17_844_847" title="Defined at line 56"><span class="token sort_ConstraintId">p17</span></a>(<span class="cons_Var"><span id="x_848_849" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">x</span></span></span>@<a href="#G_99_100" id="G_850_851" title="Defined at line 6"><span class="token sort_OpId">G</span></a>(),<span class="cons_Var">x</span>).
  <a href="#p17_830_833" id="p17_860_863" title="Defined at line 56"><span class="token sort_ConstraintId">p17</span></a>(<a href="#G_99_100" id="G_864_865" title="Defined at line 6"><span class="token sort_OpId">G</span></a>(),<span class="cons_Var"><span id="x_868_869" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">x</span></span></span>).

</code></pre></td></tr></tbody></table></div>