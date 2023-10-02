---
title: Vars.sdf3
hide:
  - toc
---

# `Vars.sdf3`

:simple-github: [pdmosses/nabl/org.metaborg.meta.lang.nabl/syntax/terms/Vars.sdf3]

[pdmosses/nabl/org.metaborg.meta.lang.nabl/syntax/terms/Vars.sdf3]: https://github.com/pdmosses/nabl/blob/master/org.metaborg.meta.lang.nabl/syntax/terms/Vars.sdf3 "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../Terms.sdf3#terms/Vars_74_84" id="terms/Vars_7_17" title="Referenced at ../Terms.sdf3 line 7">terms/Vars</a>

<span class="keyword">imports</span> 

  <a href="../../common/Identifiers.sdf3#common/Identifiers_7_25" id="common/Identifiers_31_49" title="Defined at ../../common/Identifiers.sdf3 line 1">common/Identifiers</a>  
  <a href="../Terms.sdf3#terms/Terms_7_18" id="terms/Terms_54_65" title="Defined at ../Terms.sdf3 line 1">terms/Terms</a>

<span class="keyword">sorts</span>

  <a href="#Wld_259_262" id="Wld_76_79" title="Referenced at line 23">Wld</a> <a href="../Terms.sdf3#Var_496_499" id="Var_80_83" title="Referenced at ../Terms.sdf3 line 25; ../../formulas/Propositions.sdf3 line 23">Var</a> <a href="../Terms.sdf3#VarRef_561_567" id="VarRef_84_90" title="Referenced at ../Terms.sdf3 line 33; ../../NameBindingLanguage.sdf3 line 153; ../../core/Scopes.sdf3 line 35; ../../formulas/Propositions.sdf3 line 23">VarRef</a>

<span class="keyword">context-free syntax</span>

  <a href="#Wld_259_262" id="Wld_115_118" title="Referenced at line 23">Wld</a>.<span class="cons_Constructor"><span id="Wld_119_122" title="Not referenced locally, nor via imports">Wld</span></span> = &lt;<span class="cons_String">_</span>&gt; 
  <a href="../Terms.sdf3#Var_496_499" id="Var_132_135" title="Referenced at ../Terms.sdf3 line 25; ../../formulas/Propositions.sdf3 line 23">Var</a> = <a href="#Wld_76_79" id="Wld_138_141" title="Defined at line 10, 14">Wld</a> 
  <a href="../Terms.sdf3#Var_496_499" id="Var_145_148" title="Referenced at ../Terms.sdf3 line 25; ../../formulas/Propositions.sdf3 line 23">Var</a>.<span class="cons_Constructor"><span id="Var_149_152" title="Not referenced locally, nor via imports">Var</span></span> = <a href="../../common/Identifiers.sdf3#Id_36_38" id="Id_155_157" title="Defined at ../../common/Identifiers.sdf3 line 5, 9, 11, 25, 26, 27">Id</a> 
  <a href="../Terms.sdf3#Var_496_499" id="Var_161_164" title="Referenced at ../Terms.sdf3 line 25; ../../formulas/Propositions.sdf3 line 23">Var</a>.<span class="cons_Constructor"><span id="ListVar_165_172" title="Not referenced locally, nor via imports">ListVar</span></span> = <a href="../../common/Identifiers.sdf3#LId_39_42" id="LId_175_178" title="Defined at ../../common/Identifiers.sdf3 line 5, 10, 28">LId</a> 
  <a href="../Terms.sdf3#VarRef_561_567" id="VarRef_182_188" title="Referenced at ../Terms.sdf3 line 33; ../../NameBindingLanguage.sdf3 line 153; ../../core/Scopes.sdf3 line 35; ../../formulas/Propositions.sdf3 line 23">VarRef</a>.<span class="cons_Constructor"><span id="VarRef_189_195" title="Not referenced locally, nor via imports">VarRef</span></span> = <a href="../../common/Identifiers.sdf3#Id_36_38" id="Id_198_200" title="Defined at ../../common/Identifiers.sdf3 line 5, 9, 11, 25, 26, 27">Id</a> 
  <a href="../Terms.sdf3#VarRef_561_567" id="VarRef_204_210" title="Referenced at ../Terms.sdf3 line 33; ../../NameBindingLanguage.sdf3 line 153; ../../core/Scopes.sdf3 line 35; ../../formulas/Propositions.sdf3 line 23">VarRef</a>.<span class="cons_Constructor"><span id="ListVarRef_211_221" title="Not referenced locally, nor via imports">ListVarRef</span></span> = <a href="../../common/Identifiers.sdf3#LId_39_42" id="LId_224_227" title="Defined at ../../common/Identifiers.sdf3 line 5, 10, 28">LId</a> 

<span class="keyword">context-free restrictions</span>

  <a href="#Wld_76_79" id="Wld_259_262" title="Defined at line 10, 14">Wld</a> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\-\_]

</code></pre></td></tr></tbody></table></div>