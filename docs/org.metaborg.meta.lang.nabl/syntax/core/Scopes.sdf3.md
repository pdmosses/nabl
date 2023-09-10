---
title: Scopes.sdf3
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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../../formulas/Propositions.sdf3#core/Scopes_91_102" id="core/Scopes_7_18" title="Referenced at ../../formulas/Propositions.sdf3 line 8">core/Scopes</a>

<span class="keyword">imports</span> 

        <a href="../../common/Identifiers.sdf3#common/Identifiers_7_25" id="common/Identifiers_31_49" title="Defined at ../../common/Identifiers.sdf3 line 1">common/Identifiers</a>  
        <a href="../Namespaces.sdf3#core/Namespaces_7_22" id="core/Namespaces_53_68" title="Defined at ../Namespaces.sdf3 line 1">core/Namespaces</a> 
        <a href="../../terms/Vars.sdf3#terms/Vars_7_17" id="terms/Vars_71_81" title="Defined at ../../terms/Vars.sdf3 line 1">terms/Vars</a>

<span class="keyword">lexical syntax</span>

  <span id="ScopeID_101_108" title="Not referenced locally, nor via imports">ScopeID</span> = <a href="../../common/Identifiers.sdf3#Id_36_38" id="Id_111_113" title="Defined at ../../common/Identifiers.sdf3 line 5, 9, 11, 25, 26, 27">Id</a> 

<span class="keyword">context-free syntax</span>

  <a href="#LocalScope_434_444" id="LocalScope_139_149" title="Referenced at line 21">LocalScope</a>.<span class="cons_Constructor"><span id="NamedScope_150_160" title="Not referenced locally, nor via imports">NamedScope</span></span> = &lt;&lt;<a href="../Namespaces.sdf3#NamespaceRef_340_352" id="NamespaceRef_165_177" title="Defined at ../Namespaces.sdf3 line 24">NamespaceRef</a>&gt; &lt;<a href="../../terms/Vars.sdf3#VarRef_84_90" id="VarRef_180_186" title="Defined at ../../terms/Vars.sdf3 line 10, 18, 19">VarRef</a>&gt;&gt; 
  <a href="#LocalScope_434_444" id="LocalScope_192_202" title="Referenced at line 21">LocalScope</a>.<span class="cons_Constructor"><span id="CurrentScope_203_215" title="Not referenced locally, nor via imports">CurrentScope</span></span> = &lt;<span class="cons_String">current</span> &lt;<a href="../Namespaces.sdf3#NamespaceRef_340_352" id="NamespaceRef_228_240" title="Defined at ../Namespaces.sdf3 line 24">NamespaceRef</a>&gt; <span class="cons_String">scope</span>&gt; 
  <a href="#LocalScope_434_444" id="LocalScope_252_262" title="Referenced at line 21">LocalScope</a>.<span class="cons_Constructor"><span id="TermScope_263_272" title="Not referenced locally, nor via imports">TermScope</span></span> = &lt;&lt;<a href="../Namespaces.sdf3#NamespaceRef_340_352" id="NamespaceRef_277_289" title="Defined at ../Namespaces.sdf3 line 24">NamespaceRef</a>&gt; <span class="cons_String">scope</span>  <span class="cons_String">at</span> &lt;<a href="../../terms/Vars.sdf3#VarRef_84_90" id="VarRef_302_308" title="Defined at ../../terms/Vars.sdf3 line 10, 18, 19">VarRef</a>&gt;&gt; 
  <a href="#LocalScope_434_444" id="LocalScope_314_324" title="Referenced at line 21">LocalScope</a>.<span class="cons_Constructor"><span id="Enclosing_325_334" title="Not referenced locally, nor via imports">Enclosing</span></span> = &lt;<span class="cons_String">enclosing</span> &lt;<a href="../Namespaces.sdf3#NamespaceRef_340_352" id="NamespaceRef_349_361" title="Defined at ../Namespaces.sdf3 line 24">NamespaceRef</a>&gt; <span class="cons_String">of</span> &lt;<a href="#LocalScope_139_149" id="LocalScope_367_377" title="Defined at line 15, 16, 17, 18">LocalScope</a>&gt;&gt; 
  
  <a href="#Scope_629_634" id="Scope_386_391" title="Referenced at line 31; ../../formulas/Propositions.sdf3 line 20">Scope</a>.<span class="cons_Constructor"><span id="GlobalScope_392_403" title="Not referenced locally, nor via imports">GlobalScope</span></span> = &lt;<span class="cons_String">global</span> <span class="cons_String">scope</span>&gt; 
  <a href="#Scope_629_634" id="Scope_424_429" title="Referenced at line 31; ../../formulas/Propositions.sdf3 line 20">Scope</a> = &lt;&lt;<a href="#LocalScope_139_149" id="LocalScope_434_444" title="Defined at line 15, 16, 17, 18">LocalScope</a>&gt;&gt; 
  <a href="#Scope_629_634" id="Scope_450_455" title="Referenced at line 31; ../../formulas/Propositions.sdf3 line 20">Scope</a>.<span class="cons_Constructor"><span id="Anonymous_456_465" title="Not referenced locally, nor via imports">Anonymous</span></span> = &lt;<span class="cons_String">new</span> <span class="cons_String">scope</span> <span class="cons_String">in</span> &lt;<a href="#Scope_386_391" id="Scope_483_488" title="Defined at line 20, 21, 22">Scope</a>&gt;&gt; 

