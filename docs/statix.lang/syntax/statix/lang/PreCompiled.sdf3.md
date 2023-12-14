---
title: PreCompiled.sdf3
hide:
  - toc
---

# `PreCompiled.sdf3`

:simple-github: [pdmosses/nabl/statix.lang/syntax/statix/lang/PreCompiled.sdf3]

[pdmosses/nabl/statix.lang/syntax/statix/lang/PreCompiled.sdf3]: https://github.com/pdmosses/nabl/blob/master/statix.lang/syntax/statix/lang/PreCompiled.sdf3 "The source file on GitHub"

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
67
68
69
70
71
72
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../../../StatixLang.sdf3/#statix/lang/PreCompiled_9_3" id="statix/lang/PreCompiled_1_8" title="Referenced at ../../../StatixLang.sdf3 line 9">statix/lang/PreCompiled</a>

<span class="keyword">imports</span>

  <a href="../Common.sdf3/#statix/lang/Common_1_8" id="statix/lang/Common_5_3" title="Defined at ../Common.sdf3 line 1">statix/lang/Common</a>
  <a href="../Core.sdf3/#statix/lang/Core_1_8" id="statix/lang/Core_6_3" title="Defined at ../Core.sdf3 line 1">statix/lang/Core</a>

<span class="keyword">lexical sorts</span>

  <a href="#ENVID_31_3" id="ENVID_10_3" title="Referenced at line 31, 72">ENVID</a>

<span class="keyword">context-free sorts</span>

  <span id="PreCompiledQuery_14_3" title="Not referenced">PreCompiledQuery</span>

  <a href="#State_39_11" id="State_16_3" title="Referenced at line 39">State</a>
  <a href="#StateId_48_6" id="StateId_17_3" title="Referenced at line 48">StateId</a>
  <a href="#StateRef_41_16" id="StateRef_18_3" title="Referenced at line 41, 64">StateRef</a>

  <a href="#RStep_49_9" id="RStep_20_3" title="Referenced at line 49">RStep</a>
  <a href="#RExp_58_32" id="RExp_21_3" title="Referenced at line 58, 70">RExp</a>
  <a href="#RVar_50_15" id="RVar_22_3" title="Referenced at line 50, 58, 66, 68, 70">RVar</a>
  <span id="RCond_23_3" title="Not referenced">RCond</span>

<span class="keyword">lexical syntax</span>

  <a href="#ENVID_31_3" id="ENVID_27_3" title="Referenced at line 31, 72">ENVID</a> = [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span>] [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\$\_\-]*

<span class="keyword">lexical restrictions</span>

  <a href="#ENVID_10_3" id="ENVID_31_3" title="Defined at line 10, 27">ENVID</a> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\$\_\-]

<span class="keyword">context-free syntax</span>

  <span id="Constraint_35_3" title="Not referenced">Constraint</span>.<span class="cons_Constructor"><span id="CPreCompiledQuery_35_14" title="Not referenced">CPreCompiledQuery</span></span> = [
    <span class="cons_String">compiled</span> [<a href="../Core.sdf3/#CResolveQuery_254_3" id="CResolveQuery_36_15" title="Defined at ../Core.sdf3 line 254">CResolveQuery</a>]
    <span class="cons_String">to</span>
      <span class="cons_String">states</span>
        [{<a href="#State_16_3" id="State_39_11" title="Defined at line 16, 47">State</a> <span class="cons_Lit">"\n\n"</span>}*]

      <span class="cons_String">initial</span> [<a href="#StateRef_18_3" id="StateRef_41_16" title="Defined at line 18, 54">StateRef</a>]
  ]


<span class="keyword">context-free syntax</span> <span class="layout">// States</span>

  <a href="#State_39_11" id="State_47_3" title="Referenced at line 39">State</a>.<span class="cons_Constructor"><span id="State_47_9" title="Not referenced">State</span></span> = &lt;
    &lt;<a href="#StateId_17_3" id="StateId_48_6" title="Defined at line 17, 53">StateId</a>&gt;<span class="cons_String">:</span>
      &lt;{<a href="#RStep_20_3" id="RStep_49_9" title="Defined at line 20, 58">RStep</a> <span class="cons_Lit">"\n"</span>}+&gt;
      <span class="cons_String">return</span> &lt;<a href="#RVar_22_3" id="RVar_50_15" title="Defined at line 22, 72">RVar</a>&gt;
  &gt;

  <a href="#StateId_48_6" id="StateId_53_3" title="Referenced at line 48">StateId</a>  = <a href="../Common.sdf3/#LCID_9_3" id="LCID_53_14" title="Defined at ../Common.sdf3 line 9">LCID</a>
  <a href="#StateRef_41_16" id="StateRef_54_3" title="Referenced at line 41, 64">StateRef</a> = <a href="../Common.sdf3/#LCID_9_3" id="LCID_54_14" title="Defined at ../Common.sdf3 line 9">LCID</a>

