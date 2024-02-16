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
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="terms/Vars_1_8" title="a definition with multiple references" data-urls="../Terms.sdf3/#terms/Vars line 7_3; ../../NameBindingLanguage.sdf3/#terms/Vars line 14_3; ../../core/Properties.sdf3/#terms/Vars line 7_2; ../../core/Scopes.sdf3/#terms/Vars line 7_2; ../../formulas/Propositions.sdf3/#terms/Vars line 6_3">terms/Vars</button>

<span class="keyword">imports</span> 

  <a href="../../common/Identifiers.sdf3/#common/Identifiers_1_8" id="common/Identifiers_5_3" title="a reference to a single-file definition">common/Identifiers</a>  
  <a href="../Terms.sdf3/#terms/Terms_1_8" id="terms/Terms_6_3" title="a reference to a single-file definition">terms/Terms</a>

<span class="keyword">sorts</span>

  <button class="modal-open" id="Wld_10_3" title="a definition with multiple references" data-urls="#Wld line 15_9, 23_3">Wld</button> <button class="modal-open" id="Var_10_7" title="a definition with multiple references" data-urls="../Terms.sdf3/#Var line 15_15, 25_18; ../../formulas/Propositions.sdf3/#Var line 18_51, 19_66, 20_38, 21_64, 23_58">Var</button> <button class="modal-open" id="VarRef_10_11" title="a definition with multiple references" data-urls="../Terms.sdf3/#VarRef line 33_12; ../../NameBindingLanguage.sdf3/#VarRef line 153_35; ../../core/Scopes.sdf3/#VarRef line 15_44, 17_53, 35_39; ../../formulas/Propositions.sdf3/#VarRef line 15_22, 17_25, 18_39, 19_54, 23_31">VarRef</button>

<span class="keyword">context-free syntax</span>

  <button class="modal-open" id="Wld_14_3" title="a definition with multiple references" data-urls="#Wld line 15_9, 23_3">Wld</button>.<span class="cons_Constructor"><span id="Wld_14_7" title="a definition with no references">Wld</span></span> = &lt;<span class="cons_String">_</span>&gt; 
  <button class="modal-open" id="Var_15_3" title="a definition with multiple references" data-urls="../Terms.sdf3/#Var line 15_15, 25_18; ../../formulas/Propositions.sdf3/#Var line 18_51, 19_66, 20_38, 21_64, 23_58">Var</button> = <a href="#Wld_10_3" id="Wld_15_9" title="a reference to a single-file definition">Wld</a> 
  <button class="modal-open" id="Var_16_3" title="a definition with multiple references" data-urls="../Terms.sdf3/#Var line 15_15, 25_18; ../../formulas/Propositions.sdf3/#Var line 18_51, 19_66, 20_38, 21_64, 23_58">Var</button>.<span class="cons_Constructor"><span id="Var_16_7" title="a definition with no references">Var</span></span> = <a href="../../common/Identifiers.sdf3/#Id_5_3" id="Id_16_13" title="a reference to a single-file definition">Id</a> 
  <button class="modal-open" id="Var_17_3" title="a definition with multiple references" data-urls="../Terms.sdf3/#Var line 15_15, 25_18; ../../formulas/Propositions.sdf3/#Var line 18_51, 19_66, 20_38, 21_64, 23_58">Var</button>.<span class="cons_Constructor"><span id="ListVar_17_7" title="a definition with no references">ListVar</span></span> = <a href="../../common/Identifiers.sdf3/#LId_5_6" id="LId_17_17" title="a reference to a single-file definition">LId</a> 
  <button class="modal-open" id="VarRef_18_3" title="a definition with multiple references" data-urls="../Terms.sdf3/#VarRef line 33_12; ../../NameBindingLanguage.sdf3/#VarRef line 153_35; ../../core/Scopes.sdf3/#VarRef line 15_44, 17_53, 35_39; ../../formulas/Propositions.sdf3/#VarRef line 15_22, 17_25, 18_39, 19_54, 23_31">VarRef</button>.<span class="cons_Constructor"><span id="VarRef_18_10" title="a definition with no references">VarRef</span></span> = <a href="../../common/Identifiers.sdf3/#Id_5_3" id="Id_18_19" title="a reference to a single-file definition">Id</a> 
  <button class="modal-open" id="VarRef_19_3" title="a definition with multiple references" data-urls="../Terms.sdf3/#VarRef line 33_12; ../../NameBindingLanguage.sdf3/#VarRef line 153_35; ../../core/Scopes.sdf3/#VarRef line 15_44, 17_53, 35_39; ../../formulas/Propositions.sdf3/#VarRef line 15_22, 17_25, 18_39, 19_54, 23_31">VarRef</button>.<span class="cons_Constructor"><span id="ListVarRef_19_10" title="a definition with no references">ListVarRef</span></span> = <a href="../../common/Identifiers.sdf3/#LId_5_6" id="LId_19_23" title="a reference to a single-file definition">LId</a> 

<span class="keyword">context-free restrictions</span>

  <a href="#Wld_10_3" id="Wld_23_3" title="a reference to a single-file definition">Wld</a> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\-\_]

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
