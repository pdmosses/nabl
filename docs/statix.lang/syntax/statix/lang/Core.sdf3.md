---
title: Core.sdf3
hide:
  - toc
---

# `Core.sdf3`

:simple-github: [pdmosses/nabl/statix.lang/syntax/statix/lang/Core.sdf3]

[pdmosses/nabl/statix.lang/syntax/statix/lang/Core.sdf3]: https://github.com/pdmosses/nabl/blob/master/statix.lang/syntax/statix/lang/Core.sdf3 "The source file on GitHub"

<div class="sdf3"><table class="highlighttable"><tbody><tr><td class="linenos"><div class="linenodiv"><pre><span></span>1
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
230
231
232
233
234
235
236
237
238
239
240
241
242
243
244
245
246
247
248
249
250
251
252
253
254
255
256
257
258
259
260
261
262
263
264
265
266
267
268
269
270
271
272
273
274
275
276
277
278
279
280
281
282
283
284
285
286
287
288
289
290
291
292
293
294
295
296
297
298
299
300
301
302
303
304
305
306
307
308
309
310
311
312
313
314
315
316
317
318
319
320
321
322
323
324
325
326
327
328
329
330
331
332
333
334
335
336
337
338
339
340
341
342
343
344
345
346
347
348
349
350
351
352
353
354
355
356
357
358
359
360
361
362
363
364
365
366
367
368
369
370
371
372
373
374
375
376
377
378
379
380
381
382
383
384
385
386
387
388
389
390
391
392
393
394
395
396
397
398
399
400
401
402
403
404
405
406
407
408
409
410
411
412
413
414
415
416
417
418
419
420
421
422
423
424
425
426
427
428
429
430
431
432
433
434
435
436
437
438
439
440
441
442
443
444
445
446
447
448
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../Deprecated.sdf3/#statix/lang/Core_63_79" id="statix/lang/Core_7_23" title="Referenced at ../Deprecated.sdf3 line 6; ../NoParse.sdf3 line 6; ../PreCompiled.sdf3 line 6; ../Sugar.sdf3 line 6; ../Type.sdf3 line 8; ../../../StatixLang.sdf3 line 7; ../../cli/CLI.sdf3 line 7; ../../test/Result.sdf3 line 9; ../../test/Test.sdf3 line 7">statix/lang/Core</a>

<span class="keyword">imports</span>

  <a href="../Common.sdf3/#statix/lang/Common_7_25" id="statix/lang/Common_36_54" title="Defined at ../Common.sdf3 line 1">statix/lang/Common</a>

<span class="keyword">template options</span>

  <span class="keyword">keyword</span> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\_\-\']


/******************************************************************
 * <span class="keyword">Modules</span>                                                        *
 ******************************************************************/

<span class="keyword">context-free syntax</span>

  <a href="../../../StatixLang.sdf3/#Module_344_350" id="Module_337_343" title="Referenced at ../../../StatixLang.sdf3 line 28">Module</a>.<span class="cons_Constructor"><span id="Module_344_350" title="Not referenced locally, nor via imports">Module</span></span> = &lt;
    <span class="cons_String">module</span> &lt;<a href="#ModuleId_694_702" id="ModuleId_367_375" title="Defined at line 45">ModuleId</a>&gt;

    &lt;{<a href="#Section_425_432" id="Section_384_391" title="Defined at line 24, 31, 37">Section</a> <span class="cons_Lit">"\n\n"</span>}*&gt;
  &gt; {<span class="keyword">longest-match</span>}

  <a href="#Section_384_391" id="Section_425_432" title="Referenced at line 21; ../../test/Test.sdf3 line 25">Section</a>.<span class="cons_Constructor"><span id="Imports_433_440" title="Not referenced locally, nor via imports">Imports</span></span> = &lt;
    <span class="cons_String">imports</span>
      &lt;{<a href="#Import_487_493" id="Import_465_471" title="Defined at line 29">Import</a> <span class="cons_Lit">"\n"</span>}*&gt;
  &gt;

  <a href="#Import_465_471" id="Import_487_493" title="Referenced at line 26">Import</a>.<span class="cons_Constructor"><span id="Import_494_500" title="Not referenced locally, nor via imports">Import</span></span> = <a href="#ModuleId_694_702" id="ModuleId_503_511" title="Defined at line 45">ModuleId</a>

  <a href="#Section_384_391" id="Section_515_522" title="Referenced at line 21; ../../test/Test.sdf3 line 25">Section</a>.<span class="cons_Constructor"><span id="Signature_523_532" title="Not referenced locally, nor via imports">Signature</span></span> = &lt;
    <span class="cons_String">signature</span>

      &lt;{<a href="#Signature_1011_1020" id="Signature_560_569" title="Defined at line 56, 158, 187, 284, 289">Signature</a> <span class="cons_Lit">"\n\n"</span>}*&gt;
  &gt; {<span class="keyword">longest-match</span>}

  <a href="#Section_384_391" id="Section_603_610" title="Referenced at line 21; ../../test/Test.sdf3 line 25">Section</a>.<span class="cons_Constructor"><span id="Rules_611_616" title="Not referenced locally, nor via imports">Rules</span></span> = &lt;
    <span class="cons_String">rules</span>

      &lt;{<a href="#Rule_1212_1216" id="Rule_640_644" title="Defined at line 66, 167">Rule</a> <span class="cons_Lit">"\n\n"</span>}*&gt;
  &gt; {<span class="keyword">longest-match</span>}

<span class="keyword">lexical syntax</span>

  <a href="#ModuleId_367_375" id="ModuleId_694_702" title="Referenced at line 19, 29">ModuleId</a> = <a href="#Keyword_725_732" id="Keyword_705_712" title="Defined at line 47, 86, 125, 149, 178, 243, 275, 328">Keyword</a> {<span class="keyword">reject</span>}

  <a href="#Keyword_705_712" id="Keyword_725_732" title="Referenced at line 45, 84, 147, 176, 241, 322, 326">Keyword</a> = <span class="cons_Lit">"module"</span> | <span class="cons_Lit">"imports"</span> | <span class="cons_Lit">"signature"</span> | <span class="cons_Lit">"rules"</span>


/******************************************************************
 * <span class="keyword">User Constraints</span>                                               *
 ******************************************************************/

<span class="keyword">context-free syntax</span>

  <a href="#Signature_560_569" id="Signature_1011_1020" title="Referenced at line 34">Signature</a>.<span class="cons_Constructor"><span id="Constraints_1021_1032" title="Not referenced locally, nor via imports">Constraints</span></span> = &lt;
    <span class="cons_String">constraints</span>
      &lt;{<a href="#CDecl_1098_1103" id="CDecl_1061_1066" title="Defined at line 61">CDecl</a> <span class="cons_Lit">"\n"</span>}*&gt;
  &gt; {<span class="keyword">longest-match</span>}

  <a href="#CDecl_1061_1066" id="CDecl_1098_1103" title="Referenced at line 58">CDecl</a>.<span class="cons_Constructor"><span id="CDecl_1104_1109" title="Not referenced locally, nor via imports">CDecl</span></span>      = [[<a href="#CInd_1152_1156" id="CInd_1119_1123" title="Defined at line 63, 64">CInd</a>][<a href="#ConstraintId_1527_1539" id="ConstraintId_1125_1137" title="Defined at line 83, 84">ConstraintId</a>] <span class="cons_String">:</span> [<a href="#Type_7400_7404" id="Type_1142_1146" title="Defined at line 317">Type</a>]]

  <a href="#CInd_1119_1123" id="CInd_1152_1156" title="Referenced at line 61; ../Sugar.sdf3 line 24, 25">CInd</a>.<span class="cons_Constructor"><span id="InductiveC_1157_1167" title="Not referenced locally, nor via imports">InductiveC</span></span>   =
  <a href="#CInd_1119_1123" id="CInd_1174_1178" title="Referenced at line 61; ../Sugar.sdf3 line 24, 25">CInd</a>.<span class="cons_Constructor"><span id="CoinductiveC_1179_1191" title="Not referenced locally, nor via imports">CoinductiveC</span></span> = &lt;<span class="cons_String">coinductive</span> &gt;

  <a href="#Rule_640_644" id="Rule_1212_1216" title="Referenced at line 40">Rule</a>.<span class="cons_Constructor"><span id="Rule_1217_1221" title="Not referenced locally, nor via imports">Rule</span></span> = &lt;
    &lt;<a href="#RuleName_1281_1289" id="RuleName_1231_1239" title="Defined at line 71, 72">RuleName</a>&gt;&lt;<a href="#RuleHead_1342_1350" id="RuleHead_1241_1249" title="Defined at line 75">RuleHead</a>&gt; <span class="cons_String">:-</span>
      &lt;<a href="#Constraint_1391_1401" id="Constraint_1261_1271" title="Defined at line 77, 95, 96, 98, 100, 105, 107, 108, 110, 112, 134, 135, 171, 234, 252, 384">Constraint</a>&gt;<span class="cons_String">.</span>
  &gt;

  <a href="#RuleName_1231_1239" id="RuleName_1281_1289" title="Referenced at line 67; ../Sugar.sdf3 line 40">RuleName</a>.<span class="cons_Constructor"><span id="NoName_1290_1296" title="Not referenced locally, nor via imports">NoName</span></span> = &lt;&gt;
  <a href="#RuleName_1231_1239" id="RuleName_1304_1312" title="Referenced at line 67; ../Sugar.sdf3 line 40">RuleName</a>.<span class="cons_Constructor"><span id="Name_1313_1317" title="Not referenced locally, nor via imports">Name</span></span> = &lt;
    <span class="cons_String">[</span>&lt;<a href="../Common.sdf3/#STRID_277_282" id="STRID_1328_1333" title="Defined at ../Common.sdf3 line 13">STRID</a>&gt;<span class="cons_String">]</span>
  &gt;
  <a href="#RuleHead_1241_1249" id="RuleHead_1342_1350" title="Referenced at line 67">RuleHead</a>.<span class="cons_Constructor"><span id="C_1351_1352" title="Not referenced locally, nor via imports">C</span></span> = [[<a href="#ConstraintId_1527_1539" id="ConstraintId_1357_1369" title="Defined at line 83, 84">ConstraintId</a>]<span class="cons_String">(</span>[{<a href="#Term_4932_4936" id="Term_1373_1377" title="Defined at line 225, 342, 343, 344, 345, 346, 347, 348, 349, 350, 351, 363">Term</a> <span class="cons_Lit">", "</span>}*]<span class="cons_String">)</span>]

  <a href="#Constraint_1261_1271" id="Constraint_1391_1401" title="Referenced at line 68, 79, 98, 101, 102, 110, 114, 121; ../../test/Test.sdf3 line 23">Constraint</a>.<span class="cons_Constructor"><span id="C_1402_1403" title="Not referenced locally, nor via imports">C</span></span> = [[<a href="#ConstraintId_1527_1539" id="ConstraintId_1408_1420" title="Defined at line 83, 84">ConstraintId</a>]<span class="cons_String">(</span>[{<a href="#Term_4932_4936" id="Term_1424_1428" title="Defined at line 225, 342, 343, 344, 345, 346, 347, 348, 349, 350, 351, 363">Term</a> <span class="cons_Lit">", "</span>}*]<span class="cons_String">)</span>[<a href="#Message_10079_10086" id="Message_1438_1445" title="Defined at line 418, 419">Message</a>]]

  <a href="#HoConstraint_5989_6001" id="HoConstraint_1451_1463" title="Referenced at line 265, 266">HoConstraint</a>.<span class="cons_Constructor"><span id="LLam_1464_1468" title="Not referenced locally, nor via imports">LLam</span></span> = &lt;<span class="cons_String">{</span> &lt;{<a href="#Term_4932_4936" id="Term_1476_1480" title="Defined at line 225, 342, 343, 344, 345, 346, 347, 348, 349, 350, 351, 363">Term</a> <span class="cons_Lit">", "</span>}*&gt; <span class="cons_String">:-</span> &lt;<a href="#Constraint_1391_1401" id="Constraint_1493_1503" title="Defined at line 77, 95, 96, 98, 100, 105, 107, 108, 110, 112, 134, 135, 171, 234, 252, 384">Constraint</a>&gt; <span class="cons_String">}</span>&gt;

