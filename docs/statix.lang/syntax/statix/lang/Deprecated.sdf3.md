---
title: Deprecated.sdf3
hide:
  - toc
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
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="statix/lang/Deprecated_1_8" title="Multi-file references" data-urls="../../../StatixLang.sdf3/#statix/lang/Deprecated_10_3 line 10; ../../test/Result.sdf3/#statix/lang/Deprecated_11_3 line 11; ../../test/Test.sdf3/#statix/lang/Deprecated_9_3 line 9">statix/lang/Deprecated</button>

<span class="keyword">imports</span>

  <a href="../Common.sdf3/#statix/lang/Common_1_8" id="statix/lang/Common_5_3" title="Defined at ../Common.sdf3 line 1">statix/lang/Common</a>
  <a href="../Core.sdf3/#statix/lang/Core_1_8" id="statix/lang/Core_6_3" title="Defined at ../Core.sdf3 line 1">statix/lang/Core</a>

<span class="keyword">template options</span>

  <span class="keyword">keyword</span> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\_\-\']

/******************************************************************
 * <span class="keyword">Filtering</span>
 ******************************************************************/

<span class="keyword">context-free syntax</span>

  <span id="QueryFilter_18_3" title="Not referenced">QueryFilter</span>.<span class="cons_Constructor"><span id="Filter_dep_18_15" title="Not referenced">Filter_dep</span></span> = &lt; <span class="cons_String">filter</span> <span class="cons_String">pathMatch[</span>&lt;<a href="#LabelRE_87_3" id="LabelRE_18_48" title="Defined at line 87">LabelRE</a>&gt;<span class="cons_String">]</span>&gt; {<span class="keyword">deprecated</span>("Use 'filter RE' instead of 'filter pathMatch[RE]'")}
  <span id="QueryMin_19_3" title="Not referenced">QueryMin</span>.<span class="cons_Constructor"><span id="Min_dep_19_12" title="Not referenced">Min_dep</span></span>       = &lt; <span class="cons_String">min</span> <span class="cons_String">pathLt[</span>&lt;<a href="../Core.sdf3/#LabelPairs_201_3" id="LabelPairs_19_42" title="Defined at ../Core.sdf3 line 201">LabelPairs</a>&gt;<span class="cons_String">]</span>&gt;    {<span class="keyword">deprecated</span>("Use 'min LT' instead of 'min pathLt[LT]'")}

  <span id="QueryFilter_21_3" title="Not referenced">QueryFilter</span>.<span class="cons_Constructor"><span id="Filter_dep_21_15" title="Not referenced">Filter_dep</span></span> = &lt; <span class="cons_String">filter</span> <span class="cons_String">pathMatch[</span>&lt;<a href="#LabelRE_87_3" id="LabelRE_21_48" title="Defined at line 87">LabelRE</a>&gt;<span class="cons_String">]</span> <span class="cons_String">and</span> &lt;<a href="#HoConstraint_91_3" id="HoConstraint_21_63" title="Defined at line 91">HoConstraint</a>&gt;&gt; {<span class="keyword">deprecated</span>("Use 'filter RE' instead of 'filter pathMatch[RE]'")}
  <span id="QueryMin_22_3" title="Not referenced">QueryMin</span>.<span class="cons_Constructor"><span id="Min_dep_22_12" title="Not referenced">Min_dep</span></span>       = &lt; <span class="cons_String">min</span> <span class="cons_String">pathLt[</span>&lt;<a href="../Core.sdf3/#LabelPairs_201_3" id="LabelPairs_22_42" title="Defined at ../Core.sdf3 line 201">LabelPairs</a>&gt;<span class="cons_String">]</span> <span class="cons_String">and</span> &lt;<a href="#HoConstraint_91_3" id="HoConstraint_22_60" title="Defined at line 91">HoConstraint</a>&gt;&gt;    {<span class="keyword">deprecated</span>("Use 'min LT' instead of 'min pathLt[LT]'")}

  <a href="#NamespaceFilter_44_58" id="NamespaceFilter_24_3" title="Referenced at line 44">NamespaceFilter</a>.<span class="cons_Constructor"><span id="NamespaceFilter_dep_24_19" title="Not referenced">NamespaceFilter_dep</span></span> = &lt; <span class="cons_String">filter</span> <span class="cons_String">pathMatch[</span>&lt;<a href="#LabelRE_87_3" id="LabelRE_24_61" title="Defined at line 87">LabelRE</a>&gt;<span class="cons_String">]</span>&gt; {<span class="keyword">deprecated</span>("Use 'filter RE' instead of 'filter pathMatch[RE]'")}
  <a href="#NamespaceMin_44_75" id="NamespaceMin_25_3" title="Referenced at line 44">NamespaceMin</a>.<span class="cons_Constructor"><span id="NamespaceMin_dep_25_16" title="Not referenced">NamespaceMin_dep</span></span>       = &lt; <span class="cons_String">min</span> <span class="cons_String">pathLt[</span>&lt;<a href="../Core.sdf3/#LabelPairs_201_3" id="LabelPairs_25_55" title="Defined at ../Core.sdf3 line 201">LabelPairs</a>&gt;<span class="cons_String">]</span>&gt;    {<span class="keyword">deprecated</span>("Use 'min LT' instead of 'min pathLt[LT]'")}

