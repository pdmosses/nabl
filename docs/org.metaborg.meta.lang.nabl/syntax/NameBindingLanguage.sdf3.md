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
<td class="code"><pre><code><span class="keyword">module</span> <span id="NameBindingLanguage_7_26" title="Not referenced locally, nor via imports">NameBindingLanguage</span>

<span class="keyword">imports</span> 

  <a href="../common/Layout.sdf3#common/Layout_7_20" id="common/Layout_40_53" title="Defined at ../common/Layout.sdf3 line 1">common/Layout</a> 
  <a href="../common/Identifiers.sdf3#common/Identifiers_7_25" id="common/Identifiers_57_75" title="Defined at ../common/Identifiers.sdf3 line 1">common/Identifiers</a>  
  <a href="../terms/Signatures.sdf3#terms/Signatures_7_23" id="terms/Signatures_80_96" title="Defined at ../terms/Signatures.sdf3 line 1">terms/Signatures</a>  
  <a href="../terms/Terms.sdf3#terms/Terms_7_18" id="terms/Terms_101_112" title="Defined at ../terms/Terms.sdf3 line 1">terms/Terms</a> 
  <a href="../formulas/Formulas.sdf3#formulas/Formulas_7_24" id="formulas/Formulas_116_133" title="Defined at ../formulas/Formulas.sdf3 line 1">formulas/Formulas</a> 
  <a href="../formulas/Propositions.sdf3#formulas/Propositions_7_28" id="formulas/Propositions_137_158" title="Defined at ../formulas/Propositions.sdf3 line 1">formulas/Propositions</a> 
  <a href="../core/Modules.sdf3#core/Modules_7_19" id="core/Modules_162_174" title="Defined at ../core/Modules.sdf3 line 1">core/Modules</a>  
  <a href="../core/Namespaces.sdf3#core/Namespaces_7_22" id="core/Namespaces_179_194" title="Defined at ../core/Namespaces.sdf3 line 1">core/Namespaces</a> 
  <a href="../core/Properties.sdf3#core/Properties_7_22" id="core/Properties_198_213" title="Defined at ../core/Properties.sdf3 line 1">core/Properties</a> 
  <a href="../terms/Vars.sdf3#terms/Vars_7_17" id="terms/Vars_217_227" title="Defined at ../terms/Vars.sdf3 line 1">terms/Vars</a>

<span class="keyword">context-free start-symbols</span>

  <a href="#Start_289_294" id="Start_259_264" title="Defined at line 22">Start</a>

<span class="keyword">context-free syntax</span>

  <a href="#Start_259_264" id="Start_289_294" title="Referenced at line 18">Start</a> = <a href="../core/Modules.sdf3#Module_44_50" id="Module_297_303" title="Defined at ../core/Modules.sdf3 line 5">Module</a> 

<span class="keyword">context-free syntax</span> <span class="layout">// namespaces</span>

  <a href="#RestrictedNamespaceRef_2181_2203" id="RestrictedNamespaceRef_343_365" title="Referenced at line 94">RestrictedNamespaceRef</a>.<span class="cons_Constructor"><span id="Restricted_366_376" title="Not referenced locally, nor via imports">Restricted</span></span> = &lt;&lt;<a href="#Restriction_414_425" id="Restriction_381_392" title="Defined at line 27">Restriction</a>*&gt; &lt;<a href="../core/Namespaces.sdf3#NamespaceRef_340_352" id="NamespaceRef_396_408" title="Defined at ../core/Namespaces.sdf3 line 24">NamespaceRef</a>&gt;&gt; 
  <a href="#Restriction_381_392" id="Restriction_414_425" title="Referenced at line 26">Restriction</a>.<span class="cons_Constructor"><span id="Imported_426_434" title="Not referenced locally, nor via imports">Imported</span></span> = &lt;<span class="cons_String">imported</span>&gt; 