<span class="keyword">lexical syntax</span>

  <a href="#ConstraintId_1125_1137" id="ConstraintId_1527_1539" title="Referenced at line 61, 75, 77; ../Sugar.sdf3 line 24, 25, 29, 30, 43, 47, 53">ConstraintId</a> = <a href="../Common.sdf3/#LCID_131_135" id="LCID_1542_1546" title="Defined at ../Common.sdf3 line 9">LCID</a>
  <a href="#ConstraintId_1125_1137" id="ConstraintId_1549_1561" title="Referenced at line 61, 75, 77; ../Sugar.sdf3 line 24, 25, 29, 30, 43, 47, 53">ConstraintId</a> = <a href="#Keyword_725_732" id="Keyword_1564_1571" title="Defined at line 47, 86, 125, 149, 178, 243, 275, 328">Keyword</a> {<span class="keyword">reject</span>}

  <a href="#Keyword_705_712" id="Keyword_1584_1591" title="Referenced at line 45, 84, 147, 176, 241, 322, 326">Keyword</a> = <span class="cons_Lit">"constraints"</span> | <span class="cons_Lit">"coinductive"</span>


/******************************************************************
 * <span class="keyword">Base Constraints</span>                                               *
 ******************************************************************/

<span class="keyword">context-free syntax</span>

  <a href="#Constraint_1261_1271" id="Constraint_1855_1865" title="Referenced at line 68, 79, 98, 101, 102, 110, 114, 121; ../../test/Test.sdf3 line 23">Constraint</a>.<span class="cons_Constructor"><span id="CTrue_1866_1871" title="Not referenced locally, nor via imports">CTrue</span></span>  = &lt;<span class="cons_String">true</span>&gt;
  <a href="#Constraint_1261_1271" id="Constraint_1884_1894" title="Referenced at line 68, 79, 98, 101, 102, 110, 114, 121; ../../test/Test.sdf3 line 23">Constraint</a>.<span class="cons_Constructor"><span id="CFalse_1895_1901" title="Not referenced locally, nor via imports">CFalse</span></span> = &lt;<span class="cons_String">false</span>&lt;<a href="#Message_10079_10086" id="Message_1911_1918" title="Defined at line 418, 419">Message</a>&gt;&gt;

  <a href="#Constraint_1261_1271" id="Constraint_1924_1934" title="Referenced at line 68, 79, 98, 101, 102, 110, 114, 121; ../../test/Test.sdf3 line 23">Constraint</a>         = &lt;<span class="cons_String">(</span>&lt;<a href="#Constraint_1391_1401" id="Constraint_1948_1958" title="Defined at line 77, 95, 96, 98, 100, 105, 107, 108, 110, 112, 134, 135, 171, 234, 252, 384">Constraint</a>&gt;<span class="cons_String">)</span>&gt; {<span class="keyword">bracket</span>}

  <a href="#Constraint_1261_1271" id="Constraint_1975_1985" title="Referenced at line 68, 79, 98, 101, 102, 110, 114, 121; ../../test/Test.sdf3 line 23">Constraint</a>.<span class="cons_Constructor"><a href="#CConj_2500_2505" id="CConj_1986_1991" title="Referenced at line 121">CConj</a></span>   = &lt;
    &lt;<a href="#Constraint_1391_1401" id="Constraint_2003_2013" title="Defined at line 77, 95, 96, 98, 100, 105, 107, 108, 110, 112, 134, 135, 171, 234, 252, 384">Constraint</a>&gt;<span class="cons_String">,</span>
    &lt;<a href="#Constraint_1391_1401" id="Constraint_2021_2031" title="Defined at line 77, 95, 96, 98, 100, 105, 107, 108, 110, 112, 134, 135, 171, 234, 252, 384">Constraint</a>&gt;
  &gt; {<span class="keyword">right</span>}

  <a href="#Constraint_1261_1271" id="Constraint_2048_2058" title="Referenced at line 68, 79, 98, 101, 102, 110, 114, 121; ../../test/Test.sdf3 line 23">Constraint</a>.<span class="cons_Constructor"><span id="CNew_2059_2063" title="Not referenced locally, nor via imports">CNew</span></span>    = &lt;<span class="cons_String">new</span> &lt;{<a href="#Var_7912_7915" id="Var_2076_2079" title="Defined at line 337, 338">Var</a> <span class="cons_Lit">" "</span>}+&gt;&gt;

  <a href="#Constraint_1261_1271" id="Constraint_2091_2101" title="Referenced at line 68, 79, 98, 101, 102, 110, 114, 121; ../../test/Test.sdf3 line 23">Constraint</a>.<span class="cons_Constructor"><span id="CEqual_2102_2108" title="Not referenced locally, nor via imports">CEqual</span></span>   = [[<a href="#Term_4932_4936" id="Term_2115_2119" title="Defined at line 225, 342, 343, 344, 345, 346, 347, 348, 349, 350, 351, 363">Term</a>] <span class="cons_String">==</span> [<a href="#Term_4932_4936" id="Term_2125_2129" title="Defined at line 225, 342, 343, 344, 345, 346, 347, 348, 349, 350, 351, 363">Term</a>][<a href="#Message_10079_10086" id="Message_2131_2138" title="Defined at line 418, 419">Message</a>]]
  <a href="#Constraint_1261_1271" id="Constraint_2143_2153" title="Referenced at line 68, 79, 98, 101, 102, 110, 114, 121; ../../test/Test.sdf3 line 23">Constraint</a>.<span class="cons_Constructor"><span id="CInequal_2154_2162" title="Not referenced locally, nor via imports">CInequal</span></span> = [[<a href="#Term_4932_4936" id="Term_2167_2171" title="Defined at line 225, 342, 343, 344, 345, 346, 347, 348, 349, 350, 351, 363">Term</a>] <span class="cons_String">!=</span> [<a href="#Term_4932_4936" id="Term_2177_2181" title="Defined at line 225, 342, 343, 344, 345, 346, 347, 348, 349, 350, 351, 363">Term</a>][<a href="#Message_10079_10086" id="Message_2183_2190" title="Defined at line 418, 419">Message</a>]]

  <a href="#Constraint_1261_1271" id="Constraint_2196_2206" title="Referenced at line 68, 79, 98, 101, 102, 110, 114, 121; ../../test/Test.sdf3 line 23">Constraint</a>.<span class="cons_Constructor"><span id="CTry_2207_2211" title="Not referenced locally, nor via imports">CTry</span></span> = [<span class="cons_String">try</span> <span class="cons_String">{</span> [<a href="#Constraint_1391_1401" id="Constraint_2222_2232" title="Defined at line 77, 95, 96, 98, 100, 105, 107, 108, 110, 112, 134, 135, 171, 234, 252, 384">Constraint</a>] <span class="cons_String">}</span>[<a href="#Message_10079_10086" id="Message_2236_2243" title="Defined at line 418, 419">Message</a>]]

  <a href="#Constraint_1261_1271" id="Constraint_2249_2259" title="Referenced at line 68, 79, 98, 101, 102, 110, 114, 121; ../../test/Test.sdf3 line 23">Constraint</a>.<span class="cons_Constructor"><a href="#CExists_2519_2526" id="CExists_2260_2267" title="Referenced at line 121">CExists</a></span> = [
    <span class="cons_String">{</span>[{<a href="#Var_7912_7915" id="Var_2279_2282" title="Defined at line 337, 338">Var</a> <span class="cons_Lit">" "</span>}*]<span class="cons_String">}</span>
      [<a href="#Constraint_1391_1401" id="Constraint_2298_2308" title="Defined at line 77, 95, 96, 98, 100, 105, 107, 108, 110, 112, 134, 135, 171, 234, 252, 384">Constraint</a>]
  ]

<span class="keyword">context-free priorities</span>

  <span class="layout">// Does this give longest-match behavior? Putting longest-match on CExists</span>
  <span class="layout">// seemed to break parsing of exists with conj body in parenthesis.</span>
  <a href="#Constraint_1391_1401" id="Constraint_2489_2499" title="Defined at line 77, 95, 96, 98, 100, 105, 107, 108, 110, 112, 134, 135, 171, 234, 252, 384">Constraint</a>.<span class="cons_Constructor"><a href="#CConj_1986_1991" id="CConj_2500_2505" title="Defined at line 100">CConj</a></span> &gt; <a href="#Constraint_1391_1401" id="Constraint_2508_2518" title="Defined at line 77, 95, 96, 98, 100, 105, 107, 108, 110, 112, 134, 135, 171, 234, 252, 384">Constraint</a>.<span class="cons_Constructor"><a href="#CExists_2260_2267" id="CExists_2519_2526" title="Defined at line 112">CExists</a></span>

<span class="keyword">lexical syntax</span>

  <a href="#Keyword_705_712" id="Keyword_2546_2553" title="Referenced at line 45, 84, 147, 176, 241, 322, 326">Keyword</a> = <span class="cons_Lit">"true"</span> | <span class="cons_Lit">"false"</span> | <span class="cons_Lit">"new"</span> | <span class="cons_Lit">"try"</span>


/******************************************************************
 * <span class="keyword">AST Constraints</span>                                                *
 ******************************************************************/

<span class="keyword">context-free syntax</span>

  <a href="#Constraint_1261_1271" id="Constraint_2820_2830" title="Referenced at line 68, 79, 98, 101, 102, 110, 114, 121; ../../test/Test.sdf3 line 23">Constraint</a>.<span class="cons_Constructor"><span id="CAstId_2831_2837" title="Not referenced locally, nor via imports">CAstId</span></span>       = &lt;<span class="cons_String">astId(</span>&lt;<a href="#Term_4932_4936" id="Term_2854_2858" title="Defined at line 225, 342, 343, 344, 345, 346, 347, 348, 349, 350, 351, 363">Term</a>&gt;<span class="cons_String">,</span> &lt;<a href="#Term_4932_4936" id="Term_2862_2866" title="Defined at line 225, 342, 343, 344, 345, 346, 347, 348, 349, 350, 351, 363">Term</a>&gt;<span class="cons_String">)</span>&gt;
  <a href="#Constraint_1261_1271" id="Constraint_2872_2882" title="Referenced at line 68, 79, 98, 101, 102, 110, 114, 121; ../../test/Test.sdf3 line 23">Constraint</a>.<span class="cons_Constructor"><span id="CAstProperty_2883_2895" title="Not referenced locally, nor via imports">CAstProperty</span></span> = &lt;<span class="cons_String">@</span>&lt;<a href="#TermOrTermIndex_3050_3065" id="TermOrTermIndex_2901_2916" title="Defined at line 142">TermOrTermIndex</a>&gt;<span class="cons_String">.</span>&lt;<a href="#AstProperty_2959_2970" id="AstProperty_2919_2930" title="Defined at line 137">AstProperty</a>&gt; &lt;<a href="#AstPropertyOp_2995_3008" id="AstPropertyOp_2933_2946" title="Defined at line 139, 140">AstPropertyOp</a>&gt; &lt;<a href="#Term_4932_4936" id="Term_2949_2953" title="Defined at line 225, 342, 343, 344, 345, 346, 347, 348, 349, 350, 351, 363">Term</a>&gt;&gt;

  <a href="#AstProperty_2919_2930" id="AstProperty_2959_2970" title="Referenced at line 135">AstProperty</a>.<span class="cons_Constructor"><span id="Prop_2971_2975" title="Not referenced locally, nor via imports">Prop</span></span> = <a href="#AstPropertyId_3091_3104" id="AstPropertyId_2978_2991" title="Defined at line 146, 147">AstPropertyId</a>

  <a href="#AstPropertyOp_2933_2946" id="AstPropertyOp_2995_3008" title="Referenced at line 135">AstPropertyOp</a>.<span class="cons_Constructor"><span id="Set_3009_3012" title="Not referenced locally, nor via imports">Set</span></span> = <span class="cons_Lit">":="</span>
  <a href="#AstPropertyOp_2933_2946" id="AstPropertyOp_3022_3035" title="Referenced at line 135">AstPropertyOp</a>.<span class="cons_Constructor"><span id="Add_3036_3039" title="Not referenced locally, nor via imports">Add</span></span> = <span class="cons_Lit">"+="</span>

  <a href="#TermOrTermIndex_2901_2916" id="TermOrTermIndex_3050_3065" title="Referenced at line 135; ../Deprecated.sdf3 line 82">TermOrTermIndex</a> = <a href="#Var_7912_7915" id="Var_3068_3071" title="Defined at line 337, 338">Var</a>

