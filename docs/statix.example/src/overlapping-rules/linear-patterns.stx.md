---
title: linear-patterns.stx
hide:
  - toc
---

# `linear-patterns.stx`

:simple-github: [pdmosses/nabl/statix.example/src/overlapping-rules/linear-patterns.stx]

[pdmosses/nabl/statix.example/src/overlapping-rules/linear-patterns.stx]: https://github.com/pdmosses/nabl/blob/master/statix.example/src/overlapping-rules/linear-patterns.stx "The source file on GitHub"

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
64
65
66
67
68
69
70
71
72
73
74
75
76
77
78
79
80
81
82
83
84
85
86
87
88
89
90
91
92
93
94
95
96
97
98
99
100
101
102
103
104
105
106
107
108
109
110
111
112
113
114
115
116
117
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <span id="overlapping-rules/linear-patterns_1_8" title="Not referenced"><span class="token sort_Id">overlapping-rules/linear-patterns</span></span>

<span class="keyword">signature</span>
  <span class="keyword">sorts</span> <span class="cons_SortDecl"><a href="#S_5_16" id="S_4_9" title="Referenced at line 5, 6, 7, 38, 43, 49, 56, 62, 68, 74, 106, 114"><span class="token sort_Id">S</span></a></span> <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><a href="#F_44_7" id="F_5_5" title="Referenced at line 44, 57, 63, 69"><span class="token sort_Id">F</span></a> <span class="operator">:</span> <span class="cons_IntSort">int</span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#S_4_9" id="S_5_16" title="Defined at line 4"><span class="token sort_Id">S</span></a></span></span>
    <span class="cons_OpDecl"><a href="#G_45_7" id="G_6_5" title="Referenced at line 45, 50, 57, 58, 64, 70, 75, 107, 108, 109, 115, 116"><span class="token sort_Id">G</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#S_4_9" id="S_6_9" title="Defined at line 4"><span class="token sort_Id">S</span></a></span></span>
    <span class="cons_OpDecl"><a href="#H_50_7" id="H_7_5" title="Referenced at line 50, 51, 75"><span class="token sort_Id">H</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#S_4_9" id="S_7_9" title="Defined at line 4"><span class="token sort_Id">S</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#S_4_9" id="S_7_13" title="Defined at line 4"><span class="token sort_Id">S</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#S_4_9" id="S_7_18" title="Defined at line 4"><span class="token sort_Id">S</span></a></span></span>

<span class="keyword">rules</span>

  <span class="layout">// p01 No general case</span>
  <a href="#p01_13_3" id="p01_12_3" title="Referenced at line 13"><span class="token sort_Id">p01</span></a> <span class="operator">:</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_IntSort">int</span><span class="operator">)</span>
  <a href="#p01_12_3" id="p01_13_3" title="Defined at line 12"><span class="token sort_Id">p01</span></a><span class="operator">([_]).</span>

<span class="keyword">rules</span>

  <span class="layout">// p02 Top-level general case</span>
  <a href="#p02_19_3" id="p02_18_3" title="Referenced at line 19, 20"><span class="token sort_Id">p02</span></a> <span class="operator">:</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_IntSort">int</span><span class="operator">)</span>
  <a href="#p02_18_3" id="p02_19_3" title="Defined at line 18"><span class="token sort_Id">p02</span></a><span class="operator">([]).</span>
  <a href="#p02_18_3" id="p02_20_3" title="Defined at line 18"><span class="token sort_Id">p02</span></a><span class="operator">(</span><span class="cons_Var"><span id="xs_20_7" title="Not referenced"><span class="token sort_Id">xs</span></span></span><span class="operator">).</span> <span class="layout">// p02(xs@[_|_]).</span>

