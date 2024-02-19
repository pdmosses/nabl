---
title: NameBindingLanguage.sdf3
hide:
  - toc
---

# `NameBindingLanguage.sdf3`

:simple-github: [pdmosses/nabl/org.metaborg.meta.lang.nabl/syntax/NameBindingLanguage.sdf3]

[pdmosses/nabl/org.metaborg.meta.lang.nabl/syntax/NameBindingLanguage.sdf3]: https://github.com/pdmosses/nabl/blob/master/org.metaborg.meta.lang.nabl/syntax/NameBindingLanguage.sdf3 "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <span id="NameBindingLanguage_1_8" title="a definition with no references">NameBindingLanguage</span>

<span class="keyword">imports</span> 

  <a href="../common/Layout.sdf3/#common/Layout_1_8" id="common/Layout_5_3" title="a reference to a single-file definition">common/Layout</a> 
  <a href="../common/Identifiers.sdf3/#common/Identifiers_1_8" id="common/Identifiers_6_3" title="a reference to a single-file definition">common/Identifiers</a>  
  <a href="../terms/Signatures.sdf3/#terms/Signatures_1_8" id="terms/Signatures_7_3" title="a reference to a single-file definition">terms/Signatures</a>  
  <a href="../terms/Terms.sdf3/#terms/Terms_1_8" id="terms/Terms_8_3" title="a reference to a single-file definition">terms/Terms</a> 
  <a href="../formulas/Formulas.sdf3/#formulas/Formulas_1_8" id="formulas/Formulas_9_3" title="a reference to a single-file definition">formulas/Formulas</a> 
  <a href="../formulas/Propositions.sdf3/#formulas/Propositions_1_8" id="formulas/Propositions_10_3" title="a reference to a single-file definition">formulas/Propositions</a> 
  <a href="../core/Modules.sdf3/#core/Modules_1_8" id="core/Modules_11_3" title="a reference to a single-file definition">core/Modules</a>  
  <a href="../core/Namespaces.sdf3/#core/Namespaces_1_8" id="core/Namespaces_12_3" title="a reference to a single-file definition">core/Namespaces</a> 
  <a href="../core/Properties.sdf3/#core/Properties_1_8" id="core/Properties_13_3" title="a reference to a single-file definition">core/Properties</a> 
  <a href="../terms/Vars.sdf3/#terms/Vars_1_8" id="terms/Vars_14_3" title="a reference to a single-file definition">terms/Vars</a>

<span class="keyword">context-free start-symbols</span>

  <a href="#Start_22_3" id="Start_18_3" title="a reference to a single-file definition">Start</a>

<span class="keyword">context-free syntax</span>

  <a href="#Start_18_3" id="Start_22_3" title="a definition with a single reference">Start</a> = <a href="../core/Modules.sdf3/#Module_5_3" id="Module_22_11" title="a reference to a single-file definition">Module</a> 

<span class="keyword">context-free syntax</span> <span class="layout">// namespaces</span>

  <a href="#RestrictedNamespaceRef_94_13" id="RestrictedNamespaceRef_26_3" title="a definition with a single reference">RestrictedNamespaceRef</a>.<span class="cons_Constructor"><span id="Restricted_26_26" title="a definition with no references">Restricted</span></span> = &lt;&lt;<a href="#Restriction_27_3" id="Restriction_26_41" title="a reference to a single-file definition">Restriction</a>*&gt; &lt;<a href="../core/Namespaces.sdf3/#NamespaceRef_24_3" id="NamespaceRef_26_56" title="a reference to a single-file definition">NamespaceRef</a>&gt;&gt; 
  <a href="#Restriction_26_41" id="Restriction_27_3" title="a definition with a single reference">Restriction</a>.<span class="cons_Constructor"><span id="Imported_27_15" title="a definition with no references">Imported</span></span> = &lt;<span class="cons_String">imported</span>&gt; 

