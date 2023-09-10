---
title: Deprecated.sdf3
---

# `Deprecated.sdf3`

:simple-github: [pdmosses/nabl/statix.lang/syntax/statix/lang/Deprecated.sdf3]

[pdmosses/nabl/statix.lang/syntax/statix/lang/Deprecated.sdf3]: https://github.com/pdmosses/nabl/blob/master/statix.lang/syntax/statix/lang/Deprecated.sdf3 "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../../test/Test.sdf3#statix/lang/Deprecated_117_139" id="statix/lang/Deprecated_7_29" title="Referenced at ../../test/Test.sdf3 line 9">statix/lang/Deprecated</a>

<span class="keyword">imports</span>

  <a href="../Common.sdf3#statix/lang/Common_7_25" id="statix/lang/Common_42_60" title="Defined at ../Common.sdf3 line 1">statix/lang/Common</a>
  <a href="../Core.sdf3#statix/lang/Core_7_23" id="statix/lang/Core_63_79" title="Defined at ../Core.sdf3 line 1">statix/lang/Core</a>

<span class="keyword">template options</span>

  <span class="keyword">keyword</span> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\_\-\']

/******************************************************************
 * <span class="keyword">Filtering</span>
 ******************************************************************/

<span class="keyword">context-free syntax</span>

  <span id="QueryFilter_306_317" title="Not referenced locally, nor via imports">QueryFilter</span>.<span class="cons_Constructor"><span id="Filter_dep_318_328" title="Not referenced locally, nor via imports">Filter_dep</span></span> = &lt; <span class="cons_String">filter</span> <span class="cons_String">pathMatch[</span>&lt;<a href="#LabelRE_3620_3627" id="LabelRE_351_358" title="Defined at line 87">LabelRE</a>&gt;<span class="cons_String">]</span>&gt; {<span class="keyword">deprecated</span>("Use 'filter RE' instead of 'filter pathMatch[RE]'")}
  <span id="QueryMin_430_438" title="Not referenced locally, nor via imports">QueryMin</span>.<span class="cons_Constructor"><span id="Min_dep_439_446" title="Not referenced locally, nor via imports">Min_dep</span></span>       = &lt; <span class="cons_String">min</span> <span class="cons_String">pathLt[</span>&lt;<a href="../Core.sdf3#LabelPairs_4258_4268" id="LabelPairs_469_479" title="Defined at ../Core.sdf3 line 201">LabelPairs</a>&gt;<span class="cons_String">]</span>&gt;    {<span class="keyword">deprecated</span>("Use 'min LT' instead of 'min pathLt[LT]'")}

  <span id="QueryFilter_546_557" title="Not referenced locally, nor via imports">QueryFilter</span>.<span class="cons_Constructor"><span id="Filter_dep_558_568" title="Not referenced locally, nor via imports">Filter_dep</span></span> = &lt; <span class="cons_String">filter</span> <span class="cons_String">pathMatch[</span>&lt;<a href="#LabelRE_3620_3627" id="LabelRE_591_598" title="Defined at line 87">LabelRE</a>&gt;<span class="cons_String">]</span> <span class="cons_String">and</span> &lt;<a href="#HoConstraint_3950_3962" id="HoConstraint_606_618" title="Defined at line 91">HoConstraint</a>&gt;&gt; {<span class="keyword">deprecated</span>("Use 'filter RE' instead of 'filter pathMatch[RE]'")}
  <span id="QueryMin_689_697" title="Not referenced locally, nor via imports">QueryMin</span>.<span class="cons_Constructor"><span id="Min_dep_698_705" title="Not referenced locally, nor via imports">Min_dep</span></span>       = &lt; <span class="cons_String">min</span> <span class="cons_String">pathLt[</span>&lt;<a href="../Core.sdf3#LabelPairs_4258_4268" id="LabelPairs_728_738" title="Defined at ../Core.sdf3 line 201">LabelPairs</a>&gt;<span class="cons_String">]</span> <span class="cons_String">and</span> &lt;<a href="#HoConstraint_3950_3962" id="HoConstraint_746_758" title="Defined at line 91">HoConstraint</a>&gt;&gt;    {<span class="keyword">deprecated</span>("Use 'min LT' instead of 'min pathLt[LT]'")}

  <a href="#NamespaceFilter_1671_1686" id="NamespaceFilter_824_839" title="Referenced at line 44">NamespaceFilter</a>.<span class="cons_Constructor"><span id="NamespaceFilter_dep_840_859" title="Not referenced locally, nor via imports">NamespaceFilter_dep</span></span> = &lt; <span class="cons_String">filter</span> <span class="cons_String">pathMatch[</span>&lt;<a href="#LabelRE_3620_3627" id="LabelRE_882_889" title="Defined at line 87">LabelRE</a>&gt;<span class="cons_String">]</span>&gt; {<span class="keyword">deprecated</span>("Use 'filter RE' instead of 'filter pathMatch[RE]'")}
  <a href="#NamespaceMin_1688_1700" id="NamespaceMin_961_973" title="Referenced at line 44">NamespaceMin</a>.<span class="cons_Constructor"><span id="NamespaceMin_dep_974_990" title="Not referenced locally, nor via imports">NamespaceMin_dep</span></span>       = &lt; <span class="cons_String">min</span> <span class="cons_String">pathLt[</span>&lt;<a href="../Core.sdf3#LabelPairs_4258_4268" id="LabelPairs_1013_1023" title="Defined at ../Core.sdf3 line 201">LabelPairs</a>&gt;<span class="cons_String">]</span>&gt;    {<span class="keyword">deprecated</span>("Use 'min LT' instead of 'min pathLt[LT]'")}