<span class="keyword">lexical syntax</span>

  <a href="#AstPropertyId_2978_2991" id="AstPropertyId_3091_3104" title="Referenced at line 137">AstPropertyId</a> = <a href="../Common.sdf3/#ID_61_63" id="ID_3107_3109" title="Defined at ../Common.sdf3 line 7">ID</a>
  <a href="#AstPropertyId_2978_2991" id="AstPropertyId_3112_3125" title="Referenced at line 137">AstPropertyId</a> = <a href="#Keyword_725_732" id="Keyword_3128_3135" title="Defined at line 47, 86, 125, 149, 178, 243, 275, 328">Keyword</a> {<span class="keyword">reject</span>}

  <a href="#Keyword_705_712" id="Keyword_3148_3155" title="Referenced at line 45, 84, 147, 176, 241, 322, 326">Keyword</a> = <span class="cons_Lit">"astId"</span>


/******************************************************************
 * <span class="keyword">Relations</span>                                                      *
 ******************************************************************/

<span class="keyword">context-free syntax</span>

  <a href="#Signature_560_569" id="Signature_3397_3406" title="Referenced at line 34">Signature</a>.<span class="cons_Constructor"><span id="Relations_3407_3416" title="Not referenced locally, nor via imports">Relations</span></span> = &lt;
    <span class="cons_String">relations</span>
      &lt;{<a href="#RelDecl_3482_3489" id="RelDecl_3443_3450" title="Defined at line 163">RelDecl</a> <span class="cons_Lit">"\n"</span>}*&gt;
  &gt; {<span class="keyword">longest-match</span>}

  <a href="#RelDecl_3443_3450" id="RelDecl_3482_3489" title="Referenced at line 160, 167">RelDecl</a>.<span class="cons_Constructor"><span id="RelDecl_3490_3497" title="Not referenced locally, nor via imports">RelDecl</span></span> = &lt;&lt;<a href="#Label_4187_4192" id="Label_3502_3507" title="Defined at line 196">Label</a>&gt; <span class="cons_String">:</span> &lt;<a href="#Type_7400_7404" id="Type_3512_3516" title="Defined at line 317">Type</a>&gt;&gt;

  <a href="#RelRef_3608_3614" id="RelRef_3522_3528" title="Referenced at line 171, 263; ../Deprecated.sdf3 line 58, 67; ../PreCompiled.sdf3 line 64; ../Type.sdf3 line 65">RelRef</a> = <a href="#Label_4187_4192" id="Label_3531_3536" title="Defined at line 196">Label</a>

  <a href="#Rule_640_644" id="Rule_3540_3544" title="Referenced at line 40">Rule</a> = &lt;<span class="cons_String">relation</span> &lt;<a href="#RelDecl_3482_3489" id="RelDecl_3558_3565" title="Defined at line 163">RelDecl</a>&gt;&gt;

<span class="keyword">syntax</span>

  <a href="#Constraint_1261_1271" id="Constraint_3579_3589" title="Referenced at line 68, 79, 98, 101, 102, 110, 114, 121; ../../test/Test.sdf3 line 23">Constraint</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="CTellRel_3593_3601" title="Not referenced locally, nor via imports">CTellRel</span></span> = <span class="cons_Lit">"!"</span> <a href="#RelRef_3522_3528" id="RelRef_3608_3614" title="Defined at line 165">RelRef</a><span class="keyword">-CF</span> <span class="cons_Lit">"["</span> <a href="#CommaTerms_8312_8322" id="CommaTerms_3622_3632" title="Defined at line 353">CommaTerms</a><span class="keyword">-CF</span> <span class="cons_Lit">"]"</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">"in"</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="#Term_4932_4936" id="Term_3667_3671" title="Defined at line 225, 342, 343, 344, 345, 346, 347, 348, 349, 350, 351, 363">Term</a><span class="keyword">-CF</span>

<span class="keyword">lexical syntax</span>

  <a href="#RelationId_4201_4211" id="RelationId_3694_3704" title="Referenced at line 196">RelationId</a> = <a href="../Common.sdf3/#ID_61_63" id="ID_3707_3709" title="Defined at ../Common.sdf3 line 7">ID</a>
  <a href="#RelationId_4201_4211" id="RelationId_3712_3722" title="Referenced at line 196">RelationId</a> = <a href="#Keyword_725_732" id="Keyword_3725_3732" title="Defined at line 47, 86, 125, 149, 178, 243, 275, 328">Keyword</a> {<span class="keyword">reject</span>}

  <a href="#Keyword_705_712" id="Keyword_3745_3752" title="Referenced at line 45, 84, 147, 176, 241, 322, 326">Keyword</a> = <span class="cons_Lit">"relations"</span> | <span class="cons_Lit">"relation"</span> | <span class="cons_Lit">"in"</span>


/******************************************************************
 * <span class="keyword">Scope Graph</span>                                                    *
 ******************************************************************/

<span class="keyword">context-free syntax</span>

  <a href="#Signature_560_569" id="Signature_4018_4027" title="Referenced at line 34">Signature</a>.<span class="cons_Constructor"><span id="NameResolution_4028_4042" title="Not referenced locally, nor via imports">NameResolution</span></span> = &lt;
    <span class="cons_String">name-resolution</span>
      &lt;{<a href="#ResolutionParam_4135_4150" id="ResolutionParam_4075_4090" title="Defined at line 194">ResolutionParam</a> <span class="cons_Lit">"\n"</span>}*&gt;
  &gt; {<span class="keyword">longest-match</span>}

  <span class="layout">// labels</span>

  <a href="#ResolutionParam_4075_4090" id="ResolutionParam_4135_4150" title="Referenced at line 189">ResolutionParam</a>.<span class="cons_Constructor"><span id="Labels_4151_4157" title="Not referenced locally, nor via imports">Labels</span></span> = &lt;<span class="cons_String">labels</span> &lt;{<a href="#Label_4187_4192" id="Label_4170_4175" title="Defined at line 196">Label</a> <span class="cons_Lit">" "</span>}*&gt;&gt;

  <a href="#Label_3502_3507" id="Label_4187_4192" title="Referenced at line 163, 165, 194, 198, 208, 234; ../NoParse.sdf3 line 25">Label</a>.<span class="cons_Constructor"><span id="Label_4193_4198" title="Not referenced locally, nor via imports">Label</span></span> = <a href="#RelationId_3694_3704" id="RelationId_4201_4211" title="Defined at line 175, 176, 240, 241">RelationId</a>

  <a href="#EdgeRef_4328_4335" id="EdgeRef_4215_4222" title="Referenced at line 202; ../Type.sdf3 line 66">EdgeRef</a>     = <a href="#Label_4187_4192" id="Label_4229_4234" title="Defined at line 196">Label</a>
  <a href="#EdgeRef_4328_4335" id="EdgeRef_4237_4244" title="Referenced at line 202; ../Type.sdf3 line 66">EdgeRef</a>.<span class="cons_Constructor"><span id="EOP_4245_4248" title="Not referenced locally, nor via imports">EOP</span></span> = <span class="cons_Lit">"$"</span>

  <a href="#LabelPairs_4374_4384" id="LabelPairs_4258_4268" title="Referenced at line 203; ../Deprecated.sdf3 line 19, 22, 25, 52">LabelPairs</a>          = &lt;&lt;{<a href="#LabelPair_4304_4313" id="LabelPair_4283_4292" title="Defined at line 202">LabelPair</a> <span class="cons_Lit">", "</span>}*&gt;&gt;
  <a href="#LabelPair_4283_4292" id="LabelPair_4304_4313" title="Referenced at line 201">LabelPair</a>.<span class="cons_Constructor"><span id="LabelPair_4314_4323" title="Not referenced locally, nor via imports">LabelPair</span></span> = [[<a href="#EdgeRef_4215_4222" id="EdgeRef_4328_4335" title="Defined at line 198, 199">EdgeRef</a>] <span class="cons_String">&lt;</span> [<a href="#EdgeRef_4215_4222" id="EdgeRef_4340_4347" title="Defined at line 198, 199">EdgeRef</a>]]
  <a href="#LabelOrd_6036_6044" id="LabelOrd_4352_4360" title="Referenced at line 266; ../Sugar.sdf3 line 136">LabelOrd</a>            = <a href="#LabelPairs_4258_4268" id="LabelPairs_4374_4384" title="Defined at line 201">LabelPairs</a>

  <a href="#LabelRE_4521_4528" id="LabelRE_4388_4395" title="Referenced at line 209, 210, 211, 212, 213, 214, 218, 219, 220, 221, 265">LabelRE</a>.<span class="cons_Constructor"><span id="Empty_4396_4401" title="Not referenced locally, nor via imports">Empty</span></span>      = &lt;<span class="cons_String">0</span>&gt;
  <a href="#LabelRE_4521_4528" id="LabelRE_4415_4422" title="Referenced at line 209, 210, 211, 212, 213, 214, 218, 219, 220, 221, 265">LabelRE</a>.<span class="cons_Constructor"><span id="Epsilon_4423_4430" title="Not referenced locally, nor via imports">Epsilon</span></span>    = &lt;<span class="cons_String">e</span>&gt;
