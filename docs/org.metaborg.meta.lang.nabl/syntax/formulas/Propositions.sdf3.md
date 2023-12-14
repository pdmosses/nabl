---
title: Propositions.sdf3
hide:
  - toc
---

# `Propositions.sdf3`

:simple-github: [pdmosses/nabl/org.metaborg.meta.lang.nabl/syntax/formulas/Propositions.sdf3]

[pdmosses/nabl/org.metaborg.meta.lang.nabl/syntax/formulas/Propositions.sdf3]: https://github.com/pdmosses/nabl/blob/master/org.metaborg.meta.lang.nabl/syntax/formulas/Propositions.sdf3 "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="formulas/Propositions_1_8" title="Multi-file references" data-urls="../Formulas.sdf3/#formulas/Propositions_6_3 line 6; ../../NameBindingLanguage.sdf3/#formulas/Propositions_10_3 line 10">formulas/Propositions</button>

<span class="keyword">imports</span> 

  <a href="../../terms/Terms.sdf3/#terms/Terms_1_8" id="terms/Terms_5_3" title="Defined at ../../terms/Terms.sdf3 line 1">terms/Terms</a> 
  <a href="../../terms/Vars.sdf3/#terms/Vars_1_8" id="terms/Vars_6_3" title="Defined at ../../terms/Vars.sdf3 line 1">terms/Vars</a>  
  <a href="../../core/Namespaces.sdf3/#core/Namespaces_1_8" id="core/Namespaces_7_3" title="Defined at ../../core/Namespaces.sdf3 line 1">core/Namespaces</a> 
  <a href="../../core/Scopes.sdf3/#core/Scopes_1_8" id="core/Scopes_8_3" title="Defined at ../../core/Scopes.sdf3 line 1">core/Scopes</a> 
  <a href="../../core/Properties.sdf3/#core/Properties_1_8" id="core/Properties_9_3" title="Defined at ../../core/Properties.sdf3 line 1">core/Properties</a>