/******************************************************************
 * <span class="keyword">Scope Graph creation</span>
 ******************************************************************/

<span class="keyword">context-free syntax</span>

  <span class="layout">// namespaces</span>
  <span id="Signature_1289_1298" title="Not referenced locally, nor via imports">Signature</span>.<span class="cons_Constructor"><span id="Namespaces_1299_1309" title="Not referenced locally, nor via imports">Namespaces</span></span> = &lt;
    <span class="cons_String">namespaces</span>
      &lt;{<a href="#NsDecl_1435_1441" id="NsDecl_1337_1343" title="Defined at line 39">NsDecl</a> <span class="cons_Lit">"\n"</span>}*&gt;
  &gt; {<span class="keyword">longest-match</span>, <span class="keyword">deprecated</span>("Usage of namespaces is strongly discouraged.")}

  <a href="#NsDecl_1571_1577" id="NsDecl_1435_1441" title="Referenced at line 41">NsDecl</a>.<span class="cons_Constructor"><span id="NsDecl_1442_1448" title="Not referenced locally, nor via imports">NsDecl</span></span> = &lt;&lt;<a href="../Core.sdf3#NamespaceId_5294_5305" id="NamespaceId_1453_1464" title="Defined at ../Core.sdf3 line 238">NamespaceId</a>&gt; <span class="cons_String">:</span> &lt;{<a href="../Core.sdf3#SortRef_6813_6820" id="SortRef_1470_1477" title="Defined at ../Core.sdf3 line 299, 300, 301, 302, 303, 304, 305, 306, 307, 308, 309, 310">SortRef</a> <span class="cons_Lit">" * "</span>}*&gt;&gt; {<span class="keyword">deprecated</span>("Usage of namespaces is strongly discouraged.")}

  <span id="Rule_1552_1556" title="Not referenced locally, nor via imports">Rule</span> = &lt;<span class="cons_String">namespace</span> &lt;<a href="#NsDecl_1435_1441" id="NsDecl_1571_1577" title="Defined at line 39">NsDecl</a>&gt;&gt;

  <span class="layout">// default resolution policies</span>
  <a href="#NamespaceQuery_1824_1838" id="NamespaceQuery_1616_1630" title="Referenced at line 47">NamespaceQuery</a>.<span class="cons_Constructor"><span id="NamespaceQuery_1631_1645" title="Not referenced locally, nor via imports">NamespaceQuery</span></span> = &lt;<span class="cons_String">resolve</span> &lt;<a href="../Core.sdf3#NamespaceId_5294_5305" id="NamespaceId_1658_1669" title="Defined at ../Core.sdf3 line 238">NamespaceId</a>&gt;&lt;<a href="#NamespaceFilter_824_839" id="NamespaceFilter_1671_1686" title="Defined at line 24, 49, 50">NamespaceFilter</a>&gt;&lt;<a href="#NamespaceMin_961_973" id="NamespaceMin_1688_1700" title="Defined at line 25, 52, 53">NamespaceMin</a>&gt;&gt; {<span class="keyword">deprecated</span>("Namespaces might be removed in a future version.")}

  <span id="ResolutionParam_1771_1786" title="Not referenced locally, nor via imports">ResolutionParam</span> = <a href="#NamespaceQuery_1616_1630" id="NamespaceQuery_1789_1803" title="Defined at line 44">NamespaceQuery</a>
  <span id="Rule_1806_1810" title="Not referenced locally, nor via imports">Rule</span>            = <a href="#NamespaceQuery_1616_1630" id="NamespaceQuery_1824_1838" title="Defined at line 44">NamespaceQuery</a>

  <a href="#NamespaceFilter_1671_1686" id="NamespaceFilter_1842_1857" title="Referenced at line 44">NamespaceFilter</a>.<span class="cons_Constructor"><span id="NamespaceFilter_1858_1873" title="Not referenced locally, nor via imports">NamespaceFilter</span></span>   = &lt; <span class="cons_String">filter</span> &lt;<a href="#LabelRE_3620_3627" id="LabelRE_1888_1895" title="Defined at line 87">LabelRE</a>&gt;&gt;
  <a href="#NamespaceFilter_1671_1686" id="NamespaceFilter_1900_1915" title="Referenced at line 44">NamespaceFilter</a>.<span class="cons_Constructor"><span id="NoNamespaceFilter_1916_1933" title="Not referenced locally, nor via imports">NoNamespaceFilter</span></span> =

  <a href="#NamespaceMin_1688_1700" id="NamespaceMin_1939_1951" title="Referenced at line 44">NamespaceMin</a>.<span class="cons_Constructor"><span id="NamespaceMin_1952_1964" title="Not referenced locally, nor via imports">NamespaceMin</span></span>   = &lt; <span class="cons_String">min</span> &lt;<a href="../Core.sdf3#LabelPairs_4258_4268" id="LabelPairs_1976_1986" title="Defined at ../Core.sdf3 line 201">LabelPairs</a>&gt;&gt;
  <a href="#NamespaceMin_1688_1700" id="NamespaceMin_1991_2003" title="Referenced at line 44">NamespaceMin</a>.<span class="cons_Constructor"><span id="NoNamespaceMin_2004_2018" title="Not referenced locally, nor via imports">NoNamespaceMin</span></span> =

  <span id="Constraint_2024_2034" title="Not referenced locally, nor via imports">Constraint</span>.<span class="cons_Constructor"><span id="CTellDecl_2035_2044" title="Not referenced locally, nor via imports">CTellDecl</span></span>         = [[<a href="#Term_3182_3186" id="Term_2057_2061" title="Defined at line 75">Term</a>] <span class="cons_String">-&gt;</span> [<a href="#Occurrence_3203_3213" id="Occurrence_2067_2077" title="Defined at line 77">Occurrence</a>]] {<span class="keyword">deprecated</span>("Occurrences might be removed in a future version. Use `!rel[...]` syntax instead.")}
  <span id="Constraint_2180_2190" title="Not referenced locally, nor via imports">Constraint</span>.<span class="cons_Constructor"><span id="CTellDeclWithRels_2191_2208" title="Not referenced locally, nor via imports">CTellDeclWithRels</span></span> = [[<a href="#Term_3182_3186" id="Term_2213_2217" title="Defined at line 75">Term</a>] <span class="cons_String">-&gt;</span> [<a href="#Occurrence_3203_3213" id="Occurrence_2223_2233" title="Defined at line 77">Occurrence</a>] <span class="cons_String">with</span> [{<a href="#RelData_2363_2370" id="RelData_2242_2249" title="Defined at line 58">RelData</a> <span class="cons_Lit">" and "</span>}+]] {<span class="keyword">deprecated</span>("Occurrences might be removed in a future version. Use `!rel[...]` syntax instead.")}

  <a href="#RelData_2242_2249" id="RelData_2363_2370" title="Referenced at line 56">RelData</a> = [[<a href="../Core.sdf3#RelRef_3522_3528" id="RelRef_2375_2381" title="Defined at ../Core.sdf3 line 165">RelRef</a>] [<a href="#Term_3182_3186" id="Term_2384_2388" title="Defined at line 75">Term</a>]]