<span class="keyword">context-free syntax</span> <span class="layout">// properties</span>

  <span id="PropertyDef_487_498" title="Not referenced locally, nor via imports">PropertyDef</span>.<span class="cons_Constructor"><span id="QualityDef_499_509" title="Not referenced locally, nor via imports">QualityDef</span></span> = &lt;
  &lt;<a href="#PropertyID_937_947" id="PropertyID_517_527" title="Defined at line 46">PropertyID</a>&gt; <span class="cons_String">of</span> &lt;{<a href="../core/Namespaces.sdf3#NamespaceRef_340_352" id="NamespaceRef_534_546" title="Defined at ../core/Namespaces.sdf3 line 24">NamespaceRef</a> <span class="cons_Lit">", "</span>}+&gt;&gt;
  
  <a href="#QualityRef_837_847" id="QualityRef_561_571" title="Referenced at line 39">QualityRef</a>.<span class="cons_Constructor"><span id="QualityRef_572_582" title="Not referenced locally, nor via imports">QualityRef</span></span> = &lt;&lt;<a href="#PropertyID_937_947" id="PropertyID_587_597" title="Defined at line 46">PropertyID</a>&gt;&gt;
  
  <a href="#PropertyTerm_1304_1316" id="PropertyTerm_605_617" title="Referenced at line 62">PropertyTerm</a>.<span class="cons_Constructor"><span id="PropertyTerm_618_630" title="Not referenced locally, nor via imports">PropertyTerm</span></span> = &lt;<span class="cons_String">of</span> &lt;<a href="../core/Properties.sdf3#PropertyRef_500_511" id="PropertyRef_638_649" title="Defined at ../core/Properties.sdf3 line 32, 33">PropertyRef</a>&gt; &lt;<a href="../terms/Terms.sdf3#Term_523_527" id="Term_652_656" title="Defined at ../terms/Terms.sdf3 line 29, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42">Term</a>&gt;&gt;
  <a href="#PropertyTerm_1304_1316" id="PropertyTerm_661_673" title="Referenced at line 62">PropertyTerm</a>.<span class="cons_Constructor"><span id="QualityTerm_674_685" title="Not referenced locally, nor via imports">QualityTerm</span></span> = &lt;<span class="cons_String">of</span> <span class="cons_String">quality</span> &lt;<a href="#QualityRef_561_571" id="QualityRef_701_711" title="Defined at line 34">QualityRef</a>&gt;&gt;
  <a href="#PropertyPattern_3326_3341" id="PropertyPattern_716_731" title="Referenced at line 136">PropertyPattern</a>.<span class="cons_Constructor"><span id="PropertyPattern_732_747" title="Not referenced locally, nor via imports">PropertyPattern</span></span> = &lt;<span class="cons_String">of</span> &lt;<a href="#PropFilter_855_865" id="PropFilter_755_765" title="Defined at line 41, 42">PropFilter</a>&gt; &lt;<a href="../core/Properties.sdf3#PropertyRef_500_511" id="PropertyRef_768_779" title="Defined at ../core/Properties.sdf3 line 32, 33">PropertyRef</a>&gt; &lt;<a href="../terms/Terms.sdf3#Term_523_527" id="Term_782_786" title="Defined at ../terms/Terms.sdf3 line 29, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42">Term</a>&gt;&gt;
  <a href="#PropertyPattern_3326_3341" id="PropertyPattern_791_806" title="Referenced at line 136">PropertyPattern</a>.<span class="cons_Constructor"><span id="QualityPattern_807_821" title="Not referenced locally, nor via imports">QualityPattern</span></span> = &lt;<span class="cons_String">of</span> <span class="cons_String">quality</span> &lt;<a href="#QualityRef_561_571" id="QualityRef_837_847" title="Defined at line 34">QualityRef</a>&gt;&gt;
  
  <a href="#PropFilter_755_765" id="PropFilter_855_865" title="Referenced at line 38">PropFilter</a>.<span class="cons_Constructor"><span id="Equal_866_871" title="Not referenced locally, nor via imports">Equal</span></span> = &lt;&gt; 
  <a href="#PropFilter_755_765" id="PropFilter_880_890" title="Referenced at line 38">PropFilter</a>.<span class="cons_Constructor"><span id="Conformant_891_901" title="Not referenced locally, nor via imports">Conformant</span></span> = &lt;<span class="cons_String">conformant</span>&gt; 

<span class="keyword">lexical syntax</span>

  <a href="#PropertyID_587_597" id="PropertyID_937_947" title="Referenced at line 34">PropertyID</a> = <span class="cons_Lit">"quality"</span> {<span class="keyword">reject</span>}
  <span id="SectionKeyword_971_985" title="Not referenced locally, nor via imports">SectionKeyword</span> = <span class="cons_Lit">"binding"</span> 