<span class="keyword">context-free syntax</span> <span class="layout">// properties</span>

  <span id="PropertyDef_31_3" title="a definition with no references">PropertyDef</span>.<span class="cons_Constructor"><span id="QualityDef_31_15" title="a definition with no references">QualityDef</span></span> = &lt;
  &lt;<a href="#PropertyID_46_3" id="PropertyID_32_4" title="a reference to a single-file definition">PropertyID</a>&gt; <span class="cons_String">of</span> &lt;{<a href="../core/Namespaces.sdf3/#NamespaceRef_24_3" id="NamespaceRef_32_21" title="a reference to a single-file definition">NamespaceRef</a> <span class="cons_Lit">", "</span>}+&gt;&gt;
  
  <button class="modal-open" id="QualityRef_34_3" title="a definition with multiple references" data-urls="#QualityRef line 37_43, 39_49">QualityRef</button>.<span class="cons_Constructor"><span id="QualityRef_34_14" title="a definition with no references">QualityRef</span></span> = &lt;&lt;<a href="#PropertyID_46_3" id="PropertyID_34_29" title="a reference to a single-file definition">PropertyID</a>&gt;&gt;
  
  <a href="#PropertyTerm_62_55" id="PropertyTerm_36_3" title="a definition with a single reference">PropertyTerm</a>.<span class="cons_Constructor"><span id="PropertyTerm_36_16" title="a definition with no references">PropertyTerm</span></span> = &lt;<span class="cons_String">of</span> &lt;<a href="../core/Properties.sdf3/#PropertyRef_32_3" id="PropertyRef_36_36" title="a reference to a single-file definition">PropertyRef</a>&gt; &lt;<a href="../terms/Terms.sdf3/#Term_29_3" id="Term_36_50" title="a reference to a single-file definition">Term</a>&gt;&gt;
  <a href="#PropertyTerm_62_55" id="PropertyTerm_37_3" title="a definition with a single reference">PropertyTerm</a>.<span class="cons_Constructor"><span id="QualityTerm_37_16" title="a definition with no references">QualityTerm</span></span> = &lt;<span class="cons_String">of</span> <span class="cons_String">quality</span> &lt;<a href="#QualityRef_34_3" id="QualityRef_37_43" title="a reference to a single-file definition">QualityRef</a>&gt;&gt;
  <button class="modal-open" id="PropertyPattern_38_3" title="a definition with multiple references" data-urls="#PropertyPattern line 85_52, 92_50, 94_45, 136_62">PropertyPattern</button>.<span class="cons_Constructor"><span id="PropertyPattern_38_19" title="a definition with no references">PropertyPattern</span></span> = &lt;<span class="cons_String">of</span> &lt;<a href="#PropFilter_41_3" id="PropFilter_38_42" title="a reference to a single-file definition">PropFilter</a>&gt; &lt;<a href="../core/Properties.sdf3/#PropertyRef_32_3" id="PropertyRef_38_55" title="a reference to a single-file definition">PropertyRef</a>&gt; &lt;<a href="../terms/Terms.sdf3/#Term_29_3" id="Term_38_69" title="a reference to a single-file definition">Term</a>&gt;&gt;
  <button class="modal-open" id="PropertyPattern_39_3" title="a definition with multiple references" data-urls="#PropertyPattern line 85_52, 92_50, 94_45, 136_62">PropertyPattern</button>.<span class="cons_Constructor"><span id="QualityPattern_39_19" title="a definition with no references">QualityPattern</span></span> = &lt;<span class="cons_String">of</span> <span class="cons_String">quality</span> &lt;<a href="#QualityRef_34_3" id="QualityRef_39_49" title="a reference to a single-file definition">QualityRef</a>&gt;&gt;
  
  <a href="#PropFilter_38_42" id="PropFilter_41_3" title="a definition with a single reference">PropFilter</a>.<span class="cons_Constructor"><span id="Equal_41_14" title="a definition with no references">Equal</span></span> = &lt;&gt; 
  <a href="#PropFilter_38_42" id="PropFilter_42_3" title="a definition with a single reference">PropFilter</a>.<span class="cons_Constructor"><span id="Conformant_42_14" title="a definition with no references">Conformant</span></span> = &lt;<span class="cons_String">conformant</span>&gt; 