/******************************************************************
 * <span class="keyword">Resolve</span> &amp; <span class="keyword">Query</span>
 ******************************************************************/

<span class="keyword">context-free syntax</span>

  <span id="Constraint_2572_2582" title="Not referenced locally, nor via imports">Constraint</span>.<span class="cons_Constructor"><span id="CResolveRef_2583_2594" title="Not referenced locally, nor via imports">CResolveRef</span></span>        = [[<a href="#Occurrence_3203_3213" id="Occurrence_2606_2616" title="Defined at line 77">Occurrence</a>] <span class="cons_String">in</span> [<a href="#Term_3182_3186" id="Term_2622_2626" title="Defined at line 75">Term</a>] <span class="cons_String">|-&gt;</span> [<a href="#Term_3182_3186" id="Term_2633_2637" title="Defined at line 75">Term</a>][<a href="../Core.sdf3#Message_10079_10086" id="Message_2639_2646" title="Defined at ../Core.sdf3 line 418, 419">Message</a>]]             {<span class="keyword">deprecated</span>("Occurrences might be removed in a future version. Use `query` syntax instead.")}
  <span id="Constraint_2757_2767" title="Not referenced locally, nor via imports">Constraint</span>.<span class="cons_Constructor"><span id="CResolveRefWithRel_2768_2786" title="Not referenced locally, nor via imports">CResolveRefWithRel</span></span> = [[<a href="../Core.sdf3#RelRef_3522_3528" id="RelRef_2791_2797" title="Defined at ../Core.sdf3 line 165">RelRef</a>] <span class="cons_String">of</span> [<a href="#Occurrence_3203_3213" id="Occurrence_2803_2813" title="Defined at line 77">Occurrence</a>] <span class="cons_String">in</span> [<a href="#Term_3182_3186" id="Term_2819_2823" title="Defined at line 75">Term</a>] <span class="cons_String">|-&gt;</span> [<a href="#Term_3182_3186" id="Term_2830_2834" title="Defined at line 75">Term</a>][<a href="../Core.sdf3#Message_10079_10086" id="Message_2836_2843" title="Defined at ../Core.sdf3 line 418, 419">Message</a>]] {<span class="keyword">deprecated</span>("Occurrences might be removed in a future version. Use `query` syntax instead.")}

  <span class="layout">// little duplication to fix ambiguity between</span>
  <span class="layout">// As(Var(_),Var(_)), NoId() and Var(_), WithId(Var(_))</span>
  <a href="#OccurrenceTerm_3156_3170" id="OccurrenceTerm_3050_3064" title="Referenced at line 73">OccurrenceTerm</a>  = <a href="#Term_3182_3186" id="Term_3068_3072" title="Defined at line 75">Term</a> {<span class="keyword">longest-match</span>}
  <a href="#OccurrenceTerm_3156_3170" id="OccurrenceTerm_3091_3105" title="Referenced at line 73">OccurrenceTerm</a>  = &lt;&lt;<a href="../Core.sdf3#Var_7912_7915" id="Var_3111_3114" title="Defined at ../Core.sdf3 line 337, 338">Var</a>&gt;<span class="cons_String">@</span>&lt;<a href="#Term_3182_3186" id="Term_3117_3121" title="Defined at line 75">Term</a>&gt;&gt; {<span class="keyword">reject</span>}
  <a href="#OccurrenceTerms_3488_3503" id="OccurrenceTerms_3135_3150" title="Referenced at line 85">OccurrenceTerms</a> = &lt;&lt;{<a href="#OccurrenceTerm_3050_3064" id="OccurrenceTerm_3156_3170" title="Defined at line 71, 72">OccurrenceTerm</a> <span class="cons_Lit">" "</span>}*&gt;&gt;

  <a href="#Term_3117_3121" id="Term_3182_3186" title="Referenced at line 72">Term</a> = <a href="#Occurrence_3203_3213" id="Occurrence_3189_3199" title="Defined at line 77">Occurrence</a>

  <a href="#Occurrence_4017_4027" id="Occurrence_3203_3213" title="Referenced at line 91">Occurrence</a> = <a href="#OccurrenceLit_3424_3437" id="OccurrenceLit_3216_3229" title="Defined at line 85">OccurrenceLit</a> <span class="layout">// this indirection is necessary to solve parse errors</span>