<span class="layout">//LabelRE.Any        = &lt;.&gt;</span>
  <a href="#LabelRE_4521_4528" id="LabelRE_4469_4476" title="Referenced at line 209, 210, 211, 212, 213, 214, 218, 219, 220, 221, 265">LabelRE</a>            = <a href="#Label_4187_4192" id="Label_4490_4495" title="Defined at line 196">Label</a>
  <a href="#LabelRE_4521_4528" id="LabelRE_4498_4505" title="Referenced at line 209, 210, 211, 212, 213, 214, 218, 219, 220, 221, 265">LabelRE</a>.<span class="cons_Constructor"><a href="#Closure_4848_4855" id="Closure_4506_4513" title="Referenced at line 218; ../Sugar.sdf3 line 115">Closure</a></span>    = &lt;&lt;<a href="#LabelRE_4388_4395" id="LabelRE_4521_4528" title="Defined at line 205, 206, 208, 209, 210, 211, 212, 213, 214">LabelRE</a>&gt;<span class="cons_String">*</span>&gt;
  <a href="#LabelRE_4521_4528" id="LabelRE_4534_4541" title="Referenced at line 209, 210, 211, 212, 213, 214, 218, 219, 220, 221, 265">LabelRE</a>.<span class="cons_Constructor"><a href="#Neg_4836_4839" id="Neg_4542_4545" title="Referenced at line 218; ../Sugar.sdf3 line 115">Neg</a></span>        = &lt;<span class="cons_String">~</span>&lt;<a href="#LabelRE_4388_4395" id="LabelRE_4558_4565" title="Defined at line 205, 206, 208, 209, 210, 211, 212, 213, 214">LabelRE</a>&gt;&gt;
  <a href="#LabelRE_4521_4528" id="LabelRE_4570_4577" title="Referenced at line 209, 210, 211, 212, 213, 214, 218, 219, 220, 221, 265">LabelRE</a>.<span class="cons_Constructor"><a href="#Concat_4870_4876" id="Concat_4578_4584" title="Referenced at line 219; ../Sugar.sdf3 line 116">Concat</a></span>     = &lt;&lt;<a href="#LabelRE_4388_4395" id="LabelRE_4593_4600" title="Defined at line 205, 206, 208, 209, 210, 211, 212, 213, 214">LabelRE</a>&gt; &lt;<a href="#LabelRE_4388_4395" id="LabelRE_4603_4610" title="Defined at line 205, 206, 208, 209, 210, 211, 212, 213, 214">LabelRE</a>&gt;&gt;     {<span class="keyword">right</span>}
  <a href="#LabelRE_4521_4528" id="LabelRE_4627_4634" title="Referenced at line 209, 210, 211, 212, 213, 214, 218, 219, 220, 221, 265">LabelRE</a>.<span class="cons_Constructor"><a href="#And_4889_4892" id="And_4635_4638" title="Referenced at line 220; ../Sugar.sdf3 line 116">And</a></span>        = &lt;&lt;<a href="#LabelRE_4388_4395" id="LabelRE_4650_4657" title="Defined at line 205, 206, 208, 209, 210, 211, 212, 213, 214">LabelRE</a>&gt; <span class="cons_String">&amp;</span> &lt;<a href="#LabelRE_4388_4395" id="LabelRE_4662_4669" title="Defined at line 205, 206, 208, 209, 210, 211, 212, 213, 214">LabelRE</a>&gt;&gt;   {<span class="keyword">left</span>}
  <a href="#LabelRE_4521_4528" id="LabelRE_4683_4690" title="Referenced at line 209, 210, 211, 212, 213, 214, 218, 219, 220, 221, 265">LabelRE</a>.<span class="cons_Constructor"><a href="#Or_4905_4907" id="Or_4691_4693" title="Referenced at line 221; ../Sugar.sdf3 line 116">Or</a></span>         = &lt;&lt;<a href="#LabelRE_4388_4395" id="LabelRE_4706_4713" title="Defined at line 205, 206, 208, 209, 210, 211, 212, 213, 214">LabelRE</a>&gt; <span class="cons_String">|</span> &lt;<a href="#LabelRE_4388_4395" id="LabelRE_4718_4725" title="Defined at line 205, 206, 208, 209, 210, 211, 212, 213, 214">LabelRE</a>&gt;&gt;   {<span class="keyword">left</span>}
  <a href="#LabelRE_4521_4528" id="LabelRE_4739_4746" title="Referenced at line 209, 210, 211, 212, 213, 214, 218, 219, 220, 221, 265">LabelRE</a>            = &lt;<span class="cons_String">(</span>&lt;<a href="#LabelRE_4388_4395" id="LabelRE_4763_4770" title="Defined at line 205, 206, 208, 209, 210, 211, 212, 213, 214">LabelRE</a>&gt;<span class="cons_String">)</span>&gt;             {<span class="keyword">bracket</span>}

<span class="keyword">context-free priorities</span>

    { <a href="#LabelRE_4388_4395" id="LabelRE_4828_4835" title="Defined at line 205, 206, 208, 209, 210, 211, 212, 213, 214">LabelRE</a>.<span class="cons_Constructor"><a href="#Neg_4542_4545" id="Neg_4836_4839" title="Defined at line 210">Neg</a></span> <a href="#LabelRE_4388_4395" id="LabelRE_4840_4847" title="Defined at line 205, 206, 208, 209, 210, 211, 212, 213, 214">LabelRE</a>.<span class="cons_Constructor"><a href="#Closure_4506_4513" id="Closure_4848_4855" title="Defined at line 209">Closure</a></span> }
  &gt; <a href="#LabelRE_4388_4395" id="LabelRE_4862_4869" title="Defined at line 205, 206, 208, 209, 210, 211, 212, 213, 214">LabelRE</a>.<span class="cons_Constructor"><a href="#Concat_4578_4584" id="Concat_4870_4876" title="Defined at line 211">Concat</a></span>
  &gt; <a href="#LabelRE_4388_4395" id="LabelRE_4881_4888" title="Defined at line 205, 206, 208, 209, 210, 211, 212, 213, 214">LabelRE</a>.<span class="cons_Constructor"><a href="#And_4635_4638" id="And_4889_4892" title="Defined at line 212">And</a></span>
  &gt; <a href="#LabelRE_4388_4395" id="LabelRE_4897_4904" title="Defined at line 205, 206, 208, 209, 210, 211, 212, 213, 214">LabelRE</a>.<span class="cons_Constructor"><a href="#Or_4691_4693" id="Or_4905_4907" title="Defined at line 213">Or</a></span>

<span class="keyword">context-free syntax</span>

  <a href="#Term_1373_1377" id="Term_4932_4936" title="Referenced at line 75, 77, 79, 107, 108, 134, 135, 171, 231, 232, 234, 259, 345, 346, 348, 349, 350, 351, 353, 354, 358, 359, 437">Term</a> = <a href="#Path_4947_4951" id="Path_4939_4943" title="Defined at line 227">Path</a>

  <a href="#Path_4939_4943" id="Path_4947_4951" title="Referenced at line 225">Path</a> = <a href="#PathLit_4973_4980" id="PathLit_4954_4961" title="Defined at line 231, 232">PathLit</a>

<span class="keyword">syntax</span>

  <a href="#PathLit_4954_4961" id="PathLit_4973_4980" title="Referenced at line 227">PathLit</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="PathEmpty_4984_4993" title="Not referenced locally, nor via imports">PathEmpty</span></span> = <span class="cons_Lit">"_PathEmpty"</span> <span class="cons_Lit">"("</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="#Term_4932_4936" id="Term_5024_5028" title="Defined at line 225, 342, 343, 344, 345, 346, 347, 348, 349, 350, 351, 363">Term</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">")"</span>
  <a href="#PathLit_4954_4961" id="PathLit_5049_5056" title="Referenced at line 227">PathLit</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="PathStep_5060_5068" title="Not referenced locally, nor via imports">PathStep</span></span>  = <span class="cons_Lit">"_PathStep"</span> <span class="cons_Lit">"("</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="#Term_4932_4936" id="Term_5099_5103" title="Defined at line 225, 342, 343, 344, 345, 346, 347, 348, 349, 350, 351, 363">Term</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">","</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="#Term_4932_4936" id="Term_5133_5137" title="Defined at line 225, 342, 343, 344, 345, 346, 347, 348, 349, 350, 351, 363">Term</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">","</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="#Term_4932_4936" id="Term_5167_5171" title="Defined at line 225, 342, 343, 344, 345, 346, 347, 348, 349, 350, 351, 363">Term</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">")"</span>

  <a href="#Constraint_1261_1271" id="Constraint_5193_5203" title="Referenced at line 68, 79, 98, 101, 102, 110, 114, 121; ../../test/Test.sdf3 line 23">Constraint</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="CTellEdge_5207_5216" title="Not referenced locally, nor via imports">CTellEdge</span></span> = <a href="#Term_4932_4936" id="Term_5219_5223" title="Defined at line 225, 342, 343, 344, 345, 346, 347, 348, 349, 350, 351, 363">Term</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">"-"</span> <a href="#Label_4187_4192" id="Label_5242_5247" title="Defined at line 196">Label</a><span class="keyword">-CF</span> <span class="cons_Lit">"-&gt;"</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="#Term_4932_4936" id="Term_5267_5271" title="Defined at line 225, 342, 343, 344, 345, 346, 347, 348, 349, 350, 351, 363">Term</a><span class="keyword">-CF</span>

<span class="keyword">lexical syntax</span>

  <a href="../Deprecated.sdf3/#NamespaceId_1453_1464" id="NamespaceId_5294_5305" title="Referenced at ../Deprecated.sdf3 line 39, 44, 85">NamespaceId</a> = <a href="../Common.sdf3/#UCID_96_100" id="UCID_5308_5312" title="Defined at ../Common.sdf3 line 8">UCID</a>

  <a href="#RelationId_4201_4211" id="RelationId_5316_5326" title="Referenced at line 196">RelationId</a> = <span class="cons_Lit">"e"</span> {<span class="keyword">reject</span>}        <span class="layout">// ambiguous with empty regex</span>
  <a href="#RelationId_4201_4211" id="RelationId_5381_5391" title="Referenced at line 196">RelationId</a> = <a href="#Keyword_725_732" id="Keyword_5394_5401" title="Defined at line 47, 86, 125, 149, 178, 243, 275, 328">Keyword</a> {<span class="keyword">reject</span>}    <span class="layout">// ambiguous with signature keywords</span>

  <a href="#Keyword_705_712" id="Keyword_5454_5461" title="Referenced at line 45, 84, 147, 176, 241, 322, 326">Keyword</a> = <span class="cons_Lit">"namespaces"</span> | <span class="cons_Lit">"name-resolution"</span> | <span class="cons_Lit">"labels"</span> | <span class="cons_Lit">"namespace"</span>


/******************************************************************
 * <span class="keyword">Resolve</span> &amp; <span class="keyword">Query</span>
 ******************************************************************/