<span class="keyword">context-free syntax</span> <span class="layout">// binding rules</span>

  <span id="ModuleSection_1040_1053" title="Not referenced locally, nor via imports">ModuleSection</span>.<span class="cons_Constructor"><span id="Bindings_1054_1062" title="Not referenced locally, nor via imports">Bindings</span></span> = &lt;
  <span class="cons_String">binding</span> <span class="cons_String">rules</span>
    &lt;<a href="#BindingRule_1112_1123" id="BindingRule_1088_1099" title="Defined at line 56">BindingRule</a>*&gt;
  &gt; 
  
  <a href="#BindingRule_1088_1099" id="BindingRule_1112_1123" title="Referenced at line 53">BindingRule</a>.<span class="cons_Constructor"><span id="BindingRule_1124_1135" title="Not referenced locally, nor via imports">BindingRule</span></span> = &lt;
  &lt;<a href="../terms/Terms.sdf3#Pattern_95_102" id="Pattern_1143_1150" title="Defined at ../terms/Terms.sdf3 line 11, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25">Pattern</a>&gt; &lt;<a href="#Constraints_3490_3501" id="Constraints_1153_1164" title="Defined at line 144, 145">Constraints</a>&gt; <span class="cons_String">:</span> &lt;<a href="#BindingClause_1222_1235" id="BindingClause_1169_1182" title="Defined at line 61, 72, 76, 80, 87, 99, 105">BindingClause</a>+&gt;&gt; 