<span class="keyword">rules</span>

  <span class="layout">// p03 Nested case</span>
  <a href="#p03_26_3" id="p03_25_3" title="Referenced at line 26, 27"><span class="token sort_Id">p03</span></a> <span class="operator">:</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_IntSort">int</span><span class="operator">)</span>
  <a href="#p03_25_3" id="p03_26_3" title="Defined at line 25"><span class="token sort_Id">p03</span></a><span class="operator">([_]).</span>
  <a href="#p03_25_3" id="p03_27_3" title="Defined at line 25"><span class="token sort_Id">p03</span></a><span class="operator">([_|</span><span class="cons_Var"><span id="xs_27_10" title="Not referenced"><span class="token sort_Id">xs</span></span></span><span class="operator">]).</span> <span class="layout">// p03([_|xs@[_|_]]).</span>

<span class="keyword">rules</span>

  <a href="#p06_32_3" id="p06_31_3" title="Referenced at line 32, 33, 34"><span class="token sort_Id">p06</span></a> <span class="operator">:</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_IntSort">int</span><span class="operator">)</span> <span class="operator">*</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_IntSort">int</span><span class="operator">)</span>
  <a href="#p06_31_3" id="p06_32_3" title="Defined at line 31"><span class="token sort_Id">p06</span></a><span class="operator">([],</span> <span class="cons_Var"><span id="ys_32_11" title="Not referenced"><span class="token sort_Id">ys</span></span></span><span class="operator">).</span>
  <a href="#p06_31_3" id="p06_33_3" title="Defined at line 31"><span class="token sort_Id">p06</span></a><span class="operator">(</span><span class="cons_Var"><span id="xs_33_7" title="Not referenced"><span class="token sort_Id">xs</span></span></span><span class="operator">,</span> <span class="operator">[]).</span> <span class="layout">// p06(xs@[_|_], []).</span>
  <a href="#p06_31_3" id="p06_34_3" title="Defined at line 31"><span class="token sort_Id">p06</span></a><span class="operator">(</span><span class="cons_Var"><span id="xs_34_7" title="Not referenced"><span class="token sort_Id">xs</span></span></span><span class="operator">,</span> <span class="cons_Var"><span id="ys_34_11" title="Not referenced"><span class="token sort_Id">ys</span></span></span><span class="operator">).</span> <span class="layout">// p06(xs@[_|_], [_|_]).</span>

<span class="keyword">rules</span>

  <a href="#p07_39_3" id="p07_38_3" title="Referenced at line 39"><span class="token sort_Id">p07</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#S_4_9" id="S_38_9" title="Defined at line 4"><span class="token sort_Id">S</span></a></span>
  <a href="#p07_38_3" id="p07_39_3" title="Defined at line 38"><span class="token sort_Id">p07</span></a><span class="operator">(</span><span class="cons_Var"><span id="x_39_7" title="Not referenced"><span class="token sort_Id">x</span></span></span><span class="operator">).</span>
  
<span class="keyword">rules</span>

  <a href="#p08_44_3" id="p08_43_3" title="Referenced at line 44, 45"><span class="token sort_Id">p08</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#S_4_9" id="S_43_9" title="Defined at line 4"><span class="token sort_Id">S</span></a></span>
  <a href="#p08_43_3" id="p08_44_3" title="Defined at line 43"><span class="token sort_Id">p08</span></a><span class="operator">(</span><span class="cons_Op"><a href="#F_5_5" id="F_44_7" title="Defined at line 5"><span class="token sort_Id">F</span></a>(_)</span><span class="operator">).</span>
  <a href="#p08_43_3" id="p08_45_3" title="Defined at line 43"><span class="token sort_Id">p08</span></a><span class="operator">(</span><span class="cons_Op"><a href="#G_6_5" id="G_45_7" title="Defined at line 6"><span class="token sort_Id">G</span></a>()</span><span class="operator">).</span>