<span class="keyword">context-free syntax</span>

  <a href="#Constraint_1261_1271" id="Constraint_5704_5714" title="Referenced at line 68, 79, 98, 101, 102, 110, 114, 121; ../../test/Test.sdf3 line 23">Constraint</a> = <a href="#CResolveQuery_5734_5747" id="CResolveQuery_5717_5730" title="Defined at line 254">CResolveQuery</a>

  <a href="#CResolveQuery_5717_5730" id="CResolveQuery_5734_5747" title="Referenced at line 252; ../PreCompiled.sdf3 line 36">CResolveQuery</a>.<span class="cons_Constructor"><span id="CResolveQuery_5748_5761" title="Not referenced locally, nor via imports">CResolveQuery</span></span> = [
    <span class="cons_String">query</span> [<a href="#QueryTarget_5889_5900" id="QueryTarget_5777_5788" title="Defined at line 262, 263">QueryTarget</a>]
     [<a href="#QueryFilter_5942_5953" id="QueryFilter_5796_5807" title="Defined at line 265">QueryFilter</a>]
     [<a href="#QueryMin_6006_6014" id="QueryMin_5815_5823" title="Defined at line 266">QueryMin</a>]
     [<a href="#QueryProject_6068_6080" id="QueryProject_5831_5843" title="Defined at line 267">QueryProject</a>]
      <span class="cons_String">in</span> [<a href="#Term_4932_4936" id="Term_5855_5859" title="Defined at line 225, 342, 343, 344, 345, 346, 347, 348, 349, 350, 351, 363">Term</a>] <span class="cons_String">|-&gt;</span> [<a href="#Term_4932_4936" id="Term_5866_5870" title="Defined at line 225, 342, 343, 344, 345, 346, 347, 348, 349, 350, 351, 363">Term</a>][<a href="#Message_10079_10086" id="Message_5872_5879" title="Defined at line 418, 419">Message</a>]
   ]

  <a href="#QueryTarget_5777_5788" id="QueryTarget_5889_5900" title="Referenced at line 255">QueryTarget</a>.<span class="cons_Constructor"><span id="EOP_5901_5904" title="Not referenced locally, nor via imports">EOP</span></span> = <span class="cons_Lit">"()"</span>
  <a href="#QueryTarget_5777_5788" id="QueryTarget_5914_5925" title="Referenced at line 255">QueryTarget</a>     = <a href="#RelRef_3522_3528" id="RelRef_5932_5938" title="Defined at line 165">RelRef</a>

  <a href="#QueryFilter_5796_5807" id="QueryFilter_5942_5953" title="Referenced at line 256">QueryFilter</a>.<span class="cons_Constructor"><span id="Filter_5954_5960" title="Not referenced locally, nor via imports">Filter</span></span>   = &lt; <span class="cons_String">filter</span> &lt;<a href="#LabelRE_4388_4395" id="LabelRE_5975_5982" title="Defined at line 205, 206, 208, 209, 210, 211, 212, 213, 214">LabelRE</a>&gt; <span class="cons_String">and</span> &lt;<a href="#HoConstraint_1451_1463" id="HoConstraint_5989_6001" title="Defined at line 79">HoConstraint</a>&gt;&gt;
  <a href="#QueryMin_5815_5823" id="QueryMin_6006_6014" title="Referenced at line 257">QueryMin</a>.<span class="cons_Constructor"><span id="Min_6015_6018" title="Not referenced locally, nor via imports">Min</span></span>         = &lt; <span class="cons_String">min</span> &lt;<a href="#LabelOrd_4352_4360" id="LabelOrd_6036_6044" title="Defined at line 203">LabelOrd</a>&gt; <span class="cons_String">and</span> &lt;<a href="#HoConstraint_1451_1463" id="HoConstraint_6051_6063" title="Defined at line 79">HoConstraint</a>&gt;&gt;
  <a href="#QueryProject_5831_5843" id="QueryProject_6068_6080" title="Referenced at line 258">QueryProject</a>.<span class="cons_Constructor"><span id="Project_6081_6088" title="Not referenced locally, nor via imports">Project</span></span> = &lt; <span class="cons_String">project</span> &lt;<a href="#ProjectTarget_6121_6134" id="ProjectTarget_6102_6115" title="Defined at line 269, 270, 271">ProjectTarget</a>&gt;&gt;

  <a href="#ProjectTarget_6102_6115" id="ProjectTarget_6121_6134" title="Referenced at line 267">ProjectTarget</a>.<span class="cons_Constructor"><span id="PFull_6135_6140" title="Not referenced locally, nor via imports">PFull</span></span>       = &lt;<span class="cons_String">*</span>&gt;
  <a href="#ProjectTarget_6102_6115" id="ProjectTarget_6155_6168" title="Referenced at line 267">ProjectTarget</a>.<span class="cons_Constructor"><span id="PTargetData_6169_6180" title="Not referenced locally, nor via imports">PTargetData</span></span> = &lt;<span class="cons_String">dst,</span> <span class="cons_String">$</span>&gt;
  <a href="#ProjectTarget_6102_6115" id="ProjectTarget_6194_6207" title="Referenced at line 267">ProjectTarget</a>.<span class="cons_Constructor"><span id="PData_6208_6213" title="Not referenced locally, nor via imports">PData</span></span>       = &lt;<span class="cons_String">$</span>&gt;

<span class="keyword">lexical syntax</span>

  <a href="#Keyword_705_712" id="Keyword_6245_6252" title="Referenced at line 45, 84, 147, 176, 241, 322, 326">Keyword</a> = <span class="cons_Lit">"query"</span> | <span class="cons_Lit">"in"</span> | <span class="cons_Lit">"filter"</span> | <span class="cons_Lit">"min"</span> | <span class="cons_Lit">"project"</span> | <span class="cons_Lit">"and"</span>


/******************************************************************
 * <span class="keyword">Sorts</span> &amp; <span class="keyword">Constructors</span>                                           *
 ******************************************************************/

<span class="keyword">context-free syntax</span>

  <a href="#Signature_560_569" id="Signature_6540_6549" title="Referenced at line 34">Signature</a>.<span class="cons_Constructor"><span id="Sorts_6550_6555" title="Not referenced locally, nor via imports">Sorts</span></span> = &lt;
    <span class="cons_String">sorts</span>
      &lt;{<a href="#SortDecl_6708_6716" id="SortDecl_6578_6586" title="Defined at line 294, 295">SortDecl</a> <span class="cons_Lit">"\n"</span>}*&gt;
  &gt; {<span class="keyword">longest-match</span>}

  <a href="#Signature_560_569" id="Signature_6618_6627" title="Referenced at line 34">Signature</a>.<span class="cons_Constructor"><span id="Constructors_6628_6640" title="Not referenced locally, nor via imports">Constructors</span></span> = &lt;
    <span class="cons_String">constructors</span>
      &lt;{<a href="#OpDecl_7285_7291" id="OpDecl_6670_6676" title="Defined at line 312">OpDecl</a> <span class="cons_Lit">"\n"</span>}*&gt;
  &gt; {<span class="keyword">longest-match</span>}

  <a href="#SortDecl_6578_6586" id="SortDecl_6708_6716" title="Referenced at line 286">SortDecl</a>.<span class="cons_Constructor"><span id="SortDecl_6717_6725" title="Not referenced locally, nor via imports">SortDecl</span></span>  = <a href="#SortId_7458_7464" id="SortId_6729_6735" title="Defined at line 321, 322, 323">SortId</a>
  <a href="#SortDecl_6578_6586" id="SortDecl_6738_6746" title="Referenced at line 286">SortDecl</a>.<span class="cons_Constructor"><span id="SortAlias_6747_6756" title="Not referenced locally, nor via imports">SortAlias</span></span> = &lt;&lt;<a href="#SortId_7458_7464" id="SortId_6761_6767" title="Defined at line 321, 322, 323">SortId</a>&gt; <span class="cons_String">=</span> &lt;<a href="#SortRef_6813_6820" id="SortRef_6772_6779" title="Defined at line 299, 300, 301, 302, 303, 304, 305, 306, 307, 308, 309, 310">SortRef</a>&gt;&gt;

  <a href="#Sort_6838_6842" id="Sort_6785_6789" title="Referenced at line 299, 314, 315">Sort</a>.<span class="cons_Constructor"><span id="SimpleSort_6790_6800" title="Not referenced locally, nor via imports">SimpleSort</span></span> = <a href="#SortId_7458_7464" id="SortId_6803_6809" title="Defined at line 321, 322, 323">SortId</a>

  <a href="#SortRef_6772_6779" id="SortRef_6813_6820" title="Referenced at line 295, 300, 302, 310, 315, 317, 350; ../Deprecated.sdf3 line 39; ../Sugar.sdf3 line 152">SortRef</a>                = <a href="#Sort_6785_6789" id="Sort_6838_6842" title="Defined at line 297">Sort</a>
  <a href="#SortRef_6772_6779" id="SortRef_6845_6852" title="Referenced at line 295, 300, 302, 310, 315, 317, 350; ../Deprecated.sdf3 line 39; ../Sugar.sdf3 line 152">SortRef</a>.<span class="cons_Constructor"><span id="ListSort_6853_6861" title="Not referenced locally, nor via imports">ListSort</span></span>       = &lt;<span class="cons_String">list(</span>&lt;<a href="#SortRef_6813_6820" id="SortRef_6877_6884" title="Defined at line 299, 300, 301, 302, 303, 304, 305, 306, 307, 308, 309, 310">SortRef</a>&gt;<span class="cons_String">)</span>&gt;
  <a href="#SortRef_6772_6779" id="SortRef_6890_6897" title="Referenced at line 295, 300, 302, 310, 315, 317, 350; ../Deprecated.sdf3 line 39; ../Sugar.sdf3 line 152">SortRef</a>.<span class="cons_Constructor"><span id="Tuple0Sort_6898_6908" title="Not referenced locally, nor via imports">Tuple0Sort</span></span>     = &lt;<span class="cons_String">(</span> <span class="cons_String">)</span>&gt;
  <a href="#SortRef_6772_6779" id="SortRef_6923_6930" title="Referenced at line 295, 300, 302, 310, 315, 317, 350; ../Deprecated.sdf3 line 39; ../Sugar.sdf3 line 152">SortRef</a>.<span class="cons_Constructor"><span id="TupleNSort_6931_6941" title="Not referenced locally, nor via imports">TupleNSort</span></span>     = &lt;<span class="cons_String">(</span>&lt;<a href="#SortRef_6813_6820" id="SortRef_6951_6958" title="Defined at line 299, 300, 301, 302, 303, 304, 305, 306, 307, 308, 309, 310">SortRef</a>&gt; <span class="cons_String">*</span> &lt;{<a href="#SortRef_6813_6820" id="SortRef_6964_6971" title="Defined at line 299, 300, 301, 302, 303, 304, 305, 306, 307, 308, 309, 310">SortRef</a> <span class="cons_Lit">" * "</span>}+&gt;<span class="cons_String">)</span>&gt;
  <a href="#SortRef_6772_6779" id="SortRef_6985_6992" title="Referenced at line 295, 300, 302, 310, 315, 317, 350; ../Deprecated.sdf3 line 39; ../Sugar.sdf3 line 152">SortRef</a>.<span class="cons_Constructor"><span id="IntSort_6993_7000" title="Not referenced locally, nor via imports">IntSort</span></span>        = <span class="cons_Lit">"int"</span>
  <a href="#SortRef_6772_6779" id="SortRef_7018_7025" title="Referenced at line 295, 300, 302, 310, 315, 317, 350; ../Deprecated.sdf3 line 39; ../Sugar.sdf3 line 152">SortRef</a>.<span class="cons_Constructor"><span id="StringSort_7026_7036" title="Not referenced locally, nor via imports">StringSort</span></span>     = <span class="cons_Lit">"string"</span>
  <a href="#SortRef_6772_6779" id="SortRef_7054_7061" title="Referenced at line 295, 300, 302, 310, 315, 317, 350; ../Deprecated.sdf3 line 39; ../Sugar.sdf3 line 152">SortRef</a>.<span class="cons_Constructor"><span id="PathSort_7062_7070" title="Not referenced locally, nor via imports">PathSort</span></span>       = <span class="cons_Lit">"path"</span>
  <a href="#SortRef_6772_6779" id="SortRef_7088_7095" title="Referenced at line 295, 300, 302, 310, 315, 317, 350; ../Deprecated.sdf3 line 39; ../Sugar.sdf3 line 152">SortRef</a>.<span class="cons_Constructor"><span id="LabelSort_7096_7105" title="Not referenced locally, nor via imports">LabelSort</span></span>      = <span class="cons_Lit">"label"</span>
  <a href="#SortRef_6772_6779" id="SortRef_7123_7130" title="Referenced at line 295, 300, 302, 310, 315, 317, 350; ../Deprecated.sdf3 line 39; ../Sugar.sdf3 line 152">SortRef</a>.<span class="cons_Constructor"><span id="OccurrenceSort_7131_7145" title="Not referenced locally, nor via imports">OccurrenceSort</span></span> = <span class="cons_Lit">"occurrence"</span>
  <a href="#SortRef_6772_6779" id="SortRef_7163_7170" title="Referenced at line 295, 300, 302, 310, 315, 317, 350; ../Deprecated.sdf3 line 39; ../Sugar.sdf3 line 152">SortRef</a>.<span class="cons_Constructor"><span id="ScopeSort_7171_7180" title="Not referenced locally, nor via imports">ScopeSort</span></span>      = <span class="cons_Lit">"scope"</span>
  <a href="#SortRef_6772_6779" id="SortRef_7198_7205" title="Referenced at line 295, 300, 302, 310, 315, 317, 350; ../Deprecated.sdf3 line 39; ../Sugar.sdf3 line 152">SortRef</a>.<span class="cons_Constructor"><span id="AstIdSort_7206_7215" title="Not referenced locally, nor via imports">AstIdSort</span></span>      = <span class="cons_Lit">"astId"</span>
  <a href="#SortRef_6772_6779" id="SortRef_7233_7240" title="Referenced at line 295, 300, 302, 310, 315, 317, 350; ../Deprecated.sdf3 line 39; ../Sugar.sdf3 line 152">SortRef</a>                = &lt;<span class="cons_String">(</span>&lt;<a href="#SortRef_6813_6820" id="SortRef_7261_7268" title="Defined at line 299, 300, 301, 302, 303, 304, 305, 306, 307, 308, 309, 310">SortRef</a>&gt;<span class="cons_String">)</span>&gt; {<span class="keyword">bracket</span>}

  <a href="#OpDecl_6670_6676" id="OpDecl_7285_7291" title="Referenced at line 291">OpDecl</a>.<span class="cons_Constructor"><span id="OpDecl_7292_7298" title="Not referenced locally, nor via imports">OpDecl</span></span>  = &lt;&lt;<a href="#OpId_7604_7608" id="OpId_7304_7308" title="Defined at line 325, 326">OpId</a>&gt; <span class="cons_String">:</span> &lt;<a href="#OpSort_7325_7331" id="OpSort_7313_7319" title="Defined at line 314, 315">OpSort</a>&gt;&gt;

  <a href="#OpSort_7313_7319" id="OpSort_7325_7331" title="Referenced at line 312">OpSort</a>.<span class="cons_Constructor"><span id="ConstOp_7332_7339" title="Not referenced locally, nor via imports">ConstOp</span></span> = <a href="#Sort_6785_6789" id="Sort_7342_7346" title="Defined at line 297">Sort</a>
  <a href="#OpSort_7313_7319" id="OpSort_7349_7355" title="Referenced at line 312">OpSort</a>.<span class="cons_Constructor"><span id="ArrowOp_7356_7363" title="Not referenced locally, nor via imports">ArrowOp</span></span> = [[{<a href="#SortRef_6813_6820" id="SortRef_7369_7376" title="Defined at line 299, 300, 301, 302, 303, 304, 305, 306, 307, 308, 309, 310">SortRef</a> <span class="cons_Lit">" * "</span>}+] <span class="cons_String">-&gt;</span> [<a href="#Sort_6785_6789" id="Sort_7390_7394" title="Defined at line 297">Sort</a>]]

  <a href="#Type_1142_1146" id="Type_7400_7404" title="Referenced at line 61, 163">Type</a>.<span class="cons_Constructor"><span id="SimpleType_7405_7415" title="Not referenced locally, nor via imports">SimpleType</span></span> = [[{<a href="#SortRef_6813_6820" id="SortRef_7421_7428" title="Defined at line 299, 300, 301, 302, 303, 304, 305, 306, 307, 308, 309, 310">SortRef</a> <span class="cons_Lit">" * "</span>}*]]

