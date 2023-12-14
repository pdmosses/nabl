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
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="core/Namespaces_1_8" title="Multi-file references" data-urls="../Properties.sdf3/#core/Namespaces_10_2 line 10; ../Scopes.sdf3/#core/Namespaces_6_2 line 6; ../../NameBindingLanguage.sdf3/#core/Namespaces_12_3 line 12; ../../formulas/Propositions.sdf3/#core/Namespaces_7_3 line 7">core/Namespaces</button>

<span class="keyword">imports</span> 

  <a href="../../common/Identifiers.sdf3/#common/Identifiers_1_8" id="common/Identifiers_5_3" title="Defined at ../../common/Identifiers.sdf3 line 1">common/Identifiers</a>  
  <a href="../Modules.sdf3/#core/Modules_1_8" id="core/Modules_6_3" title="Defined at ../Modules.sdf3 line 1">core/Modules</a>
  
<span class="keyword">lexical syntax</span>

  <a href="#NamespaceID_21_33" id="NamespaceID_10_3" title="Referenced at line 21, 24">NamespaceID</a> = <a href="../../common/Identifiers.sdf3/#Id_5_3" id="Id_10_17" title="Defined at ../../common/Identifiers.sdf3 line 5, 9, 11, 25, 26, 27">Id</a> 
  <a href="#NamespaceID_21_33" id="NamespaceID_11_3" title="Referenced at line 21, 24">NamespaceID</a> = <a href="#SectionKeyword_12_3" id="SectionKeyword_11_17" title="Defined at line 12">SectionKeyword</a> {<span class="keyword">reject</span>}
  <a href="#SectionKeyword_11_17" id="SectionKeyword_12_3" title="Referenced at line 11">SectionKeyword</a> = <span class="cons_Lit">"namespaces"</span> 

<span class="keyword">context-free syntax</span>

  <span id="ModuleSection_16_3" title="Not referenced">ModuleSection</span>.<span class="cons_Constructor"><span id="Namespaces_16_17" title="Not referenced">Namespaces</span></span> = &lt;
  <span class="cons_String">namespaces</span>   
    &lt;<a href="#NamespaceDef_21_3" id="NamespaceDef_18_6" title="Defined at line 21">NamespaceDef</a>*&gt;
  &gt; 
  
  <a href="#NamespaceDef_18_6" id="NamespaceDef_21_3" title="Referenced at line 18">NamespaceDef</a>.<span class="cons_Constructor"><span id="NamespaceDef_21_16" title="Not referenced">NamespaceDef</span></span> = &lt;&lt;<a href="#NamespaceID_10_3" id="NamespaceID_21_33" title="Defined at line 10, 11">NamespaceID</a>&gt;
    &gt; 
    
  <button class="modal-open" id="NamespaceRef_24_3" title="Multi-file references" data-urls="../Properties.sdf3/#NamespaceRef_30_23 line 30; ../Scopes.sdf3/#NamespaceRef_15_29 line 15, 16, 17, 18, 27, 31, 35; ../../NameBindingLanguage.sdf3/#NamespaceRef_26_56 line 26, 32, 62, 73, 77, 85, 92, 100, 106, 135, 136; ../../formulas/Propositions.sdf3/#NamespaceRef_19_39 line 19, 21">NamespaceRef</button>.<span class="cons_Constructor"><span id="NamespaceRef_24_16" title="Not referenced">NamespaceRef</span></span> = &lt;&lt;<a href="#LanguageRef_26_3" id="LanguageRef_24_33" title="Defined at line 26, 27">LanguageRef</a>&gt;&lt;<a href="#NamespaceID_10_3" id="NamespaceID_24_46" title="Defined at line 10, 11">NamespaceID</a>&gt;&gt; 
  
  <a href="#LanguageRef_24_33" id="LanguageRef_26_3" title="Referenced at line 24">LanguageRef</a>.<span class="cons_Constructor"><span id="CurrentLanguage_26_15" title="Not referenced">CurrentLanguage</span></span> = &lt;&gt; 
  <a href="#LanguageRef_24_33" id="LanguageRef_27_3" title="Referenced at line 24">LanguageRef</a>.<span class="cons_Constructor"><span id="LanguageRef_27_15" title="Not referenced">LanguageRef</span></span> = &lt;&lt;<a href="../../common/Identifiers.sdf3/#Id_5_3" id="Id_27_31" title="Defined at ../../common/Identifiers.sdf3 line 5, 9, 11, 25, 26, 27">Id</a>&gt;<span class="cons_String">.</span>&gt; 

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
