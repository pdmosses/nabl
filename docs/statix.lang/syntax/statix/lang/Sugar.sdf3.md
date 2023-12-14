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
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="statix/lang/Sugar_1_8" title="Multi-file references" data-urls="../NoParse.sdf3/#statix/lang/Sugar_7_3 line 7; ../../../StatixLang.sdf3/#statix/lang/Sugar_8_3 line 8; ../../cli/CLI.sdf3/#statix/lang/Sugar_8_3 line 8; ../../test/Result.sdf3/#statix/lang/Sugar_10_3 line 10; ../../test/Test.sdf3/#statix/lang/Sugar_8_3 line 8">statix/lang/Sugar</button>

<span class="keyword">imports</span>

  <a href="../Common.sdf3/#statix/lang/Common_1_8" id="statix/lang/Common_5_3" title="Defined at ../Common.sdf3 line 1">statix/lang/Common</a>
  <a href="../Core.sdf3/#statix/lang/Core_1_8" id="statix/lang/Core_6_3" title="Defined at ../Core.sdf3 line 1">statix/lang/Core</a>

<span class="keyword">template options</span>

  <span class="keyword">keyword</span> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\_\-\']


/******************************************************************
 * <span class="keyword">User Constraints</span>                                               *
 ******************************************************************/

<span class="keyword">context-free syntax</span>

  <span class="layout">// lifting of constraints</span>

  <span id="Rule_21_3" title="Not referenced">Rule</span>             = &lt;<span class="cons_String">constraint</span> &lt;<a href="#CDerive_29_3" id="CDerive_21_35" title="Defined at line 29, 30">CDerive</a>&gt;&gt;
  <span id="Rule_22_3" title="Not referenced">Rule</span>             = <a href="#CDerive_29_3" id="CDerive_22_22" title="Defined at line 29, 30">CDerive</a>

  <span id="Rule_24_3" title="Not referenced">Rule</span>.<span class="cons_Constructor"><span id="CDecl_24_8" title="Not referenced">CDecl</span></span>       = [[<a href="../Core.sdf3/#CInd_63_3" id="CInd_24_24" title="Defined at ../Core.sdf3 line 63, 64">CInd</a>]<span class="cons_String">constraint</span> [<a href="../Core.sdf3/#ConstraintId_83_3" id="ConstraintId_24_41" title="Defined at ../Core.sdf3 line 83, 84">ConstraintId</a>] <span class="cons_String">:</span> [<a href="#Type_152_3" id="Type_24_58" title="Defined at line 152">Type</a>]]
  <span id="Rule_25_3" title="Not referenced">Rule</span>.<span class="cons_Constructor"><span id="CDecl_25_8" title="Not referenced">CDecl</span></span>       = [[<a href="../Core.sdf3/#CInd_63_3" id="CInd_25_24" title="Defined at ../Core.sdf3 line 63, 64">CInd</a>][<a href="../Core.sdf3/#ConstraintId_83_3" id="ConstraintId_25_30" title="Defined at ../Core.sdf3 line 83, 84">ConstraintId</a>] <span class="cons_String">:</span> [<a href="#Type_152_3" id="Type_25_47" title="Defined at line 152">Type</a>]]

  <span id="CDecl_27_3" title="Not referenced">CDecl</span>            = <a href="#CDerive_29_3" id="CDerive_27_22" title="Defined at line 29, 30">CDerive</a>

  <a href="#CDerive_21_35" id="CDerive_29_3" title="Referenced at line 21, 22, 27">CDerive</a>.<span class="cons_Constructor"><span id="CDeriveMap_29_11" title="Not referenced">CDeriveMap</span></span> = [[<a href="../Core.sdf3/#ConstraintId_83_3" id="ConstraintId_29_26" title="Defined at ../Core.sdf3 line 83, 84">ConstraintId</a>] <span class="cons_String">maps</span> [<a href="../Core.sdf3/#ConstraintId_83_3" id="ConstraintId_29_46" title="Defined at ../Core.sdf3 line 83, 84">ConstraintId</a>]<span class="cons_String">(</span>[{<a href="#Lift_32_3" id="Lift_29_62" title="Defined at line 32, 33, 34, 35">Lift</a> <span class="cons_Lit">", "</span>}*]<span class="cons_String">)</span>]
  <a href="#CDerive_21_35" id="CDerive_30_3" title="Referenced at line 21, 22, 27">CDerive</a>.<span class="cons_Constructor"><span id="FDeriveMap_30_11" title="Not referenced">FDeriveMap</span></span> = [[<a href="../Core.sdf3/#ConstraintId_83_3" id="ConstraintId_30_26" title="Defined at ../Core.sdf3 line 83, 84">ConstraintId</a>] <span class="cons_String">maps</span> [<a href="../Core.sdf3/#ConstraintId_83_3" id="ConstraintId_30_46" title="Defined at ../Core.sdf3 line 83, 84">ConstraintId</a>]<span class="cons_String">(</span>[{<a href="#Lift_32_3" id="Lift_30_62" title="Defined at line 32, 33, 34, 35">Lift</a> <span class="cons_Lit">", "</span>}*]<span class="cons_String">)</span> <span class="cons_String">=</span> [<a href="#Lift_32_3" id="Lift_30_79" title="Defined at line 32, 33, 34, 35">Lift</a>]]

  <a href="#Lift_29_62" id="Lift_32_3" title="Referenced at line 29, 30, 35">Lift</a>.<span class="cons_Constructor"><span id="IdLift_32_8" title="Not referenced">IdLift</span></span>     = <span class="cons_Lit">"*"</span>
  <a href="#Lift_29_62" id="Lift_33_3" title="Referenced at line 29, 30, 35">Lift</a>.<span class="cons_Constructor"><span id="ListLift_33_8" title="Not referenced">ListLift</span></span>   = <span class="cons_Lit">"list(*)"</span>
  <a href="#Lift_29_62" id="Lift_34_3" title="Referenced at line 29, 30, 35">Lift</a>.<span class="cons_Constructor"><span id="Tuple0Lift_34_8" title="Not referenced">Tuple0Lift</span></span> = &lt;<span class="cons_String">(</span> <span class="cons_String">)</span>&gt;
  <a href="#Lift_29_62" id="Lift_35_3" title="Referenced at line 29, 30, 35">Lift</a>.<span class="cons_Constructor"><span id="TupleNLift_35_8" title="Not referenced">TupleNLift</span></span> = &lt;<span class="cons_String">(</span>&lt;<a href="#Lift_32_3" id="Lift_35_24" title="Defined at line 32, 33, 34, 35">Lift</a>&gt;<span class="cons_String">,</span> &lt;{<a href="#Lift_32_3" id="Lift_35_33" title="Defined at line 32, 33, 34, 35">Lift</a> <span class="cons_Lit">", "</span>}+&gt;<span class="cons_String">)</span>&gt;

  <span class="layout">// rule shorthands</span>

  <span id="Rule_39_3" title="Not referenced">Rule</span>.<span class="cons_Constructor"><span id="AxiomRule_39_8" title="Not referenced">AxiomRule</span></span> = &lt;
    &lt;<a href="../Core.sdf3/#RuleName_71_3" id="RuleName_40_6" title="Defined at ../Core.sdf3 line 71, 72">RuleName</a>&gt;&lt;<a href="#RuleHead_43_3" id="RuleHead_40_16" title="Defined at line 43">RuleHead</a>&gt;<span class="cons_String">.</span>
  &gt;

  <a href="#RuleHead_40_16" id="RuleHead_43_3" title="Referenced at line 40">RuleHead</a>.<span class="cons_Constructor"><span id="F_43_12" title="Not referenced">F</span></span> = [[<a href="../Core.sdf3/#ConstraintId_83_3" id="ConstraintId_43_18" title="Defined at ../Core.sdf3 line 83, 84">ConstraintId</a>]<span class="cons_String">(</span>[{<a href="#Term_53_3" id="Term_43_34" title="Defined at line 53, 69, 70, 96, 166">Term</a> <span class="cons_Lit">", "</span>}*]<span class="cons_String">)</span> <span class="cons_String">=</span> [<a href="#Term_53_3" id="Term_43_51" title="Defined at line 53, 69, 70, 96, 166">Term</a>]]

  <span id="HoConstraint_45_3" title="Not referenced">HoConstraint</span>.<span class="cons_Constructor"><span id="LLam_45_16" title="Not referenced">LLam</span></span> = &lt;<span class="cons_String">{</span> &lt;{<a href="#Term_53_3" id="Term_45_28" title="Defined at line 53, 69, 70, 96, 166">Term</a> <span class="cons_Lit">", "</span>}+&gt; <span class="cons_String">}</span>&gt;

  <span id="HoConstraint_47_3" title="Not referenced">HoConstraint</span>.<span class="cons_Constructor"><span id="LC_47_16" title="Not referenced">LC</span></span> = <a href="../Core.sdf3/#ConstraintId_83_3" id="ConstraintId_47_21" title="Defined at ../Core.sdf3 line 83, 84">ConstraintId</a>

  <span id="HoConstraint_49_3" title="Not referenced">HoConstraint</span>.<span class="cons_Constructor"><span id="EQ_49_16" title="Not referenced">EQ</span></span> = &lt;<span class="cons_String">eq(</span>&lt;<a href="#Term_53_3" id="Term_49_26" title="Defined at line 53, 69, 70, 96, 166">Term</a>&gt;<span class="cons_String">)</span>&gt;