<span class="keyword">lexical syntax</span>

  <a href="#SortId_6729_6735" id="SortId_7458_7464" title="Referenced at line 294, 295, 297">SortId</a> = <a href="../Common.sdf3/#STRID_277_282" id="STRID_7467_7472" title="Defined at ../Common.sdf3 line 13">STRID</a>
  <a href="#SortId_6729_6735" id="SortId_7475_7481" title="Referenced at line 294, 295, 297">SortId</a> = <a href="#Keyword_725_732" id="Keyword_7484_7491" title="Defined at line 47, 86, 125, 149, 178, 243, 275, 328">Keyword</a> {<span class="keyword">reject</span>}
  <a href="#SortId_6729_6735" id="SortId_7503_7509" title="Referenced at line 294, 295, 297">SortId</a> = <span class="cons_Lit">"list"</span> | <span class="cons_Lit">"int"</span> | <span class="cons_Lit">"string"</span> | <span class="cons_Lit">"occurrence"</span> | <span class="cons_Lit">"scope"</span> | <span class="cons_Lit">"path"</span> | <span class="cons_Lit">"label"</span> | <span class="cons_Lit">"astId"</span> {<span class="keyword">reject</span>}

  <a href="#OpId_7304_7308" id="OpId_7604_7608" title="Referenced at line 312, 363">OpId</a> = <a href="../Common.sdf3/#STRID_277_282" id="STRID_7611_7616" title="Defined at ../Common.sdf3 line 13">STRID</a>
  <a href="#OpId_7304_7308" id="OpId_7619_7623" title="Referenced at line 312, 363">OpId</a> = <a href="#Keyword_725_732" id="Keyword_7626_7633" title="Defined at line 47, 86, 125, 149, 178, 243, 275, 328">Keyword</a> {<span class="keyword">reject</span>}

  <a href="#Keyword_705_712" id="Keyword_7646_7653" title="Referenced at line 45, 84, 147, 176, 241, 322, 326">Keyword</a> = <span class="cons_Lit">"sorts"</span> | <span class="cons_Lit">"constructors"</span>


/******************************************************************
 * <span class="keyword">Terms</span>                                                          *
 ******************************************************************/