<span class="keyword">rules</span>

  <a href="#p10_50_3" id="p10_49_3" title="Referenced at line 50, 51"><span class="token sort_Id">p10</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#S_4_9" id="S_49_9" title="Defined at line 4"><span class="token sort_Id">S</span></a></span>
  <a href="#p10_49_3" id="p10_50_3" title="Defined at line 49"><span class="token sort_Id">p10</span></a><span class="operator">(</span><span class="cons_Op"><a href="#H_7_5" id="H_50_7" title="Defined at line 7"><span class="token sort_Id">H</span></a><span class="operator">(</span><span class="cons_Op"><a href="#G_6_5" id="G_50_9" title="Defined at line 6"><span class="token sort_Id">G</span></a>()</span>, _)</span><span class="operator">).</span>
  <a href="#p10_49_3" id="p10_51_3" title="Defined at line 49"><span class="token sort_Id">p10</span></a><span class="operator">(</span><span class="cons_Op"><a href="#H_7_5" id="H_51_7" title="Defined at line 7"><span class="token sort_Id">H</span></a>(_, _)</span><span class="operator">).</span> <span class="layout">// p10(H(F(_), _))</span>
                <span class="layout">// p10(H(H(_, _), _))</span>

<span class="keyword">rules</span>

  <a href="#p11_57_3" id="p11_56_3" title="Referenced at line 57, 58"><span class="token sort_Id">p11</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#S_4_9" id="S_56_9" title="Defined at line 4"><span class="token sort_Id">S</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#S_4_9" id="S_56_13" title="Defined at line 4"><span class="token sort_Id">S</span></a></span>
  <a href="#p11_56_3" id="p11_57_3" title="Defined at line 56"><span class="token sort_Id">p11</span></a><span class="operator">(</span><span class="cons_Op"><a href="#F_5_5" id="F_57_7" title="Defined at line 5"><span class="token sort_Id">F</span></a>(_)</span><span class="operator">,</span> <span class="cons_Op"><a href="#G_6_5" id="G_57_13" title="Defined at line 6"><span class="token sort_Id">G</span></a>()</span><span class="operator">).</span>
  <a href="#p11_56_3" id="p11_58_3" title="Defined at line 56"><span class="token sort_Id">p11</span></a><span class="operator">(</span><span class="cons_Op"><a href="#G_6_5" id="G_58_7" title="Defined at line 6"><span class="token sort_Id">G</span></a>()</span><span class="operator">,</span> <span class="cons_Var"><span id="x_58_12" title="Not referenced"><span class="token sort_Id">x</span></span></span><span class="operator">).</span>

<span class="keyword">rules</span>

  <a href="#p12_63_3" id="p12_62_3" title="Referenced at line 63, 64"><span class="token sort_Id">p12</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#S_4_9" id="S_62_9" title="Defined at line 4"><span class="token sort_Id">S</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#S_4_9" id="S_62_13" title="Defined at line 4"><span class="token sort_Id">S</span></a></span>
  <a href="#p12_62_3" id="p12_63_3" title="Defined at line 62"><span class="token sort_Id">p12</span></a><span class="operator">(</span><span class="cons_Op"><a href="#F_5_5" id="F_63_7" title="Defined at line 5"><span class="token sort_Id">F</span></a>(_)</span><span class="operator">,</span> <span class="cons_Var"><span id="x_63_13" title="Not referenced"><span class="token sort_Id">x</span></span></span><span class="operator">).</span>
  <a href="#p12_62_3" id="p12_64_3" title="Defined at line 62"><span class="token sort_Id">p12</span></a><span class="operator">(</span><span class="cons_Op"><a href="#G_6_5" id="G_64_7" title="Defined at line 6"><span class="token sort_Id">G</span></a>()</span><span class="operator">,</span> <span class="cons_Var"><span id="x_64_12" title="Not referenced"><span class="token sort_Id">x</span></span></span><span class="operator">).</span>