<span class="keyword">lexical syntax</span>

  <button class="modal-open" id="PropertyID_46_3" title="a definition with multiple references" data-urls="#PropertyID line 32_4, 34_29">PropertyID</button> = <span class="cons_Lit">"quality"</span> {<span class="keyword">reject</span>}
  <span id="SectionKeyword_47_3" title="a definition with no references">SectionKeyword</span> = <span class="cons_Lit">"binding"</span> 

<span class="keyword">context-free syntax</span> <span class="layout">// binding rules</span>

  <span id="ModuleSection_51_3" title="a definition with no references">ModuleSection</span>.<span class="cons_Constructor"><span id="Bindings_51_17" title="a definition with no references">Bindings</span></span> = &lt;
  <span class="cons_String">binding</span> <span class="cons_String">rules</span>
    &lt;<a href="#BindingRule_56_3" id="BindingRule_53_6" title="a reference to a single-file definition">BindingRule</a>*&gt;
  &gt; 
  
  <a href="#BindingRule_53_6" id="BindingRule_56_3" title="a definition with a single reference">BindingRule</a>.<span class="cons_Constructor"><span id="BindingRule_56_15" title="a definition with no references">BindingRule</span></span> = &lt;
  &lt;<a href="../terms/Terms.sdf3/#Pattern_11_3" id="Pattern_57_4" title="a reference to a single-file definition">Pattern</a>&gt; &lt;<a href="#Constraints_144_3" id="Constraints_57_14" title="a reference to a single-file definition">Constraints</a>&gt; <span class="cons_String">:</span> &lt;<a href="#BindingClause_61_3" id="BindingClause_57_30" title="a reference to a single-file definition">BindingClause</a>+&gt;&gt; 

