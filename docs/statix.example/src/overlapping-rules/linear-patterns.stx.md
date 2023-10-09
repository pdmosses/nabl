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
<td class="code"><pre><code><span class="keyword">module</span> <span id="overlapping-rules/linear-patterns_7_40" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">overlapping</span><span class="operator">-</span><span class="keyword">rules</span><span class="operator">/</span><span class="token sort_ConstraintId">linear</span><span class="operator">-</span><span class="token sort_ConstraintId">patterns</span></span>

<span class="keyword">signature</span>
  <span class="keyword">sorts</span> <span class="cons_SortDecl"><a href="#S_90_91" id="S_60_61" title="Referenced at line 5, 6, 7, 7, 7, 38, 43, 49, 56, 56, 62, 62, 68, 74, 106, 106, 114, 114"><span class="token sort_OpId">S</span></a></span> <span class="keyword">constructors</span>
    <a href="#F_562_563" id="F_79_80" title="Referenced at line 44, 57, 63, 69"><span class="token sort_OpId">F</span></a> <span class="operator">:</span> <span class="cons_IntSort">int</span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#S_60_61" id="S_90_91" title="Defined at line 4"><span class="token sort_OpId">S</span></a></span>
    <a href="#G_575_576" id="G_96_97" title="Referenced at line 45, 50, 57, 58, 64, 70, 75, 107, 107, 108, 109, 115, 115, 116"><span class="token sort_OpId">G</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#S_60_61" id="S_100_101" title="Defined at line 4"><span class="token sort_OpId">S</span></a></span>
    <a href="#H_605_606" id="H_106_107" title="Referenced at line 50, 51, 75"><span class="token sort_OpId">H</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#S_60_61" id="S_110_111" title="Defined at line 4"><span class="token sort_OpId">S</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#S_60_61" id="S_114_115" title="Defined at line 4"><span class="token sort_OpId">S</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#S_60_61" id="S_119_120" title="Defined at line 4"><span class="token sort_OpId">S</span></a></span>

<span class="keyword">rules</span>

  <span class="layout">// p01 No general case</span>
  <a href="#p01_174_177" id="p01_156_159" title="Referenced at line 13"><span class="token sort_ConstraintId">p01</span></a> <span class="operator">:</span> <span class="token sort_ConstraintId">list</span><span class="operator">(</span><span class="cons_IntSort">int</span><span class="operator">)</span>
  <a href="#p01_156_159" id="p01_174_177" title="Defined at line 12"><span class="token sort_ConstraintId">p01</span></a><span class="operator">([_]).</span>

