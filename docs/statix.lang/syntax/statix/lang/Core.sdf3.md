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
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="statix/lang/Core_1_8" title="a definition with multiple references" data-urls="../Deprecated.sdf3/#statix/lang/Core line 6_3; ../NoParse.sdf3/#statix/lang/Core line 6_3; ../PreCompiled.sdf3/#statix/lang/Core line 6_3; ../Schema.sdf3/#statix/lang/Core line 5_3; ../Sugar.sdf3/#statix/lang/Core line 6_3; ../Type.sdf3/#statix/lang/Core line 8_3; ../../../StatixLang.sdf3/#statix/lang/Core line 7_3; ../../cli/CLI.sdf3/#statix/lang/Core line 7_3; ../../test/Result.sdf3/#statix/lang/Core line 9_3; ../../test/Test.sdf3/#statix/lang/Core line 7_3">statix/lang/Core</button>

<span class="keyword">imports</span>

  <a href="../Common.sdf3/#statix/lang/Common_1_8" id="statix/lang/Common_5_3" title="a reference to a single-file definition">statix/lang/Common</a>

<span class="keyword">template options</span>

  <span class="keyword">keyword</span> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\_\-\']


/******************************************************************
 * <span class="keyword">Modules</span>                                                        *
 ******************************************************************/

<span class="keyword">context-free syntax</span>

  <a href="../../../StatixLang.sdf3/#Module_28_11" id="Module_18_3" title="a definition with a single reference">Module</a>.<span class="cons_Constructor"><span id="Module_18_10" title="a definition with no references">Module</span></span> = &lt;
    <span class="cons_String">module</span> &lt;<a href="#ModuleId_45_3" id="ModuleId_19_13" title="a reference to a single-file definition">ModuleId</a>&gt;

    &lt;{<a href="#Section_24_3" id="Section_21_7" title="a reference to a single-file definition">Section</a> <span class="cons_Lit">"\n\n"</span>}*&gt;
  &gt; {<span class="keyword">longest-match</span>}

  <button class="modal-open" id="Section_24_3" title="a definition with multiple references" data-urls="#Section line 21_7; ../../test/Test.sdf3/#Section line 25_7">Section</button>.<span class="cons_Constructor"><span id="Imports_24_11" title="a definition with no references">Imports</span></span> = &lt;
    <span class="cons_String">imports</span>
      &lt;{<a href="#Import_29_3" id="Import_26_9" title="a reference to a single-file definition">Import</a> <span class="cons_Lit">"\n"</span>}*&gt;
  &gt;

  <a href="#Import_26_9" id="Import_29_3" title="a definition with a single reference">Import</a>.<span class="cons_Constructor"><span id="Import_29_10" title="a definition with no references">Import</span></span> = <a href="#ModuleId_45_3" id="ModuleId_29_19" title="a reference to a single-file definition">ModuleId</a>

  <button class="modal-open" id="Section_31_3" title="a definition with multiple references" data-urls="#Section line 21_7; ../../test/Test.sdf3/#Section line 25_7">Section</button>.<span class="cons_Constructor"><span id="Signature_31_11" title="a definition with no references">Signature</span></span> = &lt;
    <span class="cons_String">signature</span>

      &lt;{<a href="#Signature_56_3" id="Signature_34_9" title="a reference to a single-file definition">Signature</a> <span class="cons_Lit">"\n\n"</span>}*&gt;
  &gt; {<span class="keyword">longest-match</span>}

  <button class="modal-open" id="Section_37_3" title="a definition with multiple references" data-urls="#Section line 21_7; ../../test/Test.sdf3/#Section line 25_7">Section</button>.<span class="cons_Constructor"><span id="Rules_37_11" title="a definition with no references">Rules</span></span> = &lt;
    <span class="cons_String">rules</span>

      &lt;{<a href="#Rule_66_3" id="Rule_40_9" title="a reference to a single-file definition">Rule</a> <span class="cons_Lit">"\n\n"</span>}*&gt;
  &gt; {<span class="keyword">longest-match</span>}

<span class="keyword">lexical syntax</span>

  <button class="modal-open" id="ModuleId_45_3" title="a definition with multiple references" data-urls="#ModuleId line 19_13, 29_19">ModuleId</button> = <a href="#Keyword_47_3" id="Keyword_45_14" title="a reference to a single-file definition">Keyword</a> {<span class="keyword">reject</span>}

  <button class="modal-open" id="Keyword_47_3" title="a definition with multiple references" data-urls="#Keyword line 45_14, 84_18, 147_19, 176_16, 241_16, 322_12, 326_10">Keyword</button> = <span class="cons_Lit">"module"</span> | <span class="cons_Lit">"imports"</span> | <span class="cons_Lit">"signature"</span> | <span class="cons_Lit">"rules"</span>


/******************************************************************
 * <span class="keyword">User Constraints</span>                                               *
 ******************************************************************/

<span class="keyword">context-free syntax</span>

  <a href="#Signature_34_9" id="Signature_56_3" title="a definition with a single reference">Signature</a>.<span class="cons_Constructor"><span id="Constraints_56_13" title="a definition with no references">Constraints</span></span> = &lt;
    <span class="cons_String">constraints</span>
      &lt;{<a href="#CDecl_61_3" id="CDecl_58_9" title="a reference to a single-file definition">CDecl</a> <span class="cons_Lit">"\n"</span>}*&gt;
  &gt; {<span class="keyword">longest-match</span>}

  <a href="#CDecl_58_9" id="CDecl_61_3" title="a definition with a single reference">CDecl</a>.<span class="cons_Constructor"><span id="CDecl_61_9" title="a definition with no references">CDecl</span></span>      = [[<a href="#CInd_63_3" id="CInd_61_24" title="a reference to a single-file definition">CInd</a>][<a href="#ConstraintId_83_3" id="ConstraintId_61_30" title="a reference to a single-file definition">ConstraintId</a>] <span class="cons_String">:</span> [<a href="#Type_317_3" id="Type_61_47" title="a reference to a single-file definition">Type</a>]]

  <button class="modal-open" id="CInd_63_3" title="a definition with multiple references" data-urls="#CInd line 61_24; ../Sugar.sdf3/#CInd line 24_24, 25_24">CInd</button>.<span class="cons_Constructor"><span id="InductiveC_63_8" title="a definition with no references">InductiveC</span></span>   =
  <button class="modal-open" id="CInd_64_3" title="a definition with multiple references" data-urls="#CInd line 61_24; ../Sugar.sdf3/#CInd line 24_24, 25_24">CInd</button>.<span class="cons_Constructor"><span id="CoinductiveC_64_8" title="a definition with no references">CoinductiveC</span></span> = &lt;<span class="cons_String">coinductive</span> &gt;

  <a href="#Rule_40_9" id="Rule_66_3" title="a definition with a single reference">Rule</a>.<span class="cons_Constructor"><span id="Rule_66_8" title="a definition with no references">Rule</span></span> = &lt;
    &lt;<a href="#RuleName_71_3" id="RuleName_67_6" title="a reference to a single-file definition">RuleName</a>&gt;&lt;<a href="#RuleHead_75_3" id="RuleHead_67_16" title="a reference to a single-file definition">RuleHead</a>&gt; <span class="cons_String">:-</span>
      &lt;<a href="#Constraint_77_3" id="Constraint_68_8" title="a reference to a single-file definition">Constraint</a>&gt;<span class="cons_String">.</span>
  &gt;

  <button class="modal-open" id="RuleName_71_3" title="a definition with multiple references" data-urls="#RuleName line 67_6; ../Schema.sdf3/#RuleName line 35_95, 49_85; ../Sugar.sdf3/#RuleName line 40_6">RuleName</button>.<span class="cons_Constructor"><span id="NoName_71_12" title="a definition with no references">NoName</span></span> = &lt;&gt;
  <button class="modal-open" id="RuleName_72_3" title="a definition with multiple references" data-urls="#RuleName line 67_6; ../Schema.sdf3/#RuleName line 35_95, 49_85; ../Sugar.sdf3/#RuleName line 40_6">RuleName</button>.<span class="cons_Constructor"><span id="Name_72_12" title="a definition with no references">Name</span></span> = &lt;
    <span class="cons_String">[</span>&lt;<a href="../Common.sdf3/#STRID_13_3" id="STRID_73_7" title="a reference to a single-file definition">STRID</a>&gt;<span class="cons_String">]</span>
  &gt;
  <a href="#RuleHead_67_16" id="RuleHead_75_3" title="a definition with a single reference">RuleHead</a>.<span class="cons_Constructor"><span id="C_75_12" title="a definition with no references">C</span></span> = [[<a href="#ConstraintId_83_3" id="ConstraintId_75_18" title="a reference to a single-file definition">ConstraintId</a>]<span class="cons_String">(</span>[{<a href="#Term_225_3" id="Term_75_34" title="a reference to a single-file definition">Term</a> <span class="cons_Lit">", "</span>}*]<span class="cons_String">)</span>]

  <button class="modal-open" id="Constraint_77_3" title="a definition with multiple references" data-urls="#Constraint line 68_8, 79_45, 98_27, 101_6, 102_6, 110_29, 114_8, 121_3, 121_22">Constraint</button>.<span class="cons_Constructor"><span id="C_77_14" title="a definition with no references">C</span></span> = [[<a href="#ConstraintId_83_3" id="ConstraintId_77_20" title="a reference to a single-file definition">ConstraintId</a>]<span class="cons_String">(</span>[{<a href="#Term_225_3" id="Term_77_36" title="a reference to a single-file definition">Term</a> <span class="cons_Lit">", "</span>}*]<span class="cons_String">)</span>[<a href="#Message_418_3" id="Message_77_50" title="a reference to a single-file definition">Message</a>]]

  <button class="modal-open" id="HoConstraint_79_3" title="a definition with multiple references" data-urls="#HoConstraint line 265_50, 266_48">HoConstraint</button>.<span class="cons_Constructor"><span id="LLam_79_16" title="a definition with no references">LLam</span></span> = &lt;<span class="cons_String">{</span> &lt;{<a href="#Term_225_3" id="Term_79_28" title="a reference to a single-file definition">Term</a> <span class="cons_Lit">", "</span>}*&gt; <span class="cons_String">:-</span> &lt;<a href="#Constraint_77_3" id="Constraint_79_45" title="a reference to a single-file definition">Constraint</a>&gt; <span class="cons_String">}</span>&gt;

<span class="keyword">lexical syntax</span>

  <button class="modal-open" id="ConstraintId_83_3" title="a definition with multiple references" data-urls="#ConstraintId line 61_30, 75_18, 77_20; ../Schema.sdf3/#ConstraintId line 80_34; ../Sugar.sdf3/#ConstraintId line 24_41, 25_30, 29_26, 29_46, 30_26, 30_46, 43_18, 47_21, 53_17">ConstraintId</button> = <a href="../Common.sdf3/#LCID_9_3" id="LCID_83_18" title="a reference to a single-file definition">LCID</a>
  <button class="modal-open" id="ConstraintId_84_3" title="a definition with multiple references" data-urls="#ConstraintId line 61_30, 75_18, 77_20; ../Schema.sdf3/#ConstraintId line 80_34; ../Sugar.sdf3/#ConstraintId line 24_41, 25_30, 29_26, 29_46, 30_26, 30_46, 43_18, 47_21, 53_17">ConstraintId</button> = <a href="#Keyword_47_3" id="Keyword_84_18" title="a reference to a single-file definition">Keyword</a> {<span class="keyword">reject</span>}

  <button class="modal-open" id="Keyword_86_3" title="a definition with multiple references" data-urls="#Keyword line 45_14, 84_18, 147_19, 176_16, 241_16, 322_12, 326_10">Keyword</button> = <span class="cons_Lit">"constraints"</span> | <span class="cons_Lit">"coinductive"</span>