<span class="keyword">context-free syntax</span> <span class="layout">// clauses</span>

  <a href="#BindingClause_57_30" id="BindingClause_61_3" title="a definition with a single reference">BindingClause</a>.<span class="cons_Constructor"><span id="DefClause_61_17" title="a definition with no references">DefClause</span></span> = &lt;
    &lt;<a href="#DefKind_65_3" id="DefKind_62_6" title="a reference to a single-file definition">DefKind</a>&gt; <span class="cons_String">defines</span> &lt;<a href="#Unique_68_3" id="Unique_62_24" title="a reference to a single-file definition">Unique</a>&gt; &lt;<a href="../core/Namespaces.sdf3/#NamespaceRef_24_3" id="NamespaceRef_62_33" title="a reference to a single-file definition">NamespaceRef</a>&gt; &lt;<a href="../terms/Terms.sdf3/#Term_29_3" id="Term_62_48" title="a reference to a single-file definition">Term</a>&gt; &lt;<a href="#PropertyTerm_36_3" id="PropertyTerm_62_55" title="a reference to a single-file definition">PropertyTerm</a>*&gt; &lt;<a href="#InDefScopes_117_3" id="InDefScopes_62_71" title="a reference to a single-file definition">InDefScopes</a>&gt; &lt;<a href="#Constraints_144_3" id="Constraints_62_85" title="a reference to a single-file definition">Constraints</a>&gt;
  &gt; 
  
  <a href="#DefKind_62_6" id="DefKind_65_3" title="a definition with a single reference">DefKind</a>.<span class="cons_Constructor"><span id="Explicit_65_11" title="a definition with no references">Explicit</span></span> = &lt;&gt; 
  <a href="#DefKind_62_6" id="DefKind_66_3" title="a definition with a single reference">DefKind</a>.<span class="cons_Constructor"><span id="Implicit_66_11" title="a definition with no references">Implicit</span></span> = &lt;<span class="cons_String">implicitly</span>&gt; 
  
  <a href="#Unique_62_24" id="Unique_68_3" title="a definition with a single reference">Unique</a>.<span class="cons_Constructor"><span id="Unique_68_10" title="a definition with no references">Unique</span></span> = &lt;&gt; 
  <a href="#Unique_62_24" id="Unique_69_3" title="a definition with a single reference">Unique</a>.<span class="cons_Constructor"><span id="Unique_69_10" title="a definition with no references">Unique</span></span> = &lt;<span class="cons_String">unique</span>&gt; 
  <a href="#Unique_62_24" id="Unique_70_3" title="a definition with a single reference">Unique</a>.<span class="cons_Constructor"><span id="NonUnique_70_10" title="a definition with no references">NonUnique</span></span> = &lt;<span class="cons_String">non-unique</span>&gt; 
  
  <a href="#BindingClause_57_30" id="BindingClause_72_3" title="a definition with a single reference">BindingClause</a>.<span class="cons_Constructor"><span id="ScopeClause_72_17" title="a definition with no references">ScopeClause</span></span> = &lt;
    <span class="cons_String">scopes</span> &lt;{<a href="../core/Namespaces.sdf3/#NamespaceRef_24_3" id="NamespaceRef_73_14" title="a reference to a single-file definition">NamespaceRef</a> <span class="cons_Lit">", "</span>}+&gt;
  &gt; 
  
  <a href="#BindingClause_57_30" id="BindingClause_76_3" title="a definition with a single reference">BindingClause</a>.<span class="cons_Constructor"><span id="NonTransitiveScopeClause_76_17" title="a definition with no references">NonTransitiveScopeClause</span></span> = &lt;
    <span class="cons_String">non-transitively</span> <span class="cons_String">scopes</span> &lt;{<a href="../core/Namespaces.sdf3/#NamespaceRef_24_3" id="NamespaceRef_77_31" title="a reference to a single-file definition">NamespaceRef</a> <span class="cons_Lit">", "</span>}+&gt;
  &gt; 
  
  <a href="#BindingClause_57_30" id="BindingClause_80_3" title="a definition with a single reference">BindingClause</a>.<span class="cons_Constructor"><span id="RefClause_80_17" title="a definition with no references">RefClause</span></span> = &lt;
    &lt;{<a href="#RefClausePart_84_3" id="RefClausePart_81_7" title="a reference to a single-file definition">RefClausePart</a> <span class="cons_Lit">"otherwise"</span>}+&gt;
  &gt; 
  
  <a href="#RefClausePart_81_7" id="RefClausePart_84_3" title="a definition with a single reference">RefClausePart</a>.<span class="cons_Constructor"><span id="RefClausePart_84_17" title="a definition with no references">RefClausePart</span></span> = &lt;
  <span class="cons_String">refers</span> <span class="cons_String">to</span> &lt;<a href="#Disambiguator_111_3" id="Disambiguator_85_14" title="a reference to a single-file definition">Disambiguator</a>&gt; &lt;<a href="../core/Namespaces.sdf3/#NamespaceRef_24_3" id="NamespaceRef_85_30" title="a reference to a single-file definition">NamespaceRef</a>&gt; &lt;<a href="../terms/Terms.sdf3/#Term_29_3" id="Term_85_45" title="a reference to a single-file definition">Term</a>&gt; &lt;<a href="#PropertyPattern_38_3" id="PropertyPattern_85_52" title="a reference to a single-file definition">PropertyPattern</a>*&gt; &lt;<a href="#InRefScope_128_3" id="InRefScope_85_71" title="a reference to a single-file definition">InRefScope</a>&gt; &lt;<a href="#Constraints_144_3" id="Constraints_85_84" title="a reference to a single-file definition">Constraints</a>&gt;&gt; 
  
  <a href="#BindingClause_57_30" id="BindingClause_87_3" title="a definition with a single reference">BindingClause</a>.<span class="cons_Constructor"><span id="ImportClause_87_17" title="a definition with no references">ImportClause</span></span> = &lt;
    &lt;{<a href="#ImportClausePart_91_3" id="ImportClausePart_88_7" title="a reference to a single-file definition">ImportClausePart</a> <span class="cons_Lit">"otherwise\n"</span>}+&gt;
  &gt; 
  
  <a href="#ImportClausePart_88_7" id="ImportClausePart_91_3" title="a definition with a single reference">ImportClausePart</a>.<span class="cons_Constructor"><span id="SingleImport_91_20" title="a definition with no references">SingleImport</span></span> = &lt;
  <span class="cons_String">imports</span> &lt;<a href="#Disambiguator_111_3" id="Disambiguator_92_12" title="a reference to a single-file definition">Disambiguator</a>&gt; &lt;<a href="../core/Namespaces.sdf3/#NamespaceRef_24_3" id="NamespaceRef_92_28" title="a reference to a single-file definition">NamespaceRef</a>&gt; &lt;<a href="../terms/Terms.sdf3/#Term_29_3" id="Term_92_43" title="a reference to a single-file definition">Term</a>&gt; &lt;<a href="#PropertyPattern_38_3" id="PropertyPattern_92_50" title="a reference to a single-file definition">PropertyPattern</a>*&gt; &lt;<a href="#FromRefScope_131_3" id="FromRefScope_92_69" title="a reference to a single-file definition">FromRefScope</a>&gt; &lt;<a href="#Alias_96_3" id="Alias_92_84" title="a reference to a single-file definition">Alias</a>&gt; &lt;<a href="#IntoDefScopes_120_3" id="IntoDefScopes_92_92" title="a reference to a single-file definition">IntoDefScopes</a>&gt; &lt;<a href="#Constraints_144_3" id="Constraints_92_108" title="a reference to a single-file definition">Constraints</a>&gt;&gt; 
  <a href="#ImportClausePart_88_7" id="ImportClausePart_93_3" title="a definition with a single reference">ImportClausePart</a>.<span class="cons_Constructor"><span id="WildcardImport_93_20" title="a definition with no references">WildcardImport</span></span> = &lt;
  <span class="cons_String">imports</span> &lt;{<a href="#RestrictedNamespaceRef_26_3" id="RestrictedNamespaceRef_94_13" title="a reference to a single-file definition">RestrictedNamespaceRef</a> <span class="cons_Lit">", "</span>}+&gt; &lt;<a href="#PropertyPattern_38_3" id="PropertyPattern_94_45" title="a reference to a single-file definition">PropertyPattern</a>*&gt; &lt;<a href="#FromRefScope_131_3" id="FromRefScope_94_64" title="a reference to a single-file definition">FromRefScope</a>&gt; &lt;<a href="#IntoDefScopes_120_3" id="IntoDefScopes_94_79" title="a reference to a single-file definition">IntoDefScopes</a>&gt; &lt;<a href="#Constraints_144_3" id="Constraints_94_95" title="a reference to a single-file definition">Constraints</a>&gt;&gt; 
  
  <a href="#Alias_92_84" id="Alias_96_3" title="a definition with a single reference">Alias</a>.<span class="cons_Constructor"><span id="None_96_9" title="a definition with no references">None</span></span> = &lt;&gt; 
  <a href="#Alias_92_84" id="Alias_97_3" title="a definition with a single reference">Alias</a>.<span class="cons_Constructor"><span id="Alias_97_9" title="a definition with no references">Alias</span></span> = &lt;<span class="cons_String">as</span> &lt;<a href="../terms/Terms.sdf3/#Term_29_3" id="Term_97_22" title="a reference to a single-file definition">Term</a>&gt;&gt; 
  
  <a href="#BindingClause_57_30" id="BindingClause_99_3" title="a definition with a single reference">BindingClause</a>.<span class="cons_Constructor"><span id="FilterClause_99_17" title="a definition with no references">FilterClause</span></span> = &lt;
    <span class="cons_String">filters</span> &lt;<a href="../core/Namespaces.sdf3/#NamespaceRef_24_3" id="NamespaceRef_100_14" title="a reference to a single-file definition">NamespaceRef</a>&gt; &lt;<a href="../terms/Terms.sdf3/#Term_29_3" id="Term_100_29" title="a reference to a single-file definition">Term</a>&gt; 
      &lt;<a href="#Filters_149_3" id="Filters_101_8" title="a reference to a single-file definition">Filters</a>&gt;
      &lt;<a href="#Constraints_144_3" id="Constraints_102_8" title="a reference to a single-file definition">Constraints</a>&gt;
  &gt; 
  
  <a href="#BindingClause_57_30" id="BindingClause_105_3" title="a definition with a single reference">BindingClause</a>.<span class="cons_Constructor"><span id="DisambiguateClause_105_17" title="a definition with no references">DisambiguateClause</span></span> = &lt;
    <span class="cons_String">disambiguates</span> &lt;<a href="../core/Namespaces.sdf3/#NamespaceRef_24_3" id="NamespaceRef_106_20" title="a reference to a single-file definition">NamespaceRef</a>&gt; &lt;<a href="../terms/Terms.sdf3/#Term_29_3" id="Term_106_35" title="a reference to a single-file definition">Term</a>&gt;
      &lt;<a href="#Filters_149_3" id="Filters_107_8" title="a reference to a single-file definition">Filters</a>&gt;
      <span class="cons_String">by</span> &lt;<a href="#Disambiguator_111_3" id="Disambiguator_108_11" title="a reference to a single-file definition">Disambiguator</a>&gt; 
      &lt;<a href="#Constraints_144_3" id="Constraints_109_8" title="a reference to a single-file definition">Constraints</a>&gt;
   &gt; 
  <button class="modal-open" id="Disambiguator_111_3" title="a definition with multiple references" data-urls="#Disambiguator line 85_14, 92_12, 108_11, 136_24">Disambiguator</button>.<span class="cons_Constructor"><span id="MinimalDistance_111_17" title="a definition with no references">MinimalDistance</span></span> = &lt;
    <span class="cons_String">minimal</span> <span class="cons_String">distance</span> &lt;<a href="../terms/Terms.sdf3/#Term_29_3" id="Term_112_23" title="a reference to a single-file definition">Term</a>&gt; &lt;<a href="../core/Properties.sdf3/#Relation_20_3" id="Relation_112_30" title="a reference to a single-file definition">Relation</a>&gt; &lt;<a href="../terms/Terms.sdf3/#Term_29_3" id="Term_112_41" title="a reference to a single-file definition">Term</a>&gt;
  &gt; 

