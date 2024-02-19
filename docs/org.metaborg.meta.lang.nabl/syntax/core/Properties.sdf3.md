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
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="core/Properties_1_8" title="a definition with multiple references" data-urls="../../NameBindingLanguage.sdf3/#core/Properties line 13_3; ../../formulas/Propositions.sdf3/#core/Properties line 9_3">core/Properties</button>

<span class="keyword">imports</span>

        <a href="../../common/Identifiers.sdf3/#common/Identifiers_1_8" id="common/Identifiers_5_2" title="a reference to a single-file definition">common/Identifiers</a>  
        <a href="../../terms/Signatures.sdf3/#terms/Signatures_1_8" id="terms/Signatures_6_2" title="a reference to a single-file definition">terms/Signatures</a>  
        <a href="../../terms/Vars.sdf3/#terms/Vars_1_8" id="terms/Vars_7_2" title="a reference to a single-file definition">terms/Vars</a>  
        <a href="../../terms/Terms.sdf3/#terms/Terms_1_8" id="terms/Terms_8_2" title="a reference to a single-file definition">terms/Terms</a> 
        <a href="../../formulas/Formulas.sdf3/#formulas/Formulas_1_8" id="formulas/Formulas_9_2" title="a reference to a single-file definition">formulas/Formulas</a> 
        <a href="../Namespaces.sdf3/#core/Namespaces_1_8" id="core/Namespaces_10_2" title="a reference to a single-file definition">core/Namespaces</a>

<span class="keyword">lexical syntax</span>

  <button class="modal-open" id="PropertyID_14_3" title="a definition with multiple references" data-urls="#PropertyID line 30_6, 33_31">PropertyID</button> = <a href="../../common/Identifiers.sdf3/#Id_5_3" id="Id_14_16" title="a reference to a single-file definition">Id</a> 
  <button class="modal-open" id="PropertyID_15_3" title="a definition with multiple references" data-urls="#PropertyID line 30_6, 33_31">PropertyID</button> = <span class="cons_Lit">"type"</span> {<span class="keyword">reject</span>}
  <button class="modal-open" id="PropertyID_16_3" title="a definition with multiple references" data-urls="#PropertyID line 30_6, 33_31">PropertyID</button> = <a href="#SectionKeyword_18_3" id="SectionKeyword_16_16" title="a reference to a single-file definition">SectionKeyword</a> {<span class="keyword">reject</span>}
  
  <a href="#SectionKeyword_16_16" id="SectionKeyword_18_3" title="a definition with a single reference">SectionKeyword</a> = <span class="cons_Lit">"properties"</span> 
  
  <button class="modal-open" id="Relation_20_3" title="a definition with multiple references" data-urls="../../NameBindingLanguage.sdf3/#Relation line 112_30; ../../formulas/Propositions.sdf3/#Relation line 24_37">Relation</button> = <span class="cons_Lit">"&lt;"</span> [<span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">a</span>-<span class="cons_Regular">z</span>\-]* <span class="cons_Lit">":"</span> 

<span class="keyword">context-free syntax</span>

  <span id="ModuleSection_24_3" title="a definition with no references">ModuleSection</span>.<span class="cons_Constructor"><span id="Properties_24_17" title="a definition with no references">Properties</span></span> = &lt;
  <span class="cons_String">properties</span>   
    &lt;<a href="#PropertyDef_29_3" id="PropertyDef_26_6" title="a reference to a single-file definition">PropertyDef</a>*&gt;
  &gt; 

  <a href="#PropertyDef_26_6" id="PropertyDef_29_3" title="a definition with a single reference">PropertyDef</a>.<span class="cons_Constructor"><span id="PropertyDef_29_15" title="a definition with no references">PropertyDef</span></span> = &lt;
    &lt;<a href="#PropertyID_14_3" id="PropertyID_30_6" title="a reference to a single-file definition">PropertyID</a>&gt; <span class="cons_String">of</span> &lt;{<a href="../Namespaces.sdf3/#NamespaceRef_24_3" id="NamespaceRef_30_23" title="a reference to a single-file definition">NamespaceRef</a> <span class="cons_Lit">", "</span>}+&gt; <span class="cons_String">:</span> &lt;<a href="../../terms/Signatures.sdf3/#Sort_10_3" id="Sort_30_47" title="a reference to a single-file definition">Sort</a>&gt;&gt; 

  <button class="modal-open" id="PropertyRef_32_3" title="a definition with multiple references" data-urls="../../NameBindingLanguage.sdf3/#PropertyRef line 36_36, 38_55, 153_48; ../../formulas/Propositions.sdf3/#PropertyRef line 23_44">PropertyRef</button>.<span class="cons_Constructor"><span id="TypeProp_32_15" title="a definition with no references">TypeProp</span></span> = &lt;<span class="cons_String">type</span>&gt; 
  <button class="modal-open" id="PropertyRef_33_3" title="a definition with multiple references" data-urls="../../NameBindingLanguage.sdf3/#PropertyRef line 36_36, 38_55, 153_48; ../../formulas/Propositions.sdf3/#PropertyRef line 23_44">PropertyRef</button>.<span class="cons_Constructor"><span id="PropertyRef_33_15" title="a definition with no references">PropertyRef</span></span> = &lt;&lt;<a href="#PropertyID_14_3" id="PropertyID_33_31" title="a reference to a single-file definition">PropertyID</a>&gt;&gt; 

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