<span class="keyword">rules</span>

  <a href="#p18_69_3" id="p18_68_3" title="Referenced at line 69, 70"><span class="token sort_Id">p18</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#S_4_9" id="S_68_9" title="Defined at line 4"><span class="token sort_Id">S</span></a></span>
  <a href="#p18_68_3" id="p18_69_3" title="Defined at line 68"><span class="token sort_Id">p18</span></a><span class="operator">(</span><span class="cons_Op"><a href="#F_5_5" id="F_69_7" title="Defined at line 5"><span class="token sort_Id">F</span></a>(_)</span><span class="operator">).</span>
  <a href="#p18_68_3" id="p18_70_3" title="Defined at line 68"><span class="token sort_Id">p18</span></a><span class="operator">(</span><span class="cons_Var"><span id="x_70_7" title="Not referenced"><span class="token sort_Id">x</span></span></span><span class="operator">@</span><span class="cons_Op"><a href="#G_6_5" id="G_70_9" title="Defined at line 6"><span class="token sort_Id">G</span></a>()</span><span class="operator">).</span>

<span class="keyword">rules</span>

  <a href="#p19_75_3" id="p19_74_3" title="Referenced at line 75, 76"><span class="token sort_Id">p19</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#S_4_9" id="S_74_9" title="Defined at line 4"><span class="token sort_Id">S</span></a></span>
  <a href="#p19_74_3" id="p19_75_3" title="Defined at line 74"><span class="token sort_Id">p19</span></a><span class="operator">(</span><span class="cons_Op"><a href="#H_7_5" id="H_75_7" title="Defined at line 7"><span class="token sort_Id">H</span></a><span class="operator">(</span><span class="cons_Op"><a href="#G_6_5" id="G_75_9" title="Defined at line 6"><span class="token sort_Id">G</span></a>()</span>, _)</span><span class="operator">).</span>
  <a href="#p19_74_3" id="p19_76_3" title="Defined at line 74"><span class="token sort_Id">p19</span></a><span class="operator">(</span><span class="cons_Var"><span id="x_76_7" title="Not referenced"><span class="token sort_Id">x</span></span></span><span class="operator">).</span> <span class="layout">// p19(x@F(_)).</span>
          <span class="layout">// p19(x@G()).</span>
          <span class="layout">// p19(x@H(F(_), _)).</span>
          <span class="layout">// p19(x@H(H(_, _), _)).</span>

<span class="keyword">rules</span>

  <a href="#p20_84_3" id="p20_83_3" title="Referenced at line 84, 85"><span class="token sort_Id">p20</span></a> <span class="operator">:</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_IntSort">int</span><span class="operator">)</span>
  <a href="#p20_83_3" id="p20_84_3" title="Defined at line 83"><span class="token sort_Id">p20</span></a><span class="operator">([_]).</span>
  <a href="#p20_83_3" id="p20_85_3" title="Defined at line 83"><span class="token sort_Id">p20</span></a><span class="operator">(</span><span class="cons_Var"><span id="xs_85_7" title="Not referenced"><span class="token sort_Id">xs</span></span></span><span class="operator">).</span> <span class="layout">// p20(xs@[]).</span>
           <span class="layout">// p20(xs@[_,_|_]).</span>

<span class="keyword">rules</span>

  <a href="#p21_91_3" id="p21_90_3" title="Referenced at line 91, 92, 93"><span class="token sort_Id">p21</span></a> <span class="operator">:</span> <span class="cons_StringSort">string</span>
  <a href="#p21_90_3" id="p21_91_3" title="Defined at line 90"><span class="token sort_Id">p21</span></a><span class="operator">(</span><span class="cons_Str"><span class="operator">"</span>x"</span><span class="operator">).</span>
  <a href="#p21_90_3" id="p21_92_3" title="Defined at line 90"><span class="token sort_Id">p21</span></a><span class="operator">(</span><span class="cons_Str"><span class="operator">"</span>y"</span><span class="operator">).</span>
  <a href="#p21_90_3" id="p21_93_3" title="Defined at line 90"><span class="token sort_Id">p21</span></a><span class="operator">(</span><span class="cons_Str"><span class="operator">"</span>z"</span><span class="operator">).</span>
<span class="layout">//p21(_). // not supported</span>

