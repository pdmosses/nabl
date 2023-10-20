---
title: Sugar.sdf3
hide:
  - toc
---

# `Sugar.sdf3`

:simple-github: [pdmosses/nabl/statix.lang/syntax/statix/lang/Sugar.sdf3]

[pdmosses/nabl/statix.lang/syntax/statix/lang/Sugar.sdf3]: https://github.com/pdmosses/nabl/blob/master/statix.lang/syntax/statix/lang/Sugar.sdf3 "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../NoParse.sdf3/#statix/lang/Sugar_119_136" id="statix/lang/Sugar_7_24" title="Referenced at ../NoParse.sdf3 line 7; ../../../StatixLang.sdf3 line 8; ../../cli/CLI.sdf3 line 8; ../../test/Result.sdf3 line 10; ../../test/Test.sdf3 line 8">statix/lang/Sugar</a>

<span class="keyword">imports</span>

  <a href="../Common.sdf3/#statix/lang/Common_7_25" id="statix/lang/Common_37_55" title="Defined at ../Common.sdf3 line 1">statix/lang/Common</a>
  <a href="../Core.sdf3/#statix/lang/Core_7_23" id="statix/lang/Core_58_74" title="Defined at ../Core.sdf3 line 1">statix/lang/Core</a>

<span class="keyword">template options</span>

  <span class="keyword">keyword</span> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\_\-\']


/******************************************************************
 * <span class="keyword">User Constraints</span>                                               *
 ******************************************************************/