<span class="keyword">syntax</span>

  <a href="#Term_43_34" id="Term_53_3" title="Referenced at line 43, 45, 49, 70, 94, 96">Term</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="COp_53_11" title="Not referenced">COp</span></span> = <a href="../Core.sdf3/#ConstraintId_83_3" id="ConstraintId_53_17" title="Defined at ../Core.sdf3 line 83, 84">ConstraintId</a><span class="keyword">-CF</span> <span class="cons_Lit">"("</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="../Core.sdf3/#CommaTerms_353_3" id="CommaTerms_53_48" title="Defined at ../Core.sdf3 line 353">CommaTerms</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">")"</span>

<span class="keyword">lexical syntax</span>

  <span id="Keyword_57_3" title="Not referenced">Keyword</span> = <span class="cons_Lit">"constraint"</span> | <span class="cons_Lit">"maps"</span>


/******************************************************************
 * <span class="keyword">Base Constraints</span>                                               *
 ******************************************************************/

<span class="keyword">context-free syntax</span>

  <span id="HoConstraint_66_3" title="Not referenced">HoConstraint</span>.<span class="cons_Constructor"><span id="LTrue_66_16" title="Not referenced">LTrue</span></span>  = <span class="cons_Lit">"true"</span>
  <span id="HoConstraint_67_3" title="Not referenced">HoConstraint</span>.<span class="cons_Constructor"><span id="LFalse_67_16" title="Not referenced">LFalse</span></span> = <span class="cons_Lit">"false"</span>

  <a href="#Term_43_34" id="Term_69_3" title="Referenced at line 43, 45, 49, 70, 94, 96">Term</a>.<span class="cons_Constructor"><span id="NewOp_69_8" title="Not referenced">NewOp</span></span>   = <span class="cons_Lit">"new"</span>
  <a href="#Term_43_34" id="Term_70_3" title="Referenced at line 43, 45, 49, 70, 94, 96">Term</a>.<span class="cons_Constructor"><span id="AstIdOp_70_8" title="Not referenced">AstIdOp</span></span> = &lt;<span class="cons_String">astId(</span>&lt;<a href="#Term_53_3" id="Term_70_26" title="Defined at line 53, 69, 70, 96, 166">Term</a>&gt;<span class="cons_String">)</span>&gt;

  <span id="AstProperty_72_3" title="Not referenced">AstProperty</span>.<span class="cons_Constructor"><span id="Ref_72_15" title="Not referenced">Ref</span></span>  = <span class="cons_Lit">"ref"</span>
  <span id="AstProperty_73_3" title="Not referenced">AstProperty</span>.<span class="cons_Constructor"><span id="Type_73_15" title="Not referenced">Type</span></span> = <span class="cons_Lit">"type"</span>