<span class="keyword">rules</span>

  <span class="layout">// p02 Top-level general case</span>
  <a href="#p02_244_247" id="p02_226_229" title="Referenced at line 19, 20"><span class="token sort_ConstraintId">p02</span></a> <span class="operator">:</span> <span class="token sort_ConstraintId">list</span><span class="operator">(</span><span class="cons_IntSort">int</span><span class="operator">)</span>
  <a href="#p02_226_229" id="p02_244_247" title="Defined at line 18"><span class="token sort_ConstraintId">p02</span></a><span class="operator">([]).</span>
  <a href="#p02_226_229" id="p02_255_258" title="Defined at line 18"><span class="token sort_ConstraintId">p02</span></a><span class="operator">(</span><span class="cons_Var"><span id="xs_259_261" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">xs</span></span></span><span class="operator">).</span> <span class="layout">// p02(xs@[_|_]).</span>

<span class="keyword">rules</span>

  <span class="layout">// p03 Nested case</span>
  <a href="#p03_331_334" id="p03_313_316" title="Referenced at line 26, 27"><span class="token sort_ConstraintId">p03</span></a> <span class="operator">:</span> <span class="token sort_ConstraintId">list</span><span class="operator">(</span><span class="cons_IntSort">int</span><span class="operator">)</span>
  <a href="#p03_313_316" id="p03_331_334" title="Defined at line 25"><span class="token sort_ConstraintId">p03</span></a><span class="operator">([_]).</span>
  <a href="#p03_313_316" id="p03_343_346" title="Defined at line 25"><span class="token sort_ConstraintId">p03</span></a><span class="operator">([_|</span><span class="cons_Var"><span id="xs_350_352" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">xs</span></span></span><span class="operator">]).</span> <span class="layout">// p03([_|xs@[_|_]]).</span>

<span class="keyword">rules</span>

  <a href="#p06_418_421" id="p06_388_391" title="Referenced at line 32, 33, 34"><span class="token sort_ConstraintId">p06</span></a> <span class="operator">:</span> <span class="token sort_ConstraintId">list</span><span class="operator">(</span><span class="cons_IntSort">int</span><span class="operator">)</span> <span class="operator">*</span> <span class="token sort_ConstraintId">list</span><span class="operator">(</span><span class="cons_IntSort">int</span><span class="operator">)</span>
  <a href="#p06_388_391" id="p06_418_421" title="Defined at line 31"><span class="token sort_ConstraintId">p06</span></a><span class="operator">([],</span> <span class="cons_Var"><span id="ys_426_428" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">ys</span></span></span><span class="operator">).</span>
  <a href="#p06_388_391" id="p06_433_436" title="Defined at line 31"><span class="token sort_ConstraintId">p06</span></a><span class="operator">(</span><span class="cons_Var"><span id="xs_437_439" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">xs</span></span></span><span class="operator">,</span> <span class="operator">[]).</span> <span class="layout">// p06(xs@[_|_], []).</span>
  <a href="#p06_388_391" id="p06_470_473" title="Defined at line 31"><span class="token sort_ConstraintId">p06</span></a><span class="operator">(</span><span class="cons_Var"><span id="xs_474_476" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">xs</span></span></span><span class="operator">,</span> <span class="cons_Var"><span id="ys_478_480" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">ys</span></span></span><span class="operator">).</span> <span class="layout">// p06(xs@[_|_], [_|_]).</span>

<span class="keyword">rules</span>

  <a href="#p07_528_531" id="p07_518_521" title="Referenced at line 39"><span class="token sort_ConstraintId">p07</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#S_60_61" id="S_524_525" title="Defined at line 4"><span class="token sort_OpId">S</span></a></span>
  <a href="#p07_518_521" id="p07_528_531" title="Defined at line 38"><span class="token sort_ConstraintId">p07</span></a><span class="operator">(</span><span class="cons_Var"><span id="x_532_533" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">x</span></span></span><span class="operator">).</span>
  
<span class="keyword">rules</span>

  <a href="#p08_558_561" id="p08_548_551" title="Referenced at line 44, 45"><span class="token sort_ConstraintId">p08</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#S_60_61" id="S_554_555" title="Defined at line 4"><span class="token sort_OpId">S</span></a></span>
  <a href="#p08_548_551" id="p08_558_561" title="Defined at line 43"><span class="token sort_ConstraintId">p08</span></a><span class="operator">(</span><a href="#F_79_80" id="F_562_563" title="Defined at line 5"><span class="token sort_OpId">F</span></a><span class="operator">(_)).</span>
  <a href="#p08_548_551" id="p08_571_574" title="Defined at line 43"><span class="token sort_ConstraintId">p08</span></a><span class="operator">(</span><a href="#G_96_97" id="G_575_576" title="Defined at line 6"><span class="token sort_OpId">G</span></a><span class="operator">()).</span>

<span class="keyword">rules</span>

  <a href="#p10_601_604" id="p10_591_594" title="Referenced at line 50, 51"><span class="token sort_ConstraintId">p10</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#S_60_61" id="S_597_598" title="Defined at line 4"><span class="token sort_OpId">S</span></a></span>
  <a href="#p10_591_594" id="p10_601_604" title="Defined at line 49"><span class="token sort_ConstraintId">p10</span></a><span class="operator">(</span><a href="#H_106_107" id="H_605_606" title="Defined at line 7"><span class="token sort_OpId">H</span></a><span class="operator">(</span><a href="#G_96_97" id="G_607_608" title="Defined at line 6"><span class="token sort_OpId">G</span></a><span class="operator">(),</span> <span class="operator">_)).</span>
  <a href="#p10_591_594" id="p10_619_622" title="Defined at line 49"><span class="token sort_ConstraintId">p10</span></a><span class="operator">(</span><a href="#H_106_107" id="H_623_624" title="Defined at line 7"><span class="token sort_OpId">H</span></a><span class="operator">(_,</span> <span class="operator">_)).</span> <span class="layout">// p10(H(F(_), _))</span>
                <span class="layout">// p10(H(H(_, _), _))</span>

<span class="keyword">rules</span>

  <a href="#p11_714_717" id="p11_700_703" title="Referenced at line 57, 58"><span class="token sort_ConstraintId">p11</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#S_60_61" id="S_706_707" title="Defined at line 4"><span class="token sort_OpId">S</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#S_60_61" id="S_710_711" title="Defined at line 4"><span class="token sort_OpId">S</span></a></span>
  <a href="#p11_700_703" id="p11_714_717" title="Defined at line 56"><span class="token sort_ConstraintId">p11</span></a><span class="operator">(</span><a href="#F_79_80" id="F_718_719" title="Defined at line 5"><span class="token sort_OpId">F</span></a><span class="operator">(_),</span> <a href="#G_96_97" id="G_724_725" title="Defined at line 6"><span class="token sort_OpId">G</span></a><span class="operator">()).</span>
  <a href="#p11_700_703" id="p11_732_735" title="Defined at line 56"><span class="token sort_ConstraintId">p11</span></a><span class="operator">(</span><a href="#G_96_97" id="G_736_737" title="Defined at line 6"><span class="token sort_OpId">G</span></a><span class="operator">(),</span> <span class="cons_Var"><span id="x_741_742" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">x</span></span></span><span class="operator">).</span>

<span class="keyword">rules</span>

  <a href="#p12_769_772" id="p12_755_758" title="Referenced at line 63, 64"><span class="token sort_ConstraintId">p12</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#S_60_61" id="S_761_762" title="Defined at line 4"><span class="token sort_OpId">S</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#S_60_61" id="S_765_766" title="Defined at line 4"><span class="token sort_OpId">S</span></a></span>
  <a href="#p12_755_758" id="p12_769_772" title="Defined at line 62"><span class="token sort_ConstraintId">p12</span></a><span class="operator">(</span><a href="#F_79_80" id="F_773_774" title="Defined at line 5"><span class="token sort_OpId">F</span></a><span class="operator">(_),</span> <span class="cons_Var"><span id="x_779_780" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">x</span></span></span><span class="operator">).</span>
  <a href="#p12_755_758" id="p12_785_788" title="Defined at line 62"><span class="token sort_ConstraintId">p12</span></a><span class="operator">(</span><a href="#G_96_97" id="G_789_790" title="Defined at line 6"><span class="token sort_OpId">G</span></a><span class="operator">(),</span> <span class="cons_Var"><span id="x_794_795" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">x</span></span></span><span class="operator">).</span>

<span class="keyword">rules</span>

  <a href="#p18_818_821" id="p18_808_811" title="Referenced at line 69, 70"><span class="token sort_ConstraintId">p18</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#S_60_61" id="S_814_815" title="Defined at line 4"><span class="token sort_OpId">S</span></a></span>
  <a href="#p18_808_811" id="p18_818_821" title="Defined at line 68"><span class="token sort_ConstraintId">p18</span></a><span class="operator">(</span><a href="#F_79_80" id="F_822_823" title="Defined at line 5"><span class="token sort_OpId">F</span></a><span class="operator">(_)).</span>
  <a href="#p18_808_811" id="p18_831_834" title="Defined at line 68"><span class="token sort_ConstraintId">p18</span></a><span class="operator">(</span><span class="cons_Var"><span id="x_835_836" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">x</span></span></span><span class="operator">@</span><a href="#G_96_97" id="G_837_838" title="Defined at line 6"><span class="token sort_OpId">G</span></a><span class="operator">()).</span>

<span class="keyword">rules</span>

  <a href="#p19_863_866" id="p19_853_856" title="Referenced at line 75, 76"><span class="token sort_ConstraintId">p19</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#S_60_61" id="S_859_860" title="Defined at line 4"><span class="token sort_OpId">S</span></a></span>
  <a href="#p19_853_856" id="p19_863_866" title="Defined at line 74"><span class="token sort_ConstraintId">p19</span></a><span class="operator">(</span><a href="#H_106_107" id="H_867_868" title="Defined at line 7"><span class="token sort_OpId">H</span></a><span class="operator">(</span><a href="#G_96_97" id="G_869_870" title="Defined at line 6"><span class="token sort_OpId">G</span></a><span class="operator">(),</span> <span class="operator">_)).</span>
  <a href="#p19_853_856" id="p19_881_884" title="Defined at line 74"><span class="token sort_ConstraintId">p19</span></a><span class="operator">(</span><span class="cons_Var"><span id="x_885_886" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">x</span></span></span><span class="operator">).</span> <span class="layout">// p19(x@F(_)).</span>
          <span class="layout">// p19(x@G()).</span>
          <span class="layout">// p19(x@H(F(_), _)).</span>
          <span class="layout">// p19(x@H(H(_, _), _)).</span>

<span class="keyword">rules</span>

  <a href="#p20_1025_1028" id="p20_1007_1010" title="Referenced at line 84, 85"><span class="token sort_ConstraintId">p20</span></a> <span class="operator">:</span> <span class="token sort_ConstraintId">list</span><span class="operator">(</span><span class="cons_IntSort">int</span><span class="operator">)</span>
  <a href="#p20_1007_1010" id="p20_1025_1028" title="Defined at line 83"><span class="token sort_ConstraintId">p20</span></a><span class="operator">([_]).</span>
  <a href="#p20_1007_1010" id="p20_1037_1040" title="Defined at line 83"><span class="token sort_ConstraintId">p20</span></a><span class="operator">(</span><span class="cons_Var"><span id="xs_1041_1043" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">xs</span></span></span><span class="operator">).</span> <span class="layout">// p20(xs@[]).</span>
           <span class="layout">// p20(xs@[_,_|_]).</span>

<span class="keyword">rules</span>

  <a href="#p21_1117_1120" id="p21_1102_1105" title="Referenced at line 91, 92, 93"><span class="token sort_ConstraintId">p21</span></a> <span class="operator">:</span> <span class="cons_StringSort">string</span>
  <a href="#p21_1102_1105" id="p21_1117_1120" title="Defined at line 90"><span class="token sort_ConstraintId">p21</span></a><span class="operator">(</span><span class="cons_Str"><span class="operator">"</span>x"</span><span class="operator">).</span>
  <a href="#p21_1102_1105" id="p21_1129_1132" title="Defined at line 90"><span class="token sort_ConstraintId">p21</span></a><span class="operator">(</span><span class="cons_Str"><span class="operator">"</span>y"</span><span class="operator">).</span>
  <a href="#p21_1102_1105" id="p21_1141_1144" title="Defined at line 90"><span class="token sort_ConstraintId">p21</span></a><span class="operator">(</span><span class="cons_Str"><span class="operator">"</span>z"</span><span class="operator">).</span>
<span class="layout">//p21(_). // not supported</span>

<span class="keyword">rules</span>

  <a href="#p22_1200_1203" id="p22_1188_1191" title="Referenced at line 99, 100, 101"><span class="token sort_ConstraintId">p22</span></a> <span class="operator">:</span> <span class="cons_IntSort">int</span>
  <a href="#p22_1188_1191" id="p22_1200_1203" title="Defined at line 98"><span class="token sort_ConstraintId">p22</span></a><span class="operator">(</span>1<span class="operator">).</span>
  <a href="#p22_1188_1191" id="p22_1210_1213" title="Defined at line 98"><span class="token sort_ConstraintId">p22</span></a><span class="operator">(</span>2<span class="operator">).</span>
  <a href="#p22_1188_1191" id="p22_1220_1223" title="Defined at line 98"><span class="token sort_ConstraintId">p22</span></a><span class="operator">(</span>4<span class="operator">).</span>
<span class="layout">//p22(_). // not supported</span>

<span class="keyword">rules</span>

  <a href="#p23_1279_1282" id="p23_1265_1268" title="Referenced at line 107, 108, 109, 110"><span class="token sort_ConstraintId">p23</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#S_60_61" id="S_1271_1272" title="Defined at line 4"><span class="token sort_OpId">S</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#S_60_61" id="S_1275_1276" title="Defined at line 4"><span class="token sort_OpId">S</span></a></span>
  <a href="#p23_1265_1268" id="p23_1279_1282" title="Defined at line 106"><span class="token sort_ConstraintId">p23</span></a><span class="operator">(</span><a href="#G_96_97" id="G_1283_1284" title="Defined at line 6"><span class="token sort_OpId">G</span></a><span class="operator">(),</span> <a href="#G_96_97" id="G_1288_1289" title="Defined at line 6"><span class="token sort_OpId">G</span></a><span class="operator">()).</span>
  <a href="#p23_1265_1268" id="p23_1296_1299" title="Defined at line 106"><span class="token sort_ConstraintId">p23</span></a><span class="operator">(</span><a href="#G_96_97" id="G_1300_1301" title="Defined at line 6"><span class="token sort_OpId">G</span></a><span class="operator">(),</span> <span class="operator">_).</span>
  <a href="#p23_1265_1268" id="p23_1311_1314" title="Defined at line 106"><span class="token sort_ConstraintId">p23</span></a><span class="operator">(_,</span> <a href="#G_96_97" id="G_1318_1319" title="Defined at line 6"><span class="token sort_OpId">G</span></a><span class="operator">()).</span>
  <a href="#p23_1265_1268" id="p23_1326_1329" title="Defined at line 106"><span class="token sort_ConstraintId">p23</span></a><span class="operator">(_,</span> <span class="operator">_).</span>

<span class="keyword">rules</span>

  <a href="#p24_1361_1364" id="p24_1347_1350" title="Referenced at line 115, 116, 117"><span class="token sort_ConstraintId">p24</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#S_60_61" id="S_1353_1354" title="Defined at line 4"><span class="token sort_OpId">S</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#S_60_61" id="S_1357_1358" title="Defined at line 4"><span class="token sort_OpId">S</span></a></span>
  <a href="#p24_1347_1350" id="p24_1361_1364" title="Defined at line 114"><span class="token sort_ConstraintId">p24</span></a><span class="operator">(</span><a href="#G_96_97" id="G_1365_1366" title="Defined at line 6"><span class="token sort_OpId">G</span></a><span class="operator">(),</span> <a href="#G_96_97" id="G_1370_1371" title="Defined at line 6"><span class="token sort_OpId">G</span></a><span class="operator">()).</span>
  <a href="#p24_1347_1350" id="p24_1378_1381" title="Defined at line 114"><span class="token sort_ConstraintId">p24</span></a><span class="operator">(</span><a href="#G_96_97" id="G_1382_1383" title="Defined at line 6"><span class="token sort_OpId">G</span></a><span class="operator">(),</span> <span class="operator">_).</span>
  <a href="#p24_1347_1350" id="p24_1393_1396" title="Defined at line 114"><span class="token sort_ConstraintId">p24</span></a><span class="operator">(_,</span> <span class="operator">_).</span>

</code></pre></td></tr></tbody></table></div>