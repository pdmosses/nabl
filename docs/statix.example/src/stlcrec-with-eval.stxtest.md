---
title: stlcrec-with-eval.stxtest
hide:
  - toc
---

# `stlcrec-with-eval.stxtest`

:simple-github: [pdmosses/nabl/statix.example/src/stlcrec-with-eval.stxtest]

[pdmosses/nabl/statix.example/src/stlcrec-with-eval.stxtest]: https://github.com/pdmosses/nabl/blob/master/statix.example/src/stlcrec-with-eval.stxtest "The source file on GitHub"

<div class="stxtest"><table class="highlighttable"><tbody><tr><td class="linenos"><div class="linenodiv"><pre><span></span>1
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
118
119
120
121
122
123
124
125
126
127
128
129
130
131
132
133
134
135
136
137
138
139
140
141
142
143
144
145
146
147
148
149
150
151
152
153
154
155
156
157
158
159
160
161
162
163
164
165
166
167
168
169
170
171
172
173
174
175
176
177
178
179
180
181
182
183
184
185
186
187
188
189
190
191
192
193
194
195
196
197
198
199
200
201
202
203
204
205
206
207
208
209
210
211
212
213
214
215
216
217
218
219
220
221
222
223
224
225
226
227
228
229
</pre></div></td>
<td class="code"><pre><code><span class="token keyword">resolve</span> {<span class="cons_Var"><a href="#e_19_20" id="e_9_10" title="Referenced at line 3, 5, 7"><span class="token sort_ConstraintId">e</span></a></span> <span class="cons_Var"><a href="#T_84_85" id="T_11_12" title="Referenced at line 5"><span class="token sort_OpId">T</span></a></span> <span class="cons_Var"><a href="#v_122_123" id="v_13_14" title="Referenced at line 7"><span class="token sort_ConstraintId">v</span></a></span>}

  <span class="cons_Var"><a href="#e_9_10" id="e_19_20" title="Defined at line 1"><span class="token sort_ConstraintId">e</span></a></span> == <a href="#App_487_490" id="App_24_27" title="Defined at line 17"><span class="token sort_OpId">App</span></a>(<a href="#Fun_344_347" id="Fun_28_31" title="Defined at line 15"><span class="token sort_OpId">Fun</span></a>(<span class="cons_Str">"x"</span>, <a href="#UnitType_950_958" id="UnitType_37_45" title="Defined at line 26"><span class="token sort_OpId">UnitType</span></a>(), <a href="#Var_424_427" id="Var_49_52" title="Defined at line 16"><span class="token sort_OpId">Var</span></a>(<span class="cons_Str">"x"</span>)), <a href="#Unit_278_282" id="Unit_60_64" title="Defined at line 14"><span class="token sort_OpId">Unit</span></a>()),

  ({<span class="cons_Var"><a href="#s_81_82" id="s_74_75" title="Referenced at line 5, 5"><span class="token sort_ConstraintId">s</span></a></span>} <span class="token keyword">new</span> <span class="cons_Var"><a href="#s_74_75" id="s_81_82" title="Defined at line 5"><span class="token sort_ConstraintId">s</span></a></span>, <span class="cons_Var"><a href="#T_11_12" id="T_84_85" title="Defined at line 1"><span class="token sort_OpId">T</span></a></span> == <a href="#typeOfExp_1642_1651" id="typeOfExp_89_98" title="Defined at line 59"><span class="token sort_ConstraintId">typeOfExp</span></a>(<span class="cons_Var"><a href="#s_74_75" id="s_99_100" title="Defined at line 5"><span class="token sort_ConstraintId">s</span></a></span>, <span class="cons_Var"><a href="#e_9_10" id="e_102_103" title="Defined at line 1"><span class="token sort_ConstraintId">e</span></a></span>)),

  ({<span class="cons_Var"><a href="#f_119_120" id="f_112_113" title="Referenced at line 7, 7"><span class="token sort_ConstraintId">f</span></a></span>} <span class="token keyword">new</span> <span class="cons_Var"><a href="#f_112_113" id="f_119_120" title="Defined at line 7"><span class="token sort_ConstraintId">f</span></a></span>, <span class="cons_Var"><a href="#v_13_14" id="v_122_123" title="Defined at line 1"><span class="token sort_ConstraintId">v</span></a></span> == <a href="#evalExp_4422_4429" id="evalExp_127_134" title="Defined at line 181"><span class="token sort_ConstraintId">evalExp</span></a>(<span class="cons_Var"><a href="#f_112_113" id="f_135_136" title="Defined at line 7"><span class="token sort_ConstraintId">f</span></a></span>, <span class="cons_Var"><a href="#e_9_10" id="e_138_139" title="Defined at line 1"><span class="token sort_ConstraintId">e</span></a></span>))

<span class="token keyword">signature</span>

  <span class="token sort_ConstraintId">sorts</span> <a href="#ID_354_356" id="ID_162_164" title="Referenced at line 15, 16, 19, 23, 31, 115, 174"><span class="token sort_OpId">ID</span></a> = <span class="token sort_ConstraintId">string</span>                                  <span class="token layout">// x</span>

  <span class="token sort_ConstraintId">sorts</span> <span class="cons_SortDecl"><a href="#Exp_288_291" id="Exp_221_224" title="Referenced at line 14, 15, 15, 16, 17, 17, 17, 18, 19, 19, 20, 20, 23, 52, 59, 174, 181"><span class="token sort_OpId">Exp</span></a></span> <span class="token sort_ConstraintId">constructors</span>                             <span class="token layout">// e :=</span>
    <a href="#Unit_60_64" id="Unit_278_282" title="Referenced at line 3, 62, 184"><span class="token sort_OpId">Unit</span></a>    : <span class="cons_SimpleSort"><a href="#Exp_221_224" id="Exp_288_291" title="Defined at line 13"><span class="token sort_OpId">Exp</span></a></span>                                    <span class="token layout">//    | unit</span>
    <a href="#Fun_28_31" id="Fun_344_347" title="Referenced at line 3, 65, 187"><span class="token sort_OpId">Fun</span></a>     : <span class="cons_SimpleSort"><a href="#ID_162_164" id="ID_354_356" title="Defined at line 11"><span class="token sort_OpId">ID</span></a></span> * <span class="cons_SimpleSort"><a href="#TypeExp_892_899" id="TypeExp_359_366" title="Defined at line 25"><span class="token sort_OpId">TypeExp</span></a></span> * <span class="cons_SimpleSort"><a href="#Exp_221_224" id="Exp_369_372" title="Defined at line 13"><span class="token sort_OpId">Exp</span></a></span> -&gt; <span class="cons_SimpleSort"><a href="#Exp_221_224" id="Exp_376_379" title="Defined at line 13"><span class="token sort_OpId">Exp</span></a></span>              <span class="token layout">//    | fun (x : te) { e }</span>
    <a href="#Var_49_52" id="Var_424_427" title="Referenced at line 3, 72, 190"><span class="token sort_OpId">Var</span></a>     : <span class="cons_SimpleSort"><a href="#ID_162_164" id="ID_434_436" title="Defined at line 11"><span class="token sort_OpId">ID</span></a></span> -&gt; <span class="cons_SimpleSort"><a href="#Exp_221_224" id="Exp_440_443" title="Defined at line 13"><span class="token sort_OpId">Exp</span></a></span>                              <span class="token layout">//    | x</span>
    <a href="#App_24_27" id="App_487_490" title="Referenced at line 3, 76, 194"><span class="token sort_OpId">App</span></a>     : <span class="cons_SimpleSort"><a href="#Exp_221_224" id="Exp_497_500" title="Defined at line 13"><span class="token sort_OpId">Exp</span></a></span> * <span class="cons_SimpleSort"><a href="#Exp_221_224" id="Exp_503_506" title="Defined at line 13"><span class="token sort_OpId">Exp</span></a></span> -&gt; <span class="cons_SimpleSort"><a href="#Exp_221_224" id="Exp_510_513" title="Defined at line 13"><span class="token sort_OpId">Exp</span></a></span>                       <span class="token layout">//    | e e</span>
    <a href="#Rec_2169_2172" id="Rec_552_555" title="Referenced at line 82"><span class="token sort_OpId">Rec</span></a>     : <span class="token sort_ConstraintId">list</span>(<span class="cons_SimpleSort"><a href="#Bind_763_767" id="Bind_567_571" title="Defined at line 22"><span class="token sort_OpId">Bind</span></a></span>) -&gt; <span class="cons_SimpleSort"><a href="#Exp_221_224" id="Exp_576_579" title="Defined at line 13"><span class="token sort_OpId">Exp</span></a></span>                      <span class="token layout">//    | { b* }</span>
    <a href="#FAccess_2262_2269" id="FAccess_620_627" title="Referenced at line 86"><span class="token sort_OpId">FAccess</span></a> : <span class="cons_SimpleSort"><a href="#Exp_221_224" id="Exp_630_633" title="Defined at line 13"><span class="token sort_OpId">Exp</span></a></span> * <span class="cons_SimpleSort"><a href="#ID_162_164" id="ID_636_638" title="Defined at line 11"><span class="token sort_OpId">ID</span></a></span> -&gt; <span class="cons_SimpleSort"><a href="#Exp_221_224" id="Exp_642_645" title="Defined at line 13"><span class="token sort_OpId">Exp</span></a></span>                        <span class="token layout">//    | e.x</span>
    <a href="#Let_2406_2409" id="Let_685_688" title="Referenced at line 91, 202"><span class="token sort_OpId">Let</span></a>     : <span class="token sort_ConstraintId">list</span>(<span class="cons_SimpleSort"><a href="#Bind_763_767" id="Bind_700_704" title="Defined at line 22"><span class="token sort_OpId">Bind</span></a></span>) * <span class="cons_SimpleSort"><a href="#Exp_221_224" id="Exp_708_711" title="Defined at line 13"><span class="token sort_OpId">Exp</span></a></span> -&gt; <span class="cons_SimpleSort"><a href="#Exp_221_224" id="Exp_715_718" title="Defined at line 13"><span class="token sort_OpId">Exp</span></a></span>                <span class="token layout">//    | let b+ in e</span>

  <span class="token sort_ConstraintId">sorts</span> <span class="cons_SortDecl"><a href="#Bind_567_571" id="Bind_763_767" title="Referenced at line 18, 20, 23, 99, 108, 208, 216"><span class="token sort_OpId">Bind</span></a></span> <span class="token sort_ConstraintId">constructors</span>                            <span class="token layout">// b :=</span>
    <a href="#Bind_2658_2662" id="Bind_820_824" title="Referenced at line 103, 111, 211"><span class="token sort_OpId">Bind</span></a> : <span class="cons_SimpleSort"><a href="#ID_162_164" id="ID_827_829" title="Defined at line 11"><span class="token sort_OpId">ID</span></a></span> * <span class="cons_SimpleSort"><a href="#Exp_221_224" id="Exp_832_835" title="Defined at line 13"><span class="token sort_OpId">Exp</span></a></span> -&gt; <span class="cons_SimpleSort"><a href="#Bind_763_767" id="Bind_839_843" title="Defined at line 22"><span class="token sort_OpId">Bind</span></a></span>                          <span class="token layout">//    | x = e</span>

  <span class="token sort_ConstraintId">sorts</span> <span class="cons_SortDecl"><a href="#TypeExp_359_366" id="TypeExp_892_899" title="Referenced at line 15, 26, 27, 27, 27, 28, 31, 121"><span class="token sort_OpId">TypeExp</span></a></span> <span class="token sort_ConstraintId">constructors</span>                         <span class="token layout">// te :=</span>
    <a href="#UnitType_37_45" id="UnitType_950_958" title="Referenced at line 3, 124"><span class="token sort_OpId">UnitType</span></a> : <span class="cons_SimpleSort"><a href="#TypeExp_892_899" id="TypeExp_961_968" title="Defined at line 25"><span class="token sort_OpId">TypeExp</span></a></span>                               <span class="token layout">//     | unit</span>
    <a href="#FunType_3156_3163" id="FunType_1017_1024" title="Referenced at line 127"><span class="token sort_OpId">FunType</span></a>  : <span class="cons_SimpleSort"><a href="#TypeExp_892_899" id="TypeExp_1028_1035" title="Defined at line 25"><span class="token sort_OpId">TypeExp</span></a></span> * <span class="cons_SimpleSort"><a href="#TypeExp_892_899" id="TypeExp_1038_1045" title="Defined at line 25"><span class="token sort_OpId">TypeExp</span></a></span> -&gt; <span class="cons_SimpleSort"><a href="#TypeExp_892_899" id="TypeExp_1049_1056" title="Defined at line 25"><span class="token sort_OpId">TypeExp</span></a></span>          <span class="token layout">//     | te -&gt; te</span>
    <a href="#RecType_3289_3296" id="RecType_1088_1095" title="Referenced at line 132"><span class="token sort_OpId">RecType</span></a>  : <span class="token sort_ConstraintId">list</span>(<span class="cons_SimpleSort"><a href="#Decl_1162_1166" id="Decl_1104_1108" title="Defined at line 30"><span class="token sort_OpId">Decl</span></a></span>) -&gt; <span class="cons_SimpleSort"><a href="#TypeExp_892_899" id="TypeExp_1113_1120" title="Defined at line 25"><span class="token sort_OpId">TypeExp</span></a></span>                 <span class="token layout">//     | { d* }</span>

  <span class="token sort_ConstraintId">sorts</span> <span class="cons_SortDecl"><a href="#Decl_1104_1108" id="Decl_1162_1166" title="Referenced at line 28, 31, 137"><span class="token sort_OpId">Decl</span></a></span> <span class="token sort_ConstraintId">constructors</span>                            <span class="token layout">// d :=</span>
    <a href="#Decl_3470_3474" id="Decl_1219_1223" title="Referenced at line 140"><span class="token sort_OpId">Decl</span></a> : <span class="cons_SimpleSort"><a href="#ID_162_164" id="ID_1226_1228" title="Defined at line 11"><span class="token sort_OpId">ID</span></a></span> * <span class="cons_SimpleSort"><a href="#TypeExp_892_899" id="TypeExp_1231_1238" title="Defined at line 25"><span class="token sort_OpId">TypeExp</span></a></span> -&gt; <span class="cons_SimpleSort"><a href="#Decl_1162_1166" id="Decl_1242_1246" title="Defined at line 30"><span class="token sort_OpId">Decl</span></a></span>                      <span class="token layout">//    | x : te</span>