<span class="keyword">context-free syntax</span>

  <a href="../Formulas.sdf3/#Proposition_10_15" id="Proposition_13_3" title="Referenced at ../Formulas.sdf3 line 10">Proposition</a>.<span class="cons_Constructor"><span id="True_13_15" title="Not referenced">True</span></span> = &lt;<span class="cons_String">true</span>&gt; 
  <a href="../Formulas.sdf3/#Proposition_10_15" id="Proposition_14_3" title="Referenced at ../Formulas.sdf3 line 10">Proposition</a>.<span class="cons_Constructor"><span id="False_14_15" title="Not referenced">False</span></span> = &lt;<span class="cons_String">false</span>&gt; 
  <a href="../Formulas.sdf3/#Proposition_10_15" id="Proposition_15_3" title="Referenced at ../Formulas.sdf3 line 10">Proposition</a>.<span class="cons_Constructor"><span id="Eq_15_15" title="Not referenced">Eq</span></span> = [[<a href="../../terms/Vars.sdf3/#VarRef_10_11" id="VarRef_15_22" title="Defined at ../../terms/Vars.sdf3 line 10, 18, 19">VarRef</a>] <span class="cons_String">==</span> [<a href="../../terms/Terms.sdf3/#Term_29_3" id="Term_15_34" title="Defined at ../../terms/Terms.sdf3 line 29, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42">Term</a>]] 
  
  <a href="../Formulas.sdf3/#Proposition_10_15" id="Proposition_17_3" title="Referenced at ../Formulas.sdf3 line 10">Proposition</a>.<span class="cons_Constructor"><span id="Match_17_15" title="Not referenced">Match</span></span> = [[<a href="../../terms/Vars.sdf3/#VarRef_10_11" id="VarRef_17_25" title="Defined at ../../terms/Vars.sdf3 line 10, 18, 19">VarRef</a>] <span class="cons_String">=&gt;</span> [<a href="../../terms/Terms.sdf3/#Pattern_11_3" id="Pattern_17_37" title="Defined at ../../terms/Terms.sdf3 line 11, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25">Pattern</a>]] 
  <a href="../Formulas.sdf3/#Proposition_10_15" id="Proposition_18_3" title="Referenced at ../Formulas.sdf3 line 10">Proposition</a>.<span class="cons_Constructor"><span id="DefOf_18_15" title="Not referenced">DefOf</span></span> = [<span class="cons_String">definition</span> <span class="cons_String">of</span> [<a href="../../terms/Vars.sdf3/#VarRef_10_11" id="VarRef_18_39" title="Defined at ../../terms/Vars.sdf3 line 10, 18, 19">VarRef</a>] <span class="cons_String">=&gt;</span> [<a href="../../terms/Vars.sdf3/#Var_10_7" id="Var_18_51" title="Defined at ../../terms/Vars.sdf3 line 10, 15, 16, 17">Var</a>]] 
  <a href="../Formulas.sdf3/#Proposition_10_15" id="Proposition_19_3" title="Referenced at ../Formulas.sdf3 line 10">Proposition</a>.<span class="cons_Constructor"><span id="DefOf_19_15" title="Not referenced">DefOf</span></span> = [<span class="cons_String">definition</span> <span class="cons_String">of</span> [<a href="../../core/Namespaces.sdf3/#NamespaceRef_24_3" id="NamespaceRef_19_39" title="Defined at ../../core/Namespaces.sdf3 line 24">NamespaceRef</a>] [<a href="../../terms/Vars.sdf3/#VarRef_10_11" id="VarRef_19_54" title="Defined at ../../terms/Vars.sdf3 line 10, 18, 19">VarRef</a>] <span class="cons_String">=&gt;</span> [<a href="../../terms/Vars.sdf3/#Var_10_7" id="Var_19_66" title="Defined at ../../terms/Vars.sdf3 line 10, 15, 16, 17">Var</a>]] 
  <a href="../Formulas.sdf3/#Proposition_10_15" id="Proposition_20_3" title="Referenced at ../Formulas.sdf3 line 10">Proposition</a>.<span class="cons_Constructor"><span id="ScopeOf_20_15" title="Not referenced">ScopeOf</span></span> = [[<a href="../../core/Scopes.sdf3/#Scope_20_3" id="Scope_20_27" title="Defined at ../../core/Scopes.sdf3 line 20, 21, 22">Scope</a>] <span class="cons_String">=&gt;</span> [<a href="../../terms/Vars.sdf3/#Var_10_7" id="Var_20_38" title="Defined at ../../terms/Vars.sdf3 line 10, 15, 16, 17">Var</a>]] 
  <a href="../Formulas.sdf3/#Proposition_10_15" id="Proposition_21_3" title="Referenced at ../Formulas.sdf3 line 10">Proposition</a>.<span class="cons_Constructor"><span id="ResolvesTo_21_15" title="Not referenced">ResolvesTo</span></span> = &lt;&lt;<a href="../../terms/Terms.sdf3/#Term_29_3" id="Term_21_30" title="Defined at ../../terms/Terms.sdf3 line 29, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42">Term</a>&gt; <span class="cons_String">resolves</span> <span class="cons_String">to</span> &lt;<a href="../../core/Namespaces.sdf3/#NamespaceRef_24_3" id="NamespaceRef_21_49" title="Defined at ../../core/Namespaces.sdf3 line 24">NamespaceRef</a>&gt; &lt;<a href="../../terms/Vars.sdf3/#Var_10_7" id="Var_21_64" title="Defined at ../../terms/Vars.sdf3 line 10, 15, 16, 17">Var</a>&gt;&gt; 
  
  <a href="../Formulas.sdf3/#Proposition_10_15" id="Proposition_23_3" title="Referenced at ../Formulas.sdf3 line 10">Proposition</a>.<span class="cons_Constructor"><span id="HasProperty_23_15" title="Not referenced">HasProperty</span></span> = &lt;&lt;<a href="../../terms/Vars.sdf3/#VarRef_10_11" id="VarRef_23_31" title="Defined at ../../terms/Vars.sdf3 line 10, 18, 19">VarRef</a>&gt; <span class="cons_String">has</span> &lt;<a href="../../core/Properties.sdf3/#PropertyRef_32_3" id="PropertyRef_23_44" title="Defined at ../../core/Properties.sdf3 line 32, 33">PropertyRef</a>&gt; &lt;<a href="../../terms/Vars.sdf3/#Var_10_7" id="Var_23_58" title="Defined at ../../terms/Vars.sdf3 line 10, 15, 16, 17">Var</a>&gt;&gt; 
  <a href="../Formulas.sdf3/#Proposition_10_15" id="Proposition_24_3" title="Referenced at ../Formulas.sdf3 line 10">Proposition</a>.<span class="cons_Constructor"><span id="InRelation_24_15" title="Not referenced">InRelation</span></span> = [[<a href="../../terms/Terms.sdf3/#Term_29_3" id="Term_24_30" title="Defined at ../../terms/Terms.sdf3 line 29, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42">Term</a>] [<a href="../../core/Properties.sdf3/#Relation_20_3" id="Relation_24_37" title="Defined at ../../core/Properties.sdf3 line 20">Relation</a>] [<a href="../../terms/Terms.sdf3/#Term_29_3" id="Term_24_48" title="Defined at ../../terms/Terms.sdf3 line 29, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42">Term</a>]] 

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
