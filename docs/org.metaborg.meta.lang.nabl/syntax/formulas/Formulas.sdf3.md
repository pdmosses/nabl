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
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="formulas/Formulas_1_8" title="a definition with multiple references" data-urls="../../NameBindingLanguage.sdf3/#formulas/Formulas line 9_3; ../../core/Properties.sdf3/#formulas/Formulas line 9_2">formulas/Formulas</button>

<span class="keyword">imports</span> 

  <a href="../../terms/Terms.sdf3/#terms/Terms_1_8" id="terms/Terms_5_3" title="a reference to a single-file definition">terms/Terms</a> 
  <a href="../Propositions.sdf3/#formulas/Propositions_1_8" id="formulas/Propositions_6_3" title="a reference to a single-file definition">formulas/Propositions</a>

<span class="keyword">context-free syntax</span>

  <button class="modal-open" id="Formula_10_3" title="a definition with multiple references" data-urls="#Formula line 13_10, 16_6, 17_10, 20_6, 21_9, 24_16, 28_3, 28_17, 28_31; ../../NameBindingLanguage.sdf3/#Formula line 146_12, 150_11">Formula</button> = &lt;&lt;<a href="../Propositions.sdf3/#Proposition_13_3" id="Proposition_10_15" title="a reference to a single-file definition">Proposition</a>&gt;&gt; 
  
  <button class="modal-open" id="Formula_12_3" title="a definition with multiple references" data-urls="#Formula line 13_10, 16_6, 17_10, 20_6, 21_9, 24_16, 28_3, 28_17, 28_31; ../../NameBindingLanguage.sdf3/#Formula line 146_12, 150_11">Formula</button>.<span class="cons_Constructor"><a href="#Not_28_11" id="Not_12_11" title="a definition with a single reference">Not</a></span> = &lt;
    <span class="cons_String">not</span> &lt;<a href="#Formula_10_3" id="Formula_13_10" title="a reference to a single-file definition">Formula</a>&gt;
  &gt; 
  <button class="modal-open" id="Formula_15_3" title="a definition with multiple references" data-urls="#Formula line 13_10, 16_6, 17_10, 20_6, 21_9, 24_16, 28_3, 28_17, 28_31; ../../NameBindingLanguage.sdf3/#Formula line 146_12, 150_11">Formula</button>.<span class="cons_Constructor"><a href="#And_28_25" id="And_15_11" title="a definition with a single reference">And</a></span> = &lt;
    &lt;<a href="#Formula_10_3" id="Formula_16_6" title="a reference to a single-file definition">Formula</a>&gt; 
    <span class="cons_String">and</span> &lt;<a href="#Formula_10_3" id="Formula_17_10" title="a reference to a single-file definition">Formula</a>&gt;
  &gt; {<span class="keyword">left</span>}
  <button class="modal-open" id="Formula_19_3" title="a definition with multiple references" data-urls="#Formula line 13_10, 16_6, 17_10, 20_6, 21_9, 24_16, 28_3, 28_17, 28_31; ../../NameBindingLanguage.sdf3/#Formula line 146_12, 150_11">Formula</button>.<span class="cons_Constructor"><a href="#Or_28_39" id="Or_19_11" title="a definition with a single reference">Or</a></span> = &lt;
    &lt;<a href="#Formula_10_3" id="Formula_20_6" title="a reference to a single-file definition">Formula</a>&gt; 
    <span class="cons_String">or</span> &lt;<a href="#Formula_10_3" id="Formula_21_9" title="a reference to a single-file definition">Formula</a>&gt;
  &gt; {<span class="keyword">left</span>}
  
  <button class="modal-open" id="Formula_24_3" title="a definition with multiple references" data-urls="#Formula line 13_10, 16_6, 17_10, 20_6, 21_9, 24_16, 28_3, 28_17, 28_31; ../../NameBindingLanguage.sdf3/#Formula line 146_12, 150_11">Formula</button> = &lt;<span class="cons_String">(</span>&lt;<a href="#Formula_10_3" id="Formula_24_16" title="a reference to a single-file definition">Formula</a>&gt;<span class="cons_String">)</span>&gt; {<span class="keyword">bracket</span>}

<span class="keyword">context-free priorities</span>

  <a href="#Formula_10_3" id="Formula_28_3" title="a reference to a single-file definition">Formula</a>.<span class="cons_Constructor"><a href="#Not_12_11" id="Not_28_11" title="a reference to a single-file definition">Not</a></span> &gt; <a href="#Formula_10_3" id="Formula_28_17" title="a reference to a single-file definition">Formula</a>.<span class="cons_Constructor"><a href="#And_15_11" id="And_28_25" title="a reference to a single-file definition">And</a></span> &gt; <a href="#Formula_10_3" id="Formula_28_31" title="a reference to a single-file definition">Formula</a>.<span class="cons_Constructor"><a href="#Or_19_11" id="Or_28_39" title="a reference to a single-file definition">Or</a></span>

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
