---
title: Scopes.sdf3
hide:
  - toc
---

# `Scopes.sdf3`

:simple-github: [pdmosses/nabl/org.metaborg.meta.lang.nabl/syntax/core/Scopes.sdf3]

[pdmosses/nabl/org.metaborg.meta.lang.nabl/syntax/core/Scopes.sdf3]: https://github.com/pdmosses/nabl/blob/master/org.metaborg.meta.lang.nabl/syntax/core/Scopes.sdf3 "The source file on GitHub"

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
29
30
31
32
33
34
35
36
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../../formulas/Propositions.sdf3/#core/Scopes_8_3" id="core/Scopes_1_8" title="Referenced at ../../formulas/Propositions.sdf3 line 8">core/Scopes</a>

<span class="keyword">imports</span> 

        <a href="../../common/Identifiers.sdf3/#common/Identifiers_1_8" id="common/Identifiers_5_2" title="Defined at ../../common/Identifiers.sdf3 line 1">common/Identifiers</a>  
        <a href="../Namespaces.sdf3/#core/Namespaces_1_8" id="core/Namespaces_6_2" title="Defined at ../Namespaces.sdf3 line 1">core/Namespaces</a> 
        <a href="../../terms/Vars.sdf3/#terms/Vars_1_8" id="terms/Vars_7_2" title="Defined at ../../terms/Vars.sdf3 line 1">terms/Vars</a>

<span class="keyword">lexical syntax</span>

  <span id="ScopeID_11_3" title="Not referenced">ScopeID</span> = <a href="../../common/Identifiers.sdf3/#Id_5_3" id="Id_11_13" title="Defined at ../../common/Identifiers.sdf3 line 5, 9, 11, 25, 26, 27">Id</a> 

<span class="keyword">context-free syntax</span>

  <a href="#LocalScope_18_56" id="LocalScope_15_3" title="Referenced at line 18, 21">LocalScope</a>.<span class="cons_Constructor"><span id="NamedScope_15_14" title="Not referenced">NamedScope</span></span> = &lt;&lt;<a href="../Namespaces.sdf3/#NamespaceRef_24_3" id="NamespaceRef_15_29" title="Defined at ../Namespaces.sdf3 line 24">NamespaceRef</a>&gt; &lt;<a href="../../terms/Vars.sdf3/#VarRef_10_11" id="VarRef_15_44" title="Defined at ../../terms/Vars.sdf3 line 10, 18, 19">VarRef</a>&gt;&gt; 
  <a href="#LocalScope_18_56" id="LocalScope_16_3" title="Referenced at line 18, 21">LocalScope</a>.<span class="cons_Constructor"><span id="CurrentScope_16_14" title="Not referenced">CurrentScope</span></span> = &lt;<span class="cons_String">current</span> &lt;<a href="../Namespaces.sdf3/#NamespaceRef_24_3" id="NamespaceRef_16_39" title="Defined at ../Namespaces.sdf3 line 24">NamespaceRef</a>&gt; <span class="cons_String">scope</span>&gt; 
  <a href="#LocalScope_18_56" id="LocalScope_17_3" title="Referenced at line 18, 21">LocalScope</a>.<span class="cons_Constructor"><span id="TermScope_17_14" title="Not referenced">TermScope</span></span> = &lt;&lt;<a href="../Namespaces.sdf3/#NamespaceRef_24_3" id="NamespaceRef_17_28" title="Defined at ../Namespaces.sdf3 line 24">NamespaceRef</a>&gt; <span class="cons_String">scope</span>  <span class="cons_String">at</span> &lt;<a href="../../terms/Vars.sdf3/#VarRef_10_11" id="VarRef_17_53" title="Defined at ../../terms/Vars.sdf3 line 10, 18, 19">VarRef</a>&gt;&gt; 
  <a href="#LocalScope_18_56" id="LocalScope_18_3" title="Referenced at line 18, 21">LocalScope</a>.<span class="cons_Constructor"><span id="Enclosing_18_14" title="Not referenced">Enclosing</span></span> = &lt;<span class="cons_String">enclosing</span> &lt;<a href="../Namespaces.sdf3/#NamespaceRef_24_3" id="NamespaceRef_18_38" title="Defined at ../Namespaces.sdf3 line 24">NamespaceRef</a>&gt; <span class="cons_String">of</span> &lt;<a href="#LocalScope_15_3" id="LocalScope_18_56" title="Defined at line 15, 16, 17, 18">LocalScope</a>&gt;&gt; 
  
  <button class="modal-open" id="Scope_20_3" title="Multi-file references" data-urls="#Scope_22_36 line 22, 27, 31; ../../formulas/Propositions.sdf3/#Scope_20_27 line 20">Scope</button>.<span class="cons_Constructor"><span id="GlobalScope_20_9" title="Not referenced">GlobalScope</span></span> = &lt;<span class="cons_String">global</span> <span class="cons_String">scope</span>&gt; 
  <button class="modal-open" id="Scope_21_3" title="Multi-file references" data-urls="#Scope_22_36 line 22, 27, 31; ../../formulas/Propositions.sdf3/#Scope_20_27 line 20">Scope</button> = &lt;&lt;<a href="#LocalScope_15_3" id="LocalScope_21_13" title="Defined at line 15, 16, 17, 18">LocalScope</a>&gt;&gt; 
  <button class="modal-open" id="Scope_22_3" title="Multi-file references" data-urls="#Scope_22_36 line 22, 27, 31; ../../formulas/Propositions.sdf3/#Scope_20_27 line 20">Scope</button>.<span class="cons_Constructor"><span id="Anonymous_22_9" title="Not referenced">Anonymous</span></span> = &lt;<span class="cons_String">new</span> <span class="cons_String">scope</span> <span class="cons_String">in</span> &lt;<a href="#Scope_20_3" id="Scope_22_36" title="Defined at line 20, 21, 22">Scope</a>&gt;&gt; 