/******************************************************************
 * <span class="keyword">Base Constraints</span>                                               *
 ******************************************************************/

<span class="keyword">context-free syntax</span>

  <button class="modal-open" id="Constraint_95_3" title="a definition with multiple references" data-urls="#Constraint line 68_8, 79_45, 98_27, 101_6, 102_6, 110_29, 114_8, 121_3, 121_22">Constraint</button>.<span class="cons_Constructor"><span id="CTrue_95_14" title="a definition with no references">CTrue</span></span>  = &lt;<span class="cons_String">true</span>&gt;
  <button class="modal-open" id="Constraint_96_3" title="a definition with multiple references" data-urls="#Constraint line 68_8, 79_45, 98_27, 101_6, 102_6, 110_29, 114_8, 121_3, 121_22">Constraint</button>.<span class="cons_Constructor"><span id="CFalse_96_14" title="a definition with no references">CFalse</span></span> = &lt;<span class="cons_String">false</span>&lt;<a href="#Message_418_3" id="Message_96_30" title="a reference to a single-file definition">Message</a>&gt;&gt;

  <button class="modal-open" id="Constraint_98_3" title="a definition with multiple references" data-urls="#Constraint line 68_8, 79_45, 98_27, 101_6, 102_6, 110_29, 114_8, 121_3, 121_22">Constraint</button>         = &lt;<span class="cons_String">(</span>&lt;<a href="#Constraint_77_3" id="Constraint_98_27" title="a reference to a single-file definition">Constraint</a>&gt;<span class="cons_String">)</span>&gt; {<span class="keyword">bracket</span>}

  <button class="modal-open" id="Constraint_100_3" title="a definition with multiple references" data-urls="#Constraint line 68_8, 79_45, 98_27, 101_6, 102_6, 110_29, 114_8, 121_3, 121_22">Constraint</button>.<span class="cons_Constructor"><a href="#CConj_121_14" id="CConj_100_14" title="a definition with a single reference">CConj</a></span>   = &lt;
    &lt;<a href="#Constraint_77_3" id="Constraint_101_6" title="a reference to a single-file definition">Constraint</a>&gt;<span class="cons_String">,</span>
    &lt;<a href="#Constraint_77_3" id="Constraint_102_6" title="a reference to a single-file definition">Constraint</a>&gt;
  &gt; {<span class="keyword">right</span>}

  <button class="modal-open" id="Constraint_105_3" title="a definition with multiple references" data-urls="#Constraint line 68_8, 79_45, 98_27, 101_6, 102_6, 110_29, 114_8, 121_3, 121_22">Constraint</button>.<span class="cons_Constructor"><span id="CNew_105_14" title="a definition with no references">CNew</span></span>    = &lt;<span class="cons_String">new</span> &lt;{<a href="#Var_337_3" id="Var_105_31" title="a reference to a single-file definition">Var</a> <span class="cons_Lit">" "</span>}+&gt;&gt;

  <button class="modal-open" id="Constraint_107_3" title="a definition with multiple references" data-urls="#Constraint line 68_8, 79_45, 98_27, 101_6, 102_6, 110_29, 114_8, 121_3, 121_22">Constraint</button>.<span class="cons_Constructor"><span id="CEqual_107_14" title="a definition with no references">CEqual</span></span>   = [[<a href="#Term_225_3" id="Term_107_27" title="a reference to a single-file definition">Term</a>] <span class="cons_String">==</span> [<a href="#Term_225_3" id="Term_107_37" title="a reference to a single-file definition">Term</a>][<a href="#Message_418_3" id="Message_107_43" title="a reference to a single-file definition">Message</a>]]
  <button class="modal-open" id="Constraint_108_3" title="a definition with multiple references" data-urls="#Constraint line 68_8, 79_45, 98_27, 101_6, 102_6, 110_29, 114_8, 121_3, 121_22">Constraint</button>.<span class="cons_Constructor"><span id="CInequal_108_14" title="a definition with no references">CInequal</span></span> = [[<a href="#Term_225_3" id="Term_108_27" title="a reference to a single-file definition">Term</a>] <span class="cons_String">!=</span> [<a href="#Term_225_3" id="Term_108_37" title="a reference to a single-file definition">Term</a>][<a href="#Message_418_3" id="Message_108_43" title="a reference to a single-file definition">Message</a>]]

  <button class="modal-open" id="Constraint_110_3" title="a definition with multiple references" data-urls="#Constraint line 68_8, 79_45, 98_27, 101_6, 102_6, 110_29, 114_8, 121_3, 121_22">Constraint</button>.<span class="cons_Constructor"><span id="CTry_110_14" title="a definition with no references">CTry</span></span> = [<span class="cons_String">try</span> <span class="cons_String">{</span> [<a href="#Constraint_77_3" id="Constraint_110_29" title="a reference to a single-file definition">Constraint</a>] <span class="cons_String">}</span>[<a href="#Message_418_3" id="Message_110_43" title="a reference to a single-file definition">Message</a>]]

  <button class="modal-open" id="Constraint_112_3" title="a definition with multiple references" data-urls="#Constraint line 68_8, 79_45, 98_27, 101_6, 102_6, 110_29, 114_8, 121_3, 121_22">Constraint</button>.<span class="cons_Constructor"><a href="#CExists_121_33" id="CExists_112_14" title="a definition with a single reference">CExists</a></span> = [
    <span class="cons_String">{</span>[{<a href="#Var_337_3" id="Var_113_8" title="a reference to a single-file definition">Var</a> <span class="cons_Lit">" "</span>}*]<span class="cons_String">}</span>
      [<a href="#Constraint_77_3" id="Constraint_114_8" title="a reference to a single-file definition">Constraint</a>]
  ]

<span class="keyword">context-free priorities</span>

  <span class="layout">// Does this give longest-match behavior? Putting longest-match on CExists</span>
  <span class="layout">// seemed to break parsing of exists with conj body in parenthesis.</span>
  <a href="#Constraint_77_3" id="Constraint_121_3" title="a reference to a single-file definition">Constraint</a>.<span class="cons_Constructor"><a href="#CConj_100_14" id="CConj_121_14" title="a reference to a single-file definition">CConj</a></span> &gt; <a href="#Constraint_77_3" id="Constraint_121_22" title="a reference to a single-file definition">Constraint</a>.<span class="cons_Constructor"><a href="#CExists_112_14" id="CExists_121_33" title="a reference to a single-file definition">CExists</a></span>

<span class="keyword">lexical syntax</span>

  <button class="modal-open" id="Keyword_125_3" title="a definition with multiple references" data-urls="#Keyword line 45_14, 84_18, 147_19, 176_16, 241_16, 322_12, 326_10">Keyword</button> = <span class="cons_Lit">"true"</span> | <span class="cons_Lit">"false"</span> | <span class="cons_Lit">"new"</span> | <span class="cons_Lit">"try"</span>


/******************************************************************
 * <span class="keyword">AST Constraints</span>                                                *
 ******************************************************************/

<span class="keyword">context-free syntax</span>

  <button class="modal-open" id="Constraint_134_3" title="a definition with multiple references" data-urls="#Constraint line 68_8, 79_45, 98_27, 101_6, 102_6, 110_29, 114_8, 121_3, 121_22">Constraint</button>.<span class="cons_Constructor"><span id="CAstId_134_14" title="a definition with no references">CAstId</span></span>       = &lt;<span class="cons_String">astId(</span>&lt;<a href="#Term_225_3" id="Term_134_37" title="a reference to a single-file definition">Term</a>&gt;<span class="cons_String">,</span> &lt;<a href="#Term_225_3" id="Term_134_45" title="a reference to a single-file definition">Term</a>&gt;<span class="cons_String">)</span>&gt;
  <button class="modal-open" id="Constraint_135_3" title="a definition with multiple references" data-urls="#Constraint line 68_8, 79_45, 98_27, 101_6, 102_6, 110_29, 114_8, 121_3, 121_22">Constraint</button>.<span class="cons_Constructor"><span id="CAstProperty_135_14" title="a definition with no references">CAstProperty</span></span> = &lt;<span class="cons_String">@</span>&lt;<a href="#TermOrTermIndex_142_3" id="TermOrTermIndex_135_32" title="a reference to a single-file definition">TermOrTermIndex</a>&gt;<span class="cons_String">.</span>&lt;<a href="#AstProperty_137_3" id="AstProperty_135_50" title="a reference to a single-file definition">AstProperty</a>&gt; &lt;<a href="#AstPropertyOp_139_3" id="AstPropertyOp_135_64" title="a reference to a single-file definition">AstPropertyOp</a>&gt; &lt;<a href="#Term_225_3" id="Term_135_80" title="a reference to a single-file definition">Term</a>&gt;&gt;

  <a href="#AstProperty_135_50" id="AstProperty_137_3" title="a definition with a single reference">AstProperty</a>.<span class="cons_Constructor"><span id="Prop_137_15" title="a definition with no references">Prop</span></span> = <a href="#AstPropertyId_146_3" id="AstPropertyId_137_22" title="a reference to a single-file definition">AstPropertyId</a>

  <a href="#AstPropertyOp_135_64" id="AstPropertyOp_139_3" title="a definition with a single reference">AstPropertyOp</a>.<span class="cons_Constructor"><span id="Set_139_17" title="a definition with no references">Set</span></span> = <span class="cons_Lit">":="</span>
  <a href="#AstPropertyOp_135_64" id="AstPropertyOp_140_3" title="a definition with a single reference">AstPropertyOp</a>.<span class="cons_Constructor"><span id="Add_140_17" title="a definition with no references">Add</span></span> = <span class="cons_Lit">"+="</span>

  <button class="modal-open" id="TermOrTermIndex_142_3" title="a definition with multiple references" data-urls="#TermOrTermIndex line 135_32; ../Deprecated.sdf3/#TermOrTermIndex line 82_38">TermOrTermIndex</button> = <a href="#Var_337_3" id="Var_142_21" title="a reference to a single-file definition">Var</a>

<span class="keyword">lexical syntax</span>

  <a href="#AstPropertyId_137_22" id="AstPropertyId_146_3" title="a definition with a single reference">AstPropertyId</a> = <a href="../Common.sdf3/#ID_7_3" id="ID_146_19" title="a reference to a single-file definition">ID</a>
  <a href="#AstPropertyId_137_22" id="AstPropertyId_147_3" title="a definition with a single reference">AstPropertyId</a> = <a href="#Keyword_47_3" id="Keyword_147_19" title="a reference to a single-file definition">Keyword</a> {<span class="keyword">reject</span>}

  <button class="modal-open" id="Keyword_149_3" title="a definition with multiple references" data-urls="#Keyword line 45_14, 84_18, 147_19, 176_16, 241_16, 322_12, 326_10">Keyword</button> = <span class="cons_Lit">"astId"</span>


/******************************************************************
 * <span class="keyword">Relations</span>                                                      *
 ******************************************************************/