<span class="keyword">context-free syntax</span>

  <span class="layout">// lifting of constraints</span>

  <span id="Rule_386_390" title="Not referenced locally, nor via imports">Rule</span>             = &lt;<span class="cons_String">constraint</span> &lt;<a href="#CDerive_608_615" id="CDerive_418_425" title="Defined at line 29, 30">CDerive</a>&gt;&gt;
  <span id="Rule_430_434" title="Not referenced locally, nor via imports">Rule</span>             = <a href="#CDerive_608_615" id="CDerive_449_456" title="Defined at line 29, 30">CDerive</a>

  <span id="Rule_460_464" title="Not referenced locally, nor via imports">Rule</span>.<span class="cons_Constructor"><span id="CDecl_465_470" title="Not referenced locally, nor via imports">CDecl</span></span>       = [[<a href="../Core.sdf3/#CInd_1152_1156" id="CInd_481_485" title="Defined at ../Core.sdf3 line 63, 64">CInd</a>]<span class="cons_String">constraint</span> [<a href="../Core.sdf3/#ConstraintId_1527_1539" id="ConstraintId_498_510" title="Defined at ../Core.sdf3 line 83, 84">ConstraintId</a>] <span class="cons_String">:</span> [<a href="#Type_3641_3645" id="Type_515_519" title="Defined at line 152">Type</a>]]
  <span id="Rule_524_528" title="Not referenced locally, nor via imports">Rule</span>.<span class="cons_Constructor"><span id="CDecl_529_534" title="Not referenced locally, nor via imports">CDecl</span></span>       = [[<a href="../Core.sdf3/#CInd_1152_1156" id="CInd_545_549" title="Defined at ../Core.sdf3 line 63, 64">CInd</a>][<a href="../Core.sdf3/#ConstraintId_1527_1539" id="ConstraintId_551_563" title="Defined at ../Core.sdf3 line 83, 84">ConstraintId</a>] <span class="cons_String">:</span> [<a href="#Type_3641_3645" id="Type_568_572" title="Defined at line 152">Type</a>]]

  <span id="CDecl_578_583" title="Not referenced locally, nor via imports">CDecl</span>            = <a href="#CDerive_608_615" id="CDerive_597_604" title="Defined at line 29, 30">CDerive</a>

  <a href="#CDerive_418_425" id="CDerive_608_615" title="Referenced at line 21, 22, 27">CDerive</a>.<span class="cons_Constructor"><span id="CDeriveMap_616_626" title="Not referenced locally, nor via imports">CDeriveMap</span></span> = [[<a href="../Core.sdf3/#ConstraintId_1527_1539" id="ConstraintId_631_643" title="Defined at ../Core.sdf3 line 83, 84">ConstraintId</a>] <span class="cons_String">maps</span> [<a href="../Core.sdf3/#ConstraintId_1527_1539" id="ConstraintId_651_663" title="Defined at ../Core.sdf3 line 83, 84">ConstraintId</a>]<span class="cons_String">(</span>[{<a href="#Lift_770_774" id="Lift_667_671" title="Defined at line 32, 33, 34, 35">Lift</a> <span class="cons_Lit">", "</span>}*]<span class="cons_String">)</span>]
  <a href="#CDerive_418_425" id="CDerive_684_691" title="Referenced at line 21, 22, 27">CDerive</a>.<span class="cons_Constructor"><span id="FDeriveMap_692_702" title="Not referenced locally, nor via imports">FDeriveMap</span></span> = [[<a href="../Core.sdf3/#ConstraintId_1527_1539" id="ConstraintId_707_719" title="Defined at ../Core.sdf3 line 83, 84">ConstraintId</a>] <span class="cons_String">maps</span> [<a href="../Core.sdf3/#ConstraintId_1527_1539" id="ConstraintId_727_739" title="Defined at ../Core.sdf3 line 83, 84">ConstraintId</a>]<span class="cons_String">(</span>[{<a href="#Lift_770_774" id="Lift_743_747" title="Defined at line 32, 33, 34, 35">Lift</a> <span class="cons_Lit">", "</span>}*]<span class="cons_String">)</span> <span class="cons_String">=</span> [<a href="#Lift_770_774" id="Lift_760_764" title="Defined at line 32, 33, 34, 35">Lift</a>]]

  <a href="#Lift_667_671" id="Lift_770_774" title="Referenced at line 29, 30, 35">Lift</a>.<span class="cons_Constructor"><span id="IdLift_775_781" title="Not referenced locally, nor via imports">IdLift</span></span>     = <span class="cons_Lit">"*"</span>
  <a href="#Lift_667_671" id="Lift_794_798" title="Referenced at line 29, 30, 35">Lift</a>.<span class="cons_Constructor"><span id="ListLift_799_807" title="Not referenced locally, nor via imports">ListLift</span></span>   = <span class="cons_Lit">"list(*)"</span>
  <a href="#Lift_667_671" id="Lift_824_828" title="Referenced at line 29, 30, 35">Lift</a>.<span class="cons_Constructor"><span id="Tuple0Lift_829_839" title="Not referenced locally, nor via imports">Tuple0Lift</span></span> = &lt;<span class="cons_String">(</span> <span class="cons_String">)</span>&gt;
  <a href="#Lift_667_671" id="Lift_850_854" title="Referenced at line 29, 30, 35">Lift</a>.<span class="cons_Constructor"><span id="TupleNLift_855_865" title="Not referenced locally, nor via imports">TupleNLift</span></span> = &lt;<span class="cons_String">(</span>&lt;<a href="#Lift_770_774" id="Lift_871_875" title="Defined at line 32, 33, 34, 35">Lift</a>&gt;<span class="cons_String">,</span> &lt;{<a href="#Lift_770_774" id="Lift_880_884" title="Defined at line 32, 33, 34, 35">Lift</a> <span class="cons_Lit">", "</span>}+&gt;<span class="cons_String">)</span>&gt;

  <span class="layout">// rule shorthands</span>

  <span id="Rule_920_924" title="Not referenced locally, nor via imports">Rule</span>.<span class="cons_Constructor"><span id="AxiomRule_925_934" title="Not referenced locally, nor via imports">AxiomRule</span></span> = &lt;
    &lt;<a href="../Core.sdf3/#RuleName_1281_1289" id="RuleName_944_952" title="Defined at ../Core.sdf3 line 71, 72">RuleName</a>&gt;&lt;<a href="#RuleHead_972_980" id="RuleHead_954_962" title="Defined at line 43">RuleHead</a>&gt;<span class="cons_String">.</span>
  &gt;

  <a href="#RuleHead_954_962" id="RuleHead_972_980" title="Referenced at line 40">RuleHead</a>.<span class="cons_Constructor"><span id="F_981_982" title="Not referenced locally, nor via imports">F</span></span> = [[<a href="../Core.sdf3/#ConstraintId_1527_1539" id="ConstraintId_987_999" title="Defined at ../Core.sdf3 line 83, 84">ConstraintId</a>]<span class="cons_String">(</span>[{<a href="#Term_1150_1154" id="Term_1003_1007" title="Defined at line 53, 69, 70, 96, 166">Term</a> <span class="cons_Lit">", "</span>}*]<span class="cons_String">)</span> <span class="cons_String">=</span> [<a href="#Term_1150_1154" id="Term_1020_1024" title="Defined at line 53, 69, 70, 96, 166">Term</a>]]

  <span id="HoConstraint_1030_1042" title="Not referenced locally, nor via imports">HoConstraint</span>.<span class="cons_Constructor"><span id="LLam_1043_1047" title="Not referenced locally, nor via imports">LLam</span></span> = &lt;<span class="cons_String">{</span> &lt;{<a href="#Term_1150_1154" id="Term_1055_1059" title="Defined at line 53, 69, 70, 96, 166">Term</a> <span class="cons_Lit">", "</span>}+&gt; <span class="cons_String">}</span>&gt;

  <span id="HoConstraint_1074_1086" title="Not referenced locally, nor via imports">HoConstraint</span>.<span class="cons_Constructor"><span id="LC_1087_1089" title="Not referenced locally, nor via imports">LC</span></span> = <a href="../Core.sdf3/#ConstraintId_1527_1539" id="ConstraintId_1092_1104" title="Defined at ../Core.sdf3 line 83, 84">ConstraintId</a>

  <span id="HoConstraint_1108_1120" title="Not referenced locally, nor via imports">HoConstraint</span>.<span class="cons_Constructor"><span id="EQ_1121_1123" title="Not referenced locally, nor via imports">EQ</span></span> = &lt;<span class="cons_String">eq(</span>&lt;<a href="#Term_1150_1154" id="Term_1131_1135" title="Defined at line 53, 69, 70, 96, 166">Term</a>&gt;<span class="cons_String">)</span>&gt;