<span class="keyword">lexical syntax</span>

  <span id="VARID_77_3" title="Not referenced">VARID</span> = <span class="cons_Lit">"new"</span> {<span class="keyword">reject</span>}

  <span id="AstPropertyId_79_3" title="Not referenced">AstPropertyId</span> = <span class="cons_Lit">"ref"</span> | <span class="cons_Lit">"type"</span> {<span class="keyword">reject</span>}


/******************************************************************
 * <span class="keyword">Relations</span>                                                      *
 ******************************************************************/

<span class="keyword">context-free syntax</span>

  <a href="#RelRef_94_32" id="RelRef_88_3" title="Referenced at line 94, 96">RelRef</a>.<span class="cons_Constructor"><span id="Decl_88_10" title="Not referenced">Decl</span></span> = <span class="cons_Lit">"decl"</span>

<span class="keyword">syntax</span>

  <span class="layout">// short-hand for querying relations</span>

  <button class="modal-open" id="Constraint_94_3" title="Multi-file references" data-urls="../../cli/CLI.sdf3/#Constraint_20_24 line 20; ../../test/Test.sdf3/#Constraint_23_8 line 23">Constraint</button><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="CAskRel_94_17" title="Not referenced">CAskRel</span></span>  = <span class="cons_Lit">"?"</span> <a href="#RelRef_88_3" id="RelRef_94_32" title="Defined at line 88">RelRef</a><span class="keyword">-CF</span> <span class="cons_Lit">"["</span> <a href="../Core.sdf3/#CommaTerms_353_3" id="CommaTerms_94_46" title="Defined at ../Core.sdf3 line 353">CommaTerms</a><span class="keyword">-CF</span> <span class="cons_Lit">"]"</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">"in"</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="#Term_53_3" id="Term_94_91" title="Defined at line 53, 69, 70, 96, 166">Term</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <a href="../Core.sdf3/#Message_418_3" id="Message_94_110" title="Defined at ../Core.sdf3 line 418, 419">Message</a><span class="keyword">-CF</span>

  <a href="#Term_43_34" id="Term_96_3" title="Referenced at line 43, 45, 49, 70, 94, 96">Term</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="AskRelOp_96_11" title="Not referenced">AskRelOp</span></span> = <span class="cons_Lit">"?"</span> <a href="#RelRef_88_3" id="RelRef_96_26" title="Defined at line 88">RelRef</a><span class="keyword">-CF</span> <span class="cons_Lit">"["</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="../Core.sdf3/#CommaTerms_353_3" id="CommaTerms_96_51" title="Defined at ../Core.sdf3 line 353">CommaTerms</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">"]"</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">"in"</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="#Term_53_3" id="Term_96_107" title="Defined at line 53, 69, 70, 96, 166">Term</a><span class="keyword">-CF</span>