<span class="token keyword">signature</span>

  <span class="token sort_ConstraintId">sorts</span> <span class="cons_SortDecl"><a href="#Type_1333_1337" id="Type_1303_1307" title="Referenced at line 36, 37, 37, 37, 38, 41, 59, 121, 146, 146"><span class="token sort_OpId">Type</span></a></span> <span class="token sort_ConstraintId">constructors</span>
    <a href="#UNIT_1711_1715" id="UNIT_1325_1329" title="Referenced at line 62, 124, 150, 150"><span class="token sort_OpId">UNIT</span></a>  : <span class="cons_SimpleSort"><a href="#Type_1303_1307" id="Type_1333_1337" title="Defined at line 35"><span class="token sort_OpId">Type</span></a></span>
    <a href="#FUN_1762_1765" id="FUN_1342_1345" title="Referenced at line 65, 77, 127, 152, 152"><span class="token sort_OpId">FUN</span></a>   : <span class="cons_SimpleSort"><a href="#Type_1303_1307" id="Type_1350_1354" title="Defined at line 35"><span class="token sort_OpId">Type</span></a></span> * <span class="cons_SimpleSort"><a href="#Type_1303_1307" id="Type_1357_1361" title="Defined at line 35"><span class="token sort_OpId">Type</span></a></span> -&gt; <span class="cons_SimpleSort"><a href="#Type_1303_1307" id="Type_1365_1369" title="Defined at line 35"><span class="token sort_OpId">Type</span></a></span>
    <a href="#REC_2184_2187" id="REC_1374_1377" title="Referenced at line 82, 87, 132, 154, 154"><span class="token sort_OpId">REC</span></a>   : <span class="token sort_ConstraintId">scope</span> -&gt; <span class="cons_SimpleSort"><a href="#Type_1303_1307" id="Type_1391_1395" title="Defined at line 35"><span class="token sort_OpId">Type</span></a></span>

  <span class="token keyword">relations</span>
    <a href="#typeOfDecl_1870_1880" id="typeOfDecl_1413_1423" title="Referenced at line 68, 73, 88, 104, 112, 141, 157, 158"><span class="token sort_ConstraintId">typeOfDecl</span></a> : <span class="token sort_ConstraintId">occurrence</span> -&gt; <span class="cons_SimpleSort"><a href="#Type_1303_1307" id="Type_1440_1444" title="Defined at line 35"><span class="token sort_OpId">Type</span></a></span>

  <span class="token keyword">namespaces</span>
    <a href="#Var_1521_1524" id="Var_1463_1466" title="Referenced at line 48, 68, 68, 73, 73, 73, 88, 88, 88, 104, 104, 112, 112, 117, 117, 117, 141, 141, 156, 158, 158, 158, 164, 165, 165, 191, 191, 191, 198, 198, 213, 213"><span class="token sort_OpId">Var</span></a>  : <span class="token sort_ConstraintId">string</span>

  <span class="token keyword">name-resolution</span>
    <span class="token keyword">labels</span> <a href="#P_1532_1533" id="P_1507_1508" title="Referenced at line 48, 48, 67, 93, 197"><span class="token sort_OpId">P</span></a>
    <span class="token keyword">resolve</span> <a href="#Var_1463_1466" id="Var_1521_1524" title="Defined at line 44"><span class="token sort_OpId">Var</span></a> <span class="token keyword">filter</span> <a href="#P_1507_1508" id="P_1532_1533" title="Defined at line 47"><span class="token sort_OpId">P</span></a>* <span class="token keyword">min</span> $ &lt; <a href="#P_1507_1508" id="P_1543_1544" title="Defined at line 47"><span class="token sort_OpId">P</span></a>

<span class="token keyword">rules</span>

  <a href="#programOK_1573_1582" id="programOK_1555_1564" title="Referenced at line 53"><span class="token sort_ConstraintId">programOK</span></a> : <span class="cons_SimpleSort"><a href="#Exp_221_224" id="Exp_1567_1570" title="Defined at line 13"><span class="token sort_OpId">Exp</span></a></span>
  <a href="#programOK_1555_1564" id="programOK_1573_1582" title="Defined at line 52"><span class="token sort_ConstraintId">programOK</span></a>(<span class="cons_Var"><a href="#e_1623_1624" id="e_1583_1584" title="Referenced at line 55"><span class="token sort_ConstraintId">e</span></a></span>) :- {<span class="cons_Var"><a href="#s_1603_1604" id="s_1590_1591" title="Referenced at line 54, 55"><span class="token sort_ConstraintId">s</span></a></span> <span class="cons_Var"><a href="#T_1629_1630" id="T_1592_1593" title="Referenced at line 55"><span class="token sort_OpId">T</span></a></span>}
    <span class="token keyword">new</span> <span class="cons_Var"><a href="#s_1590_1591" id="s_1603_1604" title="Defined at line 53"><span class="token sort_ConstraintId">s</span></a></span>,
    <a href="#typeOfExp_1642_1651" id="typeOfExp_1610_1619" title="Defined at line 59"><span class="token sort_ConstraintId">typeOfExp</span></a>(<span class="cons_Var"><a href="#s_1590_1591" id="s_1620_1621" title="Defined at line 53"><span class="token sort_ConstraintId">s</span></a></span>, <span class="cons_Var"><a href="#e_1583_1584" id="e_1623_1624" title="Defined at line 53"><span class="token sort_ConstraintId">e</span></a></span>) == <span class="cons_Var"><a href="#T_1592_1593" id="T_1629_1630" title="Defined at line 53"><span class="token sort_OpId">T</span></a></span>.