<span class="keyword">syntax</span>

  <a href="#Term_1003_1007" id="Term_1150_1154" title="Referenced at line 43, 45, 49, 70, 94, 96">Term</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="COp_1158_1161" title="Not referenced locally, nor via imports">COp</span></span> = <a href="../Core.sdf3/#ConstraintId_1527_1539" id="ConstraintId_1164_1176" title="Defined at ../Core.sdf3 line 83, 84">ConstraintId</a><span class="keyword">-CF</span> <span class="cons_Lit">"("</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="../Core.sdf3/#CommaTerms_8312_8322" id="CommaTerms_1195_1205" title="Defined at ../Core.sdf3 line 353">CommaTerms</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">")"</span>

<span class="keyword">lexical syntax</span>

  <span id="Keyword_1243_1250" title="Not referenced locally, nor via imports">Keyword</span> = <span class="cons_Lit">"constraint"</span> | <span class="cons_Lit">"maps"</span>


/******************************************************************
 * <span class="keyword">Base Constraints</span>                                               *
 ******************************************************************/

<span class="keyword">context-free syntax</span>

  <span id="HoConstraint_1506_1518" title="Not referenced locally, nor via imports">HoConstraint</span>.<span class="cons_Constructor"><span id="LTrue_1519_1524" title="Not referenced locally, nor via imports">LTrue</span></span>  = <span class="cons_Lit">"true"</span>
  <span id="HoConstraint_1537_1549" title="Not referenced locally, nor via imports">HoConstraint</span>.<span class="cons_Constructor"><span id="LFalse_1550_1556" title="Not referenced locally, nor via imports">LFalse</span></span> = <span class="cons_Lit">"false"</span>

  <a href="#Term_1003_1007" id="Term_1570_1574" title="Referenced at line 43, 45, 49, 70, 94, 96">Term</a>.<span class="cons_Constructor"><span id="NewOp_1575_1580" title="Not referenced locally, nor via imports">NewOp</span></span>   = <span class="cons_Lit">"new"</span>
  <a href="#Term_1003_1007" id="Term_1593_1597" title="Referenced at line 43, 45, 49, 70, 94, 96">Term</a>.<span class="cons_Constructor"><span id="AstIdOp_1598_1605" title="Not referenced locally, nor via imports">AstIdOp</span></span> = &lt;<span class="cons_String">astId(</span>&lt;<a href="#Term_1150_1154" id="Term_1616_1620" title="Defined at line 53, 69, 70, 96, 166">Term</a>&gt;<span class="cons_String">)</span>&gt;

  <span id="AstProperty_1627_1638" title="Not referenced locally, nor via imports">AstProperty</span>.<span class="cons_Constructor"><span id="Ref_1639_1642" title="Not referenced locally, nor via imports">Ref</span></span>  = <span class="cons_Lit">"ref"</span>
  <span id="AstProperty_1654_1665" title="Not referenced locally, nor via imports">AstProperty</span>.<span class="cons_Constructor"><span id="Type_1666_1670" title="Not referenced locally, nor via imports">Type</span></span> = <span class="cons_Lit">"type"</span>