<span class="keyword">context-free syntax</span> <span class="layout">// clauses</span>

  <a href="#BindingClause_1169_1182" id="BindingClause_1222_1235" title="Referenced at line 57">BindingClause</a>.<span class="cons_Constructor"><span id="DefClause_1236_1245" title="Not referenced locally, nor via imports">DefClause</span></span> = &lt;
    &lt;<a href="#DefKind_1357_1364" id="DefKind_1255_1262" title="Defined at line 65, 66">DefKind</a>&gt; <span class="cons_String">defines</span> &lt;<a href="#Unique_1420_1426" id="Unique_1273_1279" title="Defined at line 68, 69, 70">Unique</a>&gt; &lt;<a href="../core/Namespaces.sdf3#NamespaceRef_340_352" id="NamespaceRef_1282_1294" title="Defined at ../core/Namespaces.sdf3 line 24">NamespaceRef</a>&gt; &lt;<a href="../terms/Terms.sdf3#Term_523_527" id="Term_1297_1301" title="Defined at ../terms/Terms.sdf3 line 29, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42">Term</a>&gt; &lt;<a href="#PropertyTerm_605_617" id="PropertyTerm_1304_1316" title="Defined at line 36, 37">PropertyTerm</a>*&gt; &lt;<a href="#InDefScopes_2712_2723" id="InDefScopes_1320_1331" title="Defined at line 117, 118">InDefScopes</a>&gt; &lt;<a href="#Constraints_3490_3501" id="Constraints_1334_1345" title="Defined at line 144, 145">Constraints</a>&gt;
  &gt; 
  
  <a href="#DefKind_1255_1262" id="DefKind_1357_1364" title="Referenced at line 62">DefKind</a>.<span class="cons_Constructor"><span id="Explicit_1365_1373" title="Not referenced locally, nor via imports">Explicit</span></span> = &lt;&gt; 
  <a href="#DefKind_1255_1262" id="DefKind_1382_1389" title="Referenced at line 62">DefKind</a>.<span class="cons_Constructor"><span id="Implicit_1390_1398" title="Not referenced locally, nor via imports">Implicit</span></span> = &lt;<span class="cons_String">implicitly</span>&gt; 
  
  <a href="#Unique_1273_1279" id="Unique_1420_1426" title="Referenced at line 62">Unique</a>.<span class="cons_Constructor"><span id="Unique_1427_1433" title="Not referenced locally, nor via imports">Unique</span></span> = &lt;&gt; 
  <a href="#Unique_1273_1279" id="Unique_1442_1448" title="Referenced at line 62">Unique</a>.<span class="cons_Constructor"><span id="Unique_1449_1455" title="Not referenced locally, nor via imports">Unique</span></span> = &lt;<span class="cons_String">unique</span>&gt; 
  <a href="#Unique_1273_1279" id="Unique_1470_1476" title="Referenced at line 62">Unique</a>.<span class="cons_Constructor"><span id="NonUnique_1477_1486" title="Not referenced locally, nor via imports">NonUnique</span></span> = &lt;<span class="cons_String">non-unique</span>&gt; 
  
  <a href="#BindingClause_1169_1182" id="BindingClause_1508_1521" title="Referenced at line 57">BindingClause</a>.<span class="cons_Constructor"><span id="ScopeClause_1522_1533" title="Not referenced locally, nor via imports">ScopeClause</span></span> = &lt;
    <span class="cons_String">scopes</span> &lt;{<a href="../core/Namespaces.sdf3#NamespaceRef_340_352" id="NamespaceRef_1551_1563" title="Defined at ../core/Namespaces.sdf3 line 24">NamespaceRef</a> <span class="cons_Lit">", "</span>}+&gt;
  &gt; 
  
  <a href="#BindingClause_1169_1182" id="BindingClause_1582_1595" title="Referenced at line 57">BindingClause</a>.<span class="cons_Constructor"><span id="NonTransitiveScopeClause_1596_1620" title="Not referenced locally, nor via imports">NonTransitiveScopeClause</span></span> = &lt;
    <span class="cons_String">non-transitively</span> <span class="cons_String">scopes</span> &lt;{<a href="../core/Namespaces.sdf3#NamespaceRef_340_352" id="NamespaceRef_1655_1667" title="Defined at ../core/Namespaces.sdf3 line 24">NamespaceRef</a> <span class="cons_Lit">", "</span>}+&gt;
  &gt; 
  
  <a href="#BindingClause_1169_1182" id="BindingClause_1686_1699" title="Referenced at line 57">BindingClause</a>.<span class="cons_Constructor"><span id="RefClause_1700_1709" title="Not referenced locally, nor via imports">RefClause</span></span> = &lt;
    &lt;{<a href="#RefClausePart_1759_1772" id="RefClausePart_1720_1733" title="Defined at line 84">RefClausePart</a> <span class="cons_Lit">"otherwise"</span>}+&gt;
  &gt; 
  
  <a href="#RefClausePart_1720_1733" id="RefClausePart_1759_1772" title="Referenced at line 81">RefClausePart</a>.<span class="cons_Constructor"><span id="RefClausePart_1773_1786" title="Not referenced locally, nor via imports">RefClausePart</span></span> = &lt;
  <span class="cons_String">refers</span> <span class="cons_String">to</span> &lt;<a href="#Disambiguator_2593_2606" id="Disambiguator_1804_1817" title="Defined at line 111, 139, 140">Disambiguator</a>&gt; &lt;<a href="../core/Namespaces.sdf3#NamespaceRef_340_352" id="NamespaceRef_1820_1832" title="Defined at ../core/Namespaces.sdf3 line 24">NamespaceRef</a>&gt; &lt;<a href="../terms/Terms.sdf3#Term_523_527" id="Term_1835_1839" title="Defined at ../terms/Terms.sdf3 line 29, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42">Term</a>&gt; &lt;<a href="#PropertyPattern_716_731" id="PropertyPattern_1842_1857" title="Defined at line 38, 39">PropertyPattern</a>*&gt; &lt;<a href="#InRefScope_3030_3040" id="InRefScope_1861_1871" title="Defined at line 128, 129">InRefScope</a>&gt; &lt;<a href="#Constraints_3490_3501" id="Constraints_1874_1885" title="Defined at line 144, 145">Constraints</a>&gt;&gt; 
  
  <a href="#BindingClause_1169_1182" id="BindingClause_1894_1907" title="Referenced at line 57">BindingClause</a>.<span class="cons_Constructor"><span id="ImportClause_1908_1920" title="Not referenced locally, nor via imports">ImportClause</span></span> = &lt;
    &lt;{<a href="#ImportClausePart_1975_1991" id="ImportClausePart_1931_1947" title="Defined at line 91, 93">ImportClausePart</a> <span class="cons_Lit">"otherwise\n"</span>}+&gt;
  &gt; 
  
  <a href="#ImportClausePart_1931_1947" id="ImportClausePart_1975_1991" title="Referenced at line 88">ImportClausePart</a>.<span class="cons_Constructor"><span id="SingleImport_1992_2004" title="Not referenced locally, nor via imports">SingleImport</span></span> = &lt;
  <span class="cons_String">imports</span> &lt;<a href="#Disambiguator_2593_2606" id="Disambiguator_2020_2033" title="Defined at line 111, 139, 140">Disambiguator</a>&gt; &lt;<a href="../core/Namespaces.sdf3#NamespaceRef_340_352" id="NamespaceRef_2036_2048" title="Defined at ../core/Namespaces.sdf3 line 24">NamespaceRef</a>&gt; &lt;<a href="../terms/Terms.sdf3#Term_523_527" id="Term_2051_2055" title="Defined at ../terms/Terms.sdf3 line 29, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42">Term</a>&gt; &lt;<a href="#PropertyPattern_716_731" id="PropertyPattern_2058_2073" title="Defined at line 38, 39">PropertyPattern</a>*&gt; &lt;<a href="#FromRefScope_3101_3113" id="FromRefScope_2077_2089" title="Defined at line 131, 132">FromRefScope</a>&gt; &lt;<a href="#Alias_2283_2288" id="Alias_2092_2097" title="Defined at line 96, 97">Alias</a>&gt; &lt;<a href="#IntoDefScopes_2786_2799" id="IntoDefScopes_2100_2113" title="Defined at line 120, 121">IntoDefScopes</a>&gt; &lt;<a href="#Constraints_3490_3501" id="Constraints_2116_2127" title="Defined at line 144, 145">Constraints</a>&gt;&gt; 
  <a href="#ImportClausePart_1931_1947" id="ImportClausePart_2133_2149" title="Referenced at line 88">ImportClausePart</a>.<span class="cons_Constructor"><span id="WildcardImport_2150_2164" title="Not referenced locally, nor via imports">WildcardImport</span></span> = &lt;
  <span class="cons_String">imports</span> &lt;{<a href="#RestrictedNamespaceRef_343_365" id="RestrictedNamespaceRef_2181_2203" title="Defined at line 26">RestrictedNamespaceRef</a> <span class="cons_Lit">", "</span>}+&gt; &lt;<a href="#PropertyPattern_716_731" id="PropertyPattern_2213_2228" title="Defined at line 38, 39">PropertyPattern</a>*&gt; &lt;<a href="#FromRefScope_3101_3113" id="FromRefScope_2232_2244" title="Defined at line 131, 132">FromRefScope</a>&gt; &lt;<a href="#IntoDefScopes_2786_2799" id="IntoDefScopes_2247_2260" title="Defined at line 120, 121">IntoDefScopes</a>&gt; &lt;<a href="#Constraints_3490_3501" id="Constraints_2263_2274" title="Defined at line 144, 145">Constraints</a>&gt;&gt; 
  
  <a href="#Alias_2092_2097" id="Alias_2283_2288" title="Referenced at line 92">Alias</a>.<span class="cons_Constructor"><span id="None_2289_2293" title="Not referenced locally, nor via imports">None</span></span> = &lt;&gt; 
  <a href="#Alias_2092_2097" id="Alias_2302_2307" title="Referenced at line 92">Alias</a>.<span class="cons_Constructor"><span id="Alias_2308_2313" title="Not referenced locally, nor via imports">Alias</span></span> = &lt;<span class="cons_String">as</span> &lt;<a href="../terms/Terms.sdf3#Term_523_527" id="Term_2321_2325" title="Defined at ../terms/Terms.sdf3 line 29, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42">Term</a>&gt;&gt; 
  
  <a href="#BindingClause_1169_1182" id="BindingClause_2334_2347" title="Referenced at line 57">BindingClause</a>.<span class="cons_Constructor"><span id="FilterClause_2348_2360" title="Not referenced locally, nor via imports">FilterClause</span></span> = &lt;
    <span class="cons_String">filters</span> &lt;<a href="../core/Namespaces.sdf3#NamespaceRef_340_352" id="NamespaceRef_2378_2390" title="Defined at ../core/Namespaces.sdf3 line 24">NamespaceRef</a>&gt; &lt;<a href="../terms/Terms.sdf3#Term_523_527" id="Term_2393_2397" title="Defined at ../terms/Terms.sdf3 line 29, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42">Term</a>&gt; 
      &lt;<a href="#Filters_3579_3586" id="Filters_2407_2414" title="Defined at line 149">Filters</a>&gt;
      &lt;<a href="#Constraints_3490_3501" id="Constraints_2423_2434" title="Defined at line 144, 145">Constraints</a>&gt;
  &gt; 
  
  <a href="#BindingClause_1169_1182" id="BindingClause_2446_2459" title="Referenced at line 57">BindingClause</a>.<span class="cons_Constructor"><span id="DisambiguateClause_2460_2478" title="Not referenced locally, nor via imports">DisambiguateClause</span></span> = &lt;
    <span class="cons_String">disambiguates</span> &lt;<a href="../core/Namespaces.sdf3#NamespaceRef_340_352" id="NamespaceRef_2502_2514" title="Defined at ../core/Namespaces.sdf3 line 24">NamespaceRef</a>&gt; &lt;<a href="../terms/Terms.sdf3#Term_523_527" id="Term_2517_2521" title="Defined at ../terms/Terms.sdf3 line 29, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42">Term</a>&gt;
      &lt;<a href="#Filters_3579_3586" id="Filters_2530_2537" title="Defined at line 149">Filters</a>&gt;
      <span class="cons_String">by</span> &lt;<a href="#Disambiguator_2593_2606" id="Disambiguator_2549_2562" title="Defined at line 111, 139, 140">Disambiguator</a>&gt; 
      &lt;<a href="#Constraints_3490_3501" id="Constraints_2572_2583" title="Defined at line 144, 145">Constraints</a>&gt;
   &gt; 
  <a href="#Disambiguator_3288_3301" id="Disambiguator_2593_2606" title="Referenced at line 136">Disambiguator</a>.<span class="cons_Constructor"><span id="MinimalDistance_2607_2622" title="Not referenced locally, nor via imports">MinimalDistance</span></span> = &lt;
    <span class="cons_String">minimal</span> <span class="cons_String">distance</span> &lt;<a href="../terms/Terms.sdf3#Term_523_527" id="Term_2649_2653" title="Defined at ../terms/Terms.sdf3 line 29, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42">Term</a>&gt; &lt;<a href="../core/Properties.sdf3#Relation_287_295" id="Relation_2656_2664" title="Defined at ../core/Properties.sdf3 line 20">Relation</a>&gt; &lt;<a href="../terms/Terms.sdf3#Term_523_527" id="Term_2667_2671" title="Defined at ../terms/Terms.sdf3 line 29, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42">Term</a>&gt;
  &gt; 