<span class="keyword">context-free syntax</span>

  <a href="#Signature_34_9" id="Signature_158_3" title="a definition with a single reference">Signature</a>.<span class="cons_Constructor"><span id="Relations_158_13" title="a definition with no references">Relations</span></span> = &lt;
    <span class="cons_String">relations</span>
      &lt;{<a href="#RelDecl_163_3" id="RelDecl_160_9" title="a reference to a single-file definition">RelDecl</a> <span class="cons_Lit">"\n"</span>}*&gt;
  &gt; {<span class="keyword">longest-match</span>}

  <button class="modal-open" id="RelDecl_163_3" title="a definition with multiple references" data-urls="#RelDecl line 160_9, 167_21">RelDecl</button>.<span class="cons_Constructor"><span id="RelDecl_163_11" title="a definition with no references">RelDecl</span></span> = &lt;&lt;<a href="#Label_196_3" id="Label_163_23" title="a reference to a single-file definition">Label</a>&gt; <span class="cons_String">:</span> &lt;<a href="#Type_317_3" id="Type_163_33" title="a reference to a single-file definition">Type</a>&gt;&gt;

  <button class="modal-open" id="RelRef_165_3" title="a definition with multiple references" data-urls="#RelRef line 171_32, 263_21; ../Deprecated.sdf3/#RelRef line 58_15, 67_37; ../PreCompiled.sdf3/#RelRef line 64_29; ../Type.sdf3/#RelRef line 65_14">RelRef</button> = <a href="#Label_196_3" id="Label_165_12" title="a reference to a single-file definition">Label</a>

  <a href="#Rule_40_9" id="Rule_167_3" title="a definition with a single reference">Rule</a> = &lt;<span class="cons_String">relation</span> &lt;<a href="#RelDecl_163_3" id="RelDecl_167_21" title="a reference to a single-file definition">RelDecl</a>&gt;&gt;

<span class="keyword">syntax</span>

  <button class="modal-open" id="Constraint_171_3" title="a definition with multiple references" data-urls="#Constraint line 68_8, 79_45, 98_27, 101_6, 102_6, 110_29, 114_8, 121_3, 121_22">Constraint</button><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="CTellRel_171_17" title="a definition with no references">CTellRel</span></span> = <span class="cons_Lit">"!"</span> <a href="#RelRef_165_3" id="RelRef_171_32" title="a reference to a single-file definition">RelRef</a><span class="keyword">-CF</span> <span class="cons_Lit">"["</span> <a href="#CommaTerms_353_3" id="CommaTerms_171_46" title="a reference to a single-file definition">CommaTerms</a><span class="keyword">-CF</span> <span class="cons_Lit">"]"</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">"in"</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="#Term_225_3" id="Term_171_91" title="a reference to a single-file definition">Term</a><span class="keyword">-CF</span>

<span class="keyword">lexical syntax</span>

  <a href="#RelationId_196_17" id="RelationId_175_3" title="a definition with a single reference">RelationId</a> = <a href="../Common.sdf3/#ID_7_3" id="ID_175_16" title="a reference to a single-file definition">ID</a>
  <a href="#RelationId_196_17" id="RelationId_176_3" title="a definition with a single reference">RelationId</a> = <a href="#Keyword_47_3" id="Keyword_176_16" title="a reference to a single-file definition">Keyword</a> {<span class="keyword">reject</span>}

  <button class="modal-open" id="Keyword_178_3" title="a definition with multiple references" data-urls="#Keyword line 45_14, 84_18, 147_19, 176_16, 241_16, 322_12, 326_10">Keyword</button> = <span class="cons_Lit">"relations"</span> | <span class="cons_Lit">"relation"</span> | <span class="cons_Lit">"in"</span>


/******************************************************************
 * <span class="keyword">Scope Graph</span>                                                    *
 ******************************************************************/

<span class="keyword">context-free syntax</span>

  <a href="#Signature_34_9" id="Signature_187_3" title="a definition with a single reference">Signature</a>.<span class="cons_Constructor"><span id="NameResolution_187_13" title="a definition with no references">NameResolution</span></span> = &lt;
    <span class="cons_String">name-resolution</span>
      &lt;{<a href="#ResolutionParam_194_3" id="ResolutionParam_189_9" title="a reference to a single-file definition">ResolutionParam</a> <span class="cons_Lit">"\n"</span>}*&gt;
  &gt; {<span class="keyword">longest-match</span>}

  <span class="layout">// labels</span>

  <a href="#ResolutionParam_189_9" id="ResolutionParam_194_3" title="a definition with a single reference">ResolutionParam</a>.<span class="cons_Constructor"><span id="Labels_194_19" title="a definition with no references">Labels</span></span> = &lt;<span class="cons_String">labels</span> &lt;{<a href="#Label_196_3" id="Label_194_38" title="a reference to a single-file definition">Label</a> <span class="cons_Lit">" "</span>}*&gt;&gt;

  <button class="modal-open" id="Label_196_3" title="a definition with multiple references" data-urls="#Label line 163_23, 165_12, 194_38, 198_17, 208_24, 234_52; ../NoParse.sdf3/#Label line 25_10; ../Schema.sdf3/#Label line 35_52, 49_53, 82_34">Label</button>.<span class="cons_Constructor"><span id="Label_196_9" title="a definition with no references">Label</span></span> = <a href="#RelationId_175_3" id="RelationId_196_17" title="a reference to a single-file definition">RelationId</a>

  <button class="modal-open" id="EdgeRef_198_3" title="a definition with multiple references" data-urls="#EdgeRef line 202_27, 202_39; ../Type.sdf3/#EdgeRef line 66_14">EdgeRef</button>     = <a href="#Label_196_3" id="Label_198_17" title="a reference to a single-file definition">Label</a>
  <button class="modal-open" id="EdgeRef_199_3" title="a definition with multiple references" data-urls="#EdgeRef line 202_27, 202_39; ../Type.sdf3/#EdgeRef line 66_14">EdgeRef</button>.<span class="cons_Constructor"><span id="EOP_199_11" title="a definition with no references">EOP</span></span> = <span class="cons_Lit">"$"</span>

  <button class="modal-open" id="LabelPairs_201_3" title="a definition with multiple references" data-urls="#LabelPairs line 203_25; ../Deprecated.sdf3/#LabelPairs line 19_42, 22_42, 25_55, 52_40">LabelPairs</button>          = &lt;&lt;{<a href="#LabelPair_202_3" id="LabelPair_201_28" title="a reference to a single-file definition">LabelPair</a> <span class="cons_Lit">", "</span>}*&gt;&gt;
  <a href="#LabelPair_201_28" id="LabelPair_202_3" title="a definition with a single reference">LabelPair</a>.<span class="cons_Constructor"><span id="LabelPair_202_13" title="a definition with no references">LabelPair</span></span> = [[<a href="#EdgeRef_198_3" id="EdgeRef_202_27" title="a reference to a single-file definition">EdgeRef</a>] <span class="cons_String">&lt;</span> [<a href="#EdgeRef_198_3" id="EdgeRef_202_39" title="a reference to a single-file definition">EdgeRef</a>]]
  <button class="modal-open" id="LabelOrd_203_3" title="a definition with multiple references" data-urls="#LabelOrd line 266_33; ../Sugar.sdf3/#LabelOrd line 136_27">LabelOrd</button>            = <a href="#LabelPairs_201_3" id="LabelPairs_203_25" title="a reference to a single-file definition">LabelPairs</a>

  <button class="modal-open" id="LabelRE_205_3" title="a definition with multiple references" data-urls="#LabelRE line 209_26, 210_27, 211_26, 211_36, 212_26, 212_38, 213_26, 213_38, 214_27, 218_7, 218_19, 219_5, 220_5, 221_5, 265_36">LabelRE</button>.<span class="cons_Constructor"><span id="Empty_205_11" title="a definition with no references">Empty</span></span>      = &lt;<span class="cons_String">0</span>&gt;
  <button class="modal-open" id="LabelRE_206_3" title="a definition with multiple references" data-urls="#LabelRE line 209_26, 210_27, 211_26, 211_36, 212_26, 212_38, 213_26, 213_38, 214_27, 218_7, 218_19, 219_5, 220_5, 221_5, 265_36">LabelRE</button>.<span class="cons_Constructor"><span id="Epsilon_206_11" title="a definition with no references">Epsilon</span></span>    = &lt;<span class="cons_String">e</span>&gt;
<span class="layout">//LabelRE.Any        = &lt;.&gt;</span>
  <button class="modal-open" id="LabelRE_208_3" title="a definition with multiple references" data-urls="#LabelRE line 209_26, 210_27, 211_26, 211_36, 212_26, 212_38, 213_26, 213_38, 214_27, 218_7, 218_19, 219_5, 220_5, 221_5, 265_36">LabelRE</button>            = <a href="#Label_196_3" id="Label_208_24" title="a reference to a single-file definition">Label</a>
  <button class="modal-open" id="LabelRE_209_3" title="a definition with multiple references" data-urls="#LabelRE line 209_26, 210_27, 211_26, 211_36, 212_26, 212_38, 213_26, 213_38, 214_27, 218_7, 218_19, 219_5, 220_5, 221_5, 265_36">LabelRE</button>.<span class="cons_Constructor"><button class="modal-open" id="Closure_209_11" title="a definition with multiple references" data-urls="#Closure line 218_27; ../Sugar.sdf3/#Closure line 115_27">Closure</button></span>    = &lt;&lt;<a href="#LabelRE_205_3" id="LabelRE_209_26" title="a reference to a single-file definition">LabelRE</a>&gt;<span class="cons_String">*</span>&gt;
  <button class="modal-open" id="LabelRE_210_3" title="a definition with multiple references" data-urls="#LabelRE line 209_26, 210_27, 211_26, 211_36, 212_26, 212_38, 213_26, 213_38, 214_27, 218_7, 218_19, 219_5, 220_5, 221_5, 265_36">LabelRE</button>.<span class="cons_Constructor"><button class="modal-open" id="Neg_210_11" title="a definition with multiple references" data-urls="#Neg line 218_15; ../Sugar.sdf3/#Neg line 115_15">Neg</button></span>        = &lt;<span class="cons_String">~</span>&lt;<a href="#LabelRE_205_3" id="LabelRE_210_27" title="a reference to a single-file definition">LabelRE</a>&gt;&gt;
  <button class="modal-open" id="LabelRE_211_3" title="a definition with multiple references" data-urls="#LabelRE line 209_26, 210_27, 211_26, 211_36, 212_26, 212_38, 213_26, 213_38, 214_27, 218_7, 218_19, 219_5, 220_5, 221_5, 265_36">LabelRE</button>.<span class="cons_Constructor"><button class="modal-open" id="Concat_211_11" title="a definition with multiple references" data-urls="#Concat line 219_13; ../Sugar.sdf3/#Concat line 116_15">Concat</button></span>     = &lt;&lt;<a href="#LabelRE_205_3" id="LabelRE_211_26" title="a reference to a single-file definition">LabelRE</a>&gt; &lt;<a href="#LabelRE_205_3" id="LabelRE_211_36" title="a reference to a single-file definition">LabelRE</a>&gt;&gt;     {<span class="keyword">right</span>}
  <button class="modal-open" id="LabelRE_212_3" title="a definition with multiple references" data-urls="#LabelRE line 209_26, 210_27, 211_26, 211_36, 212_26, 212_38, 213_26, 213_38, 214_27, 218_7, 218_19, 219_5, 220_5, 221_5, 265_36">LabelRE</button>.<span class="cons_Constructor"><button class="modal-open" id="And_212_11" title="a definition with multiple references" data-urls="#And line 220_13; ../Sugar.sdf3/#And line 116_30">And</button></span>        = &lt;&lt;<a href="#LabelRE_205_3" id="LabelRE_212_26" title="a reference to a single-file definition">LabelRE</a>&gt; <span class="cons_String">&amp;</span> &lt;<a href="#LabelRE_205_3" id="LabelRE_212_38" title="a reference to a single-file definition">LabelRE</a>&gt;&gt;   {<span class="keyword">left</span>}
  <button class="modal-open" id="LabelRE_213_3" title="a definition with multiple references" data-urls="#LabelRE line 209_26, 210_27, 211_26, 211_36, 212_26, 212_38, 213_26, 213_38, 214_27, 218_7, 218_19, 219_5, 220_5, 221_5, 265_36">LabelRE</button>.<span class="cons_Constructor"><button class="modal-open" id="Or_213_11" title="a definition with multiple references" data-urls="#Or line 221_13; ../Sugar.sdf3/#Or line 116_42">Or</button></span>         = &lt;&lt;<a href="#LabelRE_205_3" id="LabelRE_213_26" title="a reference to a single-file definition">LabelRE</a>&gt; <span class="cons_String">|</span> &lt;<a href="#LabelRE_205_3" id="LabelRE_213_38" title="a reference to a single-file definition">LabelRE</a>&gt;&gt;   {<span class="keyword">left</span>}
  <button class="modal-open" id="LabelRE_214_3" title="a definition with multiple references" data-urls="#LabelRE line 209_26, 210_27, 211_26, 211_36, 212_26, 212_38, 213_26, 213_38, 214_27, 218_7, 218_19, 219_5, 220_5, 221_5, 265_36">LabelRE</button>            = &lt;<span class="cons_String">(</span>&lt;<a href="#LabelRE_205_3" id="LabelRE_214_27" title="a reference to a single-file definition">LabelRE</a>&gt;<span class="cons_String">)</span>&gt;             {<span class="keyword">bracket</span>}

