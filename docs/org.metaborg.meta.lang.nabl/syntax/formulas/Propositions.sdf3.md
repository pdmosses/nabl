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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../Formulas.sdf3#formulas/Propositions_53_74" id="formulas/Propositions_7_28" title="Referenced at ../Formulas.sdf3 line 6">formulas/Propositions</a>

<span class="keyword">imports</span> 

  <a href="../../terms/Terms.sdf3#terms/Terms_7_18" id="terms/Terms_42_53" title="Defined at ../../terms/Terms.sdf3 line 1">terms/Terms</a> 
  <a href="../../terms/Vars.sdf3#terms/Vars_7_17" id="terms/Vars_57_67" title="Defined at ../../terms/Vars.sdf3 line 1">terms/Vars</a>  
  <a href="../../core/Namespaces.sdf3#core/Namespaces_7_22" id="core/Namespaces_72_87" title="Defined at ../../core/Namespaces.sdf3 line 1">core/Namespaces</a> 
  <a href="../../core/Scopes.sdf3#core/Scopes_7_18" id="core/Scopes_91_102" title="Defined at ../../core/Scopes.sdf3 line 1">core/Scopes</a> 
  <a href="../../core/Properties.sdf3#core/Properties_7_22" id="core/Properties_106_121" title="Defined at ../../core/Properties.sdf3 line 1">core/Properties</a>