<span class="keyword">context-free syntax</span>

  <span id="Clause_516_522" title="Not referenced locally, nor via imports">Clause</span>.<span class="cons_Constructor"><span id="ChildScope_523_533" title="Not referenced locally, nor via imports">ChildScope</span></span> = &lt;
    &lt;<a href="#Scope_386_391" id="Scope_543_548" title="Defined at line 20, 21, 22">Scope</a>&gt; <span class="cons_String">scopes</span> &lt;<a href="../Namespaces.sdf3#NamespaceRef_340_352" id="NamespaceRef_558_570" title="Defined at ../Namespaces.sdf3 line 24">NamespaceRef</a>&gt; <span class="cons_String">at</span> <span class="cons_String">child</span> <span class="cons_String">nodes</span>
  &gt; 
  
  <span id="Clause_597_603" title="Not referenced locally, nor via imports">Clause</span>.<span class="cons_Constructor"><span id="SubsequentScope_604_619" title="Not referenced locally, nor via imports">SubsequentScope</span></span> = &lt;
    &lt;<a href="#Scope_386_391" id="Scope_629_634" title="Defined at line 20, 21, 22">Scope</a>&gt; <span class="cons_String">scopes</span> &lt;<a href="../Namespaces.sdf3#NamespaceRef_340_352" id="NamespaceRef_644_656" title="Defined at ../Namespaces.sdf3 line 24">NamespaceRef</a>&gt; <span class="cons_String">at</span> <span class="cons_String">subsequent</span> <span class="cons_String">nodes</span>
  &gt; 
  
  <span id="Clause_688_694" title="Not referenced locally, nor via imports">Clause</span>.<span class="cons_Constructor"><span id="NodeScope_695_704" title="Not referenced locally, nor via imports">NodeScope</span></span> = &lt;
    <span class="cons_String">requires</span> &lt;<a href="../Namespaces.sdf3#NamespaceRef_340_352" id="NamespaceRef_723_735" title="Defined at ../Namespaces.sdf3 line 24">NamespaceRef</a>&gt; <span class="cons_String">scope</span> <span class="cons_String">at</span> &lt;<a href="../../terms/Vars.sdf3#VarRef_84_90" id="VarRef_747_753" title="Defined at ../../terms/Vars.sdf3 line 10, 18, 19">VarRef</a>&gt;
  &gt; 

</code></pre></td></tr></tbody></table></div>