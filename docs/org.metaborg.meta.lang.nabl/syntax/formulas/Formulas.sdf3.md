---
title: Formulas.sdf3
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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../../core/Properties.sdf3#formulas/Formulas_104_121" id="formulas/Formulas_7_24" title="Referenced at ../../core/Properties.sdf3 line 9">formulas/Formulas</a>

<span class="keyword">imports</span> 

  <a href="../../terms/Terms.sdf3#terms/Terms_7_18" id="terms/Terms_38_49" title="Defined at ../../terms/Terms.sdf3 line 1">terms/Terms</a> 
  <a href="../Propositions.sdf3#formulas/Propositions_7_28" id="formulas/Propositions_53_74" title="Defined at ../Propositions.sdf3 line 1">formulas/Propositions</a>

<span class="keyword">context-free syntax</span>

  <a href="#Formula_387_394" id="Formula_99_106" title="Referenced at line 28; ../../NameBindingLanguage.sdf3 line 150">Formula</a> = &lt;&lt;<a href="../Propositions.sdf3#Proposition_146_157" id="Proposition_111_122" title="Defined at ../Propositions.sdf3 line 13, 14, 15, 17, 18, 19, 20, 21, 23, 24">Proposition</a>&gt;&gt; 
  
  <a href="#Formula_387_394" id="Formula_131_138" title="Referenced at line 28; ../../NameBindingLanguage.sdf3 line 150">Formula</a>.<span class="cons_Constructor"><a href="#Not_367_370" id="Not_139_142" title="Referenced at line 28">Not</a></span> = &lt;
    <span class="cons_String">not</span> &lt;<a href="#Formula_99_106" id="Formula_156_163" title="Defined at line 10, 12, 15, 19, 24">Formula</a>&gt;
  &gt; 
  <a href="#Formula_387_394" id="Formula_172_179" title="Referenced at line 28; ../../NameBindingLanguage.sdf3 line 150">Formula</a>.<span class="cons_Constructor"><a href="#And_381_384" id="And_180_183" title="Referenced at line 28">And</a></span> = &lt;
    &lt;<a href="#Formula_99_106" id="Formula_193_200" title="Defined at line 10, 12, 15, 19, 24">Formula</a>&gt; 
    <span class="cons_String">and</span> &lt;<a href="#Formula_99_106" id="Formula_212_219" title="Defined at line 10, 12, 15, 19, 24">Formula</a>&gt;
  &gt; {<span class="keyword">left</span>}
  <a href="#Formula_387_394" id="Formula_234_241" title="Referenced at line 28; ../../NameBindingLanguage.sdf3 line 150">Formula</a>.<span class="cons_Constructor"><a href="#Or_395_397" id="Or_242_244" title="Referenced at line 28">Or</a></span> = &lt;
    &lt;<a href="#Formula_99_106" id="Formula_254_261" title="Defined at line 10, 12, 15, 19, 24">Formula</a>&gt; 
    <span class="cons_String">or</span> &lt;<a href="#Formula_99_106" id="Formula_272_279" title="Defined at line 10, 12, 15, 19, 24">Formula</a>&gt;
  &gt; {<span class="keyword">left</span>}
  
  <a href="#Formula_387_394" id="Formula_297_304" title="Referenced at line 28; ../../NameBindingLanguage.sdf3 line 150">Formula</a> = &lt;<span class="cons_String">(</span>&lt;<a href="#Formula_99_106" id="Formula_310_317" title="Defined at line 10, 12, 15, 19, 24">Formula</a>&gt;<span class="cons_String">)</span>&gt; {<span class="keyword">bracket</span>}

<span class="keyword">context-free priorities</span>

  <a href="#Formula_99_106" id="Formula_359_366" title="Defined at line 10, 12, 15, 19, 24">Formula</a>.<span class="cons_Constructor"><a href="#Not_139_142" id="Not_367_370" title="Defined at line 12">Not</a></span> &gt; <a href="#Formula_99_106" id="Formula_373_380" title="Defined at line 10, 12, 15, 19, 24">Formula</a>.<span class="cons_Constructor"><a href="#And_180_183" id="And_381_384" title="Defined at line 15">And</a></span> &gt; <a href="#Formula_99_106" id="Formula_387_394" title="Defined at line 10, 12, 15, 19, 24">Formula</a>.<span class="cons_Constructor"><a href="#Or_242_244" id="Or_395_397" title="Defined at line 19">Or</a></span>

</code></pre></td></tr></tbody></table></div>