<span class="keyword">context-free priorities</span>

    { <a href="#LabelRE_205_3" id="LabelRE_218_7" title="a reference to a single-file definition">LabelRE</a>.<span class="cons_Constructor"><a href="#Neg_210_11" id="Neg_218_15" title="a reference to a single-file definition">Neg</a></span> <a href="#LabelRE_205_3" id="LabelRE_218_19" title="a reference to a single-file definition">LabelRE</a>.<span class="cons_Constructor"><a href="#Closure_209_11" id="Closure_218_27" title="a reference to a single-file definition">Closure</a></span> }
  &gt; <a href="#LabelRE_205_3" id="LabelRE_219_5" title="a reference to a single-file definition">LabelRE</a>.<span class="cons_Constructor"><a href="#Concat_211_11" id="Concat_219_13" title="a reference to a single-file definition">Concat</a></span>
  &gt; <a href="#LabelRE_205_3" id="LabelRE_220_5" title="a reference to a single-file definition">LabelRE</a>.<span class="cons_Constructor"><a href="#And_212_11" id="And_220_13" title="a reference to a single-file definition">And</a></span>
  &gt; <a href="#LabelRE_205_3" id="LabelRE_221_5" title="a reference to a single-file definition">LabelRE</a>.<span class="cons_Constructor"><a href="#Or_213_11" id="Or_221_13" title="a reference to a single-file definition">Or</a></span>

<span class="keyword">context-free syntax</span>

  <button class="modal-open" id="Term_225_3" title="a definition with multiple references" data-urls="#Term line 75_34, 77_36, 79_28, 107_27, 107_37, 108_27, 108_37, 134_37, 134_45, 135_80, 171_91, 231_54, 232_53, 232_87, 232_121, 234_29, 234_77, 259_11, 259_22, 345_25, 346_25, 346_39, 348_24, 348_33, 349_29, 350_23, 351_24, 353_19, 354_19, 358_5, 359_5, 437_32">Term</button> = <a href="#Path_227_3" id="Path_225_10" title="a reference to a single-file definition">Path</a>

  <a href="#Path_225_10" id="Path_227_3" title="a definition with a single reference">Path</a> = <a href="#PathLit_231_3" id="PathLit_227_10" title="a reference to a single-file definition">PathLit</a>

<span class="keyword">syntax</span>

  <a href="#PathLit_227_10" id="PathLit_231_3" title="a definition with a single reference">PathLit</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="PathEmpty_231_14" title="a definition with no references">PathEmpty</span></span> = <span class="cons_Lit">"_PathEmpty"</span> <span class="cons_Lit">"("</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="#Term_225_3" id="Term_231_54" title="a reference to a single-file definition">Term</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">")"</span>
  <a href="#PathLit_227_10" id="PathLit_232_3" title="a definition with a single reference">PathLit</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="PathStep_232_14" title="a definition with no references">PathStep</span></span>  = <span class="cons_Lit">"_PathStep"</span> <span class="cons_Lit">"("</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="#Term_225_3" id="Term_232_53" title="a reference to a single-file definition">Term</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">","</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="#Term_225_3" id="Term_232_87" title="a reference to a single-file definition">Term</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">","</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="#Term_225_3" id="Term_232_121" title="a reference to a single-file definition">Term</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">")"</span>

  <button class="modal-open" id="Constraint_234_3" title="a definition with multiple references" data-urls="#Constraint line 68_8, 79_45, 98_27, 101_6, 102_6, 110_29, 114_8, 121_3, 121_22">Constraint</button><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="CTellEdge_234_17" title="a definition with no references">CTellEdge</span></span> = <a href="#Term_225_3" id="Term_234_29" title="a reference to a single-file definition">Term</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">"-"</span> <a href="#Label_196_3" id="Label_234_52" title="a reference to a single-file definition">Label</a><span class="keyword">-CF</span> <span class="cons_Lit">"-&gt;"</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="#Term_225_3" id="Term_234_77" title="a reference to a single-file definition">Term</a><span class="keyword">-CF</span>

<span class="keyword">lexical syntax</span>

  <button class="modal-open" id="NamespaceId_238_3" title="a definition with multiple references" data-urls="../Deprecated.sdf3/#NamespaceId line 39_21, 44_45, 85_36">NamespaceId</button> = <a href="../Common.sdf3/#UCID_8_3" id="UCID_238_17" title="a reference to a single-file definition">UCID</a>

  <a href="#RelationId_196_17" id="RelationId_240_3" title="a definition with a single reference">RelationId</a> = <span class="cons_Lit">"e"</span> {<span class="keyword">reject</span>}        <span class="layout">// ambiguous with empty regex</span>
  <a href="#RelationId_196_17" id="RelationId_241_3" title="a definition with a single reference">RelationId</a> = <a href="#Keyword_47_3" id="Keyword_241_16" title="a reference to a single-file definition">Keyword</a> {<span class="keyword">reject</span>}    <span class="layout">// ambiguous with signature keywords</span>

  <button class="modal-open" id="Keyword_243_3" title="a definition with multiple references" data-urls="#Keyword line 45_14, 84_18, 147_19, 176_16, 241_16, 322_12, 326_10">Keyword</button> = <span class="cons_Lit">"namespaces"</span> | <span class="cons_Lit">"name-resolution"</span> | <span class="cons_Lit">"labels"</span> | <span class="cons_Lit">"namespace"</span>


/******************************************************************
 * <span class="keyword">Resolve</span> &amp; <span class="keyword">Query</span>
 ******************************************************************/

<span class="keyword">context-free syntax</span>

  <button class="modal-open" id="Constraint_252_3" title="a definition with multiple references" data-urls="#Constraint line 68_8, 79_45, 98_27, 101_6, 102_6, 110_29, 114_8, 121_3, 121_22">Constraint</button> = <a href="#CResolveQuery_254_3" id="CResolveQuery_252_16" title="a reference to a single-file definition">CResolveQuery</a>

  <button class="modal-open" id="CResolveQuery_254_3" title="a definition with multiple references" data-urls="#CResolveQuery line 252_16; ../PreCompiled.sdf3/#CResolveQuery line 36_15">CResolveQuery</button>.<span class="cons_Constructor"><span id="CResolveQuery_254_17" title="a definition with no references">CResolveQuery</span></span> = [
    <span class="cons_String">query</span> [<a href="#QueryTarget_262_3" id="QueryTarget_255_12" title="a reference to a single-file definition">QueryTarget</a>]
     [<a href="#QueryFilter_265_3" id="QueryFilter_256_7" title="a reference to a single-file definition">QueryFilter</a>]
     [<a href="#QueryMin_266_3" id="QueryMin_257_7" title="a reference to a single-file definition">QueryMin</a>]
     [<a href="#QueryProject_267_3" id="QueryProject_258_7" title="a reference to a single-file definition">QueryProject</a>]
      <span class="cons_String">in</span> [<a href="#Term_225_3" id="Term_259_11" title="a reference to a single-file definition">Term</a>] <span class="cons_String">|-&gt;</span> [<a href="#Term_225_3" id="Term_259_22" title="a reference to a single-file definition">Term</a>][<a href="#Message_418_3" id="Message_259_28" title="a reference to a single-file definition">Message</a>]
   ]

  <a href="#QueryTarget_255_12" id="QueryTarget_262_3" title="a definition with a single reference">QueryTarget</a>.<span class="cons_Constructor"><span id="EOP_262_15" title="a definition with no references">EOP</span></span> = <span class="cons_Lit">"()"</span>
  <a href="#QueryTarget_255_12" id="QueryTarget_263_3" title="a definition with a single reference">QueryTarget</a>     = <a href="#RelRef_165_3" id="RelRef_263_21" title="a reference to a single-file definition">RelRef</a>

  <a href="#QueryFilter_256_7" id="QueryFilter_265_3" title="a definition with a single reference">QueryFilter</a>.<span class="cons_Constructor"><span id="Filter_265_15" title="a definition with no references">Filter</span></span>   = &lt; <span class="cons_String">filter</span> &lt;<a href="#LabelRE_205_3" id="LabelRE_265_36" title="a reference to a single-file definition">LabelRE</a>&gt; <span class="cons_String">and</span> &lt;<a href="#HoConstraint_79_3" id="HoConstraint_265_50" title="a reference to a single-file definition">HoConstraint</a>&gt;&gt;
  <a href="#QueryMin_257_7" id="QueryMin_266_3" title="a definition with a single reference">QueryMin</a>.<span class="cons_Constructor"><span id="Min_266_12" title="a definition with no references">Min</span></span>         = &lt; <span class="cons_String">min</span> &lt;<a href="#LabelOrd_203_3" id="LabelOrd_266_33" title="a reference to a single-file definition">LabelOrd</a>&gt; <span class="cons_String">and</span> &lt;<a href="#HoConstraint_79_3" id="HoConstraint_266_48" title="a reference to a single-file definition">HoConstraint</a>&gt;&gt;
  <a href="#QueryProject_258_7" id="QueryProject_267_3" title="a definition with a single reference">QueryProject</a>.<span class="cons_Constructor"><span id="Project_267_16" title="a definition with no references">Project</span></span> = &lt; <span class="cons_String">project</span> &lt;<a href="#ProjectTarget_269_3" id="ProjectTarget_267_37" title="a reference to a single-file definition">ProjectTarget</a>&gt;&gt;

  <a href="#ProjectTarget_267_37" id="ProjectTarget_269_3" title="a definition with a single reference">ProjectTarget</a>.<span class="cons_Constructor"><span id="PFull_269_17" title="a definition with no references">PFull</span></span>       = &lt;<span class="cons_String">*</span>&gt;
  <a href="#ProjectTarget_267_37" id="ProjectTarget_270_3" title="a definition with a single reference">ProjectTarget</a>.<span class="cons_Constructor"><span id="PTargetData_270_17" title="a definition with no references">PTargetData</span></span> = &lt;<span class="cons_String">dst,</span> <span class="cons_String">$</span>&gt;
  <a href="#ProjectTarget_267_37" id="ProjectTarget_271_3" title="a definition with a single reference">ProjectTarget</a>.<span class="cons_Constructor"><span id="PData_271_17" title="a definition with no references">PData</span></span>       = &lt;<span class="cons_String">$</span>&gt;