<span class="keyword">context-free syntax</span> <span class="layout">// Resolution steps</span>

  <a href="#RStep_49_9" id="RStep_58_3" title="Referenced at line 49">RStep</a>.<span class="cons_Constructor"><span id="Step_58_9" title="Not referenced">Step</span></span>     = &lt;&lt;<a href="#RVar_22_3" id="RVar_58_22" title="Defined at line 22, 72">RVar</a>&gt; <span class="cons_String">:=</span> &lt;<a href="#RExp_21_3" id="RExp_58_32" title="Defined at line 21, 62, 64, 66, 68, 70">RExp</a>&gt;&gt;

<span class="keyword">context-free syntax</span> <span class="layout">// Resolution expressions</span>

  <a href="#RExp_58_32" id="RExp_62_3" title="Referenced at line 58, 70">RExp</a>.<span class="cons_Constructor"><span id="Resolve_62_8" title="Not referenced">Resolve</span></span>   = &lt;<span class="cons_String">resolve</span>&gt;

  <a href="#RExp_58_32" id="RExp_64_3" title="Referenced at line 58, 70">RExp</a>.<span class="cons_Constructor"><span id="SubEnv_64_8" title="Not referenced">SubEnv</span></span>    = &lt;<span class="cons_String">subenv</span> &lt;<a href="../Core.sdf3/#RelRef_165_3" id="RelRef_64_29" title="Defined at ../Core.sdf3 line 165">RelRef</a>&gt; &lt;<a href="#StateRef_18_3" id="StateRef_64_38" title="Defined at line 18, 54">StateRef</a>&gt;&gt;

  <a href="#RExp_58_32" id="RExp_66_3" title="Referenced at line 58, 70">RExp</a>.<span class="cons_Constructor"><span id="Merge_66_8" title="Not referenced">Merge</span></span>     = &lt;<span class="cons_String">merge(</span>&lt;{<a href="#RVar_22_3" id="RVar_66_29" title="Defined at line 22, 72">RVar</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span>&gt;

  <a href="#RExp_58_32" id="RExp_68_3" title="Referenced at line 58, 70">RExp</a>.<span class="cons_Constructor"><span id="Shadow_68_8" title="Not referenced">Shadow</span></span>    = &lt;<span class="cons_String">shadow(</span>&lt;<a href="#RVar_22_3" id="RVar_68_29" title="Defined at line 22, 72">RVar</a>&gt;<span class="cons_String">,</span> &lt;<a href="#RVar_22_3" id="RVar_68_37" title="Defined at line 22, 72">RVar</a>&gt;<span class="cons_String">)</span>&gt;

  <a href="#RExp_58_32" id="RExp_70_3" title="Referenced at line 58, 70">RExp</a>.<span class="cons_Constructor"><span id="CExp_70_8" title="Not referenced">CExp</span></span>      = &lt;<span class="cons_String">if</span> <span class="cons_String">not</span> <span class="cons_String">empty</span> &lt;<a href="#RVar_22_3" id="RVar_70_35" title="Defined at line 22, 72">RVar</a>&gt; <span class="cons_String">else</span> &lt;<a href="#RExp_21_3" id="RExp_70_47" title="Defined at line 21, 62, 64, 66, 68, 70">RExp</a>&gt;&gt;

  <a href="#RVar_50_15" id="RVar_72_3" title="Referenced at line 50, 58, 66, 68, 70">RVar</a>.<span class="cons_Constructor"><span id="RVar_72_8" title="Not referenced">RVar</span></span>      = <a href="#ENVID_10_3" id="ENVID_72_20" title="Defined at line 10, 27">ENVID</a>

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
