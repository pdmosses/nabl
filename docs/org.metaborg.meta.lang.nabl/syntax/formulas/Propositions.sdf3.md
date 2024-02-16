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
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="formulas/Propositions_1_8" title="a definition with multiple references" data-urls="../Formulas.sdf3/#formulas/Propositions line 6_3; ../../NameBindingLanguage.sdf3/#formulas/Propositions line 10_3">formulas/Propositions</button>

<span class="keyword">imports</span> 

  <a href="../../terms/Terms.sdf3/#terms/Terms_1_8" id="terms/Terms_5_3" title="a reference to a single-file definition">terms/Terms</a> 
  <a href="../../terms/Vars.sdf3/#terms/Vars_1_8" id="terms/Vars_6_3" title="a reference to a single-file definition">terms/Vars</a>  
  <a href="../../core/Namespaces.sdf3/#core/Namespaces_1_8" id="core/Namespaces_7_3" title="a reference to a single-file definition">core/Namespaces</a> 
  <a href="../../core/Scopes.sdf3/#core/Scopes_1_8" id="core/Scopes_8_3" title="a reference to a single-file definition">core/Scopes</a> 
  <a href="../../core/Properties.sdf3/#core/Properties_1_8" id="core/Properties_9_3" title="a reference to a single-file definition">core/Properties</a>

<span class="keyword">context-free syntax</span>

  <a href="../Formulas.sdf3/#Proposition_10_15" id="Proposition_13_3" title="a definition with a single reference">Proposition</a>.<span class="cons_Constructor"><span id="True_13_15" title="a definition with no references">True</span></span> = &lt;<span class="cons_String">true</span>&gt; 
  <a href="../Formulas.sdf3/#Proposition_10_15" id="Proposition_14_3" title="a definition with a single reference">Proposition</a>.<span class="cons_Constructor"><span id="False_14_15" title="a definition with no references">False</span></span> = &lt;<span class="cons_String">false</span>&gt; 
  <a href="../Formulas.sdf3/#Proposition_10_15" id="Proposition_15_3" title="a definition with a single reference">Proposition</a>.<span class="cons_Constructor"><span id="Eq_15_15" title="a definition with no references">Eq</span></span> = [[<a href="../../terms/Vars.sdf3/#VarRef_10_11" id="VarRef_15_22" title="a reference to a single-file definition">VarRef</a>] <span class="cons_String">==</span> [<a href="../../terms/Terms.sdf3/#Term_29_3" id="Term_15_34" title="a reference to a single-file definition">Term</a>]] 
  
  <a href="../Formulas.sdf3/#Proposition_10_15" id="Proposition_17_3" title="a definition with a single reference">Proposition</a>.<span class="cons_Constructor"><span id="Match_17_15" title="a definition with no references">Match</span></span> = [[<a href="../../terms/Vars.sdf3/#VarRef_10_11" id="VarRef_17_25" title="a reference to a single-file definition">VarRef</a>] <span class="cons_String">=&gt;</span> [<a href="../../terms/Terms.sdf3/#Pattern_11_3" id="Pattern_17_37" title="a reference to a single-file definition">Pattern</a>]] 
  <a href="../Formulas.sdf3/#Proposition_10_15" id="Proposition_18_3" title="a definition with a single reference">Proposition</a>.<span class="cons_Constructor"><span id="DefOf_18_15" title="a definition with no references">DefOf</span></span> = [<span class="cons_String">definition</span> <span class="cons_String">of</span> [<a href="../../terms/Vars.sdf3/#VarRef_10_11" id="VarRef_18_39" title="a reference to a single-file definition">VarRef</a>] <span class="cons_String">=&gt;</span> [<a href="../../terms/Vars.sdf3/#Var_10_7" id="Var_18_51" title="a reference to a single-file definition">Var</a>]] 
  <a href="../Formulas.sdf3/#Proposition_10_15" id="Proposition_19_3" title="a definition with a single reference">Proposition</a>.<span class="cons_Constructor"><span id="DefOf_19_15" title="a definition with no references">DefOf</span></span> = [<span class="cons_String">definition</span> <span class="cons_String">of</span> [<a href="../../core/Namespaces.sdf3/#NamespaceRef_24_3" id="NamespaceRef_19_39" title="a reference to a single-file definition">NamespaceRef</a>] [<a href="../../terms/Vars.sdf3/#VarRef_10_11" id="VarRef_19_54" title="a reference to a single-file definition">VarRef</a>] <span class="cons_String">=&gt;</span> [<a href="../../terms/Vars.sdf3/#Var_10_7" id="Var_19_66" title="a reference to a single-file definition">Var</a>]] 
  <a href="../Formulas.sdf3/#Proposition_10_15" id="Proposition_20_3" title="a definition with a single reference">Proposition</a>.<span class="cons_Constructor"><span id="ScopeOf_20_15" title="a definition with no references">ScopeOf</span></span> = [[<a href="../../core/Scopes.sdf3/#Scope_20_3" id="Scope_20_27" title="a reference to a single-file definition">Scope</a>] <span class="cons_String">=&gt;</span> [<a href="../../terms/Vars.sdf3/#Var_10_7" id="Var_20_38" title="a reference to a single-file definition">Var</a>]] 
  <a href="../Formulas.sdf3/#Proposition_10_15" id="Proposition_21_3" title="a definition with a single reference">Proposition</a>.<span class="cons_Constructor"><span id="ResolvesTo_21_15" title="a definition with no references">ResolvesTo</span></span> = &lt;&lt;<a href="../../terms/Terms.sdf3/#Term_29_3" id="Term_21_30" title="a reference to a single-file definition">Term</a>&gt; <span class="cons_String">resolves</span> <span class="cons_String">to</span> &lt;<a href="../../core/Namespaces.sdf3/#NamespaceRef_24_3" id="NamespaceRef_21_49" title="a reference to a single-file definition">NamespaceRef</a>&gt; &lt;<a href="../../terms/Vars.sdf3/#Var_10_7" id="Var_21_64" title="a reference to a single-file definition">Var</a>&gt;&gt; 
  
  <a href="../Formulas.sdf3/#Proposition_10_15" id="Proposition_23_3" title="a definition with a single reference">Proposition</a>.<span class="cons_Constructor"><span id="HasProperty_23_15" title="a definition with no references">HasProperty</span></span> = &lt;&lt;<a href="../../terms/Vars.sdf3/#VarRef_10_11" id="VarRef_23_31" title="a reference to a single-file definition">VarRef</a>&gt; <span class="cons_String">has</span> &lt;<a href="../../core/Properties.sdf3/#PropertyRef_32_3" id="PropertyRef_23_44" title="a reference to a single-file definition">PropertyRef</a>&gt; &lt;<a href="../../terms/Vars.sdf3/#Var_10_7" id="Var_23_58" title="a reference to a single-file definition">Var</a>&gt;&gt; 
  <a href="../Formulas.sdf3/#Proposition_10_15" id="Proposition_24_3" title="a definition with a single reference">Proposition</a>.<span class="cons_Constructor"><span id="InRelation_24_15" title="a definition with no references">InRelation</span></span> = [[<a href="../../terms/Terms.sdf3/#Term_29_3" id="Term_24_30" title="a reference to a single-file definition">Term</a>] [<a href="../../core/Properties.sdf3/#Relation_20_3" id="Relation_24_37" title="a reference to a single-file definition">Relation</a>] [<a href="../../terms/Terms.sdf3/#Term_29_3" id="Term_24_48" title="a reference to a single-file definition">Term</a>]] 

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