<span class="keyword">lexical syntax</span>

  <button class="modal-open" id="Keyword_275_3" title="a definition with multiple references" data-urls="#Keyword line 45_14, 84_18, 147_19, 176_16, 241_16, 322_12, 326_10">Keyword</button> = <span class="cons_Lit">"query"</span> | <span class="cons_Lit">"in"</span> | <span class="cons_Lit">"filter"</span> | <span class="cons_Lit">"min"</span> | <span class="cons_Lit">"project"</span> | <span class="cons_Lit">"and"</span>


/******************************************************************
 * <span class="keyword">Sorts</span> &amp; <span class="keyword">Constructors</span>                                           *
 ******************************************************************/

<span class="keyword">context-free syntax</span>

  <a href="#Signature_34_9" id="Signature_284_3" title="a definition with a single reference">Signature</a>.<span class="cons_Constructor"><span id="Sorts_284_13" title="a definition with no references">Sorts</span></span> = &lt;
    <span class="cons_String">sorts</span>
      &lt;{<a href="#SortDecl_294_3" id="SortDecl_286_9" title="a reference to a single-file definition">SortDecl</a> <span class="cons_Lit">"\n"</span>}*&gt;
  &gt; {<span class="keyword">longest-match</span>}

  <a href="#Signature_34_9" id="Signature_289_3" title="a definition with a single reference">Signature</a>.<span class="cons_Constructor"><span id="Constructors_289_13" title="a definition with no references">Constructors</span></span> = &lt;
    <span class="cons_String">constructors</span>
      &lt;{<a href="#OpDecl_312_3" id="OpDecl_291_9" title="a reference to a single-file definition">OpDecl</a> <span class="cons_Lit">"\n"</span>}*&gt;
  &gt; {<span class="keyword">longest-match</span>}

  <a href="#SortDecl_286_9" id="SortDecl_294_3" title="a definition with a single reference">SortDecl</a>.<span class="cons_Constructor"><span id="SortDecl_294_12" title="a definition with no references">SortDecl</span></span>  = <a href="#SortId_321_3" id="SortId_294_24" title="a reference to a single-file definition">SortId</a>
  <a href="#SortDecl_286_9" id="SortDecl_295_3" title="a definition with a single reference">SortDecl</a>.<span class="cons_Constructor"><span id="SortAlias_295_12" title="a definition with no references">SortAlias</span></span> = &lt;&lt;<a href="#SortId_321_3" id="SortId_295_26" title="a reference to a single-file definition">SortId</a>&gt; <span class="cons_String">=</span> &lt;<a href="#SortRef_299_3" id="SortRef_295_37" title="a reference to a single-file definition">SortRef</a>&gt;&gt;

  <button class="modal-open" id="Sort_297_3" title="a definition with multiple references" data-urls="#Sort line 299_28, 314_20, 315_44">Sort</button>.<span class="cons_Constructor"><span id="SimpleSort_297_8" title="a definition with no references">SimpleSort</span></span> = <a href="#SortId_321_3" id="SortId_297_21" title="a reference to a single-file definition">SortId</a>

  <button class="modal-open" id="SortRef_299_3" title="a definition with multiple references" data-urls="#SortRef line 295_37, 300_35, 302_31, 302_44, 310_31, 315_23, 317_24, 350_32; ../Deprecated.sdf3/#SortRef line 39_38; ../Sugar.sdf3/#SortRef line 152_24, 152_45">SortRef</button>                = <a href="#Sort_297_3" id="Sort_299_28" title="a reference to a single-file definition">Sort</a>
  <button class="modal-open" id="SortRef_300_3" title="a definition with multiple references" data-urls="#SortRef line 295_37, 300_35, 302_31, 302_44, 310_31, 315_23, 317_24, 350_32; ../Deprecated.sdf3/#SortRef line 39_38; ../Sugar.sdf3/#SortRef line 152_24, 152_45">SortRef</button>.<span class="cons_Constructor"><span id="ListSort_300_11" title="a definition with no references">ListSort</span></span>       = &lt;<span class="cons_String">list(</span>&lt;<a href="#SortRef_299_3" id="SortRef_300_35" title="a reference to a single-file definition">SortRef</a>&gt;<span class="cons_String">)</span>&gt;
  <button class="modal-open" id="SortRef_301_3" title="a definition with multiple references" data-urls="#SortRef line 295_37, 300_35, 302_31, 302_44, 310_31, 315_23, 317_24, 350_32; ../Deprecated.sdf3/#SortRef line 39_38; ../Sugar.sdf3/#SortRef line 152_24, 152_45">SortRef</button>.<span class="cons_Constructor"><span id="Tuple0Sort_301_11" title="a definition with no references">Tuple0Sort</span></span>     = &lt;<span class="cons_String">(</span> <span class="cons_String">)</span>&gt;
  <button class="modal-open" id="SortRef_302_3" title="a definition with multiple references" data-urls="#SortRef line 295_37, 300_35, 302_31, 302_44, 310_31, 315_23, 317_24, 350_32; ../Deprecated.sdf3/#SortRef line 39_38; ../Sugar.sdf3/#SortRef line 152_24, 152_45">SortRef</button>.<span class="cons_Constructor"><span id="TupleNSort_302_11" title="a definition with no references">TupleNSort</span></span>     = &lt;<span class="cons_String">(</span>&lt;<a href="#SortRef_299_3" id="SortRef_302_31" title="a reference to a single-file definition">SortRef</a>&gt; <span class="cons_String">*</span> &lt;{<a href="#SortRef_299_3" id="SortRef_302_44" title="a reference to a single-file definition">SortRef</a> <span class="cons_Lit">" * "</span>}+&gt;<span class="cons_String">)</span>&gt;
  <button class="modal-open" id="SortRef_303_3" title="a definition with multiple references" data-urls="#SortRef line 295_37, 300_35, 302_31, 302_44, 310_31, 315_23, 317_24, 350_32; ../Deprecated.sdf3/#SortRef line 39_38; ../Sugar.sdf3/#SortRef line 152_24, 152_45">SortRef</button>.<span class="cons_Constructor"><span id="IntSort_303_11" title="a definition with no references">IntSort</span></span>        = <span class="cons_Lit">"int"</span>
  <button class="modal-open" id="SortRef_304_3" title="a definition with multiple references" data-urls="#SortRef line 295_37, 300_35, 302_31, 302_44, 310_31, 315_23, 317_24, 350_32; ../Deprecated.sdf3/#SortRef line 39_38; ../Sugar.sdf3/#SortRef line 152_24, 152_45">SortRef</button>.<span class="cons_Constructor"><span id="StringSort_304_11" title="a definition with no references">StringSort</span></span>     = <span class="cons_Lit">"string"</span>
  <button class="modal-open" id="SortRef_305_3" title="a definition with multiple references" data-urls="#SortRef line 295_37, 300_35, 302_31, 302_44, 310_31, 315_23, 317_24, 350_32; ../Deprecated.sdf3/#SortRef line 39_38; ../Sugar.sdf3/#SortRef line 152_24, 152_45">SortRef</button>.<span class="cons_Constructor"><span id="PathSort_305_11" title="a definition with no references">PathSort</span></span>       = <span class="cons_Lit">"path"</span>
  <button class="modal-open" id="SortRef_306_3" title="a definition with multiple references" data-urls="#SortRef line 295_37, 300_35, 302_31, 302_44, 310_31, 315_23, 317_24, 350_32; ../Deprecated.sdf3/#SortRef line 39_38; ../Sugar.sdf3/#SortRef line 152_24, 152_45">SortRef</button>.<span class="cons_Constructor"><span id="LabelSort_306_11" title="a definition with no references">LabelSort</span></span>      = <span class="cons_Lit">"label"</span>
  <button class="modal-open" id="SortRef_307_3" title="a definition with multiple references" data-urls="#SortRef line 295_37, 300_35, 302_31, 302_44, 310_31, 315_23, 317_24, 350_32; ../Deprecated.sdf3/#SortRef line 39_38; ../Sugar.sdf3/#SortRef line 152_24, 152_45">SortRef</button>.<span class="cons_Constructor"><span id="OccurrenceSort_307_11" title="a definition with no references">OccurrenceSort</span></span> = <span class="cons_Lit">"occurrence"</span>
  <button class="modal-open" id="SortRef_308_3" title="a definition with multiple references" data-urls="#SortRef line 295_37, 300_35, 302_31, 302_44, 310_31, 315_23, 317_24, 350_32; ../Deprecated.sdf3/#SortRef line 39_38; ../Sugar.sdf3/#SortRef line 152_24, 152_45">SortRef</button>.<span class="cons_Constructor"><span id="ScopeSort_308_11" title="a definition with no references">ScopeSort</span></span>      = <span class="cons_Lit">"scope"</span>
  <button class="modal-open" id="SortRef_309_3" title="a definition with multiple references" data-urls="#SortRef line 295_37, 300_35, 302_31, 302_44, 310_31, 315_23, 317_24, 350_32; ../Deprecated.sdf3/#SortRef line 39_38; ../Sugar.sdf3/#SortRef line 152_24, 152_45">SortRef</button>.<span class="cons_Constructor"><span id="AstIdSort_309_11" title="a definition with no references">AstIdSort</span></span>      = <span class="cons_Lit">"astId"</span>
  <button class="modal-open" id="SortRef_310_3" title="a definition with multiple references" data-urls="#SortRef line 295_37, 300_35, 302_31, 302_44, 310_31, 315_23, 317_24, 350_32; ../Deprecated.sdf3/#SortRef line 39_38; ../Sugar.sdf3/#SortRef line 152_24, 152_45">SortRef</button>                = &lt;<span class="cons_String">(</span>&lt;<a href="#SortRef_299_3" id="SortRef_310_31" title="a reference to a single-file definition">SortRef</a>&gt;<span class="cons_String">)</span>&gt; {<span class="keyword">bracket</span>}

  <a href="#OpDecl_291_9" id="OpDecl_312_3" title="a definition with a single reference">OpDecl</a>.<span class="cons_Constructor"><span id="OpDecl_312_10" title="a definition with no references">OpDecl</span></span>  = &lt;&lt;<a href="#OpId_325_3" id="OpId_312_22" title="a reference to a single-file definition">OpId</a>&gt; <span class="cons_String">:</span> &lt;<a href="#OpSort_314_3" id="OpSort_312_31" title="a reference to a single-file definition">OpSort</a>&gt;&gt;

  <a href="#OpSort_312_31" id="OpSort_314_3" title="a definition with a single reference">OpSort</a>.<span class="cons_Constructor"><span id="ConstOp_314_10" title="a definition with no references">ConstOp</span></span> = <a href="#Sort_297_3" id="Sort_314_20" title="a reference to a single-file definition">Sort</a>
  <a href="#OpSort_312_31" id="OpSort_315_3" title="a definition with a single reference">OpSort</a>.<span class="cons_Constructor"><span id="ArrowOp_315_10" title="a definition with no references">ArrowOp</span></span> = [[{<a href="#SortRef_299_3" id="SortRef_315_23" title="a reference to a single-file definition">SortRef</a> <span class="cons_Lit">" * "</span>}+] <span class="cons_String">-&gt;</span> [<a href="#Sort_297_3" id="Sort_315_44" title="a reference to a single-file definition">Sort</a>]]

  <button class="modal-open" id="Type_317_3" title="a definition with multiple references" data-urls="#Type line 61_47, 163_33">Type</button>.<span class="cons_Constructor"><span id="SimpleType_317_8" title="a definition with no references">SimpleType</span></span> = [[{<a href="#SortRef_299_3" id="SortRef_317_24" title="a reference to a single-file definition">SortRef</a> <span class="cons_Lit">" * "</span>}*]]

