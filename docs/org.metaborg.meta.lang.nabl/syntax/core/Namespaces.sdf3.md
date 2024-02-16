---
title: Namespaces.sdf3
hide:
  - toc
---

# `Namespaces.sdf3`

:simple-github: [pdmosses/nabl/org.metaborg.meta.lang.nabl/syntax/core/Namespaces.sdf3]

[pdmosses/nabl/org.metaborg.meta.lang.nabl/syntax/core/Namespaces.sdf3]: https://github.com/pdmosses/nabl/blob/master/org.metaborg.meta.lang.nabl/syntax/core/Namespaces.sdf3 "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="core/Namespaces_1_8" title="a definition with multiple references" data-urls="../Properties.sdf3/#core/Namespaces line 10_2; ../Scopes.sdf3/#core/Namespaces line 6_2; ../../NameBindingLanguage.sdf3/#core/Namespaces line 12_3; ../../formulas/Propositions.sdf3/#core/Namespaces line 7_3">core/Namespaces</button>

<span class="keyword">imports</span> 

  <a href="../../common/Identifiers.sdf3/#common/Identifiers_1_8" id="common/Identifiers_5_3" title="a reference to a single-file definition">common/Identifiers</a>  
  <a href="../Modules.sdf3/#core/Modules_1_8" id="core/Modules_6_3" title="a reference to a single-file definition">core/Modules</a>
  
<span class="keyword">lexical syntax</span>

  <button class="modal-open" id="NamespaceID_10_3" title="a definition with multiple references" data-urls="#NamespaceID line 21_33, 24_46">NamespaceID</button> = <a href="../../common/Identifiers.sdf3/#Id_5_3" id="Id_10_17" title="a reference to a single-file definition">Id</a> 
  <button class="modal-open" id="NamespaceID_11_3" title="a definition with multiple references" data-urls="#NamespaceID line 21_33, 24_46">NamespaceID</button> = <a href="#SectionKeyword_12_3" id="SectionKeyword_11_17" title="a reference to a single-file definition">SectionKeyword</a> {<span class="keyword">reject</span>}
  <a href="#SectionKeyword_11_17" id="SectionKeyword_12_3" title="a definition with a single reference">SectionKeyword</a> = <span class="cons_Lit">"namespaces"</span> 

<span class="keyword">context-free syntax</span>

  <span id="ModuleSection_16_3" title="a definition with no references">ModuleSection</span>.<span class="cons_Constructor"><span id="Namespaces_16_17" title="a definition with no references">Namespaces</span></span> = &lt;
  <span class="cons_String">namespaces</span>   
    &lt;<a href="#NamespaceDef_21_3" id="NamespaceDef_18_6" title="a reference to a single-file definition">NamespaceDef</a>*&gt;
  &gt; 
  
  <a href="#NamespaceDef_18_6" id="NamespaceDef_21_3" title="a definition with a single reference">NamespaceDef</a>.<span class="cons_Constructor"><span id="NamespaceDef_21_16" title="a definition with no references">NamespaceDef</span></span> = &lt;&lt;<a href="#NamespaceID_10_3" id="NamespaceID_21_33" title="a reference to a single-file definition">NamespaceID</a>&gt;
    &gt; 
    
  <button class="modal-open" id="NamespaceRef_24_3" title="a definition with multiple references" data-urls="../Properties.sdf3/#NamespaceRef line 30_23; ../Scopes.sdf3/#NamespaceRef line 15_29, 16_39, 17_28, 18_38, 27_21, 31_21, 35_15; ../../NameBindingLanguage.sdf3/#NamespaceRef line 26_56, 32_21, 62_33, 73_14, 77_31, 85_30, 92_28, 100_14, 106_20, 135_36, 136_40; ../../formulas/Propositions.sdf3/#NamespaceRef line 19_39, 21_49">NamespaceRef</button>.<span class="cons_Constructor"><span id="NamespaceRef_24_16" title="a definition with no references">NamespaceRef</span></span> = &lt;&lt;<a href="#LanguageRef_26_3" id="LanguageRef_24_33" title="a reference to a single-file definition">LanguageRef</a>&gt;&lt;<a href="#NamespaceID_10_3" id="NamespaceID_24_46" title="a reference to a single-file definition">NamespaceID</a>&gt;&gt; 
  
  <a href="#LanguageRef_24_33" id="LanguageRef_26_3" title="a definition with a single reference">LanguageRef</a>.<span class="cons_Constructor"><span id="CurrentLanguage_26_15" title="a definition with no references">CurrentLanguage</span></span> = &lt;&gt; 
  <a href="#LanguageRef_24_33" id="LanguageRef_27_3" title="a definition with a single reference">LanguageRef</a>.<span class="cons_Constructor"><span id="LanguageRef_27_15" title="a definition with no references">LanguageRef</span></span> = &lt;&lt;<a href="../../common/Identifiers.sdf3/#Id_5_3" id="Id_27_31" title="a reference to a single-file definition">Id</a>&gt;<span class="cons_String">.</span>&gt; 

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
