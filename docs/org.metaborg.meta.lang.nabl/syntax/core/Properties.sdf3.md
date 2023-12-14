---
title: Properties.sdf3
hide:
  - toc
---

# `Properties.sdf3`

:simple-github: [pdmosses/nabl/org.metaborg.meta.lang.nabl/syntax/core/Properties.sdf3]

[pdmosses/nabl/org.metaborg.meta.lang.nabl/syntax/core/Properties.sdf3]: https://github.com/pdmosses/nabl/blob/master/org.metaborg.meta.lang.nabl/syntax/core/Properties.sdf3 "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="core/Properties_1_8" title="Multi-file references" data-urls="../../NameBindingLanguage.sdf3/#core/Properties_13_3 line 13; ../../formulas/Propositions.sdf3/#core/Properties_9_3 line 9">core/Properties</button>

<span class="keyword">imports</span>

        <a href="../../common/Identifiers.sdf3/#common/Identifiers_1_8" id="common/Identifiers_5_2" title="Defined at ../../common/Identifiers.sdf3 line 1">common/Identifiers</a>  
        <a href="../../terms/Signatures.sdf3/#terms/Signatures_1_8" id="terms/Signatures_6_2" title="Defined at ../../terms/Signatures.sdf3 line 1">terms/Signatures</a>  
        <a href="../../terms/Vars.sdf3/#terms/Vars_1_8" id="terms/Vars_7_2" title="Defined at ../../terms/Vars.sdf3 line 1">terms/Vars</a>  
        <a href="../../terms/Terms.sdf3/#terms/Terms_1_8" id="terms/Terms_8_2" title="Defined at ../../terms/Terms.sdf3 line 1">terms/Terms</a> 
        <a href="../../formulas/Formulas.sdf3/#formulas/Formulas_1_8" id="formulas/Formulas_9_2" title="Defined at ../../formulas/Formulas.sdf3 line 1">formulas/Formulas</a> 
        <a href="../Namespaces.sdf3/#core/Namespaces_1_8" id="core/Namespaces_10_2" title="Defined at ../Namespaces.sdf3 line 1">core/Namespaces</a>

<span class="keyword">lexical syntax</span>

  <a href="#PropertyID_30_6" id="PropertyID_14_3" title="Referenced at line 30, 33">PropertyID</a> = <a href="../../common/Identifiers.sdf3/#Id_5_3" id="Id_14_16" title="Defined at ../../common/Identifiers.sdf3 line 5, 9, 11, 25, 26, 27">Id</a> 
  <a href="#PropertyID_30_6" id="PropertyID_15_3" title="Referenced at line 30, 33">PropertyID</a> = <span class="cons_Lit">"type"</span> {<span class="keyword">reject</span>}
  <a href="#PropertyID_30_6" id="PropertyID_16_3" title="Referenced at line 30, 33">PropertyID</a> = <a href="#SectionKeyword_18_3" id="SectionKeyword_16_16" title="Defined at line 18">SectionKeyword</a> {<span class="keyword">reject</span>}
  
  <a href="#SectionKeyword_16_16" id="SectionKeyword_18_3" title="Referenced at line 16">SectionKeyword</a> = <span class="cons_Lit">"properties"</span> 
  
  <button class="modal-open" id="Relation_20_3" title="Multi-file references" data-urls="../../NameBindingLanguage.sdf3/#Relation_112_30 line 112; ../../formulas/Propositions.sdf3/#Relation_24_37 line 24">Relation</button> = <span class="cons_Lit">"&lt;"</span> [<span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">a</span>-<span class="cons_Regular">z</span>\-]* <span class="cons_Lit">":"</span> 

<span class="keyword">context-free syntax</span>

  <span id="ModuleSection_24_3" title="Not referenced">ModuleSection</span>.<span class="cons_Constructor"><span id="Properties_24_17" title="Not referenced">Properties</span></span> = &lt;
  <span class="cons_String">properties</span>   
    &lt;<a href="#PropertyDef_29_3" id="PropertyDef_26_6" title="Defined at line 29">PropertyDef</a>*&gt;
  &gt; 

  <a href="#PropertyDef_26_6" id="PropertyDef_29_3" title="Referenced at line 26">PropertyDef</a>.<span class="cons_Constructor"><span id="PropertyDef_29_15" title="Not referenced">PropertyDef</span></span> = &lt;
    &lt;<a href="#PropertyID_14_3" id="PropertyID_30_6" title="Defined at line 14, 15, 16">PropertyID</a>&gt; <span class="cons_String">of</span> &lt;{<a href="../Namespaces.sdf3/#NamespaceRef_24_3" id="NamespaceRef_30_23" title="Defined at ../Namespaces.sdf3 line 24">NamespaceRef</a> <span class="cons_Lit">", "</span>}+&gt; <span class="cons_String">:</span> &lt;<a href="../../terms/Signatures.sdf3/#Sort_10_3" id="Sort_30_47" title="Defined at ../../terms/Signatures.sdf3 line 10, 14, 15, 16">Sort</a>&gt;&gt; 

  <button class="modal-open" id="PropertyRef_32_3" title="Multi-file references" data-urls="../../NameBindingLanguage.sdf3/#PropertyRef_36_36 line 36, 38, 153; ../../formulas/Propositions.sdf3/#PropertyRef_23_44 line 23">PropertyRef</button>.<span class="cons_Constructor"><span id="TypeProp_32_15" title="Not referenced">TypeProp</span></span> = &lt;<span class="cons_String">type</span>&gt; 
  <button class="modal-open" id="PropertyRef_33_3" title="Multi-file references" data-urls="../../NameBindingLanguage.sdf3/#PropertyRef_36_36 line 36, 38, 153; ../../formulas/Propositions.sdf3/#PropertyRef_23_44 line 23">PropertyRef</button>.<span class="cons_Constructor"><span id="PropertyRef_33_15" title="Not referenced">PropertyRef</span></span> = &lt;&lt;<a href="#PropertyID_14_3" id="PropertyID_33_31" title="Defined at line 14, 15, 16">PropertyID</a>&gt;&gt; 

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