<span class="keyword">lexical syntax</span>

  <span id="RelationId_100_3" title="Not referenced">RelationId</span> = <span class="cons_Lit">"decl"</span> {<span class="keyword">reject</span>}
  <span id="RelationId_101_3" title="Not referenced">RelationId</span> = <span class="cons_Lit">"ref"</span> {<span class="keyword">reject</span>}


/******************************************************************
 * <span class="keyword">Scope Graph</span>                                                    *
 ******************************************************************/

<span class="keyword">context-free syntax</span>

  <a href="#LabelRE_110_25" id="LabelRE_110_3" title="Referenced at line 110, 111, 115, 116, 132">LabelRE</a>.<span class="cons_Constructor"><a href="#ZeroOrOne_115_43" id="ZeroOrOne_110_11" title="Referenced at line 115">ZeroOrOne</a></span> = &lt;&lt;<a href="#LabelRE_110_3" id="LabelRE_110_25" title="Defined at line 110, 111">LabelRE</a>&gt;<span class="cons_String">?</span>&gt;
  <a href="#LabelRE_110_25" id="LabelRE_111_3" title="Referenced at line 110, 111, 115, 116, 132">LabelRE</a>.<span class="cons_Constructor"><a href="#OneOrMore_115_61" id="OneOrMore_111_11" title="Referenced at line 115">OneOrMore</a></span> = &lt;&lt;<a href="#LabelRE_110_3" id="LabelRE_111_25" title="Defined at line 110, 111">LabelRE</a>&gt;<span class="cons_String">+</span>&gt;

<span class="keyword">context-free priorities</span>

    { <a href="#LabelRE_110_3" id="LabelRE_115_7" title="Defined at line 110, 111">LabelRE</a>.<span class="cons_Constructor"><a href="../Core.sdf3/#Neg_210_11" id="Neg_115_15" title="Defined at ../Core.sdf3 line 210">Neg</a></span> <a href="#LabelRE_110_3" id="LabelRE_115_19" title="Defined at line 110, 111">LabelRE</a>.<span class="cons_Constructor"><a href="../Core.sdf3/#Closure_209_11" id="Closure_115_27" title="Defined at ../Core.sdf3 line 209">Closure</a></span> <a href="#LabelRE_110_3" id="LabelRE_115_35" title="Defined at line 110, 111">LabelRE</a>.<span class="cons_Constructor"><a href="#ZeroOrOne_110_11" id="ZeroOrOne_115_43" title="Defined at line 110">ZeroOrOne</a></span> <a href="#LabelRE_110_3" id="LabelRE_115_53" title="Defined at line 110, 111">LabelRE</a>.<span class="cons_Constructor"><a href="#OneOrMore_111_11" id="OneOrMore_115_61" title="Defined at line 111">OneOrMore</a></span> }
  &gt; { <a href="#LabelRE_110_3" id="LabelRE_116_7" title="Defined at line 110, 111">LabelRE</a>.<span class="cons_Constructor"><a href="../Core.sdf3/#Concat_211_11" id="Concat_116_15" title="Defined at ../Core.sdf3 line 211">Concat</a></span> <a href="#LabelRE_110_3" id="LabelRE_116_22" title="Defined at line 110, 111">LabelRE</a>.<span class="cons_Constructor"><a href="../Core.sdf3/#And_212_11" id="And_116_30" title="Defined at ../Core.sdf3 line 212">And</a></span> <a href="#LabelRE_110_3" id="LabelRE_116_34" title="Defined at line 110, 111">LabelRE</a>.<span class="cons_Constructor"><a href="../Core.sdf3/#Or_213_11" id="Or_116_42" title="Defined at ../Core.sdf3 line 213">Or</a></span> }