<span class="keyword">lexical syntax</span>

  <button class="modal-open" id="SortId_321_3" title="a definition with multiple references" data-urls="#SortId line 294_24, 295_26, 297_21; ../Schema.sdf3/#SortId line 81_34">SortId</button> = <a href="../Common.sdf3/#STRID_13_3" id="STRID_321_12" title="a reference to a single-file definition">STRID</a>
  <button class="modal-open" id="SortId_322_3" title="a definition with multiple references" data-urls="#SortId line 294_24, 295_26, 297_21; ../Schema.sdf3/#SortId line 81_34">SortId</button> = <a href="#Keyword_47_3" id="Keyword_322_12" title="a reference to a single-file definition">Keyword</a> {<span class="keyword">reject</span>}
  <button class="modal-open" id="SortId_323_3" title="a definition with multiple references" data-urls="#SortId line 294_24, 295_26, 297_21; ../Schema.sdf3/#SortId line 81_34">SortId</button> = <span class="cons_Lit">"list"</span> | <span class="cons_Lit">"int"</span> | <span class="cons_Lit">"string"</span> | <span class="cons_Lit">"occurrence"</span> | <span class="cons_Lit">"scope"</span> | <span class="cons_Lit">"path"</span> | <span class="cons_Lit">"label"</span> | <span class="cons_Lit">"astId"</span> {<span class="keyword">reject</span>}

  <button class="modal-open" id="OpId_325_3" title="a definition with multiple references" data-urls="#OpId line 312_22, 363_24">OpId</button> = <a href="../Common.sdf3/#STRID_13_3" id="STRID_325_10" title="a reference to a single-file definition">STRID</a>
  <button class="modal-open" id="OpId_326_3" title="a definition with multiple references" data-urls="#OpId line 312_22, 363_24">OpId</button> = <a href="#Keyword_47_3" id="Keyword_326_10" title="a reference to a single-file definition">Keyword</a> {<span class="keyword">reject</span>}

  <button class="modal-open" id="Keyword_328_3" title="a definition with multiple references" data-urls="#Keyword line 45_14, 84_18, 147_19, 176_16, 241_16, 322_12, 326_10">Keyword</button> = <span class="cons_Lit">"sorts"</span> | <span class="cons_Lit">"constructors"</span>


/******************************************************************
 * <span class="keyword">Terms</span>                                                          *
 ******************************************************************/