<span class="keyword">context-free syntax</span> <span class="layout">// scopes</span>

  <a href="#InDefScopes_62_71" id="InDefScopes_117_3" title="a definition with a single reference">InDefScopes</a>.<span class="cons_Constructor"><span id="Current_117_15" title="a definition with no references">Current</span></span> = &lt;&gt; 
  <a href="#InDefScopes_62_71" id="InDefScopes_118_3" title="a definition with a single reference">InDefScopes</a> = &lt;<span class="cons_String">in</span> &lt;<a href="#DefScopes_123_3" id="DefScopes_118_22" title="a reference to a single-file definition">DefScopes</a>&gt;&gt; {<span class="keyword">bracket</span>}
  
  <button class="modal-open" id="IntoDefScopes_120_3" title="a definition with multiple references" data-urls="#IntoDefScopes line 92_92, 94_79">IntoDefScopes</button>.<span class="cons_Constructor"><span id="Current_120_17" title="a definition with no references">Current</span></span> = &lt;&gt; 
  <button class="modal-open" id="IntoDefScopes_121_3" title="a definition with multiple references" data-urls="#IntoDefScopes line 92_92, 94_79">IntoDefScopes</button> = &lt;<span class="cons_String">into</span> &lt;<a href="#DefScopes_123_3" id="DefScopes_121_26" title="a reference to a single-file definition">DefScopes</a>&gt;&gt; {<span class="keyword">bracket</span>}
  
  <button class="modal-open" id="DefScopes_123_3" title="a definition with multiple references" data-urls="#DefScopes line 118_22, 121_26">DefScopes</button>.<span class="cons_Constructor"><span id="Current_123_13" title="a definition with no references">Current</span></span> = &lt;<span class="cons_String">current</span> <span class="cons_String">scope</span>&gt; 
  <button class="modal-open" id="DefScopes_124_3" title="a definition with multiple references" data-urls="#DefScopes line 118_22, 121_26">DefScopes</button>.<span class="cons_Constructor"><span id="DefScopes_124_13" title="a definition with no references">DefScopes</span></span> = &lt;&lt;{<a href="#DefScope_125_3" id="DefScope_124_28" title="a reference to a single-file definition">DefScope</a> <span class="cons_Lit">", "</span>}+&gt;&gt; 
  <a href="#DefScope_124_28" id="DefScope_125_3" title="a definition with a single reference">DefScope</a>.<span class="cons_Constructor"><span id="Subsequent_125_12" title="a definition with no references">Subsequent</span></span> = &lt;<span class="cons_String">subsequent</span> <span class="cons_String">scope</span>&gt; 
  <a href="#DefScope_124_28" id="DefScope_126_3" title="a definition with a single reference">DefScope</a>.<span class="cons_Constructor"><span id="DefScope_126_12" title="a definition with no references">DefScope</span></span> = &lt;&lt;<a href="../terms/Terms.sdf3/#Term_29_3" id="Term_126_25" title="a reference to a single-file definition">Term</a>&gt;&gt; 
  
  <button class="modal-open" id="InRefScope_128_3" title="a definition with multiple references" data-urls="#InRefScope line 85_71, 136_81">InRefScope</button>.<span class="cons_Constructor"><span id="Current_128_14" title="a definition with no references">Current</span></span> = &lt;&gt; 
  <button class="modal-open" id="InRefScope_129_3" title="a definition with multiple references" data-urls="#InRefScope line 85_71, 136_81">InRefScope</button> = &lt;<span class="cons_String">in</span> &lt;<a href="#RefScope_134_3" id="RefScope_129_21" title="a reference to a single-file definition">RefScope</a>&gt;&gt; {<span class="keyword">bracket</span>}
  
  <button class="modal-open" id="FromRefScope_131_3" title="a definition with multiple references" data-urls="#FromRefScope line 92_69, 94_64">FromRefScope</button>.<span class="cons_Constructor"><span id="Current_131_16" title="a definition with no references">Current</span></span> = &lt;&gt; 
  <button class="modal-open" id="FromRefScope_132_3" title="a definition with multiple references" data-urls="#FromRefScope line 92_69, 94_64">FromRefScope</button> = &lt;<span class="cons_String">from</span> &lt;<a href="#RefScope_134_3" id="RefScope_132_25" title="a reference to a single-file definition">RefScope</a>&gt;&gt; {<span class="keyword">bracket</span>}
  
  <button class="modal-open" id="RefScope_134_3" title="a definition with multiple references" data-urls="#RefScope line 129_21, 132_25">RefScope</button>.<span class="cons_Constructor"><span id="Current_134_12" title="a definition with no references">Current</span></span> = &lt;<span class="cons_String">current</span> <span class="cons_String">scope</span>&gt; 
  <button class="modal-open" id="RefScope_135_3" title="a definition with multiple references" data-urls="#RefScope line 129_21, 132_25">RefScope</button>.<span class="cons_Constructor"><span id="Enclosing_135_12" title="a definition with no references">Enclosing</span></span> = &lt;<span class="cons_String">enclosing</span> &lt;<a href="../core/Namespaces.sdf3/#NamespaceRef_24_3" id="NamespaceRef_135_36" title="a reference to a single-file definition">NamespaceRef</a>&gt;&gt; 
  <button class="modal-open" id="RefScope_136_3" title="a definition with multiple references" data-urls="#RefScope line 129_21, 132_25">RefScope</button>.<span class="cons_Constructor"><span id="Context_136_12" title="a definition with no references">Context</span></span> = &lt;&lt;<a href="#Disambiguator_111_3" id="Disambiguator_136_24" title="a reference to a single-file definition">Disambiguator</a>&gt; &lt;<a href="../core/Namespaces.sdf3/#NamespaceRef_24_3" id="NamespaceRef_136_40" title="a reference to a single-file definition">NamespaceRef</a>&gt; &lt;<a href="../terms/Terms.sdf3/#Term_29_3" id="Term_136_55" title="a reference to a single-file definition">Term</a>&gt; &lt;<a href="#PropertyPattern_38_3" id="PropertyPattern_136_62" title="a reference to a single-file definition">PropertyPattern</a>*&gt; &lt;<a href="#InRefScope_128_3" id="InRefScope_136_81" title="a reference to a single-file definition">InRefScope</a>&gt;&gt; 
  <button class="modal-open" id="RefScope_137_3" title="a definition with multiple references" data-urls="#RefScope line 129_21, 132_25">RefScope</button>.<span class="cons_Constructor"><span id="RefScope_137_12" title="a definition with no references">RefScope</span></span> = &lt;&lt;<a href="../terms/Terms.sdf3/#Term_29_3" id="Term_137_25" title="a reference to a single-file definition">Term</a>&gt;&gt; 
  
  <button class="modal-open" id="Disambiguator_139_3" title="a definition with multiple references" data-urls="#Disambiguator line 85_14, 92_12, 108_11, 136_24">Disambiguator</button>.<span class="cons_Constructor"><span id="All_139_17" title="a definition with no references">All</span></span> = &lt;&gt; 
  <button class="modal-open" id="Disambiguator_140_3" title="a definition with multiple references" data-urls="#Disambiguator line 85_14, 92_12, 108_11, 136_24">Disambiguator</button>.<span class="cons_Constructor"><span id="Best_140_17" title="a definition with no references">Best</span></span> = &lt;<span class="cons_String">best</span>&gt; 

