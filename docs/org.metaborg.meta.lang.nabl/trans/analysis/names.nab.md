---
title: names.nab
---

# `names.nab`

:simple-github: [pdmosses/nabl/org.metaborg.meta.lang.nabl/trans/analysis/names.nab]

[pdmosses/nabl/org.metaborg.meta.lang.nabl/trans/analysis/names.nab]: https://github.com/pdmosses/nabl/blob/master/org.metaborg.meta.lang.nabl/trans/analysis/names.nab "The source file on GitHub"

<div class="nab"><table class="highlighttable"><tbody><tr><td class="linenos"><div class="linenodiv"><pre><span></span>1
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
34
35
36
37
38
39
40
41
42
43
44
45
46
47
48
49
50
51
52
53
54
55
56
57
58
59
60
61
62
63
64
65
66
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <span id="analysis/names_7_21" title="Not referenced locally, nor via imports">analysis/names</span>

<span class="keyword">imports</span> 

  syntax/-
  syntax/core/-
  syntax/terms/-

<span class="keyword">namespaces</span>
 
  <span class="cons_NamespaceDef"><a href="#Module_275_281" id="Module_93_99" title="Referenced at line 23">Module</a></span>
  <span class="cons_NamespaceDef"><a href="#Namespace_413_422" id="Namespace_102_111" title="Referenced at line 31">Namespace</a></span>
  <span class="cons_NamespaceDef"><a href="#Property_558_566" id="Property_114_122" title="Referenced at line 39">Property</a></span>
  <span class="cons_NamespaceDef"><a href="#Variable_967_975" id="Variable_125_133" title="Referenced at line 65">Variable</a></span>

<span class="keyword">binding rules</span>

  Module(<a href="#m_186_187" id="m_159_160" title="Referenced at line 19">m</a>, _): 
    <span class="keyword">defines</span> <span class="cons_NamespaceRef"><a href="#Module_93_99" id="Module_179_185" title="Defined at line 11">Module</a></span> <a href="#m_159_160" id="m_186_187" title="Defined at line 18">m</a>
    <span class="keyword">scopes</span> <span class="cons_NamespaceRef"><a href="#Namespace_102_111" id="Namespace_199_208" title="Defined at line 12">Namespace</a></span>, <span class="cons_NamespaceRef"><a href="#Property_114_122" id="Property_210_218" title="Defined at line 13">Property</a></span>
    
  Import(<a href="#m_282_283" id="m_233_234" title="Referenced at line 23">m</a>): 
    <span class="keyword">imports</span> <span class="cons_NamespaceRef"><a href="#Namespace_102_111" id="Namespace_250_259" title="Defined at line 12">Namespace</a></span>, <span class="cons_NamespaceRef"><a href="#Property_114_122" id="Property_261_269" title="Defined at line 13">Property</a></span> <span class="keyword">from</span> <span class="cons_NamespaceRef"><a href="#Module_93_99" id="Module_275_281" title="Defined at line 11">Module</a></span> <a href="#m_233_234" id="m_282_283" title="Defined at line 22">m</a>
  
<span class="keyword">binding rules</span>

  NamespaceDef(<a href="#n_355_356" id="n_317_318" title="Referenced at line 28">n</a>): 
    <span class="keyword">defines non-unique</span> <span class="cons_NamespaceRef"><a href="#Namespace_102_111" id="Namespace_345_354" title="Defined at line 12">Namespace</a></span> <a href="#n_317_318" id="n_355_356" title="Defined at line 27">n</a>
  
  NamespaceRef(CurrentLanguage(), <a href="#n_423_424" id="n_394_395" title="Referenced at line 31">n</a>): 
    <span class="keyword">refers to</span> <span class="cons_NamespaceRef"><a href="#Namespace_102_111" id="Namespace_413_422" title="Defined at line 12">Namespace</a></span> <a href="#n_394_395" id="n_423_424" title="Defined at line 30">n</a>
     
<span class="keyword">binding rules</span>

  PropertyDef(<a href="#p_504_505" id="p_460_461" title="Referenced at line 36">p</a>, <a href="#ns_515_517" id="ns_463_465" title="Referenced at line 36">ns</a>, <a href="#t_519_520" id="t_467_468" title="Referenced at line 36">t</a>): 
    <span class="keyword">defines non-unique</span> <span class="cons_NamespaceRef"><a href="#Property_114_122" id="Property_495_503" title="Defined at line 13">Property</a></span> <a href="#p_460_461" id="p_504_505" title="Defined at line 35">p</a> <span class="keyword">of</span> <span class="cons_TypeProp">type</span> (<a href="#ns_463_465" id="ns_515_517" title="Defined at line 35">ns</a>, <a href="#t_467_468" id="t_519_520" title="Defined at line 35">t</a>)
  
  PropertyRef(<a href="#p_567_568" id="p_539_540" title="Referenced at line 39">p</a>): 
    <span class="keyword">refers to</span> <span class="cons_NamespaceRef"><a href="#Property_114_122" id="Property_558_566" title="Defined at line 13">Property</a></span> <a href="#p_539_540" id="p_567_568" title="Defined at line 38">p</a>

<span class="keyword">binding rules</span>

  BindingRule(_, _, _):
    <span class="keyword">scopes</span> <span class="cons_NamespaceRef"><a href="#Variable_125_133" id="Variable_620_628" title="Defined at line 14">Variable</a></span>
    
  RefClausePart(_, _, _, _, _, _):
    <span class="keyword">scopes</span> <span class="cons_NamespaceRef"><a href="#Variable_125_133" id="Variable_680_688" title="Defined at line 14">Variable</a></span>
  
  WildcardImport(_, _, _, _, _):
    <span class="keyword">scopes</span> <span class="cons_NamespaceRef"><a href="#Variable_125_133" id="Variable_736_744" title="Defined at line 14">Variable</a></span>
  
  SingleImport(_, _, _, _, _, _, _, _):
    <span class="keyword">scopes</span> <span class="cons_NamespaceRef"><a href="#Variable_125_133" id="Variable_799_807" title="Defined at line 14">Variable</a></span>
    
  Var(<a href="#x_844_845" id="x_819_820" title="Referenced at line 56">x</a>):
    <span class="keyword">defines</span> <span class="cons_NamespaceRef"><a href="#Variable_125_133" id="Variable_835_843" title="Defined at line 14">Variable</a></span> <a href="#x_819_820" id="x_844_845" title="Defined at line 55">x</a>
    
  ListVar(<a href="#x_886_887" id="x_861_862" title="Referenced at line 59">x</a>):
    <span class="keyword">defines</span> <span class="cons_NamespaceRef"><a href="#Variable_125_133" id="Variable_877_885" title="Defined at line 14">Variable</a></span> <a href="#x_861_862" id="x_886_887" title="Defined at line 58">x</a>
    
  VarRef(<a href="#x_929_930" id="x_902_903" title="Referenced at line 62">x</a>):
    <span class="keyword">refers to</span> <span class="cons_NamespaceRef"><a href="#Variable_125_133" id="Variable_920_928" title="Defined at line 14">Variable</a></span> <a href="#x_902_903" id="x_929_930" title="Defined at line 61">x</a>
    
  ListVarRef(<a href="#x_976_977" id="x_949_950" title="Referenced at line 65">x</a>):
    <span class="keyword">refers to</span> <span class="cons_NamespaceRef"><a href="#Variable_125_133" id="Variable_967_975" title="Defined at line 14">Variable</a></span> <a href="#x_949_950" id="x_976_977" title="Defined at line 64">x</a>
  
</code></pre></td></tr></tbody></table></div>