<span class="keyword">context-free syntax</span>

  <a href="../Formulas.sdf3#Proposition_111_122" id="Proposition_146_157" title="Referenced at ../Formulas.sdf3 line 10">Proposition</a>.<span class="cons_Constructor"><span id="True_158_162" title="Not referenced locally, nor via imports">True</span></span> = &lt;<span class="cons_String">true</span>&gt; 
  <a href="../Formulas.sdf3#Proposition_111_122" id="Proposition_175_186" title="Referenced at ../Formulas.sdf3 line 10">Proposition</a>.<span class="cons_Constructor"><span id="False_187_192" title="Not referenced locally, nor via imports">False</span></span> = &lt;<span class="cons_String">false</span>&gt; 
  <a href="../Formulas.sdf3#Proposition_111_122" id="Proposition_206_217" title="Referenced at ../Formulas.sdf3 line 10">Proposition</a>.<span class="cons_Constructor"><span id="Eq_218_220" title="Not referenced locally, nor via imports">Eq</span></span> = [[<a href="../../terms/Vars.sdf3#VarRef_84_90" id="VarRef_225_231" title="Defined at ../../terms/Vars.sdf3 line 10, 18, 19">VarRef</a>] <span class="cons_String">==</span> [<a href="../../terms/Terms.sdf3#Term_523_527" id="Term_237_241" title="Defined at ../../terms/Terms.sdf3 line 29, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42">Term</a>]] 
  
  <a href="../Formulas.sdf3#Proposition_111_122" id="Proposition_250_261" title="Referenced at ../Formulas.sdf3 line 10">Proposition</a>.<span class="cons_Constructor"><span id="Match_262_267" title="Not referenced locally, nor via imports">Match</span></span> = [[<a href="../../terms/Vars.sdf3#VarRef_84_90" id="VarRef_272_278" title="Defined at ../../terms/Vars.sdf3 line 10, 18, 19">VarRef</a>] <span class="cons_String">=&gt;</span> [<a href="../../terms/Terms.sdf3#Pattern_95_102" id="Pattern_284_291" title="Defined at ../../terms/Terms.sdf3 line 11, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25">Pattern</a>]] 
  <a href="../Formulas.sdf3#Proposition_111_122" id="Proposition_297_308" title="Referenced at ../Formulas.sdf3 line 10">Proposition</a>.<span class="cons_Constructor"><span id="DefOf_309_314" title="Not referenced locally, nor via imports">DefOf</span></span> = [<span class="cons_String">definition</span> <span class="cons_String">of</span> [<a href="../../terms/Vars.sdf3#VarRef_84_90" id="VarRef_333_339" title="Defined at ../../terms/Vars.sdf3 line 10, 18, 19">VarRef</a>] <span class="cons_String">=&gt;</span> [<a href="../../terms/Vars.sdf3#Var_80_83" id="Var_345_348" title="Defined at ../../terms/Vars.sdf3 line 10, 15, 16, 17">Var</a>]] 
  <a href="../Formulas.sdf3#Proposition_111_122" id="Proposition_354_365" title="Referenced at ../Formulas.sdf3 line 10">Proposition</a>.<span class="cons_Constructor"><span id="DefOf_366_371" title="Not referenced locally, nor via imports">DefOf</span></span> = [<span class="cons_String">definition</span> <span class="cons_String">of</span> [<a href="../../core/Namespaces.sdf3#NamespaceRef_340_352" id="NamespaceRef_390_402" title="Defined at ../../core/Namespaces.sdf3 line 24">NamespaceRef</a>] [<a href="../../terms/Vars.sdf3#VarRef_84_90" id="VarRef_405_411" title="Defined at ../../terms/Vars.sdf3 line 10, 18, 19">VarRef</a>] <span class="cons_String">=&gt;</span> [<a href="../../terms/Vars.sdf3#Var_80_83" id="Var_417_420" title="Defined at ../../terms/Vars.sdf3 line 10, 15, 16, 17">Var</a>]] 
  <a href="../Formulas.sdf3#Proposition_111_122" id="Proposition_426_437" title="Referenced at ../Formulas.sdf3 line 10">Proposition</a>.<span class="cons_Constructor"><span id="ScopeOf_438_445" title="Not referenced locally, nor via imports">ScopeOf</span></span> = [[<a href="../../core/Scopes.sdf3#Scope_386_391" id="Scope_450_455" title="Defined at ../../core/Scopes.sdf3 line 20, 21, 22">Scope</a>] <span class="cons_String">=&gt;</span> [<a href="../../terms/Vars.sdf3#Var_80_83" id="Var_461_464" title="Defined at ../../terms/Vars.sdf3 line 10, 15, 16, 17">Var</a>]] 
  <a href="../Formulas.sdf3#Proposition_111_122" id="Proposition_470_481" title="Referenced at ../Formulas.sdf3 line 10">Proposition</a>.<span class="cons_Constructor"><span id="ResolvesTo_482_492" title="Not referenced locally, nor via imports">ResolvesTo</span></span> = &lt;&lt;<a href="../../terms/Terms.sdf3#Term_523_527" id="Term_497_501" title="Defined at ../../terms/Terms.sdf3 line 29, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42">Term</a>&gt; <span class="cons_String">resolves</span> <span class="cons_String">to</span> &lt;<a href="../../core/Namespaces.sdf3#NamespaceRef_340_352" id="NamespaceRef_516_528" title="Defined at ../../core/Namespaces.sdf3 line 24">NamespaceRef</a>&gt; &lt;<a href="../../terms/Vars.sdf3#Var_80_83" id="Var_531_534" title="Defined at ../../terms/Vars.sdf3 line 10, 15, 16, 17">Var</a>&gt;&gt; 
  
  <a href="../Formulas.sdf3#Proposition_111_122" id="Proposition_543_554" title="Referenced at ../Formulas.sdf3 line 10">Proposition</a>.<span class="cons_Constructor"><span id="HasProperty_555_566" title="Not referenced locally, nor via imports">HasProperty</span></span> = &lt;&lt;<a href="../../terms/Vars.sdf3#VarRef_84_90" id="VarRef_571_577" title="Defined at ../../terms/Vars.sdf3 line 10, 18, 19">VarRef</a>&gt; <span class="cons_String">has</span> &lt;<a href="../../core/Properties.sdf3#PropertyRef_500_511" id="PropertyRef_584_595" title="Defined at ../../core/Properties.sdf3 line 32, 33">PropertyRef</a>&gt; &lt;<a href="../../terms/Vars.sdf3#Var_80_83" id="Var_598_601" title="Defined at ../../terms/Vars.sdf3 line 10, 15, 16, 17">Var</a>&gt;&gt; 
  <a href="../Formulas.sdf3#Proposition_111_122" id="Proposition_607_618" title="Referenced at ../Formulas.sdf3 line 10">Proposition</a>.<span class="cons_Constructor"><span id="InRelation_619_629" title="Not referenced locally, nor via imports">InRelation</span></span> = [[<a href="../../terms/Terms.sdf3#Term_523_527" id="Term_634_638" title="Defined at ../../terms/Terms.sdf3 line 29, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42">Term</a>] [<a href="../../core/Properties.sdf3#Relation_287_295" id="Relation_641_649" title="Defined at ../../core/Properties.sdf3 line 20">Relation</a>] [<a href="../../terms/Terms.sdf3#Term_523_527" id="Term_652_656" title="Defined at ../../terms/Terms.sdf3 line 29, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42">Term</a>]] 

</code></pre></td></tr></tbody></table></div>