<span class="token keyword">rules</span>

  <a href="#typeOfExp_89_98" id="typeOfExp_1642_1651" title="Referenced at line 5, 55, 62, 65, 69, 72, 76, 77, 78, 82, 86, 87, 91, 95, 104, 112"><span class="token sort_ConstraintId">typeOfExp</span></a> : <span class="token sort_ConstraintId">scope</span> * <span class="cons_SimpleSort"><a href="#Exp_221_224" id="Exp_1662_1665" title="Defined at line 13"><span class="token sort_OpId">Exp</span></a></span> -&gt; <span class="cons_SimpleSort"><a href="#Type_1303_1307" id="Type_1669_1673" title="Defined at line 35"><span class="token sort_OpId">Type</span></a></span>

  [T-Unit]
  <a href="#typeOfExp_1642_1651" id="typeOfExp_1688_1697" title="Defined at line 59"><span class="token sort_ConstraintId">typeOfExp</span></a>(<span class="cons_Var"><span id="s_1698_1699" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">s</span></span></span>, <a href="#Unit_278_282" id="Unit_1701_1705" title="Defined at line 14"><span class="token sort_OpId">Unit</span></a>()) = <a href="#UNIT_1325_1329" id="UNIT_1711_1715" title="Defined at line 36"><span class="token sort_OpId">UNIT</span></a>().

  [T-Fun]
  <a href="#typeOfExp_1642_1651" id="typeOfExp_1732_1741" title="Defined at line 59"><span class="token sort_ConstraintId">typeOfExp</span></a>(<span class="cons_Var"><a href="#s_1801_1802" id="s_1742_1743" title="Referenced at line 66, 67"><span class="token sort_ConstraintId">s</span></a></span>, <a href="#Fun_344_347" id="Fun_1745_1748" title="Defined at line 15"><span class="token sort_OpId">Fun</span></a>(<span class="cons_Var"><a href="#x_1860_1861" id="x_1749_1750" title="Referenced at line 68, 68, 68, 68"><span class="token sort_ConstraintId">x</span></a></span>, <span class="cons_Var"><a href="#te_1804_1806" id="te_1752_1754" title="Referenced at line 66"><span class="token sort_ConstraintId">te</span></a></span>, <span class="cons_Var"><a href="#e_1905_1906" id="e_1756_1757" title="Referenced at line 69"><span class="token sort_ConstraintId">e</span></a></span>)) = <a href="#FUN_1342_1345" id="FUN_1762_1765" title="Defined at line 37"><span class="token sort_OpId">FUN</span></a>(<span class="cons_Var"><a href="#S_1811_1812" id="S_1766_1767" title="Referenced at line 66, 68"><span class="token sort_OpId">S</span></a></span>, <span class="cons_Var"><a href="#T_1911_1912" id="T_1769_1770" title="Referenced at line 69"><span class="token sort_OpId">T</span></a></span>) :- {<span class="cons_Var"><a href="#s_fun_1822_1827" id="s_fun_1776_1781" title="Referenced at line 67, 67, 68, 68, 69"><span class="token sort_ConstraintId">s_fun</span></a></span>}
    <a href="#typeOfTypeExp_3031_3044" id="typeOfTypeExp_1787_1800" title="Defined at line 121"><span class="token sort_ConstraintId">typeOfTypeExp</span></a>(<span class="cons_Var"><a href="#s_1742_1743" id="s_1801_1802" title="Defined at line 65"><span class="token sort_ConstraintId">s</span></a></span>, <span class="cons_Var"><a href="#te_1752_1754" id="te_1804_1806" title="Defined at line 65"><span class="token sort_ConstraintId">te</span></a></span>) == <span class="cons_Var"><a href="#S_1766_1767" id="S_1811_1812" title="Defined at line 65"><span class="token sort_OpId">S</span></a></span>,
    <span class="token keyword">new</span> <span class="cons_Var"><a href="#s_fun_1776_1781" id="s_fun_1822_1827" title="Defined at line 65"><span class="token sort_ConstraintId">s_fun</span></a></span>, <span class="cons_Var"><a href="#s_fun_1776_1781" id="s_fun_1829_1834" title="Defined at line 65"><span class="token sort_ConstraintId">s_fun</span></a></span> -<a href="#P_1507_1508" id="P_1836_1837" title="Defined at line 47"><span class="token sort_OpId">P</span></a>-&gt; <span class="cons_Var"><a href="#s_1742_1743" id="s_1840_1841" title="Defined at line 65"><span class="token sort_ConstraintId">s</span></a></span>,
    <span class="token sort_ConstraintId">s_fun</span> -&gt; <span class="token sort_OpId">Var</span>{<span class="token sort_ConstraintId">x</span>@<span class="token sort_ConstraintId">x</span>} <span class="token keyword">with</span> <a href="#typeOfDecl_1413_1423" id="typeOfDecl_1870_1880" title="Defined at line 41"><span class="token sort_ConstraintId">typeOfDecl</span></a> <span class="cons_Var"><a href="#S_1766_1767" id="S_1881_1882" title="Defined at line 65"><span class="token sort_OpId">S</span></a></span>,
    <a href="#typeOfExp_1642_1651" id="typeOfExp_1888_1897" title="Defined at line 59"><span class="token sort_ConstraintId">typeOfExp</span></a>(<span class="cons_Var"><a href="#s_fun_1776_1781" id="s_fun_1898_1903" title="Defined at line 65"><span class="token sort_ConstraintId">s_fun</span></a></span>, <span class="cons_Var"><a href="#e_1756_1757" id="e_1905_1906" title="Defined at line 65"><span class="token sort_ConstraintId">e</span></a></span>) == <span class="cons_Var"><a href="#T_1769_1770" id="T_1911_1912" title="Defined at line 65"><span class="token sort_OpId">T</span></a></span>.

  [T-Var]
  <a href="#typeOfExp_1642_1651" id="typeOfExp_1927_1936" title="Defined at line 59"><span class="token sort_ConstraintId">typeOfExp</span></a>(<span class="cons_Var"><a href="#s_1989_1990" id="s_1937_1938" title="Referenced at line 73"><span class="token sort_ConstraintId">s</span></a></span>, <a href="#Var_424_427" id="Var_1940_1943" title="Defined at line 16"><span class="token sort_OpId">Var</span></a>(<span class="cons_Var"><a href="#x_1981_1982" id="x_1944_1945" title="Referenced at line 73, 73, 73, 73, 73, 73"><span class="token sort_ConstraintId">x</span></a></span>)) = <span class="cons_Var"><a href="#T_2004_2005" id="T_1950_1951" title="Referenced at line 73"><span class="token sort_OpId">T</span></a></span> :- {<span class="cons_Var"><a href="#d_2001_2002" id="d_1956_1957" title="Referenced at line 73"><span class="token sort_ConstraintId">d</span></a></span>}
    <a href="#typeOfDecl_1413_1423" id="typeOfDecl_1963_1973" title="Defined at line 41"><span class="token sort_ConstraintId">typeOfDecl</span></a> <span class="token keyword">of</span> <a href="#Var_1463_1466" id="Var_1977_1980" title="Defined at line 44"><span class="token sort_OpId">Var</span></a>{<span class="cons_Var"><a href="#x_1944_1945" id="x_1981_1982" title="Defined at line 72"><span class="token sort_ConstraintId">x</span></a></span>@<span class="cons_Var"><a href="#x_1944_1945" id="x_1983_1984" title="Defined at line 72"><span class="token sort_ConstraintId">x</span></a></span>} <span class="token keyword">in</span> <span class="cons_Var"><a href="#s_1937_1938" id="s_1989_1990" title="Defined at line 72"><span class="token sort_ConstraintId">s</span></a></span> |-&gt; [(_, (<span class="cons_Var"><a href="#d_1956_1957" id="d_2001_2002" title="Defined at line 72"><span class="token sort_ConstraintId">d</span></a></span>, <span class="cons_Var"><a href="#T_1950_1951" id="T_2004_2005" title="Defined at line 72"><span class="token sort_OpId">T</span></a></span>))].

  [T-App]
  <a href="#typeOfExp_1642_1651" id="typeOfExp_2023_2032" title="Defined at line 59"><span class="token sort_ConstraintId">typeOfExp</span></a>(<span class="cons_Var"><a href="#s_2076_2077" id="s_2033_2034" title="Referenced at line 77, 78"><span class="token sort_ConstraintId">s</span></a></span>, <a href="#App_487_490" id="App_2036_2039" title="Defined at line 17"><span class="token sort_OpId">App</span></a>(<span class="cons_Var"><a href="#e1_2079_2081" id="e1_2040_2042" title="Referenced at line 77"><span class="token sort_ConstraintId">e1</span></a></span>, <span class="cons_Var"><a href="#e2_2114_2116" id="e2_2044_2046" title="Referenced at line 78"><span class="token sort_ConstraintId">e2</span></a></span>)) = <span class="cons_Var"><a href="#T_2093_2094" id="T_2051_2052" title="Referenced at line 77"><span class="token sort_OpId">T</span></a></span> :- {<span class="cons_Var"><a href="#S_2090_2091" id="S_2057_2058" title="Referenced at line 77, 79"><span class="token sort_OpId">S</span></a></span> <span class="cons_Var"><a href="#U_2121_2122" id="U_2059_2060" title="Referenced at line 78, 79"><span class="token sort_OpId">U</span></a></span>}
    <a href="#typeOfExp_1642_1651" id="typeOfExp_2066_2075" title="Defined at line 59"><span class="token sort_ConstraintId">typeOfExp</span></a>(<span class="cons_Var"><a href="#s_2033_2034" id="s_2076_2077" title="Defined at line 76"><span class="token sort_ConstraintId">s</span></a></span>, <span class="cons_Var"><a href="#e1_2040_2042" id="e1_2079_2081" title="Defined at line 76"><span class="token sort_ConstraintId">e1</span></a></span>) == <a href="#FUN_1342_1345" id="FUN_2086_2089" title="Defined at line 37"><span class="token sort_OpId">FUN</span></a>(<span class="cons_Var"><a href="#S_2057_2058" id="S_2090_2091" title="Defined at line 76"><span class="token sort_OpId">S</span></a></span>, <span class="cons_Var"><a href="#T_2051_2052" id="T_2093_2094" title="Defined at line 76"><span class="token sort_OpId">T</span></a></span>),
    <a href="#typeOfExp_1642_1651" id="typeOfExp_2101_2110" title="Defined at line 59"><span class="token sort_ConstraintId">typeOfExp</span></a>(<span class="cons_Var"><a href="#s_2033_2034" id="s_2111_2112" title="Defined at line 76"><span class="token sort_ConstraintId">s</span></a></span>, <span class="cons_Var"><a href="#e2_2044_2046" id="e2_2114_2116" title="Defined at line 76"><span class="token sort_ConstraintId">e2</span></a></span>) == <span class="cons_Var"><a href="#U_2059_2060" id="U_2121_2122" title="Defined at line 76"><span class="token sort_OpId">U</span></a></span>,
    <a href="#subType_3583_3590" id="subType_2128_2135" title="Defined at line 146"><span class="token sort_ConstraintId">subType</span></a>(<span class="cons_Var"><a href="#U_2059_2060" id="U_2136_2137" title="Defined at line 76"><span class="token sort_OpId">U</span></a></span>, <span class="cons_Var"><a href="#S_2057_2058" id="S_2139_2140" title="Defined at line 76"><span class="token sort_OpId">S</span></a></span>).

  [T-Rec]
  <a href="#typeOfExp_1642_1651" id="typeOfExp_2156_2165" title="Defined at line 59"><span class="token sort_ConstraintId">typeOfExp</span></a>(<span class="cons_Var"><a href="#s_2220_2221" id="s_2166_2167" title="Referenced at line 83"><span class="token sort_ConstraintId">s</span></a></span>, <a href="#Rec_552_555" id="Rec_2169_2172" title="Defined at line 18"><span class="token sort_OpId">Rec</span></a>(<span class="cons_Var"><a href="#finits_2223_2229" id="finits_2173_2179" title="Referenced at line 83"><span class="token sort_ConstraintId">finits</span></a></span>)) = <a href="#REC_1374_1377" id="REC_2184_2187" title="Defined at line 38"><span class="token sort_OpId">REC</span></a>(<span class="cons_Var"><a href="#rs_2203_2205" id="rs_2188_2190" title="Referenced at line 83, 83"><span class="token sort_ConstraintId">rs</span></a></span>) :-
    <span class="token keyword">new</span> <span class="cons_Var"><a href="#rs_2188_2190" id="rs_2203_2205" title="Defined at line 82"><span class="token sort_ConstraintId">rs</span></a></span>, <a href="#fieldInitsOK_2782_2794" id="fieldInitsOK_2207_2219" title="Defined at line 109"><span class="token sort_ConstraintId">fieldInitsOK</span></a>(<span class="cons_Var"><a href="#s_2166_2167" id="s_2220_2221" title="Defined at line 82"><span class="token sort_ConstraintId">s</span></a></span>, <span class="cons_Var"><a href="#finits_2173_2179" id="finits_2223_2229" title="Defined at line 82"><span class="token sort_ConstraintId">finits</span></a></span>, <span class="cons_Var"><a href="#rs_2188_2190" id="rs_2231_2233" title="Defined at line 82"><span class="token sort_ConstraintId">rs</span></a></span>).

  [T-Fld]
  <a href="#typeOfExp_1642_1651" id="typeOfExp_2249_2258" title="Defined at line 59"><span class="token sort_ConstraintId">typeOfExp</span></a>(<span class="cons_Var"><a href="#s_2303_2304" id="s_2259_2260" title="Referenced at line 87"><span class="token sort_ConstraintId">s</span></a></span>, <a href="#FAccess_620_627" id="FAccess_2262_2269" title="Defined at line 19"><span class="token sort_OpId">FAccess</span></a>(<span class="cons_Var"><a href="#e_2306_2307" id="e_2270_2271" title="Referenced at line 87"><span class="token sort_ConstraintId">e</span></a></span>, <span class="cons_Var"><a href="#x_2350_2351" id="x_2273_2274" title="Referenced at line 88, 88, 88, 88, 88, 88"><span class="token sort_ConstraintId">x</span></a></span>)) = <span class="cons_Var"><a href="#T_2374_2375" id="T_2279_2280" title="Referenced at line 88"><span class="token sort_OpId">T</span></a></span> :- {<span class="cons_Var"><a href="#rs_2316_2318" id="rs_2285_2287" title="Referenced at line 87, 88"><span class="token sort_ConstraintId">rs</span></a></span>}
    <a href="#typeOfExp_1642_1651" id="typeOfExp_2293_2302" title="Defined at line 59"><span class="token sort_ConstraintId">typeOfExp</span></a>(<span class="cons_Var"><a href="#s_2259_2260" id="s_2303_2304" title="Defined at line 86"><span class="token sort_ConstraintId">s</span></a></span>, <span class="cons_Var"><a href="#e_2270_2271" id="e_2306_2307" title="Defined at line 86"><span class="token sort_ConstraintId">e</span></a></span>) == <a href="#REC_1374_1377" id="REC_2312_2315" title="Defined at line 38"><span class="token sort_OpId">REC</span></a>(<span class="cons_Var"><a href="#rs_2285_2287" id="rs_2316_2318" title="Defined at line 86"><span class="token sort_ConstraintId">rs</span></a></span>),
    <a href="#typeOfDecl_1413_1423" id="typeOfDecl_2325_2335" title="Defined at line 41"><span class="token sort_ConstraintId">typeOfDecl</span></a> <span class="token keyword">of</span> /*<span class="token sort_OpId">Fld</span>*/<a href="#Var_1521_1524" id="Var_2346_2349" title="Defined at line 48"><span class="token sort_OpId">Var</span></a>{<span class="cons_Var"><a href="#x_2273_2274" id="x_2350_2351" title="Defined at line 86"><span class="token sort_ConstraintId">x</span></a></span>@<span class="cons_Var"><a href="#x_2273_2274" id="x_2352_2353" title="Defined at line 86"><span class="token sort_ConstraintId">x</span></a></span>} <span class="token keyword">in</span> <span class="cons_Var"><a href="#rs_2285_2287" id="rs_2358_2360" title="Defined at line 86"><span class="token sort_ConstraintId">rs</span></a></span> |-&gt; [(_, (_, <span class="cons_Var"><a href="#T_2279_2280" id="T_2374_2375" title="Defined at line 86"><span class="token sort_OpId">T</span></a></span>))].

  [T-Let]
  <a href="#typeOfExp_1642_1651" id="typeOfExp_2393_2402" title="Defined at line 59"><span class="token sort_ConstraintId">typeOfExp</span></a>(<span class="cons_Var"><a href="#s_2479_2480" id="s_2403_2404" title="Referenced at line 93, 94"><span class="token sort_ConstraintId">s</span></a></span>, <a href="#Let_685_688" id="Let_2406_2409" title="Defined at line 20"><span class="token sort_OpId">Let</span></a>(<span class="cons_Var"><a href="#binds_2440_2445" id="binds_2410_2415" title="Referenced at line 92, 94"><span class="token sort_ConstraintId">binds</span></a></span>, <span class="cons_Var"><a href="#e_2536_2537" id="e_2417_2418" title="Referenced at line 95"><span class="token sort_ConstraintId">e</span></a></span>)) = <span class="cons_Var"><a href="#T_2542_2543" id="T_2423_2424" title="Referenced at line 95"><span class="token sort_OpId">T</span></a></span> :- {<span class="cons_Var"><a href="#s_let_2461_2466" id="s_let_2429_2434" title="Referenced at line 93, 93, 94, 95"><span class="token sort_ConstraintId">s_let</span></a></span>}
    <span class="cons_Var"><a href="#binds_2410_2415" id="binds_2440_2445" title="Defined at line 91"><span class="token sort_ConstraintId">binds</span></a></span> != [],
    <span class="token keyword">new</span> <span class="cons_Var"><a href="#s_let_2429_2434" id="s_let_2461_2466" title="Defined at line 91"><span class="token sort_ConstraintId">s_let</span></a></span>, <span class="cons_Var"><a href="#s_let_2429_2434" id="s_let_2468_2473" title="Defined at line 91"><span class="token sort_ConstraintId">s_let</span></a></span> -<a href="#P_1507_1508" id="P_2475_2476" title="Defined at line 47"><span class="token sort_OpId">P</span></a>-&gt; <span class="cons_Var"><a href="#s_2403_2404" id="s_2479_2480" title="Defined at line 91"><span class="token sort_ConstraintId">s</span></a></span>,
    <a href="#letBindsOK_2590_2600" id="letBindsOK_2486_2496" title="Defined at line 100"><span class="token sort_ConstraintId">letBindsOK</span></a>(<span class="cons_Var"><a href="#s_2403_2404" id="s_2497_2498" title="Defined at line 91"><span class="token sort_ConstraintId">s</span></a></span>, <span class="cons_Var"><a href="#binds_2410_2415" id="binds_2500_2505" title="Defined at line 91"><span class="token sort_ConstraintId">binds</span></a></span>, <span class="cons_Var"><a href="#s_let_2429_2434" id="s_let_2507_2512" title="Defined at line 91"><span class="token sort_ConstraintId">s_let</span></a></span>),
    <a href="#typeOfExp_1642_1651" id="typeOfExp_2519_2528" title="Defined at line 59"><span class="token sort_ConstraintId">typeOfExp</span></a>(<span class="cons_Var"><a href="#s_let_2429_2434" id="s_let_2529_2534" title="Defined at line 91"><span class="token sort_ConstraintId">s_let</span></a></span>, <span class="cons_Var"><a href="#e_2417_2418" id="e_2536_2537" title="Defined at line 91"><span class="token sort_ConstraintId">e</span></a></span>) == <span class="cons_Var"><a href="#T_2423_2424" id="T_2542_2543" title="Defined at line 91"><span class="token sort_OpId">T</span></a></span>.

<span class="token keyword">rules</span>

  <a href="#letBindOK_2606_2615" id="letBindOK_2555_2564" title="Referenced at line 100, 103"><span class="token sort_ConstraintId">letBindOK</span></a> : <span class="token sort_ConstraintId">scope</span> * <span class="cons_SimpleSort"><a href="#Bind_763_767" id="Bind_2575_2579" title="Defined at line 22"><span class="token sort_OpId">Bind</span></a></span> * <span class="token sort_ConstraintId">scope</span>
  <a href="#letBindsOK_2486_2496" id="letBindsOK_2590_2600" title="Referenced at line 94"><span class="token sort_ConstraintId">letBindsOK</span></a> <span class="token keyword">maps</span> <a href="#letBindOK_2555_2564" id="letBindOK_2606_2615" title="Defined at line 99"><span class="token sort_ConstraintId">letBindOK</span></a>(*, <span class="token sort_ConstraintId">list</span>(*), *)

  [T-Bind]
  <a href="#letBindOK_2555_2564" id="letBindOK_2645_2654" title="Defined at line 99"><span class="token sort_ConstraintId">letBindOK</span></a>(<span class="cons_Var"><a href="#s_2728_2729" id="s_2655_2656" title="Referenced at line 104"><span class="token sort_ConstraintId">s</span></a></span>, <a href="#Bind_820_824" id="Bind_2658_2662" title="Defined at line 23"><span class="token sort_OpId">Bind</span></a>(<span class="cons_Var"><a href="#x_2697_2698" id="x_2663_2664" title="Referenced at line 104, 104, 104, 104"><span class="token sort_ConstraintId">x</span></a></span>, <span class="cons_Var"><a href="#e_2731_2732" id="e_2666_2667" title="Referenced at line 104"><span class="token sort_ConstraintId">e</span></a></span>), <span class="cons_Var"><a href="#s_bnd_2684_2689" id="s_bnd_2670_2675" title="Referenced at line 104, 104"><span class="token sort_ConstraintId">s_bnd</span></a></span>) :-
    <span class="token sort_ConstraintId">s_bnd</span> -&gt; <span class="token sort_OpId">Var</span>{<span class="token sort_ConstraintId">x</span>@<span class="token sort_ConstraintId">x</span>} <span class="token keyword">with</span> <a href="#typeOfDecl_1413_1423" id="typeOfDecl_2707_2717" title="Defined at line 41"><span class="token sort_ConstraintId">typeOfDecl</span></a> <a href="#typeOfExp_1642_1651" id="typeOfExp_2718_2727" title="Defined at line 59"><span class="token sort_ConstraintId">typeOfExp</span></a>(<span class="cons_Var"><a href="#s_2655_2656" id="s_2728_2729" title="Defined at line 103"><span class="token sort_ConstraintId">s</span></a></span>, <span class="cons_Var"><a href="#e_2666_2667" id="e_2731_2732" title="Defined at line 103"><span class="token sort_ConstraintId">e</span></a></span>).

<span class="token keyword">rules</span>

  <a href="#fieldInitOK_2800_2811" id="fieldInitOK_2745_2756" title="Referenced at line 109, 111"><span class="token sort_ConstraintId">fieldInitOK</span></a> : <span class="token sort_ConstraintId">scope</span> * <span class="cons_SimpleSort"><a href="#Bind_763_767" id="Bind_2767_2771" title="Defined at line 22"><span class="token sort_OpId">Bind</span></a></span> * <span class="token sort_ConstraintId">scope</span>
  <a href="#fieldInitsOK_2207_2219" id="fieldInitsOK_2782_2794" title="Referenced at line 83"><span class="token sort_ConstraintId">fieldInitsOK</span></a> <span class="token keyword">maps</span> <a href="#fieldInitOK_2745_2756" id="fieldInitOK_2800_2811" title="Defined at line 108"><span class="token sort_ConstraintId">fieldInitOK</span></a>(*, <span class="token sort_ConstraintId">list</span>(*), *)

  <a href="#fieldInitOK_2745_2756" id="fieldInitOK_2830_2841" title="Defined at line 108"><span class="token sort_ConstraintId">fieldInitOK</span></a>(<span class="cons_Var"><a href="#s_2920_2921" id="s_2842_2843" title="Referenced at line 112"><span class="token sort_ConstraintId">s</span></a></span>, <a href="#Bind_820_824" id="Bind_2845_2849" title="Defined at line 23"><span class="token sort_OpId">Bind</span></a>(<span class="cons_Var"><a href="#x_2889_2890" id="x_2850_2851" title="Referenced at line 112, 112, 112, 112, 113"><span class="token sort_ConstraintId">x</span></a></span>, <span class="cons_Var"><a href="#e_2923_2924" id="e_2853_2854" title="Referenced at line 112"><span class="token sort_ConstraintId">e</span></a></span>), <span class="cons_Var"><a href="#rs_2872_2874" id="rs_2857_2859" title="Referenced at line 112, 112, 113"><span class="token sort_ConstraintId">rs</span></a></span>) :- {<span class="cons_Var"><span id="T_2865_2866" title="Not referenced locally, nor via imports"><span class="token sort_OpId">T</span></span></span>}
    <span class="token sort_ConstraintId">rs</span> -&gt; /*<span class="token sort_OpId">Fld</span>*/<span class="token sort_OpId">Var</span>{<span class="token sort_ConstraintId">x</span>@<span class="token sort_ConstraintId">x</span>} <span class="token keyword">with</span> <a href="#typeOfDecl_1413_1423" id="typeOfDecl_2899_2909" title="Defined at line 41"><span class="token sort_ConstraintId">typeOfDecl</span></a> <a href="#typeOfExp_1642_1651" id="typeOfExp_2910_2919" title="Defined at line 59"><span class="token sort_ConstraintId">typeOfExp</span></a>(<span class="cons_Var"><a href="#s_2842_2843" id="s_2920_2921" title="Defined at line 111"><span class="token sort_ConstraintId">s</span></a></span>, <span class="cons_Var"><a href="#e_2853_2854" id="e_2923_2924" title="Defined at line 111"><span class="token sort_ConstraintId">e</span></a></span>),
    <a href="#unique_2949_2955" id="unique_2931_2937" title="Defined at line 115"><span class="token sort_ConstraintId">unique</span></a>(<span class="cons_Var"><a href="#x_2850_2851" id="x_2938_2939" title="Defined at line 111"><span class="token sort_ConstraintId">x</span></a></span>, <span class="cons_Var"><a href="#rs_2857_2859" id="rs_2941_2943" title="Defined at line 111"><span class="token sort_ConstraintId">rs</span></a></span>).

  <a href="#unique_2931_2937" id="unique_2949_2955" title="Referenced at line 113, 116, 142"><span class="token sort_ConstraintId">unique</span></a> : <span class="cons_SimpleSort"><a href="#ID_162_164" id="ID_2958_2960" title="Defined at line 11"><span class="token sort_OpId">ID</span></a></span> * <span class="token sort_ConstraintId">scope</span>
  <a href="#unique_2949_2955" id="unique_2971_2977" title="Defined at line 115"><span class="token sort_ConstraintId">unique</span></a>(<span class="cons_Var"><a href="#x_3002_3003" id="x_2978_2979" title="Referenced at line 117, 117, 117, 117, 117, 117"><span class="token sort_ConstraintId">x</span></a></span>, <span class="cons_Var"><a href="#s_3010_3011" id="s_2981_2982" title="Referenced at line 117"><span class="token sort_ConstraintId">s</span></a></span>) :-
    /*<span class="token sort_OpId">Fld</span>*/<a href="#Var_1463_1466" id="Var_2998_3001" title="Defined at line 44"><span class="token sort_OpId">Var</span></a>{<span class="cons_Var"><a href="#x_2978_2979" id="x_3002_3003" title="Defined at line 116"><span class="token sort_ConstraintId">x</span></a></span>@<span class="cons_Var"><a href="#x_2978_2979" id="x_3004_3005" title="Defined at line 116"><span class="token sort_ConstraintId">x</span></a></span>} <span class="token keyword">in</span> <span class="cons_Var"><a href="#s_2981_2982" id="s_3010_3011" title="Defined at line 116"><span class="token sort_ConstraintId">s</span></a></span> |-&gt; [_].

<span class="token keyword">rules</span>

  <a href="#typeOfTypeExp_1787_1800" id="typeOfTypeExp_3031_3044" title="Referenced at line 66, 124, 127, 128, 129, 132, 141"><span class="token sort_ConstraintId">typeOfTypeExp</span></a> : <span class="token sort_ConstraintId">scope</span> * <span class="cons_SimpleSort"><a href="#TypeExp_892_899" id="TypeExp_3055_3062" title="Defined at line 25"><span class="token sort_OpId">TypeExp</span></a></span> -&gt; <span class="cons_SimpleSort"><a href="#Type_1303_1307" id="Type_3066_3070" title="Defined at line 35"><span class="token sort_OpId">Type</span></a></span>

  [TE-Unit]
  <a href="#typeOfTypeExp_3031_3044" id="typeOfTypeExp_3086_3099" title="Defined at line 121"><span class="token sort_ConstraintId">typeOfTypeExp</span></a>(<span class="cons_Var"><span id="s_3100_3101" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">s</span></span></span>, <a href="#UnitType_950_958" id="UnitType_3103_3111" title="Defined at line 26"><span class="token sort_OpId">UnitType</span></a>()) = <a href="#UNIT_1325_1329" id="UNIT_3117_3121" title="Defined at line 36"><span class="token sort_OpId">UNIT</span></a>().

  [TE-Fun]
  <a href="#typeOfTypeExp_3031_3044" id="typeOfTypeExp_3139_3152" title="Defined at line 121"><span class="token sort_ConstraintId">typeOfTypeExp</span></a>(<span class="cons_Var"><a href="#s_3210_3211" id="s_3153_3154" title="Referenced at line 128, 129"><span class="token sort_ConstraintId">s</span></a></span>, <a href="#FunType_1017_1024" id="FunType_3156_3163" title="Defined at line 27"><span class="token sort_OpId">FunType</span></a>(<span class="cons_Var"><a href="#te1_3213_3216" id="te1_3164_3167" title="Referenced at line 128"><span class="token sort_ConstraintId">te1</span></a></span>, <span class="cons_Var"><a href="#te2_3246_3249" id="te2_3169_3172" title="Referenced at line 129"><span class="token sort_ConstraintId">te2</span></a></span>)) = <a href="#FUN_1342_1345" id="FUN_3177_3180" title="Defined at line 37"><span class="token sort_OpId">FUN</span></a>(<span class="cons_Var"><a href="#T1_3221_3223" id="T1_3181_3183" title="Referenced at line 128"><span class="token sort_OpId">T1</span></a></span>, <span class="cons_Var"><a href="#T2_3254_3256" id="T2_3185_3187" title="Referenced at line 129"><span class="token sort_OpId">T2</span></a></span>) :-
    <a href="#typeOfTypeExp_3031_3044" id="typeOfTypeExp_3196_3209" title="Defined at line 121"><span class="token sort_ConstraintId">typeOfTypeExp</span></a>(<span class="cons_Var"><a href="#s_3153_3154" id="s_3210_3211" title="Defined at line 127"><span class="token sort_ConstraintId">s</span></a></span>, <span class="cons_Var"><a href="#te1_3164_3167" id="te1_3213_3216" title="Defined at line 127"><span class="token sort_ConstraintId">te1</span></a></span>) == <span class="cons_Var"><a href="#T1_3181_3183" id="T1_3221_3223" title="Defined at line 127"><span class="token sort_OpId">T1</span></a></span>,
    <a href="#typeOfTypeExp_3031_3044" id="typeOfTypeExp_3229_3242" title="Defined at line 121"><span class="token sort_ConstraintId">typeOfTypeExp</span></a>(<span class="cons_Var"><a href="#s_3153_3154" id="s_3243_3244" title="Defined at line 127"><span class="token sort_ConstraintId">s</span></a></span>, <span class="cons_Var"><a href="#te2_3169_3172" id="te2_3246_3249" title="Defined at line 127"><span class="token sort_ConstraintId">te2</span></a></span>) == <span class="cons_Var"><a href="#T2_3185_3187" id="T2_3254_3256" title="Defined at line 127"><span class="token sort_OpId">T2</span></a></span>.

  [TE-Rec]
  <a href="#typeOfTypeExp_3031_3044" id="typeOfTypeExp_3272_3285" title="Defined at line 121"><span class="token sort_ConstraintId">typeOfTypeExp</span></a>(<span class="cons_Var"><a href="#s_3344_3345" id="s_3286_3287" title="Referenced at line 133"><span class="token sort_ConstraintId">s</span></a></span>, <a href="#RecType_1088_1095" id="RecType_3289_3296" title="Defined at line 28"><span class="token sort_OpId">RecType</span></a>(<span class="cons_Var"><a href="#ftypes_3347_3353" id="ftypes_3297_3303" title="Referenced at line 133"><span class="token sort_ConstraintId">ftypes</span></a></span>)) = <a href="#REC_1374_1377" id="REC_3308_3311" title="Defined at line 38"><span class="token sort_OpId">REC</span></a>(<span class="cons_Var"><a href="#rs_3327_3329" id="rs_3312_3314" title="Referenced at line 133, 133"><span class="token sort_ConstraintId">rs</span></a></span>) :-
    <span class="token keyword">new</span> <span class="cons_Var"><a href="#rs_3312_3314" id="rs_3327_3329" title="Defined at line 132"><span class="token sort_ConstraintId">rs</span></a></span>, <a href="#fieldTypesOK_3407_3419" id="fieldTypesOK_3331_3343" title="Defined at line 138"><span class="token sort_ConstraintId">fieldTypesOK</span></a>(<span class="cons_Var"><a href="#s_3286_3287" id="s_3344_3345" title="Defined at line 132"><span class="token sort_ConstraintId">s</span></a></span>, <span class="cons_Var"><a href="#ftypes_3297_3303" id="ftypes_3347_3353" title="Defined at line 132"><span class="token sort_ConstraintId">ftypes</span></a></span>, <span class="cons_Var"><a href="#rs_3312_3314" id="rs_3355_3357" title="Defined at line 132"><span class="token sort_ConstraintId">rs</span></a></span>).

<span class="token keyword">rules</span>

  <a href="#fieldTypeOK_3425_3436" id="fieldTypeOK_3370_3381" title="Referenced at line 138, 140"><span class="token sort_ConstraintId">fieldTypeOK</span></a> : <span class="token sort_ConstraintId">scope</span> * <span class="cons_SimpleSort"><a href="#Decl_1162_1166" id="Decl_3392_3396" title="Defined at line 30"><span class="token sort_OpId">Decl</span></a></span> * <span class="token sort_ConstraintId">scope</span>
  <a href="#fieldTypesOK_3331_3343" id="fieldTypesOK_3407_3419" title="Referenced at line 133"><span class="token sort_ConstraintId">fieldTypesOK</span></a> <span class="token keyword">maps</span> <a href="#fieldTypeOK_3370_3381" id="fieldTypeOK_3425_3436" title="Defined at line 137"><span class="token sort_ConstraintId">fieldTypeOK</span></a>(*, <span class="token sort_ConstraintId">list</span>(*), *)

  <a href="#fieldTypeOK_3370_3381" id="fieldTypeOK_3455_3466" title="Defined at line 137"><span class="token sort_ConstraintId">fieldTypeOK</span></a>(<span class="cons_Var"><a href="#s_3546_3547" id="s_3467_3468" title="Referenced at line 141"><span class="token sort_ConstraintId">s</span></a></span>, <a href="#Decl_1219_1223" id="Decl_3470_3474" title="Defined at line 31"><span class="token sort_OpId">Decl</span></a>(<span class="cons_Var"><a href="#x_3511_3512" id="x_3475_3476" title="Referenced at line 141, 141, 141, 141, 142"><span class="token sort_ConstraintId">x</span></a></span>, <span class="cons_Var"><a href="#te_3549_3551" id="te_3478_3480" title="Referenced at line 141"><span class="token sort_ConstraintId">te</span></a></span>), <span class="cons_Var"><a href="#rs_3494_3496" id="rs_3483_3485" title="Referenced at line 141, 141, 142"><span class="token sort_ConstraintId">rs</span></a></span>) :-
    <span class="token sort_ConstraintId">rs</span> -&gt; /*<span class="token sort_OpId">Fld</span>*/<span class="token sort_OpId">Var</span>{<span class="token sort_ConstraintId">x</span>@<span class="token sort_ConstraintId">x</span>} <span class="token keyword">with</span> <a href="#typeOfDecl_1413_1423" id="typeOfDecl_3521_3531" title="Defined at line 41"><span class="token sort_ConstraintId">typeOfDecl</span></a> <a href="#typeOfTypeExp_3031_3044" id="typeOfTypeExp_3532_3545" title="Defined at line 121"><span class="token sort_ConstraintId">typeOfTypeExp</span></a>(<span class="cons_Var"><a href="#s_3467_3468" id="s_3546_3547" title="Defined at line 140"><span class="token sort_ConstraintId">s</span></a></span>, <span class="cons_Var"><a href="#te_3478_3480" id="te_3549_3551" title="Defined at line 140"><span class="token sort_ConstraintId">te</span></a></span>),
    <a href="#unique_2949_2955" id="unique_3558_3564" title="Defined at line 115"><span class="token sort_ConstraintId">unique</span></a>(<span class="cons_Var"><a href="#x_3475_3476" id="x_3565_3566" title="Defined at line 140"><span class="token sort_ConstraintId">x</span></a></span>, <span class="cons_Var"><a href="#rs_3483_3485" id="rs_3568_3570" title="Defined at line 140"><span class="token sort_ConstraintId">rs</span></a></span>).

<span class="token keyword">rules</span>

  <a href="#subType_2128_2135" id="subType_3583_3590" title="Referenced at line 79, 150, 152, 152, 152, 154, 159"><span class="token sort_ConstraintId">subType</span></a>  : <span class="cons_SimpleSort"><a href="#Type_1303_1307" id="Type_3594_3598" title="Defined at line 35"><span class="token sort_OpId">Type</span></a></span> * <span class="cons_SimpleSort"><a href="#Type_1303_1307" id="Type_3601_3605" title="Defined at line 35"><span class="token sort_OpId">Type</span></a></span>
  <a href="#subField_3664_3672" id="subField_3608_3616" title="Referenced at line 148, 156"><span class="token sort_ConstraintId">subField</span></a> : <span class="token sort_ConstraintId">scope</span> * (<span class="token sort_ConstraintId">path</span> * <span class="token sort_ConstraintId">occurrence</span>)
  <a href="#subFields_3825_3834" id="subFields_3649_3658" title="Referenced at line 154"><span class="token sort_ConstraintId">subFields</span></a> <span class="token keyword">maps</span> <a href="#subField_3608_3616" id="subField_3664_3672" title="Defined at line 147"><span class="token sort_ConstraintId">subField</span></a>(*, <span class="token sort_ConstraintId">list</span>(*))

  <a href="#subType_3583_3590" id="subType_3688_3695" title="Defined at line 146"><span class="token sort_ConstraintId">subType</span></a>(<a href="#UNIT_1325_1329" id="UNIT_3696_3700" title="Defined at line 36"><span class="token sort_OpId">UNIT</span></a>(), <a href="#UNIT_1325_1329" id="UNIT_3704_3708" title="Defined at line 36"><span class="token sort_OpId">UNIT</span></a>()).

  <a href="#subType_3583_3590" id="subType_3716_3723" title="Defined at line 146"><span class="token sort_ConstraintId">subType</span></a>(<a href="#FUN_1342_1345" id="FUN_3724_3727" title="Defined at line 37"><span class="token sort_OpId">FUN</span></a>(<span class="cons_Var"><a href="#S1_3765_3767" id="S1_3728_3730" title="Referenced at line 152"><span class="token sort_OpId">S1</span></a></span>, <span class="cons_Var"><a href="#T1_3778_3780" id="T1_3732_3734" title="Referenced at line 152"><span class="token sort_OpId">T1</span></a></span>), <a href="#FUN_1342_1345" id="FUN_3737_3740" title="Defined at line 37"><span class="token sort_OpId">FUN</span></a>(<span class="cons_Var"><a href="#S2_3761_3763" id="S2_3741_3743" title="Referenced at line 152"><span class="token sort_OpId">S2</span></a></span>, <span class="cons_Var"><a href="#T2_3782_3784" id="T2_3745_3747" title="Referenced at line 152"><span class="token sort_OpId">T2</span></a></span>)) :- <a href="#subType_3583_3590" id="subType_3753_3760" title="Defined at line 146"><span class="token sort_ConstraintId">subType</span></a>(<span class="cons_Var"><a href="#S2_3741_3743" id="S2_3761_3763" title="Defined at line 152"><span class="token sort_OpId">S2</span></a></span>, <span class="cons_Var"><a href="#S1_3728_3730" id="S1_3765_3767" title="Defined at line 152"><span class="token sort_OpId">S1</span></a></span>), <a href="#subType_3583_3590" id="subType_3770_3777" title="Defined at line 146"><span class="token sort_ConstraintId">subType</span></a>(<span class="cons_Var"><a href="#T1_3732_3734" id="T1_3778_3780" title="Defined at line 152"><span class="token sort_OpId">T1</span></a></span>, <span class="cons_Var"><a href="#T2_3745_3747" id="T2_3782_3784" title="Defined at line 152"><span class="token sort_OpId">T2</span></a></span>).

  <a href="#subType_3583_3590" id="subType_3790_3797" title="Defined at line 146"><span class="token sort_ConstraintId">subType</span></a>(<a href="#REC_1374_1377" id="REC_3798_3801" title="Defined at line 38"><span class="token sort_OpId">REC</span></a>(<span class="cons_Var"><a href="#s_sub_3835_3840" id="s_sub_3802_3807" title="Referenced at line 154"><span class="token sort_ConstraintId">s_sub</span></a></span>), <a href="#REC_1374_1377" id="REC_3810_3813" title="Defined at line 38"><span class="token sort_OpId">REC</span></a>(<span class="cons_Var"><a href="#s_sup_3852_3857" id="s_sup_3814_3819" title="Referenced at line 154"><span class="token sort_ConstraintId">s_sup</span></a></span>)) :- <a href="#subFields_3649_3658" id="subFields_3825_3834" title="Defined at line 148"><span class="token sort_ConstraintId">subFields</span></a>(<span class="cons_Var"><a href="#s_sub_3802_3807" id="s_sub_3835_3840" title="Defined at line 154"><span class="token sort_ConstraintId">s_sub</span></a></span>, <a href="#allFields_4048_4057" id="allFields_3842_3851" title="Defined at line 161"><span class="token sort_ConstraintId">allFields</span></a>(<span class="cons_Var"><a href="#s_sup_3814_3819" id="s_sup_3852_3857" title="Defined at line 154"><span class="token sort_ConstraintId">s_sup</span></a></span>)).

  <a href="#subField_3608_3616" id="subField_3864_3872" title="Defined at line 147"><span class="token sort_ConstraintId">subField</span></a>(<span class="cons_Var"><a href="#s_sub_4001_4006" id="s_sub_3873_3878" title="Referenced at line 158"><span class="token sort_ConstraintId">s_sub</span></a></span>, (<span class="cons_Var"><a href="#p_sup_3956_3961" id="p_sup_3881_3886" title="Referenced at line 157"><span class="token sort_ConstraintId">p_sup</span></a></span>, <span class="cons_Var"><a href="#d_sup_3942_3947" id="d_sup_3888_3893" title="Referenced at line 157"><span class="token sort_ConstraintId">d_sup</span></a></span>@/*<span class="token sort_OpId">Fld</span>*/<a href="#Var_1463_1466" id="Var_3901_3904" title="Defined at line 44"><span class="token sort_OpId">Var</span></a>{<span class="cons_Var"><a href="#x_3993_3994" id="x_3905_3906" title="Referenced at line 158, 158, 158"><span class="token sort_ConstraintId">x</span></a></span>@<span class="cons_Var"><a href="#i_3995_3996" id="i_3907_3908" title="Referenced at line 158, 158, 158"><span class="token sort_ConstraintId">i</span></a></span>})) :- {<span class="cons_Var"><a href="#S_3925_3926" id="S_3916_3917" title="Referenced at line 157, 159"><span class="token sort_OpId">S</span></a></span> <span class="cons_Var"><a href="#T_4020_4021" id="T_3918_3919" title="Referenced at line 158, 159"><span class="token sort_OpId">T</span></a></span>}
    <span class="cons_Var"><a href="#S_3916_3917" id="S_3925_3926" title="Defined at line 156"><span class="token sort_OpId">S</span></a></span> == ?<a href="#typeOfDecl_1413_1423" id="typeOfDecl_3931_3941" title="Defined at line 41"><span class="token sort_ConstraintId">typeOfDecl</span></a>[<span class="cons_Var"><a href="#d_sup_3888_3893" id="d_sup_3942_3947" title="Defined at line 156"><span class="token sort_ConstraintId">d_sup</span></a></span>] <span class="token keyword">in</span> <a href="#dst_5469_5472" id="dst_3952_3955" title="Defined at line 227"><span class="token sort_ConstraintId">dst</span></a>(<span class="cons_Var"><a href="#p_sup_3881_3886" id="p_sup_3956_3961" title="Defined at line 156"><span class="token sort_ConstraintId">p_sup</span></a></span>),
    <a href="#typeOfDecl_1413_1423" id="typeOfDecl_3968_3978" title="Defined at line 41"><span class="token sort_ConstraintId">typeOfDecl</span></a> <span class="token keyword">of</span> /*<span class="token sort_OpId">Fld</span>*/<a href="#Var_1463_1466" id="Var_3989_3992" title="Defined at line 44"><span class="token sort_OpId">Var</span></a>{<span class="cons_Var"><a href="#x_3905_3906" id="x_3993_3994" title="Defined at line 156"><span class="token sort_ConstraintId">x</span></a></span>@<span class="cons_Var"><a href="#i_3907_3908" id="i_3995_3996" title="Defined at line 156"><span class="token sort_ConstraintId">i</span></a></span>} <span class="token keyword">in</span> <span class="cons_Var"><a href="#s_sub_3873_3878" id="s_sub_4001_4006" title="Defined at line 156"><span class="token sort_ConstraintId">s_sub</span></a></span> |-&gt; [(_, (_, <span class="cons_Var"><a href="#T_3918_3919" id="T_4020_4021" title="Defined at line 156"><span class="token sort_OpId">T</span></a></span>))],
    <a href="#subType_3583_3590" id="subType_4030_4037" title="Defined at line 146"><span class="token sort_ConstraintId">subType</span></a>(<span class="cons_Var"><a href="#T_3918_3919" id="T_4038_4039" title="Defined at line 156"><span class="token sort_OpId">T</span></a></span>, <span class="cons_Var"><a href="#S_3916_3917" id="S_4041_4042" title="Defined at line 156"><span class="token sort_OpId">S</span></a></span>).

  <a href="#allFields_3842_3851" id="allFields_4048_4057" title="Referenced at line 154, 162"><span class="token sort_ConstraintId">allFields</span></a>: <span class="token sort_ConstraintId">scope</span> -&gt; <span class="token sort_ConstraintId">list</span>((<span class="token sort_ConstraintId">path</span> * <span class="token sort_ConstraintId">occurrence</span>))
  <a href="#allFields_4048_4057" id="allFields_4096_4105" title="Defined at line 161"><span class="token sort_ConstraintId">allFields</span></a>(<span class="cons_Var"><a href="#s_4249_4250" id="s_4106_4107" title="Referenced at line 166"><span class="token sort_ConstraintId">s</span></a></span>) = <span class="cons_Var"><a href="#ps_4255_4257" id="ps_4111_4113" title="Referenced at line 166"><span class="token sort_ConstraintId">ps</span></a></span> :-
    <span class="token keyword">query</span> <span class="token sort_ConstraintId">decl</span>
          <span class="token keyword">filter</span> <span class="token sort_ConstraintId">e</span> <span class="token keyword">and</span> { /*<span class="token sort_OpId">Fld</span>*/<a href="#Var_1463_1466" id="Var_4164_4167" title="Defined at line 44"><span class="token sort_OpId">Var</span></a>{_@_} }
          <span class="token keyword">min</span> /* */ <span class="token keyword">and</span> { /*<span class="token sort_OpId">Fld</span>*/<a href="#Var_1463_1466" id="Var_4208_4211" title="Defined at line 44"><span class="token sort_OpId">Var</span></a>{<span class="cons_Var">x</span>@_}, /*<span class="token sort_OpId">Fld</span>*/<a href="#Var_1463_1466" id="Var_4225_4228" title="Defined at line 44"><span class="token sort_OpId">Var</span></a>{<span class="cons_Var"><span id="x_4229_4230" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">x</span></span></span>@_} }
          <span class="token keyword">in</span> <span class="cons_Var"><a href="#s_4106_4107" id="s_4249_4250" title="Defined at line 162"><span class="token sort_ConstraintId">s</span></a></span> |-&gt; <span class="cons_Var"><a href="#ps_4111_4113" id="ps_4255_4257" title="Defined at line 162"><span class="token sort_ConstraintId">ps</span></a></span>.

<span class="token keyword">signature</span>

  <span class="token sort_ConstraintId">sorts</span> <a href="#Frame_4347_4352" id="Frame_4279_4284" title="Referenced at line 174, 181, 208, 208, 216, 216"><span class="token sort_OpId">Frame</span></a> = <span class="token sort_ConstraintId">scope</span>

  <span class="token sort_ConstraintId">sorts</span> <span class="cons_SortDecl"><a href="#Val_4331_4334" id="Val_4302_4305" title="Referenced at line 173, 174, 177, 181"><span class="token sort_OpId">Val</span></a></span> <span class="token sort_ConstraintId">constructors</span>
    <a href="#UnitV_4495_4500" id="UnitV_4323_4328" title="Referenced at line 184"><span class="token sort_OpId">UnitV</span></a> : <span class="cons_SimpleSort"><a href="#Val_4302_4305" id="Val_4331_4334" title="Defined at line 172"><span class="token sort_OpId">Val</span></a></span>
    <a href="#ClosV_4549_4554" id="ClosV_4339_4344" title="Referenced at line 187, 195"><span class="token sort_OpId">ClosV</span></a> : <span class="cons_SimpleSort"><a href="#Frame_4279_4284" id="Frame_4347_4352" title="Defined at line 170"><span class="token sort_OpId">Frame</span></a></span> * <span class="cons_SimpleSort"><a href="#ID_162_164" id="ID_4355_4357" title="Defined at line 11"><span class="token sort_OpId">ID</span></a></span> * <span class="cons_SimpleSort"><a href="#Exp_221_224" id="Exp_4360_4363" title="Defined at line 13"><span class="token sort_OpId">Exp</span></a></span> -&gt; <span class="cons_SimpleSort"><a href="#Val_4302_4305" id="Val_4367_4370" title="Defined at line 172"><span class="token sort_OpId">Val</span></a></span>

  <span class="token keyword">relations</span>
    <a href="#val_4623_4626" id="val_4388_4391" title="Referenced at line 191, 198, 213"><span class="token sort_ConstraintId">val</span></a> : <span class="token sort_ConstraintId">occurrence</span> -&gt; <span class="cons_SimpleSort"><a href="#Val_4302_4305" id="Val_4408_4411" title="Defined at line 172"><span class="token sort_OpId">Val</span></a></span>

<span class="token keyword">rules</span>

  <a href="#evalExp_127_134" id="evalExp_4422_4429" title="Referenced at line 7, 184, 187, 190, 194, 195, 196, 199, 202, 205, 212"><span class="token sort_ConstraintId">evalExp</span></a> : <span class="cons_SimpleSort"><a href="#Frame_4279_4284" id="Frame_4432_4437" title="Defined at line 170"><span class="token sort_OpId">Frame</span></a></span> * <span class="cons_SimpleSort"><a href="#Exp_221_224" id="Exp_4440_4443" title="Defined at line 13"><span class="token sort_OpId">Exp</span></a></span> -&gt; (<span class="cons_SimpleSort"><a href="#Val_4302_4305" id="Val_4448_4451" title="Defined at line 172"><span class="token sort_OpId">Val</span></a></span> * <span class="token keyword">in</span><span class="token sort_ConstraintId">t</span>)

  [E-Unit]
  <a href="#evalExp_4422_4429" id="evalExp_4473_4480" title="Defined at line 181"><span class="token sort_ConstraintId">evalExp</span></a>(<span class="cons_Var"><span id="f_4481_4482" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">f</span></span></span>, <a href="#Unit_278_282" id="Unit_4484_4488" title="Defined at line 14"><span class="token sort_OpId">Unit</span></a>()) = (<a href="#UnitV_4323_4328" id="UnitV_4495_4500" title="Defined at line 173"><span class="token sort_OpId">UnitV</span></a>(), 0).

  [E-Fun]
  <a href="#evalExp_4422_4429" id="evalExp_4521_4528" title="Defined at line 181"><span class="token sort_ConstraintId">evalExp</span></a>(<span class="cons_Var"><span id="f_4529_4530" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">f</span></span></span>, <a href="#Fun_344_347" id="Fun_4532_4535" title="Defined at line 15"><span class="token sort_OpId">Fun</span></a>(<span class="cons_Var"><span id="x_4536_4537" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">x</span></span></span>, <span class="cons_Var"><span id="S_4539_4540" title="Not referenced locally, nor via imports"><span class="token sort_OpId">S</span></span></span>, <span class="cons_Var">e</span>)) = (<a href="#ClosV_4339_4344" id="ClosV_4549_4554" title="Defined at line 174"><span class="token sort_OpId">ClosV</span></a>(<span class="cons_Var">f</span>, <span class="cons_Var">x</span>, <span class="cons_Var"><span id="e_4561_4562" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">e</span></span></span>), 0).

  [E-Var]
  <a href="#evalExp_4422_4429" id="evalExp_4582_4589" title="Defined at line 181"><span class="token sort_ConstraintId">evalExp</span></a>(<span class="cons_Var"><a href="#f_4642_4643" id="f_4590_4591" title="Referenced at line 191"><span class="token sort_ConstraintId">f</span></a></span>, <a href="#Var_424_427" id="Var_4593_4596" title="Defined at line 16"><span class="token sort_OpId">Var</span></a>(<span class="cons_Var"><a href="#x_4634_4635" id="x_4597_4598" title="Referenced at line 191, 191, 191, 191, 191, 191"><span class="token sort_ConstraintId">x</span></a></span>)) = (<span class="cons_Var"><a href="#v_4657_4658" id="v_4604_4605" title="Referenced at line 191"><span class="token sort_ConstraintId">v</span></a></span>, 0) :- {<span class="cons_Var"><a href="#p_4650_4651" id="p_4614_4615" title="Referenced at line 191"><span class="token sort_ConstraintId">p</span></a></span> <span class="cons_Var"><a href="#d_4654_4655" id="d_4616_4617" title="Referenced at line 191"><span class="token sort_ConstraintId">d</span></a></span>}
    <a href="#val_4388_4391" id="val_4623_4626" title="Defined at line 177"><span class="token sort_ConstraintId">val</span></a> <span class="token keyword">of</span> <a href="#Var_1463_1466" id="Var_4630_4633" title="Defined at line 44"><span class="token sort_OpId">Var</span></a>{<span class="cons_Var"><a href="#x_4597_4598" id="x_4634_4635" title="Defined at line 190"><span class="token sort_ConstraintId">x</span></a></span>@<span class="cons_Var"><a href="#x_4597_4598" id="x_4636_4637" title="Defined at line 190"><span class="token sort_ConstraintId">x</span></a></span>} <span class="token keyword">in</span> <span class="cons_Var"><a href="#f_4590_4591" id="f_4642_4643" title="Defined at line 190"><span class="token sort_ConstraintId">f</span></a></span> |-&gt; [(<span class="cons_Var"><a href="#p_4614_4615" id="p_4650_4651" title="Defined at line 190"><span class="token sort_ConstraintId">p</span></a></span>, (<span class="cons_Var"><a href="#d_4616_4617" id="d_4654_4655" title="Defined at line 190"><span class="token sort_ConstraintId">d</span></a></span>, <span class="cons_Var"><a href="#v_4604_4605" id="v_4657_4658" title="Defined at line 190"><span class="token sort_ConstraintId">v</span></a></span>))].

  [E-App]
  <a href="#evalExp_4422_4429" id="evalExp_4676_4683" title="Defined at line 181"><span class="token sort_ConstraintId">evalExp</span></a>(<span class="cons_Var"><a href="#f_4763_4764" id="f_4684_4685" title="Referenced at line 195, 196"><span class="token sort_ConstraintId">f</span></a></span>, <a href="#App_487_490" id="App_4687_4690" title="Defined at line 17"><span class="token sort_OpId">App</span></a>(<span class="cons_Var"><a href="#e1_4766_4768" id="e1_4691_4693" title="Referenced at line 195"><span class="token sort_ConstraintId">e1</span></a></span>, <span class="cons_Var"><a href="#e2_4815_4817" id="e2_4695_4697" title="Referenced at line 196"><span class="token sort_ConstraintId">e2</span></a></span>)) = (<span class="cons_Var"><a href="#v_4927_4928" id="v_4703_4704" title="Referenced at line 199"><span class="token sort_ConstraintId">v</span></a></span>, #(1 + <span class="cons_Var"><a href="#k_4930_4931" id="k_4712_4713" title="Referenced at line 199"><span class="token sort_ConstraintId">k</span></a></span> + <span class="cons_Var"><a href="#k1_4795_4797" id="k1_4716_4718" title="Referenced at line 195"><span class="token sort_ConstraintId">k1</span></a></span> + <span class="cons_Var"><a href="#k2_4827_4829" id="k2_4721_4723" title="Referenced at line 196"><span class="token sort_ConstraintId">k2</span></a></span>)) :- {<span class="cons_Var"><a href="#f_clos_4780_4786" id="f_clos_4730_4736" title="Referenced at line 195, 197"><span class="token sort_ConstraintId">f_clos</span></a></span> <span class="cons_Var"><a href="#x_4788_4789" id="x_4737_4738" title="Referenced at line 195, 198, 198, 198, 198"><span class="token sort_ConstraintId">x</span></a></span> <span class="cons_Var"><a href="#e_4791_4792" id="e_4739_4740" title="Referenced at line 195, 199"><span class="token sort_ConstraintId">e</span></a></span> <span class="cons_Var"><a href="#f_app_4840_4845" id="f_app_4741_4746" title="Referenced at line 197, 197, 198, 198, 199"><span class="token sort_ConstraintId">f_app</span></a></span> <span class="cons_Var"><a href="#v'_4823_4825" id="v'_4747_4749" title="Referenced at line 196, 198">v'</a></span>}
    <a href="#evalExp_4422_4429" id="evalExp_4755_4762" title="Defined at line 181"><span class="token sort_ConstraintId">evalExp</span></a>(<span class="cons_Var"><a href="#f_4684_4685" id="f_4763_4764" title="Defined at line 194"><span class="token sort_ConstraintId">f</span></a></span>, <span class="cons_Var"><a href="#e1_4691_4693" id="e1_4766_4768" title="Defined at line 194"><span class="token sort_ConstraintId">e1</span></a></span>) == (<a href="#ClosV_4339_4344" id="ClosV_4774_4779" title="Defined at line 174"><span class="token sort_OpId">ClosV</span></a>(<span class="cons_Var"><a href="#f_clos_4730_4736" id="f_clos_4780_4786" title="Defined at line 194"><span class="token sort_ConstraintId">f_clos</span></a></span>, <span class="cons_Var"><a href="#x_4737_4738" id="x_4788_4789" title="Defined at line 194"><span class="token sort_ConstraintId">x</span></a></span>, <span class="cons_Var"><a href="#e_4739_4740" id="e_4791_4792" title="Defined at line 194"><span class="token sort_ConstraintId">e</span></a></span>), <span class="cons_Var"><a href="#k1_4716_4718" id="k1_4795_4797" title="Defined at line 194"><span class="token sort_ConstraintId">k1</span></a></span>),
    <a href="#evalExp_4422_4429" id="evalExp_4804_4811" title="Defined at line 181"><span class="token sort_ConstraintId">evalExp</span></a>(<span class="cons_Var"><a href="#f_4684_4685" id="f_4812_4813" title="Defined at line 194"><span class="token sort_ConstraintId">f</span></a></span>, <span class="cons_Var"><a href="#e2_4695_4697" id="e2_4815_4817" title="Defined at line 194"><span class="token sort_ConstraintId">e2</span></a></span>) == (<span class="cons_Var"><a href="#v'_4747_4749" id="v'_4823_4825" title="Defined at line 194">v'</a></span>, <span class="cons_Var"><a href="#k2_4721_4723" id="k2_4827_4829" title="Defined at line 194"><span class="token sort_ConstraintId">k2</span></a></span>),
    <span class="token keyword">new</span> <span class="cons_Var"><a href="#f_app_4741_4746" id="f_app_4840_4845" title="Defined at line 194"><span class="token sort_ConstraintId">f_app</span></a></span>, <span class="cons_Var"><a href="#f_app_4741_4746" id="f_app_4847_4852" title="Defined at line 194"><span class="token sort_ConstraintId">f_app</span></a></span> -<a href="#P_1507_1508" id="P_4854_4855" title="Defined at line 47"><span class="token sort_OpId">P</span></a>-&gt; <span class="cons_Var"><a href="#f_clos_4730_4736" id="f_clos_4858_4864" title="Defined at line 194"><span class="token sort_ConstraintId">f_clos</span></a></span>,
    <span class="token sort_ConstraintId">f_app</span> -&gt; <span class="token sort_OpId">Var</span>{<span class="token sort_ConstraintId">x</span>@<span class="token sort_ConstraintId">x</span>} <span class="token keyword">with</span> <a href="#val_4388_4391" id="val_4893_4896" title="Defined at line 177"><span class="token sort_ConstraintId">val</span></a> <span class="cons_Var"><a href="#v'_4747_4749" id="v'_4897_4899" title="Defined at line 194">v'</a></span>,
    <a href="#evalExp_4422_4429" id="evalExp_4905_4912" title="Defined at line 181"><span class="token sort_ConstraintId">evalExp</span></a>(<span class="cons_Var"><a href="#f_app_4741_4746" id="f_app_4913_4918" title="Defined at line 194"><span class="token sort_ConstraintId">f_app</span></a></span>, <span class="cons_Var"><a href="#e_4739_4740" id="e_4920_4921" title="Defined at line 194"><span class="token sort_ConstraintId">e</span></a></span>) == (<span class="cons_Var"><a href="#v_4703_4704" id="v_4927_4928" title="Defined at line 194"><span class="token sort_ConstraintId">v</span></a></span>, <span class="cons_Var"><a href="#k_4712_4713" id="k_4930_4931" title="Defined at line 194"><span class="token sort_ConstraintId">k</span></a></span>).

  [E-Let]
  <a href="#evalExp_4422_4429" id="evalExp_4947_4954" title="Defined at line 181"><span class="token sort_ConstraintId">evalExp</span></a>(<span class="cons_Var"><a href="#f_5030_5031" id="f_4955_4956" title="Referenced at line 204"><span class="token sort_ConstraintId">f</span></a></span>, <a href="#Let_685_688" id="Let_4958_4961" title="Defined at line 20"><span class="token sort_OpId">Let</span></a>(<span class="cons_Var"><a href="#binds_5033_5038" id="binds_4962_4967" title="Referenced at line 204"><span class="token sort_ConstraintId">binds</span></a></span>, <span class="cons_Var"><a href="#e_5073_5074" id="e_4969_4970" title="Referenced at line 205"><span class="token sort_ConstraintId">e</span></a></span>)) = (<span class="cons_Var"><a href="#v_5080_5081" id="v_4976_4977" title="Referenced at line 205"><span class="token sort_ConstraintId">v</span></a></span>, #(<span class="cons_Var"><a href="#k_5083_5084" id="k_4981_4982" title="Referenced at line 205"><span class="token sort_ConstraintId">k</span></a></span> + <span class="cons_Var"><a href="#k'_5050_5052" id="k'_4985_4987" title="Referenced at line 204">k'</a></span>)) :- {<span class="cons_Var"><a href="#f_let_5009_5014" id="f_let_4994_4999" title="Referenced at line 203, 204, 205"><span class="token sort_ConstraintId">f_let</span></a></span>}
    <span class="token keyword">new</span> <span class="cons_Var"><a href="#f_let_4994_4999" id="f_let_5009_5014" title="Defined at line 202"><span class="token sort_ConstraintId">f_let</span></a></span>,
    <a href="#evalBinds_5253_5262" id="evalBinds_5020_5029" title="Defined at line 216"><span class="token sort_ConstraintId">evalBinds</span></a>(<span class="cons_Var"><a href="#f_4955_4956" id="f_5030_5031" title="Defined at line 202"><span class="token sort_ConstraintId">f</span></a></span>, <span class="cons_Var"><a href="#binds_4962_4967" id="binds_5033_5038" title="Defined at line 202"><span class="token sort_ConstraintId">binds</span></a></span>, <span class="cons_Var"><a href="#f_let_4994_4999" id="f_let_5040_5045" title="Defined at line 202"><span class="token sort_ConstraintId">f_let</span></a></span>) == <span class="cons_Var"><a href="#k'_4985_4987" id="k'_5050_5052" title="Defined at line 202">k'</a></span>,
    <a href="#evalExp_4422_4429" id="evalExp_5058_5065" title="Defined at line 181"><span class="token sort_ConstraintId">evalExp</span></a>(<span class="cons_Var"><a href="#f_let_4994_4999" id="f_let_5066_5071" title="Defined at line 202"><span class="token sort_ConstraintId">f_let</span></a></span>, <span class="cons_Var"><a href="#e_4969_4970" id="e_5073_5074" title="Defined at line 202"><span class="token sort_ConstraintId">e</span></a></span>) == (<span class="cons_Var"><a href="#v_4976_4977" id="v_5080_5081" title="Defined at line 202"><span class="token sort_ConstraintId">v</span></a></span>, <span class="cons_Var"><a href="#k_4981_4982" id="k_5083_5084" title="Defined at line 202"><span class="token sort_ConstraintId">k</span></a></span>).


  <a href="#evalBind_5144_5152" id="evalBind_5091_5099" title="Referenced at line 211, 221"><span class="token sort_ConstraintId">evalBind</span></a> : <span class="cons_SimpleSort"><a href="#Frame_4279_4284" id="Frame_5102_5107" title="Defined at line 170"><span class="token sort_OpId">Frame</span></a></span> * <span class="cons_SimpleSort"><a href="#Bind_763_767" id="Bind_5110_5114" title="Defined at line 22"><span class="token sort_OpId">Bind</span></a></span> * <span class="cons_SimpleSort"><a href="#Frame_4279_4284" id="Frame_5117_5122" title="Defined at line 170"><span class="token sort_OpId">Frame</span></a></span> -&gt; <span class="token keyword">in</span><span class="token sort_ConstraintId">t</span>

  [E-Bind]
  <a href="#evalBind_5091_5099" id="evalBind_5144_5152" title="Defined at line 208"><span class="token sort_ConstraintId">evalBind</span></a>(<span class="cons_Var"><a href="#f_5198_5199" id="f_5153_5154" title="Referenced at line 212"><span class="token sort_ConstraintId">f</span></a></span>, <a href="#Bind_820_824" id="Bind_5156_5160" title="Defined at line 23"><span class="token sort_OpId">Bind</span></a>(<span class="cons_Var"><a href="#x_5232_5233" id="x_5161_5162" title="Referenced at line 213, 213, 213, 213"><span class="token sort_ConstraintId">x</span></a></span>, <span class="cons_Var"><a href="#e_5201_5202" id="e_5164_5165" title="Referenced at line 212"><span class="token sort_ConstraintId">e</span></a></span>), <span class="cons_Var"><a href="#f_bnd_5219_5224" id="f_bnd_5168_5173" title="Referenced at line 213, 213"><span class="token sort_ConstraintId">f_bnd</span></a></span>) = <span class="cons_Var"><a href="#k_5211_5212" id="k_5177_5178" title="Referenced at line 212"><span class="token sort_ConstraintId">k</span></a></span> :- {<span class="cons_Var"><a href="#v_5208_5209" id="v_5183_5184" title="Referenced at line 212, 213"><span class="token sort_ConstraintId">v</span></a></span>}
    <a href="#evalExp_4422_4429" id="evalExp_5190_5197" title="Defined at line 181"><span class="token sort_ConstraintId">evalExp</span></a>(<span class="cons_Var"><a href="#f_5153_5154" id="f_5198_5199" title="Defined at line 211"><span class="token sort_ConstraintId">f</span></a></span>, <span class="cons_Var"><a href="#e_5164_5165" id="e_5201_5202" title="Defined at line 211"><span class="token sort_ConstraintId">e</span></a></span>) == (<span class="cons_Var"><a href="#v_5183_5184" id="v_5208_5209" title="Defined at line 211"><span class="token sort_ConstraintId">v</span></a></span>, <span class="cons_Var"><a href="#k_5177_5178" id="k_5211_5212" title="Defined at line 211"><span class="token sort_ConstraintId">k</span></a></span>),
    <span class="token sort_ConstraintId">f_bnd</span> -&gt; <span class="token sort_OpId">Var</span>{<span class="token sort_ConstraintId">x</span>@<span class="token sort_ConstraintId">x</span>} <span class="token keyword">with</span> <a href="#val_4388_4391" id="val_5242_5245" title="Defined at line 177"><span class="token sort_ConstraintId">val</span></a> <span class="cons_Var"><a href="#v_5183_5184" id="v_5246_5247" title="Defined at line 211"><span class="token sort_ConstraintId">v</span></a></span>.


  <a href="#evalBinds_5020_5029" id="evalBinds_5253_5262" title="Referenced at line 204, 218, 220, 222"><span class="token sort_ConstraintId">evalBinds</span></a> : <span class="cons_SimpleSort"><a href="#Frame_4279_4284" id="Frame_5265_5270" title="Defined at line 170"><span class="token sort_OpId">Frame</span></a></span> * <span class="token sort_ConstraintId">list</span>(<span class="cons_SimpleSort"><a href="#Bind_763_767" id="Bind_5278_5282" title="Defined at line 22"><span class="token sort_OpId">Bind</span></a></span>) * <span class="cons_SimpleSort"><a href="#Frame_4279_4284" id="Frame_5286_5291" title="Defined at line 170"><span class="token sort_OpId">Frame</span></a></span> -&gt; <span class="token keyword">in</span><span class="token sort_ConstraintId">t</span>
  
  <a href="#evalBinds_5253_5262" id="evalBinds_5304_5313" title="Defined at line 216"><span class="token sort_ConstraintId">evalBinds</span></a>(<span class="cons_Var"><span id="f_5314_5315" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">f</span></span></span>, [], <span class="cons_Var"><span id="f_bnd_5321_5326" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">f_bnd</span></span></span>) = 0.

  <a href="#evalBinds_5253_5262" id="evalBinds_5336_5345" title="Defined at line 216"><span class="token sort_ConstraintId">evalBinds</span></a>(<span class="cons_Var"><a href="#f_5398_5399" id="f_5346_5347" title="Referenced at line 221, 222"><span class="token sort_ConstraintId">f</span></a></span>, [<span class="cons_Var"><a href="#bind_5401_5405" id="bind_5350_5354" title="Referenced at line 221"><span class="token sort_ConstraintId">bind</span></a></span>|<span class="cons_Var"><a href="#binds_5437_5442" id="binds_5355_5360" title="Referenced at line 222"><span class="token sort_ConstraintId">binds</span></a></span>], <span class="cons_Var"><a href="#f_bnd_5407_5412" id="f_bnd_5363_5368" title="Referenced at line 221, 222"><span class="token sort_ConstraintId">f_bnd</span></a></span>) = #(<span class="cons_Var"><a href="#k_5417_5418" id="k_5374_5375" title="Referenced at line 221"><span class="token sort_ConstraintId">k</span></a></span> + <span class="cons_Var"><a href="#k'_5454_5456" id="k'_5378_5380" title="Referenced at line 222">k'</a></span>) :-
    <a href="#evalBind_5091_5099" id="evalBind_5389_5397" title="Defined at line 208"><span class="token sort_ConstraintId">evalBind</span></a>(<span class="cons_Var"><a href="#f_5346_5347" id="f_5398_5399" title="Defined at line 220"><span class="token sort_ConstraintId">f</span></a></span>, <span class="cons_Var"><a href="#bind_5350_5354" id="bind_5401_5405" title="Defined at line 220"><span class="token sort_ConstraintId">bind</span></a></span>, <span class="cons_Var"><a href="#f_bnd_5363_5368" id="f_bnd_5407_5412" title="Defined at line 220"><span class="token sort_ConstraintId">f_bnd</span></a></span>) == <span class="cons_Var"><a href="#k_5374_5375" id="k_5417_5418" title="Defined at line 220"><span class="token sort_ConstraintId">k</span></a></span>,
    <a href="#evalBinds_5253_5262" id="evalBinds_5424_5433" title="Defined at line 216"><span class="token sort_ConstraintId">evalBinds</span></a>(<span class="cons_Var"><a href="#f_5346_5347" id="f_5434_5435" title="Defined at line 220"><span class="token sort_ConstraintId">f</span></a></span>, <span class="cons_Var"><a href="#binds_5355_5360" id="binds_5437_5442" title="Defined at line 220"><span class="token sort_ConstraintId">binds</span></a></span>, <span class="cons_Var"><a href="#f_bnd_5363_5368" id="f_bnd_5444_5449" title="Defined at line 220"><span class="token sort_ConstraintId">f_bnd</span></a></span>) == <span class="cons_Var"><a href="#k'_5378_5380" id="k'_5454_5456" title="Defined at line 220">k'</a></span>.


<span class="token keyword">rules</span>

  <a href="#dst_3952_3955" id="dst_5469_5472" title="Referenced at line 157, 228, 229"><span class="token sort_ConstraintId">dst</span></a> : <span class="token sort_ConstraintId">path</span> -&gt; <span class="token sort_ConstraintId">scope</span>
  <a href="#dst_5469_5472" id="dst_5491_5494" title="Defined at line 227"><span class="token sort_ConstraintId">dst</span></a>(_<span class="token sort_OpId">PathEmpty</span>(<span class="cons_Var">s</span>)) = <span class="cons_Var"><span id="s_5512_5513" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">s</span></span></span>.
  <a href="#dst_5469_5472" id="dst_5517_5520" title="Defined at line 227"><span class="token sort_ConstraintId">dst</span></a>(_<span class="token sort_OpId">PathStep</span>(_, _, <span class="cons_Var">s</span>)) = <span class="cons_Var"><span id="s_5543_5544" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">s</span></span></span>.


</code></pre></td></tr></tbody></table></div>