<span class="keyword">context-free syntax</span>

  <button class="modal-open" id="Var_337_3" title="a definition with multiple references" data-urls="#Var line 105_31, 113_8, 142_21, 342_21, 349_23, 396_18, 430_35; ../Deprecated.sdf3/#Var line 72_23; ../Schema.sdf3/#Var line 76_34, 79_34; ../../test/Result.sdf3/#Var line 50_18">Var</button>.<span class="cons_Constructor"><span id="Var_337_7" title="a definition with no references">Var</span></span> = <a href="../Common.sdf3/#VARID_10_3" id="VARID_337_13" title="a reference to a single-file definition">VARID</a>
  <button class="modal-open" id="Var_338_3" title="a definition with multiple references" data-urls="#Var line 105_31, 113_8, 142_21, 342_21, 349_23, 396_18, 430_35; ../Deprecated.sdf3/#Var line 72_23; ../Schema.sdf3/#Var line 76_34, 79_34; ../../test/Result.sdf3/#Var line 50_18">Var</button>.<span class="cons_Constructor"><span id="Wld_338_7" title="a definition with no references">Wld</span></span> = &lt;<span class="cons_String">_</span>&gt;

  <button class="modal-open" id="Int_340_3" title="a definition with multiple references" data-urls="#Int line 343_21, 395_18">Int</button>.<span class="cons_Constructor"><span id="Int_340_7" title="a definition with no references">Int</span></span> = <a href="../Common.sdf3/#INT_5_3" id="INT_340_13" title="a reference to a single-file definition">INT</a>

  <button class="modal-open" id="Term_342_3" title="a definition with multiple references" data-urls="#Term line 75_34, 77_36, 79_28, 107_27, 107_37, 108_27, 108_37, 134_37, 134_45, 135_80, 171_91, 231_54, 232_53, 232_87, 232_121, 234_29, 234_77, 259_11, 259_22, 345_25, 346_25, 346_39, 348_24, 348_33, 349_29, 350_23, 351_24, 353_19, 354_19, 358_5, 359_5, 437_32">Term</button>            = <a href="#Var_337_3" id="Var_342_21" title="a reference to a single-file definition">Var</a>
  <button class="modal-open" id="Term_343_3" title="a definition with multiple references" data-urls="#Term line 75_34, 77_36, 79_28, 107_27, 107_37, 108_27, 108_37, 134_37, 134_45, 135_80, 171_91, 231_54, 232_53, 232_87, 232_121, 234_29, 234_77, 259_11, 259_22, 345_25, 346_25, 346_39, 348_24, 348_33, 349_29, 350_23, 351_24, 353_19, 354_19, 358_5, 359_5, 437_32">Term</button>            = <a href="#Int_340_3" id="Int_343_21" title="a reference to a single-file definition">Int</a>
  <button class="modal-open" id="Term_344_3" title="a definition with multiple references" data-urls="#Term line 75_34, 77_36, 79_28, 107_27, 107_37, 108_27, 108_37, 134_37, 134_45, 135_80, 171_91, 231_54, 232_53, 232_87, 232_121, 234_29, 234_77, 259_11, 259_22, 345_25, 346_25, 346_39, 348_24, 348_33, 349_29, 350_23, 351_24, 353_19, 354_19, 358_5, 359_5, 437_32">Term</button>            = <a href="#Str_365_3" id="Str_344_21" title="a reference to a single-file definition">Str</a>
  <button class="modal-open" id="Term_345_3" title="a definition with multiple references" data-urls="#Term line 75_34, 77_36, 79_28, 107_27, 107_37, 108_27, 108_37, 134_37, 134_45, 135_80, 171_91, 231_54, 232_53, 232_87, 232_121, 234_29, 234_77, 259_11, 259_22, 345_25, 346_25, 346_39, 348_24, 348_33, 349_29, 350_23, 351_24, 353_19, 354_19, 358_5, 359_5, 437_32">Term</button>.<span class="cons_Constructor"><span id="List_345_8" title="a definition with no references">List</span></span>       = &lt;<span class="cons_String">[</span>&lt;{<a href="#Term_225_3" id="Term_345_25" title="a reference to a single-file definition">Term</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">]</span>&gt;
  <button class="modal-open" id="Term_346_3" title="a definition with multiple references" data-urls="#Term line 75_34, 77_36, 79_28, 107_27, 107_37, 108_27, 108_37, 134_37, 134_45, 135_80, 171_91, 231_54, 232_53, 232_87, 232_121, 234_29, 234_77, 259_11, 259_22, 345_25, 346_25, 346_39, 348_24, 348_33, 349_29, 350_23, 351_24, 353_19, 354_19, 358_5, 359_5, 437_32">Term</button>.<span class="cons_Constructor"><span id="ListTail_346_8" title="a definition with no references">ListTail</span></span>   = &lt;<span class="cons_String">[</span>&lt;{<a href="#Term_225_3" id="Term_346_25" title="a reference to a single-file definition">Term</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">|</span>&lt;<a href="#Term_225_3" id="Term_346_39" title="a reference to a single-file definition">Term</a>&gt;<span class="cons_String">]</span>&gt;
  <button class="modal-open" id="Term_347_3" title="a definition with multiple references" data-urls="#Term line 75_34, 77_36, 79_28, 107_27, 107_37, 108_27, 108_37, 134_37, 134_45, 135_80, 171_91, 231_54, 232_53, 232_87, 232_121, 234_29, 234_77, 259_11, 259_22, 345_25, 346_25, 346_39, 348_24, 348_33, 349_29, 350_23, 351_24, 353_19, 354_19, 358_5, 359_5, 437_32">Term</button>.<span class="cons_Constructor"><span id="Tuple0_347_8" title="a definition with no references">Tuple0</span></span>     = &lt;<span class="cons_String">(</span> <span class="cons_String">)</span>&gt;
  <button class="modal-open" id="Term_348_3" title="a definition with multiple references" data-urls="#Term line 75_34, 77_36, 79_28, 107_27, 107_37, 108_27, 108_37, 134_37, 134_45, 135_80, 171_91, 231_54, 232_53, 232_87, 232_121, 234_29, 234_77, 259_11, 259_22, 345_25, 346_25, 346_39, 348_24, 348_33, 349_29, 350_23, 351_24, 353_19, 354_19, 358_5, 359_5, 437_32">Term</button>.<span class="cons_Constructor"><span id="TupleN_348_8" title="a definition with no references">TupleN</span></span>     = &lt;<span class="cons_String">(</span>&lt;<a href="#Term_225_3" id="Term_348_24" title="a reference to a single-file definition">Term</a>&gt;<span class="cons_String">,</span> &lt;{<a href="#Term_225_3" id="Term_348_33" title="a reference to a single-file definition">Term</a> <span class="cons_Lit">", "</span>}+&gt;<span class="cons_String">)</span>&gt;
  <button class="modal-open" id="Term_349_3" title="a definition with multiple references" data-urls="#Term line 75_34, 77_36, 79_28, 107_27, 107_37, 108_27, 108_37, 134_37, 134_45, 135_80, 171_91, 231_54, 232_53, 232_87, 232_121, 234_29, 234_77, 259_11, 259_22, 345_25, 346_25, 346_39, 348_24, 348_33, 349_29, 350_23, 351_24, 353_19, 354_19, 358_5, 359_5, 437_32">Term</button>.<span class="cons_Constructor"><a href="#As_358_10" id="As_349_8" title="a definition with a single reference">As</a></span>         = &lt;&lt;<a href="#Var_337_3" id="Var_349_23" title="a reference to a single-file definition">Var</a>&gt;<span class="cons_String">@</span>&lt;<a href="#Term_225_3" id="Term_349_29" title="a reference to a single-file definition">Term</a>&gt;&gt;
  <button class="modal-open" id="Term_350_3" title="a definition with multiple references" data-urls="#Term line 75_34, 77_36, 79_28, 107_27, 107_37, 108_27, 108_37, 134_37, 134_45, 135_80, 171_91, 231_54, 232_53, 232_87, 232_121, 234_29, 234_77, 259_11, 259_22, 345_25, 346_25, 346_39, 348_24, 348_33, 349_29, 350_23, 351_24, 353_19, 354_19, 358_5, 359_5, 437_32">Term</button>.<span class="cons_Constructor"><a href="#Ascribe_359_10" id="Ascribe_350_8" title="a definition with a single reference">Ascribe</a></span>    = &lt;&lt;<a href="#Term_225_3" id="Term_350_23" title="a reference to a single-file definition">Term</a>&gt; <span class="cons_String">:</span> &lt;<a href="#SortRef_299_3" id="SortRef_350_32" title="a reference to a single-file definition">SortRef</a>&gt;&gt;
  <button class="modal-open" id="Term_351_3" title="a definition with multiple references" data-urls="#Term line 75_34, 77_36, 79_28, 107_27, 107_37, 108_27, 108_37, 134_37, 134_45, 135_80, 171_91, 231_54, 232_53, 232_87, 232_121, 234_29, 234_77, 259_11, 259_22, 345_25, 346_25, 346_39, 348_24, 348_33, 349_29, 350_23, 351_24, 353_19, 354_19, 358_5, 359_5, 437_32">Term</button>            = &lt;<span class="cons_String">(</span>&lt;<a href="#Term_225_3" id="Term_351_24" title="a reference to a single-file definition">Term</a>&gt;<span class="cons_String">)</span>&gt; {<span class="keyword">bracket</span>}

  <button class="modal-open" id="CommaTerms_353_3" title="a definition with multiple references" data-urls="#CommaTerms line 171_46, 363_48; ../Sugar.sdf3/#CommaTerms line 53_48, 94_46, 96_51">CommaTerms</button> = &lt;&lt;{<a href="#Term_225_3" id="Term_353_19" title="a reference to a single-file definition">Term</a> <span class="cons_Lit">", "</span>}*&gt;&gt;
  <span id="SpaceTerms_354_3" title="a definition with no references">SpaceTerms</span> = &lt;&lt;{<a href="#Term_225_3" id="Term_354_19" title="a reference to a single-file definition">Term</a> <span class="cons_Lit">" "</span>}*&gt;&gt;

<span class="keyword">context-free priorities</span>

    <a href="#Term_225_3" id="Term_358_5" title="a reference to a single-file definition">Term</a>.<span class="cons_Constructor"><a href="#As_349_8" id="As_358_10" title="a reference to a single-file definition">As</a></span>
  &gt; <a href="#Term_225_3" id="Term_359_5" title="a reference to a single-file definition">Term</a>.<span class="cons_Constructor"><a href="#Ascribe_350_8" id="Ascribe_359_10" title="a reference to a single-file definition">Ascribe</a></span>

<span class="keyword">syntax</span>

  <button class="modal-open" id="Term_363_3" title="a definition with multiple references" data-urls="#Term line 75_34, 77_36, 79_28, 107_27, 107_37, 108_27, 108_37, 134_37, 134_45, 135_80, 171_91, 231_54, 232_53, 232_87, 232_121, 234_29, 234_77, 259_11, 259_22, 345_25, 346_25, 346_39, 348_24, 348_33, 349_29, 350_23, 351_24, 353_19, 354_19, 358_5, 359_5, 437_32">Term</button><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="Op_363_11" title="a definition with no references">Op</span></span>         = <a href="#OpId_325_3" id="OpId_363_24" title="a reference to a single-file definition">OpId</a><span class="keyword">-LEX</span> <span class="cons_Lit">"("</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="#CommaTerms_353_3" id="CommaTerms_363_48" title="a reference to a single-file definition">CommaTerms</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">")"</span>

  <button class="modal-open" id="Str_365_3" title="a definition with multiple references" data-urls="#Str line 344_21, 435_30">Str</button><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="Str_365_10" title="a definition with no references">Str</span></span>        = <span class="cons_Lit">"\""</span> <a href="#StrChars_369_3" id="StrChars_365_28" title="a reference to a single-file definition">StrChars</a><span class="keyword">-LEX</span> <span class="cons_Lit">"\""</span>

<span class="keyword">lexical syntax</span>

  <button class="modal-open" id="StrChars_369_3" title="a definition with multiple references" data-urls="#StrChars line 365_28, 375_3">StrChars</button>   = <a href="#StrChar_370_3" id="StrChar_369_16" title="a reference to a single-file definition">StrChar</a>*
  <a href="#StrChar_369_16" id="StrChar_370_3" title="a definition with a single reference">StrChar</a>    = ~[\"\\\t\r\n]
  <a href="#StrChar_369_16" id="StrChar_371_3" title="a definition with a single reference">StrChar</a>    =  <span class="cons_Lit">"\\\""</span> | <span class="cons_Lit">"\\\\"</span> | <span class="cons_Lit">"\\t"</span> | <span class="cons_Lit">"\\r"</span> | <span class="cons_Lit">"\\n"</span>

<span class="keyword">lexical restrictions</span>

  <a href="#StrChars_369_3" id="StrChars_375_3" title="a reference to a single-file definition">StrChars</a> -/- ~[\"]


/******************************************************************
 * <span class="keyword">Arithmetic</span>                                                          *
 ******************************************************************/

<span class="keyword">syntax</span>

  <button class="modal-open" id="Constraint_384_3" title="a definition with multiple references" data-urls="#Constraint line 68_8, 79_45, 98_27, 101_6, 102_6, 110_29, 114_8, 121_3, 121_22">Constraint</button><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="CArith_384_17" title="a definition with no references">CArith</span></span> = <a href="#ArithExp_395_3" id="ArithExp_384_26" title="a reference to a single-file definition">ArithExp</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">"#"</span> <a href="#ArithOp_386_3" id="ArithOp_384_53" title="a reference to a single-file definition">ArithOp</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <a href="#ArithExp_395_3" id="ArithExp_384_75" title="a reference to a single-file definition">ArithExp</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <a href="#Message_418_3" id="Message_384_98" title="a reference to a single-file definition">Message</a><span class="keyword">-CF</span>

  <a href="#ArithOp_384_53" id="ArithOp_386_3" title="a definition with a single reference">ArithOp</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="Equal_386_14" title="a definition with no references">Equal</span></span>            = <span class="cons_Lit">"="</span>
  <a href="#ArithOp_384_53" id="ArithOp_387_3" title="a definition with a single reference">ArithOp</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="NotEqual_387_14" title="a definition with no references">NotEqual</span></span>         = <span class="cons_Lit">"\\="</span>
  <a href="#ArithOp_384_53" id="ArithOp_388_3" title="a definition with a single reference">ArithOp</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="GreaterThanEqual_388_14" title="a definition with no references">GreaterThanEqual</span></span> = <span class="cons_Lit">"&gt;="</span>
  <a href="#ArithOp_384_53" id="ArithOp_389_3" title="a definition with a single reference">ArithOp</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="LessThanEqual_389_14" title="a definition with no references">LessThanEqual</span></span>    = <span class="cons_Lit">"=&lt;"</span>
  <a href="#ArithOp_384_53" id="ArithOp_390_3" title="a definition with a single reference">ArithOp</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="GreaterThan_390_14" title="a definition with no references">GreaterThan</span></span>      = <span class="cons_Lit">"&gt;"</span>
  <a href="#ArithOp_384_53" id="ArithOp_391_3" title="a definition with a single reference">ArithOp</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="LessThan_391_14" title="a definition with no references">LessThan</span></span>         = <span class="cons_Lit">"&lt;"</span>

<span class="keyword">context-free syntax</span>

  <button class="modal-open" id="ArithExp_395_3" title="a definition with multiple references" data-urls="#ArithExp line 384_26, 384_75, 397_20, 397_33, 398_20, 398_33, 399_20, 399_33, 400_24, 400_36, 401_24, 401_36, 402_20, 402_35, 403_20, 403_35, 404_21, 408_12, 408_25, 408_38, 409_12, 409_25; ../Sugar.sdf3/#ArithExp line 166_40">ArithExp</button>     = <a href="#Int_340_3" id="Int_395_18" title="a reference to a single-file definition">Int</a>
  <button class="modal-open" id="ArithExp_396_3" title="a definition with multiple references" data-urls="#ArithExp line 384_26, 384_75, 397_20, 397_33, 398_20, 398_33, 399_20, 399_33, 400_24, 400_36, 401_24, 401_36, 402_20, 402_35, 403_20, 403_35, 404_21, 408_12, 408_25, 408_38, 409_12, 409_25; ../Sugar.sdf3/#ArithExp line 166_40">ArithExp</button>     = <a href="#Var_337_3" id="Var_396_18" title="a reference to a single-file definition">Var</a>
  <button class="modal-open" id="ArithExp_397_3" title="a definition with multiple references" data-urls="#ArithExp line 384_26, 384_75, 397_20, 397_33, 398_20, 398_33, 399_20, 399_33, 400_24, 400_36, 401_24, 401_36, 402_20, 402_35, 403_20, 403_35, 404_21, 408_12, 408_25, 408_38, 409_12, 409_25; ../Sugar.sdf3/#ArithExp line 166_40">ArithExp</button>.<span class="cons_Constructor"><a href="#Add_409_21" id="Add_397_12" title="a definition with a single reference">Add</a></span> = &lt;&lt;<a href="#ArithExp_395_3" id="ArithExp_397_20" title="a reference to a single-file definition">ArithExp</a>&gt; <span class="cons_String">+</span> &lt;<a href="#ArithExp_395_3" id="ArithExp_397_33" title="a reference to a single-file definition">ArithExp</a>&gt;&gt; {<span class="keyword">left</span>}
  <button class="modal-open" id="ArithExp_398_3" title="a definition with multiple references" data-urls="#ArithExp line 384_26, 384_75, 397_20, 397_33, 398_20, 398_33, 399_20, 399_33, 400_24, 400_36, 401_24, 401_36, 402_20, 402_35, 403_20, 403_35, 404_21, 408_12, 408_25, 408_38, 409_12, 409_25; ../Sugar.sdf3/#ArithExp line 166_40">ArithExp</button>.<span class="cons_Constructor"><a href="#Mul_408_21" id="Mul_398_12" title="a definition with a single reference">Mul</a></span> = &lt;&lt;<a href="#ArithExp_395_3" id="ArithExp_398_20" title="a reference to a single-file definition">ArithExp</a>&gt; <span class="cons_String">*</span> &lt;<a href="#ArithExp_395_3" id="ArithExp_398_33" title="a reference to a single-file definition">ArithExp</a>&gt;&gt; {<span class="keyword">left</span>}
  <button class="modal-open" id="ArithExp_399_3" title="a definition with multiple references" data-urls="#ArithExp line 384_26, 384_75, 397_20, 397_33, 398_20, 398_33, 399_20, 399_33, 400_24, 400_36, 401_24, 401_36, 402_20, 402_35, 403_20, 403_35, 404_21, 408_12, 408_25, 408_38, 409_12, 409_25; ../Sugar.sdf3/#ArithExp line 166_40">ArithExp</button>.<span class="cons_Constructor"><a href="#Sub_409_34" id="Sub_399_12" title="a definition with a single reference">Sub</a></span> = &lt;&lt;<a href="#ArithExp_395_3" id="ArithExp_399_20" title="a reference to a single-file definition">ArithExp</a>&gt; <span class="cons_String">-</span> &lt;<a href="#ArithExp_395_3" id="ArithExp_399_33" title="a reference to a single-file definition">ArithExp</a>&gt;&gt; {<span class="keyword">left</span>}
  <button class="modal-open" id="ArithExp_400_3" title="a definition with multiple references" data-urls="#ArithExp line 384_26, 384_75, 397_20, 397_33, 398_20, 398_33, 399_20, 399_33, 400_24, 400_36, 401_24, 401_36, 402_20, 402_35, 403_20, 403_35, 404_21, 408_12, 408_25, 408_38, 409_12, 409_25; ../Sugar.sdf3/#ArithExp line 166_40">ArithExp</button>.<span class="cons_Constructor"><span id="Min_400_12" title="a definition with no references">Min</span></span> = &lt;<span class="cons_String">min(</span>&lt;<a href="#ArithExp_395_3" id="ArithExp_400_24" title="a reference to a single-file definition">ArithExp</a>&gt;<span class="cons_String">,</span> &lt;<a href="#ArithExp_395_3" id="ArithExp_400_36" title="a reference to a single-file definition">ArithExp</a>&gt;<span class="cons_String">)</span>&gt;
  <button class="modal-open" id="ArithExp_401_3" title="a definition with multiple references" data-urls="#ArithExp line 384_26, 384_75, 397_20, 397_33, 398_20, 398_33, 399_20, 399_33, 400_24, 400_36, 401_24, 401_36, 402_20, 402_35, 403_20, 403_35, 404_21, 408_12, 408_25, 408_38, 409_12, 409_25; ../Sugar.sdf3/#ArithExp line 166_40">ArithExp</button>.<span class="cons_Constructor"><span id="Max_401_12" title="a definition with no references">Max</span></span> = &lt;<span class="cons_String">max(</span>&lt;<a href="#ArithExp_395_3" id="ArithExp_401_24" title="a reference to a single-file definition">ArithExp</a>&gt;<span class="cons_String">,</span> &lt;<a href="#ArithExp_395_3" id="ArithExp_401_36" title="a reference to a single-file definition">ArithExp</a>&gt;<span class="cons_String">)</span>&gt;
  <button class="modal-open" id="ArithExp_402_3" title="a definition with multiple references" data-urls="#ArithExp line 384_26, 384_75, 397_20, 397_33, 398_20, 398_33, 399_20, 399_33, 400_24, 400_36, 401_24, 401_36, 402_20, 402_35, 403_20, 403_35, 404_21, 408_12, 408_25, 408_38, 409_12, 409_25; ../Sugar.sdf3/#ArithExp line 166_40">ArithExp</button>.<span class="cons_Constructor"><a href="#Mod_408_47" id="Mod_402_12" title="a definition with a single reference">Mod</a></span> = &lt;&lt;<a href="#ArithExp_395_3" id="ArithExp_402_20" title="a reference to a single-file definition">ArithExp</a>&gt; <span class="cons_String">mod</span> &lt;<a href="#ArithExp_395_3" id="ArithExp_402_35" title="a reference to a single-file definition">ArithExp</a>&gt;&gt; {<span class="keyword">left</span>}
  <button class="modal-open" id="ArithExp_403_3" title="a definition with multiple references" data-urls="#ArithExp line 384_26, 384_75, 397_20, 397_33, 398_20, 398_33, 399_20, 399_33, 400_24, 400_36, 401_24, 401_36, 402_20, 402_35, 403_20, 403_35, 404_21, 408_12, 408_25, 408_38, 409_12, 409_25; ../Sugar.sdf3/#ArithExp line 166_40">ArithExp</button>.<span class="cons_Constructor"><a href="#Div_408_34" id="Div_403_12" title="a definition with a single reference">Div</a></span> = &lt;&lt;<a href="#ArithExp_395_3" id="ArithExp_403_20" title="a reference to a single-file definition">ArithExp</a>&gt; <span class="cons_String">div</span> &lt;<a href="#ArithExp_395_3" id="ArithExp_403_35" title="a reference to a single-file definition">ArithExp</a>&gt;&gt; {<span class="keyword">left</span>}
  <button class="modal-open" id="ArithExp_404_3" title="a definition with multiple references" data-urls="#ArithExp line 384_26, 384_75, 397_20, 397_33, 398_20, 398_33, 399_20, 399_33, 400_24, 400_36, 401_24, 401_36, 402_20, 402_35, 403_20, 403_35, 404_21, 408_12, 408_25, 408_38, 409_12, 409_25; ../Sugar.sdf3/#ArithExp line 166_40">ArithExp</button>     = &lt;<span class="cons_String">(</span>&lt;<a href="#ArithExp_395_3" id="ArithExp_404_21" title="a reference to a single-file definition">ArithExp</a>&gt;<span class="cons_String">)</span>&gt; {<span class="keyword">bracket</span>}

<span class="keyword">context-free priorities</span>

    {<span class="keyword">left</span>: <a href="#ArithExp_395_3" id="ArithExp_408_12" title="a reference to a single-file definition">ArithExp</a>.<span class="cons_Constructor"><a href="#Mul_398_12" id="Mul_408_21" title="a reference to a single-file definition">Mul</a></span> <a href="#ArithExp_395_3" id="ArithExp_408_25" title="a reference to a single-file definition">ArithExp</a>.<span class="cons_Constructor"><a href="#Div_403_12" id="Div_408_34" title="a reference to a single-file definition">Div</a></span> <a href="#ArithExp_395_3" id="ArithExp_408_38" title="a reference to a single-file definition">ArithExp</a>.<span class="cons_Constructor"><a href="#Mod_402_12" id="Mod_408_47" title="a reference to a single-file definition">Mod</a></span>}
  &gt; {<span class="keyword">left</span>: <a href="#ArithExp_395_3" id="ArithExp_409_12" title="a reference to a single-file definition">ArithExp</a>.<span class="cons_Constructor"><a href="#Add_397_12" id="Add_409_21" title="a reference to a single-file definition">Add</a></span> <a href="#ArithExp_395_3" id="ArithExp_409_25" title="a reference to a single-file definition">ArithExp</a>.<span class="cons_Constructor"><a href="#Sub_399_12" id="Sub_409_34" title="a reference to a single-file definition">Sub</a></span>}


/******************************************************************
 * <span class="keyword">Messages</span>                                                       *
 ******************************************************************/

<span class="keyword">context-free syntax</span>

  <button class="modal-open" id="Message_418_3" title="a definition with multiple references" data-urls="#Message line 77_50, 96_30, 107_43, 108_43, 110_43, 259_28, 384_98; ../Deprecated.sdf3/#Message line 66_70, 67_82; ../Sugar.sdf3/#Message line 94_110">Message</button>.<span class="cons_Constructor"><span id="NoMessage_418_11" title="a definition with no references">NoMessage</span></span> =
  <button class="modal-open" id="Message_419_3" title="a definition with multiple references" data-urls="#Message line 77_50, 96_30, 107_43, 108_43, 110_43, 259_28, 384_98; ../Deprecated.sdf3/#Message line 66_70, 67_82; ../Sugar.sdf3/#Message line 94_110">Message</button>.<span class="cons_Constructor"><span id="Message_419_11" title="a definition with no references">Message</span></span>   = &lt; <span class="cons_String">|</span> &lt;<a href="#MessageKind_421_3" id="MessageKind_419_28" title="a reference to a single-file definition">MessageKind</a>&gt; &lt;<a href="#MessageContent_427_3" id="MessageContent_419_42" title="a reference to a single-file definition">MessageContent</a>&gt; &lt;<a href="#MessageOrigin_429_3" id="MessageOrigin_419_59" title="a reference to a single-file definition">MessageOrigin</a>&gt;&gt;

  <a href="#MessageKind_419_28" id="MessageKind_421_3" title="a definition with a single reference">MessageKind</a>.<span class="cons_Constructor"><span id="Error_421_15" title="a definition with no references">Error</span></span>      = &lt;<span class="cons_String">error</span>&gt;
  <a href="#MessageKind_419_28" id="MessageKind_422_3" title="a definition with a single reference">MessageKind</a>.<span class="cons_Constructor"><span id="Warning_422_15" title="a definition with no references">Warning</span></span>    = &lt;<span class="cons_String">warning</span>&gt;
  <a href="#MessageKind_419_28" id="MessageKind_423_3" title="a definition with a single reference">MessageKind</a>.<span class="cons_Constructor"><span id="Note_423_15" title="a definition with no references">Note</span></span>       = &lt;<span class="cons_String">note</span>&gt;

<span class="keyword">syntax</span>

  <a href="#MessageContent_419_42" id="MessageContent_427_3" title="a definition with a single reference">MessageContent</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="Formatted_427_21" title="a definition with no references">Formatted</span></span> = <span class="cons_Lit">"$["</span> <a href="#MessageContentPart_437_3" id="MessageContentPart_427_38" title="a reference to a single-file definition">MessageContentPart</a><span class="keyword">-CF</span>* <span class="cons_Lit">"]"</span>

  <a href="#MessageOrigin_419_59" id="MessageOrigin_429_3" title="a definition with a single reference">MessageOrigin</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="NoOrigin_429_20" title="a definition with no references">NoOrigin</span></span> =
  <a href="#MessageOrigin_419_59" id="MessageOrigin_430_3" title="a definition with a single reference">MessageOrigin</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="Origin_430_20" title="a definition with no references">Origin</span></span>   = <span class="cons_Lit">"@"</span> <a href="#Var_337_3" id="Var_430_35" title="a reference to a single-file definition">Var</a><span class="keyword">-CF</span>

<span class="keyword">context-free syntax</span>

  <a href="#MessageContent_419_42" id="MessageContent_434_3" title="a definition with a single reference">MessageContent</a>.<span class="cons_Constructor"><span id="NoMessage_434_18" title="a definition with no references">NoMessage</span></span> =
  <a href="#MessageContent_419_42" id="MessageContent_435_3" title="a definition with a single reference">MessageContent</a>           = <a href="#Str_365_3" id="Str_435_30" title="a reference to a single-file definition">Str</a>

  <a href="#MessageContentPart_427_38" id="MessageContentPart_437_3" title="a definition with a single reference">MessageContentPart</a>.<span class="cons_Constructor"><span id="Term_437_22" title="a definition with no references">Term</span></span> = &lt;<span class="cons_String">[</span>&lt;<a href="#Term_225_3" id="Term_437_32" title="a reference to a single-file definition">Term</a>&gt;<span class="cons_String">]</span>&gt;
  <a href="#MessageContentPart_427_38" id="MessageContentPart_438_3" title="a definition with a single reference">MessageContentPart</a>.<span class="cons_Constructor"><span id="Text_438_22" title="a definition with no references">Text</span></span> = <a href="#MessageChars_442_3" id="MessageChars_438_29" title="a reference to a single-file definition">MessageChars</a>

<span class="keyword">lexical syntax</span>

  <button class="modal-open" id="MessageChars_442_3" title="a definition with multiple references" data-urls="#MessageChars line 438_29, 448_3">MessageChars</button> = <a href="#MessageChar_443_3" id="MessageChar_442_18" title="a reference to a single-file definition">MessageChar</a>+
  <a href="#MessageChar_442_18" id="MessageChar_443_3" title="a definition with a single reference">MessageChar</a>  = ~[\[\]\\\t\r\n]
  <a href="#MessageChar_442_18" id="MessageChar_444_3" title="a definition with a single reference">MessageChar</a>  = <span class="cons_Lit">"\\["</span> | <span class="cons_Lit">"\\]"</span> | <span class="cons_Lit">"\\n"</span> | <span class="cons_Lit">"\\r"</span> | <span class="cons_Lit">"\\t"</span> | <span class="cons_Lit">"\\\\"</span>

<span class="keyword">lexical restrictions</span>

  <a href="#MessageChars_442_3" id="MessageChars_448_3" title="a reference to a single-file definition">MessageChars</a> -/- ~[\[\]]

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