/******************************************************************
 * <span class="keyword">Scope Graph creation</span>
 ******************************************************************/

<span class="keyword">context-free syntax</span>

  <span class="layout">// namespaces</span>
  <span id="Signature_34_3" title="Not referenced">Signature</span>.<span class="cons_Constructor"><span id="Namespaces_34_13" title="Not referenced">Namespaces</span></span> = &lt;
    <span class="cons_String">namespaces</span>
      &lt;{<a href="#NsDecl_39_3" id="NsDecl_36_9" title="Defined at line 39">NsDecl</a> <span class="cons_Lit">"\n"</span>}*&gt;
  &gt; {<span class="keyword">longest-match</span>, <span class="keyword">deprecated</span>("Usage of namespaces is strongly discouraged.")}

  <a href="#NsDecl_36_9" id="NsDecl_39_3" title="Referenced at line 36, 41">NsDecl</a>.<span class="cons_Constructor"><span id="NsDecl_39_10" title="Not referenced">NsDecl</span></span> = &lt;&lt;<a href="../Core.sdf3/#NamespaceId_238_3" id="NamespaceId_39_21" title="Defined at ../Core.sdf3 line 238">NamespaceId</a>&gt; <span class="cons_String">:</span> &lt;{<a href="../Core.sdf3/#SortRef_299_3" id="SortRef_39_38" title="Defined at ../Core.sdf3 line 299, 300, 301, 302, 303, 304, 305, 306, 307, 308, 309, 310">SortRef</a> <span class="cons_Lit">" * "</span>}*&gt;&gt; {<span class="keyword">deprecated</span>("Usage of namespaces is strongly discouraged.")}

  <span id="Rule_41_3" title="Not referenced">Rule</span> = &lt;<span class="cons_String">namespace</span> &lt;<a href="#NsDecl_39_3" id="NsDecl_41_22" title="Defined at line 39">NsDecl</a>&gt;&gt;

  <span class="layout">// default resolution policies</span>
  <a href="#NamespaceQuery_46_21" id="NamespaceQuery_44_3" title="Referenced at line 46, 47">NamespaceQuery</a>.<span class="cons_Constructor"><span id="NamespaceQuery_44_18" title="Not referenced">NamespaceQuery</span></span> = &lt;<span class="cons_String">resolve</span> &lt;<a href="../Core.sdf3/#NamespaceId_238_3" id="NamespaceId_44_45" title="Defined at ../Core.sdf3 line 238">NamespaceId</a>&gt;&lt;<a href="#NamespaceFilter_24_3" id="NamespaceFilter_44_58" title="Defined at line 24, 49, 50">NamespaceFilter</a>&gt;&lt;<a href="#NamespaceMin_25_3" id="NamespaceMin_44_75" title="Defined at line 25, 52, 53">NamespaceMin</a>&gt;&gt; {<span class="keyword">deprecated</span>("Namespaces might be removed in a future version.")}

  <span id="ResolutionParam_46_3" title="Not referenced">ResolutionParam</span> = <a href="#NamespaceQuery_44_3" id="NamespaceQuery_46_21" title="Defined at line 44">NamespaceQuery</a>
  <span id="Rule_47_3" title="Not referenced">Rule</span>            = <a href="#NamespaceQuery_44_3" id="NamespaceQuery_47_21" title="Defined at line 44">NamespaceQuery</a>

  <a href="#NamespaceFilter_44_58" id="NamespaceFilter_49_3" title="Referenced at line 44">NamespaceFilter</a>.<span class="cons_Constructor"><span id="NamespaceFilter_49_19" title="Not referenced">NamespaceFilter</span></span>   = &lt; <span class="cons_String">filter</span> &lt;<a href="#LabelRE_87_3" id="LabelRE_49_49" title="Defined at line 87">LabelRE</a>&gt;&gt;
  <a href="#NamespaceFilter_44_58" id="NamespaceFilter_50_3" title="Referenced at line 44">NamespaceFilter</a>.<span class="cons_Constructor"><span id="NoNamespaceFilter_50_19" title="Not referenced">NoNamespaceFilter</span></span> =

  <a href="#NamespaceMin_44_75" id="NamespaceMin_52_3" title="Referenced at line 44">NamespaceMin</a>.<span class="cons_Constructor"><span id="NamespaceMin_52_16" title="Not referenced">NamespaceMin</span></span>   = &lt; <span class="cons_String">min</span> &lt;<a href="../Core.sdf3/#LabelPairs_201_3" id="LabelPairs_52_40" title="Defined at ../Core.sdf3 line 201">LabelPairs</a>&gt;&gt;
  <a href="#NamespaceMin_44_75" id="NamespaceMin_53_3" title="Referenced at line 44">NamespaceMin</a>.<span class="cons_Constructor"><span id="NoNamespaceMin_53_16" title="Not referenced">NoNamespaceMin</span></span> =

  <span id="Constraint_55_3" title="Not referenced">Constraint</span>.<span class="cons_Constructor"><span id="CTellDecl_55_14" title="Not referenced">CTellDecl</span></span>         = [[<a href="#Term_75_3" id="Term_55_36" title="Defined at line 75">Term</a>] <span class="cons_String">-&gt;</span> [<a href="#Occurrence_77_3" id="Occurrence_55_46" title="Defined at line 77">Occurrence</a>]] {<span class="keyword">deprecated</span>("Occurrences might be removed in a future version. Use `!rel[...]` syntax instead.")}
  <span id="Constraint_56_3" title="Not referenced">Constraint</span>.<span class="cons_Constructor"><span id="CTellDeclWithRels_56_14" title="Not referenced">CTellDeclWithRels</span></span> = [[<a href="#Term_75_3" id="Term_56_36" title="Defined at line 75">Term</a>] <span class="cons_String">-&gt;</span> [<a href="#Occurrence_77_3" id="Occurrence_56_46" title="Defined at line 77">Occurrence</a>] <span class="cons_String">with</span> [{<a href="#RelData_58_3" id="RelData_56_65" title="Defined at line 58">RelData</a> <span class="cons_Lit">" and "</span>}+]] {<span class="keyword">deprecated</span>("Occurrences might be removed in a future version. Use `!rel[...]` syntax instead.")}

  <a href="#RelData_56_65" id="RelData_58_3" title="Referenced at line 56">RelData</a> = [[<a href="../Core.sdf3/#RelRef_165_3" id="RelRef_58_15" title="Defined at ../Core.sdf3 line 165">RelRef</a>] [<a href="#Term_75_3" id="Term_58_24" title="Defined at line 75">Term</a>]]