<span class="keyword">lexical syntax</span>

  <span id="VARID_1699_1704" title="Not referenced locally, nor via imports">VARID</span> = <span class="cons_Lit">"new"</span> {<span class="keyword">reject</span>}

  <span id="AstPropertyId_1725_1738" title="Not referenced locally, nor via imports">AstPropertyId</span> = <span class="cons_Lit">"ref"</span> | <span class="cons_Lit">"type"</span> {<span class="keyword">reject</span>}


/******************************************************************
 * <span class="keyword">Relations</span>                                                      *
 ******************************************************************/

<span class="keyword">context-free syntax</span>

  <a href="#RelRef_2097_2103" id="RelRef_1996_2002" title="Referenced at line 94, 96">RelRef</a>.<span class="cons_Constructor"><span id="Decl_2003_2007" title="Not referenced locally, nor via imports">Decl</span></span> = <span class="cons_Lit">"decl"</span>

<span class="keyword">syntax</span>

  <span class="layout">// short-hand for querying relations</span>

  <a href="../../cli/CLI.sdf3/#Constraint_252_262" id="Constraint_2068_2078" title="Referenced at ../../cli/CLI.sdf3 line 20">Constraint</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="CAskRel_2082_2089" title="Not referenced locally, nor via imports">CAskRel</span></span>  = <span class="cons_Lit">"?"</span> <a href="#RelRef_1996_2002" id="RelRef_2097_2103" title="Defined at line 88">RelRef</a><span class="keyword">-CF</span> <span class="cons_Lit">"["</span> <a href="../Core.sdf3/#CommaTerms_8312_8322" id="CommaTerms_2111_2121" title="Defined at ../Core.sdf3 line 353">CommaTerms</a><span class="keyword">-CF</span> <span class="cons_Lit">"]"</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">"in"</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="#Term_1150_1154" id="Term_2156_2160" title="Defined at line 53, 69, 70, 96, 166">Term</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <a href="../Core.sdf3/#Message_10079_10086" id="Message_2175_2182" title="Defined at ../Core.sdf3 line 418, 419">Message</a><span class="keyword">-CF</span>

  <a href="#Term_1003_1007" id="Term_2189_2193" title="Referenced at line 43, 45, 49, 70, 94, 96">Term</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="AskRelOp_2197_2205" title="Not referenced locally, nor via imports">AskRelOp</span></span> = <span class="cons_Lit">"?"</span> <a href="#RelRef_1996_2002" id="RelRef_2212_2218" title="Defined at line 88">RelRef</a><span class="keyword">-CF</span> <span class="cons_Lit">"["</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="../Core.sdf3/#CommaTerms_8312_8322" id="CommaTerms_2237_2247" title="Defined at ../Core.sdf3 line 353">CommaTerms</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">"]"</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">"in"</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="#Term_1150_1154" id="Term_2293_2297" title="Defined at line 53, 69, 70, 96, 166">Term</a><span class="keyword">-CF</span>

<span class="keyword">lexical syntax</span>

  <span id="RelationId_2320_2330" title="Not referenced locally, nor via imports">RelationId</span> = <span class="cons_Lit">"decl"</span> {<span class="keyword">reject</span>}
  <span id="RelationId_2351_2361" title="Not referenced locally, nor via imports">RelationId</span> = <span class="cons_Lit">"ref"</span> {<span class="keyword">reject</span>}