<span class="keyword">context-free syntax</span> <span class="layout">// scopes</span>

  <a href="#InDefScopes_1320_1331" id="InDefScopes_2712_2723" title="Referenced at line 62">InDefScopes</a>.<span class="cons_Constructor"><span id="Current_2724_2731" title="Not referenced locally, nor via imports">Current</span></span> = &lt;&gt; 
  <a href="#InDefScopes_1320_1331" id="InDefScopes_2740_2751" title="Referenced at line 62">InDefScopes</a> = &lt;<span class="cons_String">in</span> &lt;<a href="#DefScopes_2866_2875" id="DefScopes_2759_2768" title="Defined at line 123, 124">DefScopes</a>&gt;&gt; {<span class="keyword">bracket</span>}
  
  <a href="#IntoDefScopes_2247_2260" id="IntoDefScopes_2786_2799" title="Referenced at line 94">IntoDefScopes</a>.<span class="cons_Constructor"><span id="Current_2800_2807" title="Not referenced locally, nor via imports">Current</span></span> = &lt;&gt; 
  <a href="#IntoDefScopes_2247_2260" id="IntoDefScopes_2816_2829" title="Referenced at line 94">IntoDefScopes</a> = &lt;<span class="cons_String">into</span> &lt;<a href="#DefScopes_2866_2875" id="DefScopes_2839_2848" title="Defined at line 123, 124">DefScopes</a>&gt;&gt; {<span class="keyword">bracket</span>}
  
  <a href="#DefScopes_2839_2848" id="DefScopes_2866_2875" title="Referenced at line 121">DefScopes</a>.<span class="cons_Constructor"><span id="Current_2876_2883" title="Not referenced locally, nor via imports">Current</span></span> = &lt;<span class="cons_String">current</span> <span class="cons_String">scope</span>&gt; 
  <a href="#DefScopes_2839_2848" id="DefScopes_2905_2914" title="Referenced at line 121">DefScopes</a>.<span class="cons_Constructor"><span id="DefScopes_2915_2924" title="Not referenced locally, nor via imports">DefScopes</span></span> = &lt;&lt;{<a href="#DefScope_2951_2959" id="DefScope_2930_2938" title="Defined at line 125, 126">DefScope</a> <span class="cons_Lit">", "</span>}+&gt;&gt; 
  <a href="#DefScope_2930_2938" id="DefScope_2951_2959" title="Referenced at line 124">DefScope</a>.<span class="cons_Constructor"><span id="Subsequent_2960_2970" title="Not referenced locally, nor via imports">Subsequent</span></span> = &lt;<span class="cons_String">subsequent</span> <span class="cons_String">scope</span>&gt; 
  <a href="#DefScope_2930_2938" id="DefScope_2995_3003" title="Referenced at line 124">DefScope</a>.<span class="cons_Constructor"><span id="DefScope_3004_3012" title="Not referenced locally, nor via imports">DefScope</span></span> = &lt;&lt;<a href="../terms/Terms.sdf3#Term_523_527" id="Term_3017_3021" title="Defined at ../terms/Terms.sdf3 line 29, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42">Term</a>&gt;&gt; 
  
  <a href="#InRefScope_3345_3355" id="InRefScope_3030_3040" title="Referenced at line 136">InRefScope</a>.<span class="cons_Constructor"><span id="Current_3041_3048" title="Not referenced locally, nor via imports">Current</span></span> = &lt;&gt; 
  <a href="#InRefScope_3345_3355" id="InRefScope_3057_3067" title="Referenced at line 136">InRefScope</a> = &lt;<span class="cons_String">in</span> &lt;<a href="#RefScope_3178_3186" id="RefScope_3075_3083" title="Defined at line 134, 135, 136, 137">RefScope</a>&gt;&gt; {<span class="keyword">bracket</span>}
  
  <a href="#FromRefScope_2232_2244" id="FromRefScope_3101_3113" title="Referenced at line 94">FromRefScope</a>.<span class="cons_Constructor"><span id="Current_3114_3121" title="Not referenced locally, nor via imports">Current</span></span> = &lt;&gt; 
  <a href="#FromRefScope_2232_2244" id="FromRefScope_3130_3142" title="Referenced at line 94">FromRefScope</a> = &lt;<span class="cons_String">from</span> &lt;<a href="#RefScope_3178_3186" id="RefScope_3152_3160" title="Defined at line 134, 135, 136, 137">RefScope</a>&gt;&gt; {<span class="keyword">bracket</span>}
  
  <a href="#RefScope_3152_3160" id="RefScope_3178_3186" title="Referenced at line 132">RefScope</a>.<span class="cons_Constructor"><span id="Current_3187_3194" title="Not referenced locally, nor via imports">Current</span></span> = &lt;<span class="cons_String">current</span> <span class="cons_String">scope</span>&gt; 
  <a href="#RefScope_3152_3160" id="RefScope_3216_3224" title="Referenced at line 132">RefScope</a>.<span class="cons_Constructor"><span id="Enclosing_3225_3234" title="Not referenced locally, nor via imports">Enclosing</span></span> = &lt;<span class="cons_String">enclosing</span> &lt;<a href="../core/Namespaces.sdf3#NamespaceRef_340_352" id="NamespaceRef_3249_3261" title="Defined at ../core/Namespaces.sdf3 line 24">NamespaceRef</a>&gt;&gt; 
  <a href="#RefScope_3152_3160" id="RefScope_3267_3275" title="Referenced at line 132">RefScope</a>.<span class="cons_Constructor"><span id="Context_3276_3283" title="Not referenced locally, nor via imports">Context</span></span> = &lt;&lt;<a href="#Disambiguator_2593_2606" id="Disambiguator_3288_3301" title="Defined at line 111, 139, 140">Disambiguator</a>&gt; &lt;<a href="../core/Namespaces.sdf3#NamespaceRef_340_352" id="NamespaceRef_3304_3316" title="Defined at ../core/Namespaces.sdf3 line 24">NamespaceRef</a>&gt; &lt;<a href="../terms/Terms.sdf3#Term_523_527" id="Term_3319_3323" title="Defined at ../terms/Terms.sdf3 line 29, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42">Term</a>&gt; &lt;<a href="#PropertyPattern_716_731" id="PropertyPattern_3326_3341" title="Defined at line 38, 39">PropertyPattern</a>*&gt; &lt;<a href="#InRefScope_3030_3040" id="InRefScope_3345_3355" title="Defined at line 128, 129">InRefScope</a>&gt;&gt; 
  <a href="#RefScope_3152_3160" id="RefScope_3361_3369" title="Referenced at line 132">RefScope</a>.<span class="cons_Constructor"><span id="RefScope_3370_3378" title="Not referenced locally, nor via imports">RefScope</span></span> = &lt;&lt;<a href="../terms/Terms.sdf3#Term_523_527" id="Term_3383_3387" title="Defined at ../terms/Terms.sdf3 line 29, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42">Term</a>&gt;&gt; 
  
  <a href="#Disambiguator_3288_3301" id="Disambiguator_3396_3409" title="Referenced at line 136">Disambiguator</a>.<span class="cons_Constructor"><span id="All_3410_3413" title="Not referenced locally, nor via imports">All</span></span> = &lt;&gt; 
  <a href="#Disambiguator_3288_3301" id="Disambiguator_3422_3435" title="Referenced at line 136">Disambiguator</a>.<span class="cons_Constructor"><span id="Best_3436_3440" title="Not referenced locally, nor via imports">Best</span></span> = &lt;<span class="cons_String">best</span>&gt; 