<span class="keyword">context-free syntax</span> <span class="layout">// constraints</span>

  <button class="modal-open" id="Constraints_144_3" title="a definition with multiple references" data-urls="#Constraints line 57_14, 62_85, 85_84, 92_108, 94_95, 102_8, 109_8">Constraints</button>.<span class="cons_Constructor"><span id="NoWhere_144_15" title="a definition with no references">NoWhere</span></span> = &lt;&gt; 
  <button class="modal-open" id="Constraints_145_3" title="a definition with multiple references" data-urls="#Constraints line 57_14, 62_85, 85_84, 92_108, 94_95, 102_8, 109_8">Constraints</button>.<span class="cons_Constructor"><span id="Where_145_15" title="a definition with no references">Where</span></span> = &lt;
    <span class="cons_String">where</span> &lt;<a href="../formulas/Formulas.sdf3/#Formula_10_3" id="Formula_146_12" title="a reference to a single-file definition">Formula</a>&gt;
  &gt; {<span class="keyword">bracket</span>}
  
  <button class="modal-open" id="Filters_149_3" title="a definition with multiple references" data-urls="#Filters line 101_8, 107_8">Filters</button>.<span class="cons_Constructor"><span id="Filter_149_11" title="a definition with no references">Filter</span></span> = &lt;
    <span class="cons_String">with</span> &lt;<a href="../formulas/Formulas.sdf3/#Formula_10_3" id="Formula_150_11" title="a reference to a single-file definition">Formula</a>&gt;
  &gt; 
  
  <span id="Proposition_153_3" title="a definition with no references">Proposition</span>.<span class="cons_Constructor"><span id="PropertyPattern_153_15" title="a definition with no references">PropertyPattern</span></span> = &lt;&lt;<a href="../terms/Vars.sdf3/#VarRef_10_11" id="VarRef_153_35" title="a reference to a single-file definition">VarRef</a>&gt; <span class="cons_String">has</span> &lt;<a href="../core/Properties.sdf3/#PropertyRef_32_3" id="PropertyRef_153_48" title="a reference to a single-file definition">PropertyRef</a>&gt; &lt;<a href="../terms/Terms.sdf3/#Pattern_11_3" id="Pattern_153_62" title="a reference to a single-file definition">Pattern</a>&gt;&gt; {<span class="keyword">avoid</span>}

<span class="keyword">lexical syntax</span>

  <span id="Id_157_3" title="a definition with no references">Id</span> = <span class="cons_Lit">"into"</span> {<span class="keyword">reject</span>}
  <span id="Id_158_3" title="a definition with no references">Id</span> = <span class="cons_Lit">"enclosing"</span> {<span class="keyword">reject</span>}

<span class="keyword">template options</span>

  <span class="keyword">keyword</span> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">z</span>]

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