/******************************************************************
 * <span class="keyword">Scope Graph</span>                                                    *
 ******************************************************************/

<span class="keyword">context-free syntax</span>

  <a href="#LabelRE_2632_2639" id="LabelRE_2610_2617" title="Referenced at line 110, 111, 115, 116, 132">LabelRE</a>.<span class="cons_Constructor"><a href="#ZeroOrOne_2746_2755" id="ZeroOrOne_2618_2627" title="Referenced at line 115">ZeroOrOne</a></span> = &lt;&lt;<a href="#LabelRE_2610_2617" id="LabelRE_2632_2639" title="Defined at line 110, 111">LabelRE</a>&gt;<span class="cons_String">?</span>&gt;
  <a href="#LabelRE_2632_2639" id="LabelRE_2645_2652" title="Referenced at line 110, 111, 115, 116, 132">LabelRE</a>.<span class="cons_Constructor"><a href="#OneOrMore_2764_2773" id="OneOrMore_2653_2662" title="Referenced at line 115">OneOrMore</a></span> = &lt;&lt;<a href="#LabelRE_2610_2617" id="LabelRE_2667_2674" title="Defined at line 110, 111">LabelRE</a>&gt;<span class="cons_String">+</span>&gt;

<span class="keyword">context-free priorities</span>

    { <a href="#LabelRE_2610_2617" id="LabelRE_2710_2717" title="Defined at line 110, 111">LabelRE</a>.<span class="cons_Constructor"><a href="../Core.sdf3/#Neg_4542_4545" id="Neg_2718_2721" title="Defined at ../Core.sdf3 line 210">Neg</a></span> <a href="#LabelRE_2610_2617" id="LabelRE_2722_2729" title="Defined at line 110, 111">LabelRE</a>.<span class="cons_Constructor"><a href="../Core.sdf3/#Closure_4506_4513" id="Closure_2730_2737" title="Defined at ../Core.sdf3 line 209">Closure</a></span> <a href="#LabelRE_2610_2617" id="LabelRE_2738_2745" title="Defined at line 110, 111">LabelRE</a>.<span class="cons_Constructor"><a href="#ZeroOrOne_2618_2627" id="ZeroOrOne_2746_2755" title="Defined at line 110">ZeroOrOne</a></span> <a href="#LabelRE_2610_2617" id="LabelRE_2756_2763" title="Defined at line 110, 111">LabelRE</a>.<span class="cons_Constructor"><a href="#OneOrMore_2653_2662" id="OneOrMore_2764_2773" title="Defined at line 111">OneOrMore</a></span> }
  &gt; { <a href="#LabelRE_2610_2617" id="LabelRE_2782_2789" title="Defined at line 110, 111">LabelRE</a>.<span class="cons_Constructor"><a href="../Core.sdf3/#Concat_4578_4584" id="Concat_2790_2796" title="Defined at ../Core.sdf3 line 211">Concat</a></span> <a href="#LabelRE_2610_2617" id="LabelRE_2797_2804" title="Defined at line 110, 111">LabelRE</a>.<span class="cons_Constructor"><a href="../Core.sdf3/#And_4635_4638" id="And_2805_2808" title="Defined at ../Core.sdf3 line 212">And</a></span> <a href="#LabelRE_2610_2617" id="LabelRE_2809_2816" title="Defined at line 110, 111">LabelRE</a>.<span class="cons_Constructor"><a href="../Core.sdf3/#Or_4691_4693" id="Or_2817_2819" title="Defined at ../Core.sdf3 line 213">Or</a></span> }

<span class="keyword">lexical syntax</span>

  <span id="Keyword_2841_2848" title="Not referenced locally, nor via imports">Keyword</span> = <span class="cons_Lit">"resolve"</span> | <span class="cons_Lit">"filter"</span> | <span class="cons_Lit">"with"</span> | <span class="cons_Lit">"and"</span>


/******************************************************************
 * <span class="keyword">Resolve</span> &amp; <span class="keyword">Query</span>
 ******************************************************************/