<span class="keyword">rules</span>

  <a href="#p22_99_3" id="p22_98_3" title="Referenced at line 99, 100, 101"><span class="token sort_Id">p22</span></a> <span class="operator">:</span> <span class="cons_IntSort">int</span>
  <a href="#p22_98_3" id="p22_99_3" title="Defined at line 98"><span class="token sort_Id">p22</span></a><span class="operator">(</span>1<span class="operator">).</span>
  <a href="#p22_98_3" id="p22_100_3" title="Defined at line 98"><span class="token sort_Id">p22</span></a><span class="operator">(</span>2<span class="operator">).</span>
  <a href="#p22_98_3" id="p22_101_3" title="Defined at line 98"><span class="token sort_Id">p22</span></a><span class="operator">(</span>4<span class="operator">).</span>
<span class="layout">//p22(_). // not supported</span>

<span class="keyword">rules</span>

  <a href="#p23_107_3" id="p23_106_3" title="Referenced at line 107, 108, 109, 110"><span class="token sort_Id">p23</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#S_4_9" id="S_106_9" title="Defined at line 4"><span class="token sort_Id">S</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#S_4_9" id="S_106_13" title="Defined at line 4"><span class="token sort_Id">S</span></a></span>
  <a href="#p23_106_3" id="p23_107_3" title="Defined at line 106"><span class="token sort_Id">p23</span></a><span class="operator">(</span><span class="cons_Op"><a href="#G_6_5" id="G_107_7" title="Defined at line 6"><span class="token sort_Id">G</span></a>()</span><span class="operator">,</span> <span class="cons_Op"><a href="#G_6_5" id="G_107_12" title="Defined at line 6"><span class="token sort_Id">G</span></a>()</span><span class="operator">).</span>
  <a href="#p23_106_3" id="p23_108_3" title="Defined at line 106"><span class="token sort_Id">p23</span></a><span class="operator">(</span><span class="cons_Op"><a href="#G_6_5" id="G_108_7" title="Defined at line 6"><span class="token sort_Id">G</span></a>()</span><span class="operator">,</span> <span class="operator">_).</span>
  <a href="#p23_106_3" id="p23_109_3" title="Defined at line 106"><span class="token sort_Id">p23</span></a><span class="operator">(_,</span> <span class="cons_Op"><a href="#G_6_5" id="G_109_10" title="Defined at line 6"><span class="token sort_Id">G</span></a>()</span><span class="operator">).</span>
  <a href="#p23_106_3" id="p23_110_3" title="Defined at line 106"><span class="token sort_Id">p23</span></a><span class="operator">(_,</span> <span class="operator">_).</span>

<span class="keyword">rules</span>

  <a href="#p24_115_3" id="p24_114_3" title="Referenced at line 115, 116, 117"><span class="token sort_Id">p24</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#S_4_9" id="S_114_9" title="Defined at line 4"><span class="token sort_Id">S</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#S_4_9" id="S_114_13" title="Defined at line 4"><span class="token sort_Id">S</span></a></span>
  <a href="#p24_114_3" id="p24_115_3" title="Defined at line 114"><span class="token sort_Id">p24</span></a><span class="operator">(</span><span class="cons_Op"><a href="#G_6_5" id="G_115_7" title="Defined at line 6"><span class="token sort_Id">G</span></a>()</span><span class="operator">,</span> <span class="cons_Op"><a href="#G_6_5" id="G_115_12" title="Defined at line 6"><span class="token sort_Id">G</span></a>()</span><span class="operator">).</span>
  <a href="#p24_114_3" id="p24_116_3" title="Defined at line 114"><span class="token sort_Id">p24</span></a><span class="operator">(</span><span class="cons_Op"><a href="#G_6_5" id="G_116_7" title="Defined at line 6"><span class="token sort_Id">G</span></a>()</span><span class="operator">,</span> <span class="operator">_).</span>
  <a href="#p24_114_3" id="p24_117_3" title="Defined at line 114"><span class="token sort_Id">p24</span></a><span class="operator">(_,</span> <span class="operator">_).</span>

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
