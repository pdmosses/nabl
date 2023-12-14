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
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="terms/Vars_1_8" title="Multi-file references" data-urls="../Terms.sdf3/#terms/Vars_7_3 line 7; ../../NameBindingLanguage.sdf3/#terms/Vars_14_3 line 14; ../../core/Properties.sdf3/#terms/Vars_7_2 line 7; ../../core/Scopes.sdf3/#terms/Vars_7_2 line 7; ../../formulas/Propositions.sdf3/#terms/Vars_6_3 line 6">terms/Vars</button>

<span class="keyword">imports</span> 

  <a href="../../common/Identifiers.sdf3/#common/Identifiers_1_8" id="common/Identifiers_5_3" title="Defined at ../../common/Identifiers.sdf3 line 1">common/Identifiers</a>  
  <a href="../Terms.sdf3/#terms/Terms_1_8" id="terms/Terms_6_3" title="Defined at ../Terms.sdf3 line 1">terms/Terms</a>

<span class="keyword">sorts</span>

  <a href="#Wld_15_9" id="Wld_10_3" title="Referenced at line 15, 23">Wld</a> <button class="modal-open" id="Var_10_7" title="Multi-file references" data-urls="../Terms.sdf3/#Var_15_15 line 15, 25; ../../formulas/Propositions.sdf3/#Var_18_51 line 18, 19, 20, 21, 23">Var</button> <button class="modal-open" id="VarRef_10_11" title="Multi-file references" data-urls="../Terms.sdf3/#VarRef_33_12 line 33; ../../NameBindingLanguage.sdf3/#VarRef_153_35 line 153; ../../core/Scopes.sdf3/#VarRef_15_44 line 15, 17, 35; ../../formulas/Propositions.sdf3/#VarRef_15_22 line 15, 17, 18, 19, 23">VarRef</button>

<span class="keyword">context-free syntax</span>

  <a href="#Wld_15_9" id="Wld_14_3" title="Referenced at line 15, 23">Wld</a>.<span class="cons_Constructor"><span id="Wld_14_7" title="Not referenced">Wld</span></span> = &lt;<span class="cons_String">_</span>&gt; 
  <button class="modal-open" id="Var_15_3" title="Multi-file references" data-urls="../Terms.sdf3/#Var_15_15 line 15, 25; ../../formulas/Propositions.sdf3/#Var_18_51 line 18, 19, 20, 21, 23">Var</button> = <a href="#Wld_10_3" id="Wld_15_9" title="Defined at line 10, 14">Wld</a> 
  <button class="modal-open" id="Var_16_3" title="Multi-file references" data-urls="../Terms.sdf3/#Var_15_15 line 15, 25; ../../formulas/Propositions.sdf3/#Var_18_51 line 18, 19, 20, 21, 23">Var</button>.<span class="cons_Constructor"><span id="Var_16_7" title="Not referenced">Var</span></span> = <a href="../../common/Identifiers.sdf3/#Id_5_3" id="Id_16_13" title="Defined at ../../common/Identifiers.sdf3 line 5, 9, 11, 25, 26, 27">Id</a> 
  <button class="modal-open" id="Var_17_3" title="Multi-file references" data-urls="../Terms.sdf3/#Var_15_15 line 15, 25; ../../formulas/Propositions.sdf3/#Var_18_51 line 18, 19, 20, 21, 23">Var</button>.<span class="cons_Constructor"><span id="ListVar_17_7" title="Not referenced">ListVar</span></span> = <a href="../../common/Identifiers.sdf3/#LId_5_6" id="LId_17_17" title="Defined at ../../common/Identifiers.sdf3 line 5, 10, 28">LId</a> 
  <button class="modal-open" id="VarRef_18_3" title="Multi-file references" data-urls="../Terms.sdf3/#VarRef_33_12 line 33; ../../NameBindingLanguage.sdf3/#VarRef_153_35 line 153; ../../core/Scopes.sdf3/#VarRef_15_44 line 15, 17, 35; ../../formulas/Propositions.sdf3/#VarRef_15_22 line 15, 17, 18, 19, 23">VarRef</button>.<span class="cons_Constructor"><span id="VarRef_18_10" title="Not referenced">VarRef</span></span> = <a href="../../common/Identifiers.sdf3/#Id_5_3" id="Id_18_19" title="Defined at ../../common/Identifiers.sdf3 line 5, 9, 11, 25, 26, 27">Id</a> 
  <button class="modal-open" id="VarRef_19_3" title="Multi-file references" data-urls="../Terms.sdf3/#VarRef_33_12 line 33; ../../NameBindingLanguage.sdf3/#VarRef_153_35 line 153; ../../core/Scopes.sdf3/#VarRef_15_44 line 15, 17, 35; ../../formulas/Propositions.sdf3/#VarRef_15_22 line 15, 17, 18, 19, 23">VarRef</button>.<span class="cons_Constructor"><span id="ListVarRef_19_10" title="Not referenced">ListVarRef</span></span> = <a href="../../common/Identifiers.sdf3/#LId_5_6" id="LId_19_23" title="Defined at ../../common/Identifiers.sdf3 line 5, 10, 28">LId</a> 

<span class="keyword">context-free restrictions</span>

  <a href="#Wld_10_3" id="Wld_23_3" title="Defined at line 10, 14">Wld</a> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\-\_]

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
