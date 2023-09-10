---
title: Namespaces.sdf3
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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../../formulas/Propositions.sdf3#core/Namespaces_72_87" id="core/Namespaces_7_22" title="Referenced at ../../formulas/Propositions.sdf3 line 7">core/Namespaces</a>

<span class="keyword">imports</span> 

  <a href="../../common/Identifiers.sdf3#common/Identifiers_7_25" id="common/Identifiers_36_54" title="Defined at ../../common/Identifiers.sdf3 line 1">common/Identifiers</a>  
  <a href="../Modules.sdf3#core/Modules_7_19" id="core/Modules_59_71" title="Defined at ../Modules.sdf3 line 1">core/Modules</a>
  
<span class="keyword">lexical syntax</span>

  <a href="#NamespaceID_383_394" id="NamespaceID_93_104" title="Referenced at line 24">NamespaceID</a> = <a href="../../common/Identifiers.sdf3#Id_36_38" id="Id_107_109" title="Defined at ../../common/Identifiers.sdf3 line 5, 9, 11, 25, 26, 27">Id</a> 
  <a href="#NamespaceID_383_394" id="NamespaceID_113_124" title="Referenced at line 24">NamespaceID</a> = <a href="#SectionKeyword_153_167" id="SectionKeyword_127_141" title="Defined at line 12">SectionKeyword</a> {<span class="keyword">reject</span>}
  <a href="#SectionKeyword_127_141" id="SectionKeyword_153_167" title="Referenced at line 11">SectionKeyword</a> = <span class="cons_Lit">"namespaces"</span> 

<span class="keyword">context-free syntax</span>

  <span id="ModuleSection_208_221" title="Not referenced locally, nor via imports">ModuleSection</span>.<span class="cons_Constructor"><span id="Namespaces_222_232" title="Not referenced locally, nor via imports">Namespaces</span></span> = &lt;
  <span class="cons_String">namespaces</span>   
    &lt;<a href="#NamespaceDef_283_295" id="NamespaceDef_258_270" title="Defined at line 21">NamespaceDef</a>*&gt;
  &gt; 
  
  <a href="#NamespaceDef_258_270" id="NamespaceDef_283_295" title="Referenced at line 18">NamespaceDef</a>.<span class="cons_Constructor"><span id="NamespaceDef_296_308" title="Not referenced locally, nor via imports">NamespaceDef</span></span> = &lt;&lt;<a href="#NamespaceID_93_104" id="NamespaceID_313_324" title="Defined at line 10, 11">NamespaceID</a>&gt;
    &gt; 
    
  <a href="../Properties.sdf3#NamespaceRef_465_477" id="NamespaceRef_340_352" title="Referenced at ../Properties.sdf3 line 30; ../Scopes.sdf3 line 35; ../../formulas/Propositions.sdf3 line 21; ../../NameBindingLanguage.sdf3 line 136">NamespaceRef</a>.<span class="cons_Constructor"><span id="NamespaceRef_353_365" title="Not referenced locally, nor via imports">NamespaceRef</span></span> = &lt;&lt;<a href="#LanguageRef_403_414" id="LanguageRef_370_381" title="Defined at line 26, 27">LanguageRef</a>&gt;&lt;<a href="#NamespaceID_93_104" id="NamespaceID_383_394" title="Defined at line 10, 11">NamespaceID</a>&gt;&gt; 
  
  <a href="#LanguageRef_370_381" id="LanguageRef_403_414" title="Referenced at line 24">LanguageRef</a>.<span class="cons_Constructor"><span id="CurrentLanguage_415_430" title="Not referenced locally, nor via imports">CurrentLanguage</span></span> = &lt;&gt; 
  <a href="#LanguageRef_370_381" id="LanguageRef_439_450" title="Referenced at line 24">LanguageRef</a>.<span class="cons_Constructor"><span id="LanguageRef_451_462" title="Not referenced locally, nor via imports">LanguageRef</span></span> = &lt;&lt;<a href="../../common/Identifiers.sdf3#Id_36_38" id="Id_467_469" title="Defined at ../../common/Identifiers.sdf3 line 5, 9, 11, 25, 26, 27">Id</a>&gt;<span class="cons_String">.</span>&gt; 

</code></pre></td></tr></tbody></table></div>