<span class="keyword">context-free syntax</span>

  <span class="layout">// short-hand forms for occurrences using default resolution policies</span>

  <span id="QueryFilter_3144_3155" title="Not referenced locally, nor via imports">QueryFilter</span>.<span class="cons_Constructor"><span id="NoFilter_3156_3164" title="Not referenced locally, nor via imports">NoFilter</span></span> =
  <span id="QueryFilter_3169_3180" title="Not referenced locally, nor via imports">QueryFilter</span>.<span class="cons_Constructor"><span id="Filter_3181_3187" title="Not referenced locally, nor via imports">Filter</span></span>   = &lt; <span class="cons_String">filter</span> &lt;<a href="#LabelRE_2610_2617" id="LabelRE_3202_3209" title="Defined at line 110, 111">LabelRE</a>&gt;&gt;


  <span id="QueryMin_3216_3224" title="Not referenced locally, nor via imports">QueryMin</span>.<span class="cons_Constructor"><span id="NoMin_3225_3230" title="Not referenced locally, nor via imports">NoMin</span></span> =
  <span id="QueryMin_3235_3243" title="Not referenced locally, nor via imports">QueryMin</span>.<span class="cons_Constructor"><span id="Min_3244_3247" title="Not referenced locally, nor via imports">Min</span></span>   = &lt; <span class="cons_String">min</span> &lt;<a href="../Core.sdf3/#LabelOrd_4352_4360" id="LabelOrd_3259_3267" title="Defined at ../Core.sdf3 line 203">LabelOrd</a>&gt;&gt;


  <span id="QueryProject_3274_3286" title="Not referenced locally, nor via imports">QueryProject</span>.<span class="cons_Constructor"><span id="NoProject_3287_3296" title="Not referenced locally, nor via imports">NoProject</span></span> =

<span class="keyword">lexical syntax</span>

  <span id="Keyword_3318_3325" title="Not referenced locally, nor via imports">Keyword</span> = <span class="cons_Lit">"filter"</span> | <span class="cons_Lit">"min"</span> | <span class="cons_Lit">"in"</span> | <span class="cons_Lit">"of"</span> | <span class="cons_Lit">"resolveMatch"</span> | <span class="cons_Lit">"resolveLt"</span> | <span class="cons_Lit">"occurrenceMatch"</span>


/******************************************************************
 * <span class="keyword">Sorts</span> &amp; <span class="keyword">Constructors</span>                                           *
 ******************************************************************/

<span class="keyword">context-free syntax</span>

  <a href="#Type_515_519" id="Type_3641_3645" title="Referenced at line 24, 25">Type</a>.<span class="cons_Constructor"><span id="FunType_3646_3653" title="Not referenced locally, nor via imports">FunType</span></span>    = [[{<a href="../Core.sdf3/#SortRef_6813_6820" id="SortRef_3662_3669" title="Defined at ../Core.sdf3 line 299, 300, 301, 302, 303, 304, 305, 306, 307, 308, 309, 310">SortRef</a> <span class="cons_Lit">" * "</span>}*] <span class="cons_String">-&gt;</span> [<a href="../Core.sdf3/#SortRef_6813_6820" id="SortRef_3683_3690" title="Defined at ../Core.sdf3 line 299, 300, 301, 302, 303, 304, 305, 306, 307, 308, 309, 310">SortRef</a>]]


/******************************************************************
 * <span class="keyword">Terms</span>                                                          *
 ******************************************************************/


/******************************************************************
 * <span class="keyword">Arithmetic</span>                                                          *
 ******************************************************************/

<span class="keyword">syntax</span>

  <a href="#Term_1003_1007" id="Term_4123_4127" title="Referenced at line 43, 45, 49, 70, 94, 96">Term</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="ArithOp_4131_4138" title="Not referenced locally, nor via imports">ArithOp</span></span> = <span class="cons_Lit">"#"</span> <span class="cons_Lit">"("</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="../Core.sdf3/#ArithExp_9303_9311" id="ArithExp_4160_4168" title="Defined at ../Core.sdf3 line 395, 396, 397, 398, 399, 400, 401, 402, 403, 404">ArithExp</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">")"</span>

</code></pre></td></tr></tbody></table></div>