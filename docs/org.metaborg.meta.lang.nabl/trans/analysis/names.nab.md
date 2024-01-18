---
title: names.nab
hide:
  - toc
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
<td class="code"><pre><code><span class="keyword">module</span> <span id="analysis/names_1_8" title="Not referenced">analysis/names</span>

<span class="keyword">imports</span> 

  syntax/-
  syntax/core/-
  syntax/terms/-

<span class="keyword">namespaces</span>
 
  <span class="cons_NamespaceDef"><a href="#Module_23_38" id="Module_11_3" title="Referenced at line 23">Module</a></span>
  <span class="cons_NamespaceDef"><a href="#Namespace_31_15" id="Namespace_12_3" title="Referenced at line 31">Namespace</a></span>
  <span class="cons_NamespaceDef"><a href="#Property_39_15" id="Property_13_3" title="Referenced at line 39">Property</a></span>
  <span class="cons_NamespaceDef"><a href="#Variable_65_15" id="Variable_14_3" title="Referenced at line 65">Variable</a></span>

<span class="keyword">binding rules</span>

  Module(<a href="#m_19_20" id="m_18_10" title="Referenced at line 19">m</a>, _): 
    <span class="keyword">defines</span> <span class="cons_NamespaceRef"><a href="#Module_11_3" id="Module_19_13" title="Defined at line 11">Module</a></span> <a href="#m_18_10" id="m_19_20" title="Defined at line 18">m</a>
    <span class="keyword">scopes</span> <span class="cons_NamespaceRef"><a href="#Namespace_12_3" id="Namespace_20_12" title="Defined at line 12">Namespace</a></span>, <span class="cons_NamespaceRef"><a href="#Property_13_3" id="Property_20_23" title="Defined at line 13">Property</a></span>
    
  Import(<a href="#m_23_45" id="m_22_10" title="Referenced at line 23">m</a>): 
    <span class="keyword">imports</span> <span class="cons_NamespaceRef"><a href="#Namespace_12_3" id="Namespace_23_13" title="Defined at line 12">Namespace</a></span>, <span class="cons_NamespaceRef"><a href="#Property_13_3" id="Property_23_24" title="Defined at line 13">Property</a></span> <span class="keyword">from</span> <span class="cons_NamespaceRef"><a href="#Module_11_3" id="Module_23_38" title="Defined at line 11">Module</a></span> <a href="#m_22_10" id="m_23_45" title="Defined at line 22">m</a>
  
<span class="keyword">binding rules</span>

  NamespaceDef(<a href="#n_28_34" id="n_27_16" title="Referenced at line 28">n</a>): 
    <span class="keyword">defines non-unique</span> <span class="cons_NamespaceRef"><a href="#Namespace_12_3" id="Namespace_28_24" title="Defined at line 12">Namespace</a></span> <a href="#n_27_16" id="n_28_34" title="Defined at line 27">n</a>
  
  NamespaceRef(CurrentLanguage(), <a href="#n_31_25" id="n_30_35" title="Referenced at line 31">n</a>): 
    <span class="keyword">refers to</span> <span class="cons_NamespaceRef"><a href="#Namespace_12_3" id="Namespace_31_15" title="Defined at line 12">Namespace</a></span> <a href="#n_30_35" id="n_31_25" title="Defined at line 30">n</a>
     
<span class="keyword">binding rules</span>

  PropertyDef(<a href="#p_36_33" id="p_35_15" title="Referenced at line 36">p</a>, <a href="#ns_36_44" id="ns_35_18" title="Referenced at line 36">ns</a>, <a href="#t_36_48" id="t_35_22" title="Referenced at line 36">t</a>): 
    <span class="keyword">defines non-unique</span> <span class="cons_NamespaceRef"><a href="#Property_13_3" id="Property_36_24" title="Defined at line 13">Property</a></span> <a href="#p_35_15" id="p_36_33" title="Defined at line 35">p</a> <span class="keyword">of</span> <span class="cons_TypeProp">type</span> (<a href="#ns_35_18" id="ns_36_44" title="Defined at line 35">ns</a>, <a href="#t_35_22" id="t_36_48" title="Defined at line 35">t</a>)
  
  PropertyRef(<a href="#p_39_24" id="p_38_15" title="Referenced at line 39">p</a>): 
    <span class="keyword">refers to</span> <span class="cons_NamespaceRef"><a href="#Property_13_3" id="Property_39_15" title="Defined at line 13">Property</a></span> <a href="#p_38_15" id="p_39_24" title="Defined at line 38">p</a>

<span class="keyword">binding rules</span>

  BindingRule(_, _, _):
    <span class="keyword">scopes</span> <span class="cons_NamespaceRef"><a href="#Variable_14_3" id="Variable_44_12" title="Defined at line 14">Variable</a></span>
    
  RefClausePart(_, _, _, _, _, _):
    <span class="keyword">scopes</span> <span class="cons_NamespaceRef"><a href="#Variable_14_3" id="Variable_47_12" title="Defined at line 14">Variable</a></span>
  
  WildcardImport(_, _, _, _, _):
    <span class="keyword">scopes</span> <span class="cons_NamespaceRef"><a href="#Variable_14_3" id="Variable_50_12" title="Defined at line 14">Variable</a></span>
  
  SingleImport(_, _, _, _, _, _, _, _):
    <span class="keyword">scopes</span> <span class="cons_NamespaceRef"><a href="#Variable_14_3" id="Variable_53_12" title="Defined at line 14">Variable</a></span>
    
  Var(<a href="#x_56_22" id="x_55_7" title="Referenced at line 56">x</a>):
    <span class="keyword">defines</span> <span class="cons_NamespaceRef"><a href="#Variable_14_3" id="Variable_56_13" title="Defined at line 14">Variable</a></span> <a href="#x_55_7" id="x_56_22" title="Defined at line 55">x</a>
    
  ListVar(<a href="#x_59_22" id="x_58_11" title="Referenced at line 59">x</a>):
    <span class="keyword">defines</span> <span class="cons_NamespaceRef"><a href="#Variable_14_3" id="Variable_59_13" title="Defined at line 14">Variable</a></span> <a href="#x_58_11" id="x_59_22" title="Defined at line 58">x</a>
    
  VarRef(<a href="#x_62_24" id="x_61_10" title="Referenced at line 62">x</a>):
    <span class="keyword">refers to</span> <span class="cons_NamespaceRef"><a href="#Variable_14_3" id="Variable_62_15" title="Defined at line 14">Variable</a></span> <a href="#x_61_10" id="x_62_24" title="Defined at line 61">x</a>
    
  ListVarRef(<a href="#x_65_24" id="x_64_14" title="Referenced at line 65">x</a>):
    <span class="keyword">refers to</span> <span class="cons_NamespaceRef"><a href="#Variable_14_3" id="Variable_65_15" title="Defined at line 14">Variable</a></span> <a href="#x_64_14" id="x_65_24" title="Defined at line 64">x</a>
  
</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
