---
title: Formulas.sdf3
hide:
  - toc
---

# `Formulas.sdf3`

:simple-github: [pdmosses/nabl/org.metaborg.meta.lang.nabl/syntax/formulas/Formulas.sdf3]

[pdmosses/nabl/org.metaborg.meta.lang.nabl/syntax/formulas/Formulas.sdf3]: https://github.com/pdmosses/nabl/blob/master/org.metaborg.meta.lang.nabl/syntax/formulas/Formulas.sdf3 "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="formulas/Formulas_1_8" title="Multi-file references" data-urls="../../NameBindingLanguage.sdf3/#formulas/Formulas_9_3 line 9; ../../core/Properties.sdf3/#formulas/Formulas_9_2 line 9">formulas/Formulas</button>

<span class="keyword">imports</span> 

  <a href="../../terms/Terms.sdf3/#terms/Terms_1_8" id="terms/Terms_5_3" title="Defined at ../../terms/Terms.sdf3 line 1">terms/Terms</a> 
  <a href="../Propositions.sdf3/#formulas/Propositions_1_8" id="formulas/Propositions_6_3" title="Defined at ../Propositions.sdf3 line 1">formulas/Propositions</a>

<span class="keyword">context-free syntax</span>

  <button class="modal-open" id="Formula_10_3" title="Multi-file references" data-urls="#Formula_13_10 line 13, 16, 17, 20, 21, 24, 28; ../../NameBindingLanguage.sdf3/#Formula_146_12 line 146, 150">Formula</button> = &lt;&lt;<a href="../Propositions.sdf3/#Proposition_13_3" id="Proposition_10_15" title="Defined at ../Propositions.sdf3 line 13, 14, 15, 17, 18, 19, 20, 21, 23, 24">Proposition</a>&gt;&gt; 
  
  <button class="modal-open" id="Formula_12_3" title="Multi-file references" data-urls="#Formula_13_10 line 13, 16, 17, 20, 21, 24, 28; ../../NameBindingLanguage.sdf3/#Formula_146_12 line 146, 150">Formula</button>.<span class="cons_Constructor"><a href="#Not_28_11" id="Not_12_11" title="Referenced at line 28">Not</a></span> = &lt;
    <span class="cons_String">not</span> &lt;<a href="#Formula_10_3" id="Formula_13_10" title="Defined at line 10, 12, 15, 19, 24">Formula</a>&gt;
  &gt; 
  <button class="modal-open" id="Formula_15_3" title="Multi-file references" data-urls="#Formula_13_10 line 13, 16, 17, 20, 21, 24, 28; ../../NameBindingLanguage.sdf3/#Formula_146_12 line 146, 150">Formula</button>.<span class="cons_Constructor"><a href="#And_28_25" id="And_15_11" title="Referenced at line 28">And</a></span> = &lt;
    &lt;<a href="#Formula_10_3" id="Formula_16_6" title="Defined at line 10, 12, 15, 19, 24">Formula</a>&gt; 
    <span class="cons_String">and</span> &lt;<a href="#Formula_10_3" id="Formula_17_10" title="Defined at line 10, 12, 15, 19, 24">Formula</a>&gt;
  &gt; {<span class="keyword">left</span>}
  <button class="modal-open" id="Formula_19_3" title="Multi-file references" data-urls="#Formula_13_10 line 13, 16, 17, 20, 21, 24, 28; ../../NameBindingLanguage.sdf3/#Formula_146_12 line 146, 150">Formula</button>.<span class="cons_Constructor"><a href="#Or_28_39" id="Or_19_11" title="Referenced at line 28">Or</a></span> = &lt;
    &lt;<a href="#Formula_10_3" id="Formula_20_6" title="Defined at line 10, 12, 15, 19, 24">Formula</a>&gt; 
    <span class="cons_String">or</span> &lt;<a href="#Formula_10_3" id="Formula_21_9" title="Defined at line 10, 12, 15, 19, 24">Formula</a>&gt;
  &gt; {<span class="keyword">left</span>}
  
  <button class="modal-open" id="Formula_24_3" title="Multi-file references" data-urls="#Formula_13_10 line 13, 16, 17, 20, 21, 24, 28; ../../NameBindingLanguage.sdf3/#Formula_146_12 line 146, 150">Formula</button> = &lt;<span class="cons_String">(</span>&lt;<a href="#Formula_10_3" id="Formula_24_16" title="Defined at line 10, 12, 15, 19, 24">Formula</a>&gt;<span class="cons_String">)</span>&gt; {<span class="keyword">bracket</span>}

<span class="keyword">context-free priorities</span>

  <a href="#Formula_10_3" id="Formula_28_3" title="Defined at line 10, 12, 15, 19, 24">Formula</a>.<span class="cons_Constructor"><a href="#Not_12_11" id="Not_28_11" title="Defined at line 12">Not</a></span> &gt; <a href="#Formula_10_3" id="Formula_28_17" title="Defined at line 10, 12, 15, 19, 24">Formula</a>.<span class="cons_Constructor"><a href="#And_15_11" id="And_28_25" title="Defined at line 15">And</a></span> &gt; <a href="#Formula_10_3" id="Formula_28_31" title="Defined at line 10, 12, 15, 19, 24">Formula</a>.<span class="cons_Constructor"><a href="#Or_19_11" id="Or_28_39" title="Defined at line 19">Or</a></span>

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