<span class="keyword">context-free syntax</span>

  <span id="Clause_26_3" title="Not referenced">Clause</span>.<span class="cons_Constructor"><span id="ChildScope_26_10" title="Not referenced">ChildScope</span></span> = &lt;
    &lt;<a href="#Scope_20_3" id="Scope_27_6" title="Defined at line 20, 21, 22">Scope</a>&gt; <span class="cons_String">scopes</span> &lt;<a href="../Namespaces.sdf3/#NamespaceRef_24_3" id="NamespaceRef_27_21" title="Defined at ../Namespaces.sdf3 line 24">NamespaceRef</a>&gt; <span class="cons_String">at</span> <span class="cons_String">child</span> <span class="cons_String">nodes</span>
  &gt; 
  
  <span id="Clause_30_3" title="Not referenced">Clause</span>.<span class="cons_Constructor"><span id="SubsequentScope_30_10" title="Not referenced">SubsequentScope</span></span> = &lt;
    &lt;<a href="#Scope_20_3" id="Scope_31_6" title="Defined at line 20, 21, 22">Scope</a>&gt; <span class="cons_String">scopes</span> &lt;<a href="../Namespaces.sdf3/#NamespaceRef_24_3" id="NamespaceRef_31_21" title="Defined at ../Namespaces.sdf3 line 24">NamespaceRef</a>&gt; <span class="cons_String">at</span> <span class="cons_String">subsequent</span> <span class="cons_String">nodes</span>
  &gt; 
  
  <span id="Clause_34_3" title="Not referenced">Clause</span>.<span class="cons_Constructor"><span id="NodeScope_34_10" title="Not referenced">NodeScope</span></span> = &lt;
    <span class="cons_String">requires</span> &lt;<a href="../Namespaces.sdf3/#NamespaceRef_24_3" id="NamespaceRef_35_15" title="Defined at ../Namespaces.sdf3 line 24">NamespaceRef</a>&gt; <span class="cons_String">scope</span> <span class="cons_String">at</span> &lt;<a href="../../terms/Vars.sdf3/#VarRef_10_11" id="VarRef_35_39" title="Defined at ../../terms/Vars.sdf3 line 10, 18, 19">VarRef</a>&gt;
  &gt; 

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