/******************************************************************
 * <span class="keyword">Resolve</span> &amp; <span class="keyword">Query</span>
 ******************************************************************/

<span class="keyword">context-free syntax</span>

  <span id="Constraint_66_3" title="Not referenced">Constraint</span>.<span class="cons_Constructor"><span id="CResolveRef_66_14" title="Not referenced">CResolveRef</span></span>        = [[<a href="#Occurrence_77_3" id="Occurrence_66_37" title="Defined at line 77">Occurrence</a>] <span class="cons_String">in</span> [<a href="#Term_75_3" id="Term_66_53" title="Defined at line 75">Term</a>] <span class="cons_String">|-&gt;</span> [<a href="#Term_75_3" id="Term_66_64" title="Defined at line 75">Term</a>][<a href="../Core.sdf3/#Message_418_3" id="Message_66_70" title="Defined at ../Core.sdf3 line 418, 419">Message</a>]]             {<span class="keyword">deprecated</span>("Occurrences might be removed in a future version. Use `query` syntax instead.")}
  <span id="Constraint_67_3" title="Not referenced">Constraint</span>.<span class="cons_Constructor"><span id="CResolveRefWithRel_67_14" title="Not referenced">CResolveRefWithRel</span></span> = [[<a href="../Core.sdf3/#RelRef_165_3" id="RelRef_67_37" title="Defined at ../Core.sdf3 line 165">RelRef</a>] <span class="cons_String">of</span> [<a href="#Occurrence_77_3" id="Occurrence_67_49" title="Defined at line 77">Occurrence</a>] <span class="cons_String">in</span> [<a href="#Term_75_3" id="Term_67_65" title="Defined at line 75">Term</a>] <span class="cons_String">|-&gt;</span> [<a href="#Term_75_3" id="Term_67_76" title="Defined at line 75">Term</a>][<a href="../Core.sdf3/#Message_418_3" id="Message_67_82" title="Defined at ../Core.sdf3 line 418, 419">Message</a>]] {<span class="keyword">deprecated</span>("Occurrences might be removed in a future version. Use `query` syntax instead.")}

  <span class="layout">// little duplication to fix ambiguity between</span>
  <span class="layout">// As(Var(_),Var(_)), NoId() and Var(_), WithId(Var(_))</span>
  <a href="#OccurrenceTerm_73_24" id="OccurrenceTerm_71_3" title="Referenced at line 73">OccurrenceTerm</a>  = <a href="#Term_75_3" id="Term_71_21" title="Defined at line 75">Term</a> {<span class="keyword">longest-match</span>}
  <a href="#OccurrenceTerm_73_24" id="OccurrenceTerm_72_3" title="Referenced at line 73">OccurrenceTerm</a>  = &lt;&lt;<a href="../Core.sdf3/#Var_337_3" id="Var_72_23" title="Defined at ../Core.sdf3 line 337, 338">Var</a>&gt;<span class="cons_String">@</span>&lt;<a href="#Term_75_3" id="Term_72_29" title="Defined at line 75">Term</a>&gt;&gt; {<span class="keyword">reject</span>}
  <a href="#OccurrenceTerms_85_67" id="OccurrenceTerms_73_3" title="Referenced at line 85">OccurrenceTerms</a> = &lt;&lt;{<a href="#OccurrenceTerm_71_3" id="OccurrenceTerm_73_24" title="Defined at line 71, 72">OccurrenceTerm</a> <span class="cons_Lit">" "</span>}*&gt;&gt;

  <a href="#Term_55_36" id="Term_75_3" title="Referenced at line 55, 56, 58, 66, 67, 71, 72">Term</a> = <a href="#Occurrence_77_3" id="Occurrence_75_10" title="Defined at line 77">Occurrence</a>

  <a href="#Occurrence_55_46" id="Occurrence_77_3" title="Referenced at line 55, 56, 66, 67, 75, 87, 89, 91">Occurrence</a> = <a href="#OccurrenceLit_85_3" id="OccurrenceLit_77_16" title="Defined at line 85">OccurrenceLit</a> <span class="layout">// this indirection is necessary to solve parse errors</span>

