---
title: Properties.sdf3
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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../../formulas/Propositions.sdf3#core/Properties_106_121" id="core/Properties_7_22" title="Referenced at ../../formulas/Propositions.sdf3 line 9">core/Properties</a>

<span class="keyword">imports</span>

        <a href="../../common/Identifiers.sdf3#common/Identifiers_7_25" id="common/Identifiers_34_52" title="Defined at ../../common/Identifiers.sdf3 line 1">common/Identifiers</a>  
        <a href="../../terms/Signatures.sdf3#terms/Signatures_7_23" id="terms/Signatures_56_72" title="Defined at ../../terms/Signatures.sdf3 line 1">terms/Signatures</a>  
        <a href="../../terms/Vars.sdf3#terms/Vars_7_17" id="terms/Vars_76_86" title="Defined at ../../terms/Vars.sdf3 line 1">terms/Vars</a>  
        <a href="../../terms/Terms.sdf3#terms/Terms_7_18" id="terms/Terms_90_101" title="Defined at ../../terms/Terms.sdf3 line 1">terms/Terms</a> 
        <a href="../../formulas/Formulas.sdf3#formulas/Formulas_7_24" id="formulas/Formulas_104_121" title="Defined at ../../formulas/Formulas.sdf3 line 1">formulas/Formulas</a> 
        <a href="../Namespaces.sdf3#core/Namespaces_7_22" id="core/Namespaces_124_139" title="Defined at ../Namespaces.sdf3 line 1">core/Namespaces</a>

<span class="keyword">lexical syntax</span>

  <a href="#PropertyID_561_571" id="PropertyID_159_169" title="Referenced at line 33">PropertyID</a> = <a href="../../common/Identifiers.sdf3#Id_36_38" id="Id_172_174" title="Defined at ../../common/Identifiers.sdf3 line 5, 9, 11, 25, 26, 27">Id</a> 
  <a href="#PropertyID_561_571" id="PropertyID_178_188" title="Referenced at line 33">PropertyID</a> = <span class="cons_Lit">"type"</span> {<span class="keyword">reject</span>}
  <a href="#PropertyID_561_571" id="PropertyID_209_219" title="Referenced at line 33">PropertyID</a> = <a href="#SectionKeyword_251_265" id="SectionKeyword_222_236" title="Defined at line 18">SectionKeyword</a> {<span class="keyword">reject</span>}
  
  <a href="#SectionKeyword_222_236" id="SectionKeyword_251_265" title="Referenced at line 16">SectionKeyword</a> = <span class="cons_Lit">"properties"</span> 
  
  <a href="../../formulas/Propositions.sdf3#Relation_641_649" id="Relation_287_295" title="Referenced at ../../formulas/Propositions.sdf3 line 24; ../../NameBindingLanguage.sdf3 line 112">Relation</a> = <span class="cons_Lit">"&lt;"</span> [<span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">a</span>-<span class="cons_Regular">z</span>\-]* <span class="cons_Lit">":"</span> 

<span class="keyword">context-free syntax</span>

  <span id="ModuleSection_343_356" title="Not referenced locally, nor via imports">ModuleSection</span>.<span class="cons_Constructor"><span id="Properties_357_367" title="Not referenced locally, nor via imports">Properties</span></span> = &lt;
  <span class="cons_String">properties</span>   
    &lt;<a href="#PropertyDef_415_426" id="PropertyDef_393_404" title="Defined at line 29">PropertyDef</a>*&gt;
  &gt; 

  <a href="#PropertyDef_393_404" id="PropertyDef_415_426" title="Referenced at line 26">PropertyDef</a>.<span class="cons_Constructor"><span id="PropertyDef_427_438" title="Not referenced locally, nor via imports">PropertyDef</span></span> = &lt;
    &lt;<a href="#PropertyID_159_169" id="PropertyID_448_458" title="Defined at line 14, 15, 16">PropertyID</a>&gt; <span class="cons_String">of</span> &lt;{<a href="../Namespaces.sdf3#NamespaceRef_340_352" id="NamespaceRef_465_477" title="Defined at ../Namespaces.sdf3 line 24">NamespaceRef</a> <span class="cons_Lit">", "</span>}+&gt; <span class="cons_String">:</span> &lt;<a href="../../terms/Signatures.sdf3#Sort_83_87" id="Sort_489_493" title="Defined at ../../terms/Signatures.sdf3 line 10, 14, 15, 16">Sort</a>&gt;&gt; 

  <a href="../../formulas/Propositions.sdf3#PropertyRef_584_595" id="PropertyRef_500_511" title="Referenced at ../../formulas/Propositions.sdf3 line 23; ../../NameBindingLanguage.sdf3 line 153">PropertyRef</a>.<span class="cons_Constructor"><span id="TypeProp_512_520" title="Not referenced locally, nor via imports">TypeProp</span></span> = &lt;<span class="cons_String">type</span>&gt; 
  <a href="../../formulas/Propositions.sdf3#PropertyRef_584_595" id="PropertyRef_533_544" title="Referenced at ../../formulas/Propositions.sdf3 line 23; ../../NameBindingLanguage.sdf3 line 153">PropertyRef</a>.<span class="cons_Constructor"><span id="PropertyRef_545_556" title="Not referenced locally, nor via imports">PropertyRef</span></span> = &lt;&lt;<a href="#PropertyID_159_169" id="PropertyID_561_571" title="Defined at line 14, 15, 16">PropertyID</a>&gt;&gt; 

</code></pre></td></tr></tbody></table></div>