<span class="keyword">lexical syntax</span>

  <span id="Keyword_120_3" title="Not referenced">Keyword</span> = <span class="cons_Lit">"resolve"</span> | <span class="cons_Lit">"filter"</span> | <span class="cons_Lit">"with"</span> | <span class="cons_Lit">"and"</span>


/******************************************************************
 * <span class="keyword">Resolve</span> &amp; <span class="keyword">Query</span>
 ******************************************************************/

<span class="keyword">context-free syntax</span>

  <span class="layout">// short-hand forms for occurrences using default resolution policies</span>

  <span id="QueryFilter_131_3" title="Not referenced">QueryFilter</span>.<span class="cons_Constructor"><span id="NoFilter_131_15" title="Not referenced">NoFilter</span></span> =
  <span id="QueryFilter_132_3" title="Not referenced">QueryFilter</span>.<span class="cons_Constructor"><span id="Filter_132_15" title="Not referenced">Filter</span></span>   = &lt; <span class="cons_String">filter</span> &lt;<a href="#LabelRE_110_3" id="LabelRE_132_36" title="Defined at line 110, 111">LabelRE</a>&gt;&gt;


  <span id="QueryMin_135_3" title="Not referenced">QueryMin</span>.<span class="cons_Constructor"><span id="NoMin_135_12" title="Not referenced">NoMin</span></span> =
  <span id="QueryMin_136_3" title="Not referenced">QueryMin</span>.<span class="cons_Constructor"><span id="Min_136_12" title="Not referenced">Min</span></span>   = &lt; <span class="cons_String">min</span> &lt;<a href="../Core.sdf3/#LabelOrd_203_3" id="LabelOrd_136_27" title="Defined at ../Core.sdf3 line 203">LabelOrd</a>&gt;&gt;


  <span id="QueryProject_139_3" title="Not referenced">QueryProject</span>.<span class="cons_Constructor"><span id="NoProject_139_16" title="Not referenced">NoProject</span></span> =

<span class="keyword">lexical syntax</span>

  <span id="Keyword_143_3" title="Not referenced">Keyword</span> = <span class="cons_Lit">"filter"</span> | <span class="cons_Lit">"min"</span> | <span class="cons_Lit">"in"</span> | <span class="cons_Lit">"of"</span> | <span class="cons_Lit">"resolveMatch"</span> | <span class="cons_Lit">"resolveLt"</span> | <span class="cons_Lit">"occurrenceMatch"</span>


/******************************************************************
 * <span class="keyword">Sorts</span> &amp; <span class="keyword">Constructors</span>                                           *
 ******************************************************************/

<span class="keyword">context-free syntax</span>

  <a href="#Type_24_58" id="Type_152_3" title="Referenced at line 24, 25">Type</a>.<span class="cons_Constructor"><span id="FunType_152_8" title="Not referenced">FunType</span></span>    = [[{<a href="../Core.sdf3/#SortRef_299_3" id="SortRef_152_24" title="Defined at ../Core.sdf3 line 299, 300, 301, 302, 303, 304, 305, 306, 307, 308, 309, 310">SortRef</a> <span class="cons_Lit">" * "</span>}*] <span class="cons_String">-&gt;</span> [<a href="../Core.sdf3/#SortRef_299_3" id="SortRef_152_45" title="Defined at ../Core.sdf3 line 299, 300, 301, 302, 303, 304, 305, 306, 307, 308, 309, 310">SortRef</a>]]


/******************************************************************
 * <span class="keyword">Terms</span>                                                          *
 ******************************************************************/


/******************************************************************
 * <span class="keyword">Arithmetic</span>                                                          *
 ******************************************************************/

<span class="keyword">syntax</span>

  <a href="#Term_43_34" id="Term_166_3" title="Referenced at line 43, 45, 49, 70, 94, 96">Term</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="ArithOp_166_11" title="Not referenced">ArithOp</span></span> = <span class="cons_Lit">"#"</span> <span class="cons_Lit">"("</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="../Core.sdf3/#ArithExp_395_3" id="ArithExp_166_40" title="Defined at ../Core.sdf3 line 395, 396, 397, 398, 399, 400, 401, 402, 403, 404">ArithExp</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">")"</span>

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