<span class="keyword">context-free syntax</span> <span class="layout">// constraints</span>

  <a href="#Constraints_2572_2583" id="Constraints_3490_3501" title="Referenced at line 109">Constraints</a>.<span class="cons_Constructor"><span id="NoWhere_3502_3509" title="Not referenced locally, nor via imports">NoWhere</span></span> = &lt;&gt; 
  <a href="#Constraints_2572_2583" id="Constraints_3518_3529" title="Referenced at line 109">Constraints</a>.<span class="cons_Constructor"><span id="Where_3530_3535" title="Not referenced locally, nor via imports">Where</span></span> = &lt;
    <span class="cons_String">where</span> &lt;<a href="../formulas/Formulas.sdf3#Formula_99_106" id="Formula_3551_3558" title="Defined at ../formulas/Formulas.sdf3 line 10, 12, 15, 19, 24">Formula</a>&gt;
  &gt; {<span class="keyword">bracket</span>}
  
  <a href="#Filters_2530_2537" id="Filters_3579_3586" title="Referenced at line 107">Filters</a>.<span class="cons_Constructor"><span id="Filter_3587_3593" title="Not referenced locally, nor via imports">Filter</span></span> = &lt;
    <span class="cons_String">with</span> &lt;<a href="../formulas/Formulas.sdf3#Formula_99_106" id="Formula_3608_3615" title="Defined at ../formulas/Formulas.sdf3 line 10, 12, 15, 19, 24">Formula</a>&gt;
  &gt; 
  
  <span id="Proposition_3627_3638" title="Not referenced locally, nor via imports">Proposition</span>.<span class="cons_Constructor"><span id="PropertyPattern_3639_3654" title="Not referenced locally, nor via imports">PropertyPattern</span></span> = &lt;&lt;<a href="../terms/Vars.sdf3#VarRef_84_90" id="VarRef_3659_3665" title="Defined at ../terms/Vars.sdf3 line 10, 18, 19">VarRef</a>&gt; <span class="cons_String">has</span> &lt;<a href="../core/Properties.sdf3#PropertyRef_500_511" id="PropertyRef_3672_3683" title="Defined at ../core/Properties.sdf3 line 32, 33">PropertyRef</a>&gt; &lt;<a href="../terms/Terms.sdf3#Pattern_95_102" id="Pattern_3686_3693" title="Defined at ../terms/Terms.sdf3 line 11, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25">Pattern</a>&gt;&gt; {<span class="keyword">avoid</span>}

<span class="keyword">lexical syntax</span>

  <span id="Id_3723_3725" title="Not referenced locally, nor via imports">Id</span> = <span class="cons_Lit">"into"</span> {<span class="keyword">reject</span>}
  <span id="Id_3746_3748" title="Not referenced locally, nor via imports">Id</span> = <span class="cons_Lit">"enclosing"</span> {<span class="keyword">reject</span>}

<span class="keyword">template options</span>

  <span class="keyword">keyword</span> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">z</span>]

</code></pre></td></tr></tbody></table></div>