<span class="keyword">syntax</span>

  <a href="#OccurrencePosition_85_97" id="OccurrencePosition_81_3" title="Referenced at line 85">OccurrencePosition</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="NoId_81_25" title="Not referenced">NoId</span></span>   =
  <a href="#OccurrencePosition_85_97" id="OccurrencePosition_82_3" title="Referenced at line 85">OccurrencePosition</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="WithId_82_25" title="Not referenced">WithId</span></span> = <span class="cons_Lit">"@"</span> <a href="../Core.sdf3/#TermOrTermIndex_142_3" id="TermOrTermIndex_82_38" title="Defined at ../Core.sdf3 line 142">TermOrTermIndex</a><span class="keyword">-CF</span>
  <a href="#OccurrencePosition_85_97" id="OccurrencePosition_83_3" title="Referenced at line 85">OccurrencePosition</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="NoId_83_25" title="Not referenced">NoId</span></span>   = <span class="cons_Lit">"@-"</span>

  <a href="#OccurrenceLit_77_16" id="OccurrenceLit_85_3" title="Referenced at line 77">OccurrenceLit</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="StxOccurrence_85_20" title="Not referenced">StxOccurrence</span></span> = <a href="../Core.sdf3/#NamespaceId_238_3" id="NamespaceId_85_36" title="Defined at ../Core.sdf3 line 238">NamespaceId</a><span class="keyword">-LEX</span> <span class="cons_Lit">"{"</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="#OccurrenceTerms_73_3" id="OccurrenceTerms_85_67" title="Defined at line 73">OccurrenceTerms</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <a href="#OccurrencePosition_81_3" id="OccurrencePosition_85_97" title="Defined at line 81, 82, 83">OccurrencePosition</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">"}"</span> {<span class="keyword">deprecated</span>("Usage of occurrences is strongly discouraged.")}

  <button class="modal-open" id="LabelRE_87_3" title="Multi-file references" data-urls="#LabelRE_18_48 line 18, 21, 24, 49; ../../../StatixLang.sdf3/#LabelRE_24_3 line 24">LabelRE</button><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="ResolveMatch_87_14" title="Not referenced">ResolveMatch</span></span> = <span class="cons_Lit">"resolveMatch"</span> <span class="cons_Lit">"["</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="#Occurrence_77_3" id="Occurrence_87_59" title="Defined at line 77">Occurrence</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span>  <span class="cons_Lit">"]"</span>           {<span class="keyword">deprecated</span>("Occurrences might be removed in a future version.")}

  <span id="LabelOrd_89_3" title="Not referenced">LabelOrd</span><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="ResolveLt_89_15" title="Not referenced">ResolveLt</span></span> = <span class="cons_Lit">"resolveLt"</span> <span class="cons_Lit">"["</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="#Occurrence_77_3" id="Occurrence_89_54" title="Defined at line 77">Occurrence</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">"]"</span>                 {<span class="keyword">deprecated</span>("Occurrences might be removed in a future version.")}

  <a href="#HoConstraint_21_63" id="HoConstraint_91_3" title="Referenced at line 21, 22">HoConstraint</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="OccurrenceMatch_91_19" title="Not referenced">OccurrenceMatch</span></span> = <span class="cons_Lit">"occurrenceMatch"</span> <span class="cons_Lit">"["</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="#Occurrence_77_3" id="Occurrence_91_70" title="Defined at line 77">Occurrence</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">"]"</span> {<span class="keyword">deprecated</span>("Occurrences might be removed in a future version.")}

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