<span class="keyword">syntax</span>

  <a href="#OccurrencePosition_3518_3536" id="OccurrencePosition_3296_3314" title="Referenced at line 85">OccurrencePosition</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="NoId_3318_3322" title="Not referenced locally, nor via imports">NoId</span></span>   =
  <a href="#OccurrencePosition_3518_3536" id="OccurrencePosition_3329_3347" title="Referenced at line 85">OccurrencePosition</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="WithId_3351_3357" title="Not referenced locally, nor via imports">WithId</span></span> = <span class="cons_Lit">"@"</span> <a href="../Core.sdf3#TermOrTermIndex_3050_3065" id="TermOrTermIndex_3364_3379" title="Defined at ../Core.sdf3 line 142">TermOrTermIndex</a><span class="keyword">-CF</span>
  <a href="#OccurrencePosition_3518_3536" id="OccurrencePosition_3385_3403" title="Referenced at line 85">OccurrencePosition</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="NoId_3407_3411" title="Not referenced locally, nor via imports">NoId</span></span>   = <span class="cons_Lit">"@-"</span>

  <a href="#OccurrenceLit_3216_3229" id="OccurrenceLit_3424_3437" title="Referenced at line 77">OccurrenceLit</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="StxOccurrence_3441_3454" title="Not referenced locally, nor via imports">StxOccurrence</span></span> = <a href="../Core.sdf3#NamespaceId_5294_5305" id="NamespaceId_3457_3468" title="Defined at ../Core.sdf3 line 238">NamespaceId</a><span class="keyword">-LEX</span> <span class="cons_Lit">"{"</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="#OccurrenceTerms_3135_3150" id="OccurrenceTerms_3488_3503" title="Defined at line 73">OccurrenceTerms</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <a href="#OccurrencePosition_3296_3314" id="OccurrencePosition_3518_3536" title="Defined at line 81, 82, 83">OccurrencePosition</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">"}"</span> {<span class="keyword">deprecated</span>("Usage of occurrences is strongly discouraged.")}

  <a href="#LabelRE_1888_1895" id="LabelRE_3620_3627" title="Referenced at line 49; ../../../StatixLang.sdf3 line 24">LabelRE</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="ResolveMatch_3631_3643" title="Not referenced locally, nor via imports">ResolveMatch</span></span> = <span class="cons_Lit">"resolveMatch"</span> <span class="cons_Lit">"["</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="#Occurrence_3203_3213" id="Occurrence_3676_3686" title="Defined at line 77">Occurrence</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span>  <span class="cons_Lit">"]"</span>           {<span class="keyword">deprecated</span>("Occurrences might be removed in a future version.")}

  <span id="LabelOrd_3785_3793" title="Not referenced locally, nor via imports">LabelOrd</span><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="ResolveLt_3797_3806" title="Not referenced locally, nor via imports">ResolveLt</span></span> = <span class="cons_Lit">"resolveLt"</span> <span class="cons_Lit">"["</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="#Occurrence_3203_3213" id="Occurrence_3836_3846" title="Defined at line 77">Occurrence</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">"]"</span>                 {<span class="keyword">deprecated</span>("Occurrences might be removed in a future version.")}

  <a href="#HoConstraint_746_758" id="HoConstraint_3950_3962" title="Referenced at line 22">HoConstraint</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="OccurrenceMatch_3966_3981" title="Not referenced locally, nor via imports">OccurrenceMatch</span></span> = <span class="cons_Lit">"occurrenceMatch"</span> <span class="cons_Lit">"["</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="#Occurrence_3203_3213" id="Occurrence_4017_4027" title="Defined at line 77">Occurrence</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">"]"</span> {<span class="keyword">deprecated</span>("Occurrences might be removed in a future version.")}

</code></pre></td></tr></tbody></table></div>