<span class="keyword">context-free syntax</span>

  <a href="#Var_2076_2079" id="Var_7912_7915" title="Referenced at line 105, 113, 142, 342, 349, 396, 430; ../Deprecated.sdf3 line 72; ../../test/Result.sdf3 line 50">Var</a>.<span class="cons_Constructor"><span id="Var_7916_7919" title="Not referenced locally, nor via imports">Var</span></span> = <a href="../Common.sdf3/#VARID_166_171" id="VARID_7922_7927" title="Defined at ../Common.sdf3 line 10">VARID</a>
  <a href="#Var_2076_2079" id="Var_7930_7933" title="Referenced at line 105, 113, 142, 342, 349, 396, 430; ../Deprecated.sdf3 line 72; ../../test/Result.sdf3 line 50">Var</a>.<span class="cons_Constructor"><span id="Wld_7934_7937" title="Not referenced locally, nor via imports">Wld</span></span> = &lt;<span class="cons_String">_</span>&gt;

  <a href="#Int_8006_8009" id="Int_7947_7950" title="Referenced at line 343, 395">Int</a>.<span class="cons_Constructor"><span id="Int_7951_7954" title="Not referenced locally, nor via imports">Int</span></span> = <a href="../Common.sdf3/#INT_45_48" id="INT_7957_7960" title="Defined at ../Common.sdf3 line 5">INT</a>

  <a href="#Term_1373_1377" id="Term_7964_7968" title="Referenced at line 75, 77, 79, 107, 108, 134, 135, 171, 231, 232, 234, 259, 345, 346, 348, 349, 350, 351, 353, 354, 358, 359, 437">Term</a>            = <a href="#Var_7912_7915" id="Var_7982_7985" title="Defined at line 337, 338">Var</a>
  <a href="#Term_1373_1377" id="Term_7988_7992" title="Referenced at line 75, 77, 79, 107, 108, 134, 135, 171, 231, 232, 234, 259, 345, 346, 348, 349, 350, 351, 353, 354, 358, 359, 437">Term</a>            = <a href="#Int_7947_7950" id="Int_8006_8009" title="Defined at line 340">Int</a>
  <a href="#Term_1373_1377" id="Term_8012_8016" title="Referenced at line 75, 77, 79, 107, 108, 134, 135, 171, 231, 232, 234, 259, 345, 346, 348, 349, 350, 351, 353, 354, 358, 359, 437">Term</a>            = <a href="#Str_8516_8519" id="Str_8030_8033" title="Defined at line 365">Str</a>
  <a href="#Term_1373_1377" id="Term_8036_8040" title="Referenced at line 75, 77, 79, 107, 108, 134, 135, 171, 231, 232, 234, 259, 345, 346, 348, 349, 350, 351, 353, 354, 358, 359, 437">Term</a>.<span class="cons_Constructor"><span id="List_8041_8045" title="Not referenced locally, nor via imports">List</span></span>       = &lt;<span class="cons_String">[</span>&lt;{<a href="#Term_4932_4936" id="Term_8058_8062" title="Defined at line 225, 342, 343, 344, 345, 346, 347, 348, 349, 350, 351, 363">Term</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">]</span>&gt;
  <a href="#Term_1373_1377" id="Term_8075_8079" title="Referenced at line 75, 77, 79, 107, 108, 134, 135, 171, 231, 232, 234, 259, 345, 346, 348, 349, 350, 351, 353, 354, 358, 359, 437">Term</a>.<span class="cons_Constructor"><span id="ListTail_8080_8088" title="Not referenced locally, nor via imports">ListTail</span></span>   = &lt;<span class="cons_String">[</span>&lt;{<a href="#Term_4932_4936" id="Term_8097_8101" title="Defined at line 225, 342, 343, 344, 345, 346, 347, 348, 349, 350, 351, 363">Term</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">|</span>&lt;<a href="#Term_4932_4936" id="Term_8111_8115" title="Defined at line 225, 342, 343, 344, 345, 346, 347, 348, 349, 350, 351, 363">Term</a>&gt;<span class="cons_String">]</span>&gt;
  <a href="#Term_1373_1377" id="Term_8121_8125" title="Referenced at line 75, 77, 79, 107, 108, 134, 135, 171, 231, 232, 234, 259, 345, 346, 348, 349, 350, 351, 353, 354, 358, 359, 437">Term</a>.<span class="cons_Constructor"><span id="Tuple0_8126_8132" title="Not referenced locally, nor via imports">Tuple0</span></span>     = &lt;<span class="cons_String">(</span> <span class="cons_String">)</span>&gt;
  <a href="#Term_1373_1377" id="Term_8147_8151" title="Referenced at line 75, 77, 79, 107, 108, 134, 135, 171, 231, 232, 234, 259, 345, 346, 348, 349, 350, 351, 353, 354, 358, 359, 437">Term</a>.<span class="cons_Constructor"><span id="TupleN_8152_8158" title="Not referenced locally, nor via imports">TupleN</span></span>     = &lt;<span class="cons_String">(</span>&lt;<a href="#Term_4932_4936" id="Term_8168_8172" title="Defined at line 225, 342, 343, 344, 345, 346, 347, 348, 349, 350, 351, 363">Term</a>&gt;<span class="cons_String">,</span> &lt;{<a href="#Term_4932_4936" id="Term_8177_8181" title="Defined at line 225, 342, 343, 344, 345, 346, 347, 348, 349, 350, 351, 363">Term</a> <span class="cons_Lit">", "</span>}+&gt;<span class="cons_String">)</span>&gt;
  <a href="#Term_1373_1377" id="Term_8194_8198" title="Referenced at line 75, 77, 79, 107, 108, 134, 135, 171, 231, 232, 234, 259, 345, 346, 348, 349, 350, 351, 353, 354, 358, 359, 437">Term</a>.<span class="cons_Constructor"><a href="#As_8408_8410" id="As_8199_8201" title="Referenced at line 358">As</a></span>         = &lt;&lt;<a href="#Var_7912_7915" id="Var_8214_8217" title="Defined at line 337, 338">Var</a>&gt;<span class="cons_String">@</span>&lt;<a href="#Term_4932_4936" id="Term_8220_8224" title="Defined at line 225, 342, 343, 344, 345, 346, 347, 348, 349, 350, 351, 363">Term</a>&gt;&gt;
  <a href="#Term_1373_1377" id="Term_8229_8233" title="Referenced at line 75, 77, 79, 107, 108, 134, 135, 171, 231, 232, 234, 259, 345, 346, 348, 349, 350, 351, 353, 354, 358, 359, 437">Term</a>.<span class="cons_Constructor"><a href="#Ascribe_8420_8427" id="Ascribe_8234_8241" title="Referenced at line 359">Ascribe</a></span>    = &lt;&lt;<a href="#Term_4932_4936" id="Term_8249_8253" title="Defined at line 225, 342, 343, 344, 345, 346, 347, 348, 349, 350, 351, 363">Term</a>&gt; <span class="cons_String">:</span> &lt;<a href="#SortRef_6813_6820" id="SortRef_8258_8265" title="Defined at line 299, 300, 301, 302, 303, 304, 305, 306, 307, 308, 309, 310">SortRef</a>&gt;&gt;
  <a href="#Term_1373_1377" id="Term_8270_8274" title="Referenced at line 75, 77, 79, 107, 108, 134, 135, 171, 231, 232, 234, 259, 345, 346, 348, 349, 350, 351, 353, 354, 358, 359, 437">Term</a>            = &lt;<span class="cons_String">(</span>&lt;<a href="#Term_4932_4936" id="Term_8291_8295" title="Defined at line 225, 342, 343, 344, 345, 346, 347, 348, 349, 350, 351, 363">Term</a>&gt;<span class="cons_String">)</span>&gt; {<span class="keyword">bracket</span>}

  <a href="#CommaTerms_3622_3632" id="CommaTerms_8312_8322" title="Referenced at line 171, 363; ../Sugar.sdf3 line 53, 94, 96">CommaTerms</a> = &lt;&lt;{<a href="#Term_4932_4936" id="Term_8328_8332" title="Defined at line 225, 342, 343, 344, 345, 346, 347, 348, 349, 350, 351, 363">Term</a> <span class="cons_Lit">", "</span>}*&gt;&gt;
  <span id="SpaceTerms_8344_8354" title="Not referenced locally, nor via imports">SpaceTerms</span> = &lt;&lt;{<a href="#Term_4932_4936" id="Term_8360_8364" title="Defined at line 225, 342, 343, 344, 345, 346, 347, 348, 349, 350, 351, 363">Term</a> <span class="cons_Lit">" "</span>}*&gt;&gt;

<span class="keyword">context-free priorities</span>

    <a href="#Term_4932_4936" id="Term_8403_8407" title="Defined at line 225, 342, 343, 344, 345, 346, 347, 348, 349, 350, 351, 363">Term</a>.<span class="cons_Constructor"><a href="#As_8199_8201" id="As_8408_8410" title="Defined at line 349">As</a></span>
  &gt; <a href="#Term_4932_4936" id="Term_8415_8419" title="Defined at line 225, 342, 343, 344, 345, 346, 347, 348, 349, 350, 351, 363">Term</a>.<span class="cons_Constructor"><a href="#Ascribe_8234_8241" id="Ascribe_8420_8427" title="Defined at line 350">Ascribe</a></span>

<span class="keyword">syntax</span>

  <a href="#Term_1373_1377" id="Term_8439_8443" title="Referenced at line 75, 77, 79, 107, 108, 134, 135, 171, 231, 232, 234, 259, 345, 346, 348, 349, 350, 351, 353, 354, 358, 359, 437">Term</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="Op_8447_8449" title="Not referenced locally, nor via imports">Op</span></span>         = <a href="#OpId_7604_7608" id="OpId_8460_8464" title="Defined at line 325, 326">OpId</a><span class="keyword">-LEX</span> <span class="cons_Lit">"("</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="#CommaTerms_8312_8322" id="CommaTerms_8484_8494" title="Defined at line 353">CommaTerms</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">")"</span>

  <a href="#Str_8030_8033" id="Str_8516_8519" title="Referenced at line 344, 435">Str</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="Str_8523_8526" title="Not referenced locally, nor via imports">Str</span></span>        = <span class="cons_Lit">"\""</span> <a href="#StrChars_8578_8586" id="StrChars_8541_8549" title="Defined at line 369">StrChars</a><span class="keyword">-LEX</span> <span class="cons_Lit">"\""</span>

<span class="keyword">lexical syntax</span>

  <a href="#StrChars_8541_8549" id="StrChars_8578_8586" title="Referenced at line 365, 375">StrChars</a>   = <a href="#StrChar_8602_8609" id="StrChar_8591_8598" title="Defined at line 370, 371">StrChar</a>*
  <a href="#StrChar_8591_8598" id="StrChar_8602_8609" title="Referenced at line 369">StrChar</a>    = ~[\"\\\t\r\n]
  <a href="#StrChar_8591_8598" id="StrChar_8631_8638" title="Referenced at line 369">StrChar</a>    =  <span class="cons_Lit">"\\\""</span> | <span class="cons_Lit">"\\\\"</span> | <span class="cons_Lit">"\\t"</span> | <span class="cons_Lit">"\\r"</span> | <span class="cons_Lit">"\\n"</span>

<span class="keyword">lexical restrictions</span>

  <a href="#StrChars_8578_8586" id="StrChars_8710_8718" title="Defined at line 369">StrChars</a> -/- ~[\"]


/******************************************************************
 * <span class="keyword">Arithmetic</span>                                                          *
 ******************************************************************/

<span class="keyword">syntax</span>

  <a href="#Constraint_1261_1271" id="Constraint_8952_8962" title="Referenced at line 68, 79, 98, 101, 102, 110, 114, 121; ../../test/Test.sdf3 line 23">Constraint</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="CArith_8966_8972" title="Not referenced locally, nor via imports">CArith</span></span> = <a href="#ArithExp_9303_9311" id="ArithExp_8975_8983" title="Defined at line 395, 396, 397, 398, 399, 400, 401, 402, 403, 404">ArithExp</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">"#"</span> <a href="#ArithOp_9061_9068" id="ArithOp_9002_9009" title="Defined at line 386, 387, 388, 389, 390, 391">ArithOp</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <a href="#ArithExp_9303_9311" id="ArithExp_9024_9032" title="Defined at line 395, 396, 397, 398, 399, 400, 401, 402, 403, 404">ArithExp</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <a href="#Message_10079_10086" id="Message_9047_9054" title="Defined at line 418, 419">Message</a><span class="keyword">-CF</span>

  <a href="#ArithOp_9002_9009" id="ArithOp_9061_9068" title="Referenced at line 384">ArithOp</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="Equal_9072_9077" title="Not referenced locally, nor via imports">Equal</span></span>            = <span class="cons_Lit">"="</span>
  <a href="#ArithOp_9002_9009" id="ArithOp_9097_9104" title="Referenced at line 384">ArithOp</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="NotEqual_9108_9116" title="Not referenced locally, nor via imports">NotEqual</span></span>         = <span class="cons_Lit">"\\="</span>
  <a href="#ArithOp_9002_9009" id="ArithOp_9135_9142" title="Referenced at line 384">ArithOp</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="GreaterThanEqual_9146_9162" title="Not referenced locally, nor via imports">GreaterThanEqual</span></span> = <span class="cons_Lit">"&gt;="</span>
  <a href="#ArithOp_9002_9009" id="ArithOp_9172_9179" title="Referenced at line 384">ArithOp</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="LessThanEqual_9183_9196" title="Not referenced locally, nor via imports">LessThanEqual</span></span>    = <span class="cons_Lit">"=&lt;"</span>
  <a href="#ArithOp_9002_9009" id="ArithOp_9209_9216" title="Referenced at line 384">ArithOp</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="GreaterThan_9220_9231" title="Not referenced locally, nor via imports">GreaterThan</span></span>      = <span class="cons_Lit">"&gt;"</span>
  <a href="#ArithOp_9002_9009" id="ArithOp_9245_9252" title="Referenced at line 384">ArithOp</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="LessThan_9256_9264" title="Not referenced locally, nor via imports">LessThan</span></span>         = <span class="cons_Lit">"&lt;"</span>

<span class="keyword">context-free syntax</span>

  <a href="#ArithExp_8975_8983" id="ArithExp_9303_9311" title="Referenced at line 384, 397, 398, 399, 400, 401, 402, 403, 404, 408, 409; ../Sugar.sdf3 line 166">ArithExp</a>     = <a href="#Int_7947_7950" id="Int_9318_9321" title="Defined at line 340">Int</a>
  <a href="#ArithExp_8975_8983" id="ArithExp_9324_9332" title="Referenced at line 384, 397, 398, 399, 400, 401, 402, 403, 404, 408, 409; ../Sugar.sdf3 line 166">ArithExp</a>     = <a href="#Var_7912_7915" id="Var_9339_9342" title="Defined at line 337, 338">Var</a>
  <a href="#ArithExp_8975_8983" id="ArithExp_9345_9353" title="Referenced at line 384, 397, 398, 399, 400, 401, 402, 403, 404, 408, 409; ../Sugar.sdf3 line 166">ArithExp</a>.<span class="cons_Constructor"><a href="#Add_9830_9833" id="Add_9354_9357" title="Referenced at line 409">Add</a></span> = &lt;&lt;<a href="#ArithExp_9303_9311" id="ArithExp_9362_9370" title="Defined at line 395, 396, 397, 398, 399, 400, 401, 402, 403, 404">ArithExp</a>&gt; <span class="cons_String">+</span> &lt;<a href="#ArithExp_9303_9311" id="ArithExp_9375_9383" title="Defined at line 395, 396, 397, 398, 399, 400, 401, 402, 403, 404">ArithExp</a>&gt;&gt; {<span class="keyword">left</span>}
  <a href="#ArithExp_8975_8983" id="ArithExp_9395_9403" title="Referenced at line 384, 397, 398, 399, 400, 401, 402, 403, 404, 408, 409; ../Sugar.sdf3 line 166">ArithExp</a>.<span class="cons_Constructor"><a href="#Mul_9779_9782" id="Mul_9404_9407" title="Referenced at line 408">Mul</a></span> = &lt;&lt;<a href="#ArithExp_9303_9311" id="ArithExp_9412_9420" title="Defined at line 395, 396, 397, 398, 399, 400, 401, 402, 403, 404">ArithExp</a>&gt; <span class="cons_String">*</span> &lt;<a href="#ArithExp_9303_9311" id="ArithExp_9425_9433" title="Defined at line 395, 396, 397, 398, 399, 400, 401, 402, 403, 404">ArithExp</a>&gt;&gt; {<span class="keyword">left</span>}
  <a href="#ArithExp_8975_8983" id="ArithExp_9445_9453" title="Referenced at line 384, 397, 398, 399, 400, 401, 402, 403, 404, 408, 409; ../Sugar.sdf3 line 166">ArithExp</a>.<span class="cons_Constructor"><a href="#Sub_9843_9846" id="Sub_9454_9457" title="Referenced at line 409">Sub</a></span> = &lt;&lt;<a href="#ArithExp_9303_9311" id="ArithExp_9462_9470" title="Defined at line 395, 396, 397, 398, 399, 400, 401, 402, 403, 404">ArithExp</a>&gt; <span class="cons_String">-</span> &lt;<a href="#ArithExp_9303_9311" id="ArithExp_9475_9483" title="Defined at line 395, 396, 397, 398, 399, 400, 401, 402, 403, 404">ArithExp</a>&gt;&gt; {<span class="keyword">left</span>}
  <a href="#ArithExp_8975_8983" id="ArithExp_9495_9503" title="Referenced at line 384, 397, 398, 399, 400, 401, 402, 403, 404, 408, 409; ../Sugar.sdf3 line 166">ArithExp</a>.<span class="cons_Constructor"><span id="Min_9504_9507" title="Not referenced locally, nor via imports">Min</span></span> = &lt;<span class="cons_String">min(</span>&lt;<a href="#ArithExp_9303_9311" id="ArithExp_9516_9524" title="Defined at line 395, 396, 397, 398, 399, 400, 401, 402, 403, 404">ArithExp</a>&gt;<span class="cons_String">,</span> &lt;<a href="#ArithExp_9303_9311" id="ArithExp_9528_9536" title="Defined at line 395, 396, 397, 398, 399, 400, 401, 402, 403, 404">ArithExp</a>&gt;<span class="cons_String">)</span>&gt;
  <a href="#ArithExp_8975_8983" id="ArithExp_9542_9550" title="Referenced at line 384, 397, 398, 399, 400, 401, 402, 403, 404, 408, 409; ../Sugar.sdf3 line 166">ArithExp</a>.<span class="cons_Constructor"><span id="Max_9551_9554" title="Not referenced locally, nor via imports">Max</span></span> = &lt;<span class="cons_String">max(</span>&lt;<a href="#ArithExp_9303_9311" id="ArithExp_9563_9571" title="Defined at line 395, 396, 397, 398, 399, 400, 401, 402, 403, 404">ArithExp</a>&gt;<span class="cons_String">,</span> &lt;<a href="#ArithExp_9303_9311" id="ArithExp_9575_9583" title="Defined at line 395, 396, 397, 398, 399, 400, 401, 402, 403, 404">ArithExp</a>&gt;<span class="cons_String">)</span>&gt;
  <a href="#ArithExp_8975_8983" id="ArithExp_9589_9597" title="Referenced at line 384, 397, 398, 399, 400, 401, 402, 403, 404, 408, 409; ../Sugar.sdf3 line 166">ArithExp</a>.<span class="cons_Constructor"><a href="#Mod_9805_9808" id="Mod_9598_9601" title="Referenced at line 408">Mod</a></span> = &lt;&lt;<a href="#ArithExp_9303_9311" id="ArithExp_9606_9614" title="Defined at line 395, 396, 397, 398, 399, 400, 401, 402, 403, 404">ArithExp</a>&gt; <span class="cons_String">mod</span> &lt;<a href="#ArithExp_9303_9311" id="ArithExp_9621_9629" title="Defined at line 395, 396, 397, 398, 399, 400, 401, 402, 403, 404">ArithExp</a>&gt;&gt; {<span class="keyword">left</span>}
  <a href="#ArithExp_8975_8983" id="ArithExp_9641_9649" title="Referenced at line 384, 397, 398, 399, 400, 401, 402, 403, 404, 408, 409; ../Sugar.sdf3 line 166">ArithExp</a>.<span class="cons_Constructor"><a href="#Div_9792_9795" id="Div_9650_9653" title="Referenced at line 408">Div</a></span> = &lt;&lt;<a href="#ArithExp_9303_9311" id="ArithExp_9658_9666" title="Defined at line 395, 396, 397, 398, 399, 400, 401, 402, 403, 404">ArithExp</a>&gt; <span class="cons_String">div</span> &lt;<a href="#ArithExp_9303_9311" id="ArithExp_9673_9681" title="Defined at line 395, 396, 397, 398, 399, 400, 401, 402, 403, 404">ArithExp</a>&gt;&gt; {<span class="keyword">left</span>}
  <a href="#ArithExp_8975_8983" id="ArithExp_9693_9701" title="Referenced at line 384, 397, 398, 399, 400, 401, 402, 403, 404, 408, 409; ../Sugar.sdf3 line 166">ArithExp</a>     = &lt;<span class="cons_String">(</span>&lt;<a href="#ArithExp_9303_9311" id="ArithExp_9711_9719" title="Defined at line 395, 396, 397, 398, 399, 400, 401, 402, 403, 404">ArithExp</a>&gt;<span class="cons_String">)</span>&gt; {<span class="keyword">bracket</span>}

<span class="keyword">context-free priorities</span>

    {<span class="keyword">left</span>: <a href="#ArithExp_9303_9311" id="ArithExp_9770_9778" title="Defined at line 395, 396, 397, 398, 399, 400, 401, 402, 403, 404">ArithExp</a>.<span class="cons_Constructor"><a href="#Mul_9404_9407" id="Mul_9779_9782" title="Defined at line 398">Mul</a></span> <a href="#ArithExp_9303_9311" id="ArithExp_9783_9791" title="Defined at line 395, 396, 397, 398, 399, 400, 401, 402, 403, 404">ArithExp</a>.<span class="cons_Constructor"><a href="#Div_9650_9653" id="Div_9792_9795" title="Defined at line 403">Div</a></span> <a href="#ArithExp_9303_9311" id="ArithExp_9796_9804" title="Defined at line 395, 396, 397, 398, 399, 400, 401, 402, 403, 404">ArithExp</a>.<span class="cons_Constructor"><a href="#Mod_9598_9601" id="Mod_9805_9808" title="Defined at line 402">Mod</a></span>}
  &gt; {<span class="keyword">left</span>: <a href="#ArithExp_9303_9311" id="ArithExp_9821_9829" title="Defined at line 395, 396, 397, 398, 399, 400, 401, 402, 403, 404">ArithExp</a>.<span class="cons_Constructor"><a href="#Add_9354_9357" id="Add_9830_9833" title="Defined at line 397">Add</a></span> <a href="#ArithExp_9303_9311" id="ArithExp_9834_9842" title="Defined at line 395, 396, 397, 398, 399, 400, 401, 402, 403, 404">ArithExp</a>.<span class="cons_Constructor"><a href="#Sub_9454_9457" id="Sub_9843_9846" title="Defined at line 399">Sub</a></span>}


/******************************************************************
 * <span class="keyword">Messages</span>                                                       *
 ******************************************************************/

<span class="keyword">context-free syntax</span>

  <a href="#Message_1438_1445" id="Message_10079_10086" title="Referenced at line 77, 96, 107, 108, 110, 259, 384; ../Deprecated.sdf3 line 66, 67; ../Sugar.sdf3 line 94">Message</a>.<span class="cons_Constructor"><span id="NoMessage_10087_10096" title="Not referenced locally, nor via imports">NoMessage</span></span> =
  <a href="#Message_1438_1445" id="Message_10101_10108" title="Referenced at line 77, 96, 107, 108, 110, 259, 384; ../Deprecated.sdf3 line 66, 67; ../Sugar.sdf3 line 94">Message</a>.<span class="cons_Constructor"><span id="Message_10109_10116" title="Not referenced locally, nor via imports">Message</span></span>   = &lt; <span class="cons_String">|</span> &lt;<a href="#MessageKind_10176_10187" id="MessageKind_10126_10137" title="Defined at line 421, 422, 423">MessageKind</a>&gt; &lt;<a href="#MessageContent_10291_10305" id="MessageContent_10140_10154" title="Defined at line 427, 434, 435">MessageContent</a>&gt; &lt;<a href="#MessageOrigin_10356_10369" id="MessageOrigin_10157_10170" title="Defined at line 429, 430">MessageOrigin</a>&gt;&gt;

  <a href="#MessageKind_10126_10137" id="MessageKind_10176_10187" title="Referenced at line 419">MessageKind</a>.<span class="cons_Constructor"><span id="Error_10188_10193" title="Not referenced locally, nor via imports">Error</span></span>      = &lt;<span class="cons_String">error</span>&gt;
  <a href="#MessageKind_10126_10137" id="MessageKind_10211_10222" title="Referenced at line 419">MessageKind</a>.<span class="cons_Constructor"><span id="Warning_10223_10230" title="Not referenced locally, nor via imports">Warning</span></span>    = &lt;<span class="cons_String">warning</span>&gt;
  <a href="#MessageKind_10126_10137" id="MessageKind_10248_10259" title="Referenced at line 419">MessageKind</a>.<span class="cons_Constructor"><span id="Note_10260_10264" title="Not referenced locally, nor via imports">Note</span></span>       = &lt;<span class="cons_String">note</span>&gt;

<span class="keyword">syntax</span>

  <a href="#MessageContent_10140_10154" id="MessageContent_10291_10305" title="Referenced at line 419">MessageContent</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="Formatted_10309_10318" title="Not referenced locally, nor via imports">Formatted</span></span> = <span class="cons_Lit">"$["</span> <a href="#MessageContentPart_10512_10530" id="MessageContentPart_10326_10344" title="Defined at line 437, 438">MessageContentPart</a><span class="keyword">-CF</span>* <span class="cons_Lit">"]"</span>

  <a href="#MessageOrigin_10157_10170" id="MessageOrigin_10356_10369" title="Referenced at line 419">MessageOrigin</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="NoOrigin_10373_10381" title="Not referenced locally, nor via imports">NoOrigin</span></span> =
  <a href="#MessageOrigin_10157_10170" id="MessageOrigin_10386_10399" title="Referenced at line 419">MessageOrigin</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="Origin_10403_10409" title="Not referenced locally, nor via imports">Origin</span></span>   = <span class="cons_Lit">"@"</span> <a href="#Var_7912_7915" id="Var_10418_10421" title="Defined at line 337, 338">Var</a><span class="keyword">-CF</span>

<span class="keyword">context-free syntax</span>

  <a href="#MessageContent_10140_10154" id="MessageContent_10449_10463" title="Referenced at line 419">MessageContent</a>.<span class="cons_Constructor"><span id="NoMessage_10464_10473" title="Not referenced locally, nor via imports">NoMessage</span></span> =
  <a href="#MessageContent_10140_10154" id="MessageContent_10478_10492" title="Referenced at line 419">MessageContent</a>           = <a href="#Str_8516_8519" id="Str_10505_10508" title="Defined at line 365">Str</a>

  <a href="#MessageContentPart_10326_10344" id="MessageContentPart_10512_10530" title="Referenced at line 427">MessageContentPart</a>.<span class="cons_Constructor"><span id="Term_10531_10535" title="Not referenced locally, nor via imports">Term</span></span> = &lt;<span class="cons_String">[</span>&lt;<a href="#Term_4932_4936" id="Term_10541_10545" title="Defined at line 225, 342, 343, 344, 345, 346, 347, 348, 349, 350, 351, 363">Term</a>&gt;<span class="cons_String">]</span>&gt;
  <a href="#MessageContentPart_10326_10344" id="MessageContentPart_10551_10569" title="Referenced at line 427">MessageContentPart</a>.<span class="cons_Constructor"><span id="Text_10570_10574" title="Not referenced locally, nor via imports">Text</span></span> = <a href="#MessageChars_10609_10621" id="MessageChars_10577_10589" title="Defined at line 442">MessageChars</a>

<span class="keyword">lexical syntax</span>

  <a href="#MessageChars_10577_10589" id="MessageChars_10609_10621" title="Referenced at line 438, 448">MessageChars</a> = <a href="#MessageChar_10639_10650" id="MessageChar_10624_10635" title="Defined at line 443, 444">MessageChar</a>+
  <a href="#MessageChar_10624_10635" id="MessageChar_10639_10650" title="Referenced at line 442">MessageChar</a>  = ~[\[\]\\\t\r\n]
  <a href="#MessageChar_10624_10635" id="MessageChar_10672_10683" title="Referenced at line 442">MessageChar</a>  = <span class="cons_Lit">"\\["</span> | <span class="cons_Lit">"\\]"</span> | <span class="cons_Lit">"\\n"</span> | <span class="cons_Lit">"\\r"</span> | <span class="cons_Lit">"\\t"</span> | <span class="cons_Lit">"\\\\"</span>

<span class="keyword">lexical restrictions</span>

  <a href="#MessageChars_10609_10621" id="MessageChars_10759_10771" title="Defined at line 442">MessageChars</a> -/- ~[\[\]]

</code></pre></td></tr></tbody></table></div>