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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../../../StatixLang.sdf3/#statix/lang/PreCompiled_111_134" id="statix/lang/PreCompiled_7_30" title="Referenced at ../../../StatixLang.sdf3 line 9">statix/lang/PreCompiled</a>

<span class="keyword">imports</span>

  <a href="../Common.sdf3/#statix/lang/Common_7_25" id="statix/lang/Common_43_61" title="Defined at ../Common.sdf3 line 1">statix/lang/Common</a>
  <a href="../Core.sdf3/#statix/lang/Core_7_23" id="statix/lang/Core_64_80" title="Defined at ../Core.sdf3 line 1">statix/lang/Core</a>

<span class="keyword">lexical sorts</span>

  <a href="#ENVID_286_291" id="ENVID_99_104" title="Referenced at line 31, 72">ENVID</a>

<span class="keyword">context-free sorts</span>

  <span id="PreCompiledQuery_128_144" title="Not referenced locally, nor via imports">PreCompiledQuery</span>

  <a href="#State_430_435" id="State_148_153" title="Referenced at line 39">State</a>
  <a href="#StateId_532_539" id="StateId_156_163" title="Referenced at line 48">StateId</a>
  <a href="#StateRef_462_470" id="StateRef_166_174" title="Referenced at line 41, 64">StateRef</a>

  <a href="#RStep_550_555" id="RStep_178_183" title="Referenced at line 49">RStep</a>
  <a href="#RExp_698_702" id="RExp_186_190" title="Referenced at line 58, 70">RExp</a>
  <a href="#RVar_578_582" id="RVar_193_197" title="Referenced at line 50, 58, 66, 68, 70">RVar</a>
  <span id="RCond_200_205" title="Not referenced locally, nor via imports">RCond</span>

<span class="keyword">lexical syntax</span>

  <a href="#ENVID_286_291" id="ENVID_225_230" title="Referenced at line 31, 72">ENVID</a> = [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span>] [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\$\_\-]*

<span class="keyword">lexical restrictions</span>

  <a href="#ENVID_99_104" id="ENVID_286_291" title="Defined at line 10, 27">ENVID</a> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\$\_\-]

<span class="keyword">context-free syntax</span>

  <span id="Constraint_338_348" title="Not referenced locally, nor via imports">Constraint</span>.<span class="cons_Constructor"><span id="CPreCompiledQuery_349_366" title="Not referenced locally, nor via imports">CPreCompiledQuery</span></span> = [
    <span class="cons_String">compiled</span> [<a href="../Core.sdf3/#CResolveQuery_5734_5747" id="CResolveQuery_385_398" title="Defined at ../Core.sdf3 line 254">CResolveQuery</a>]
    <span class="cons_String">to</span>
      <span class="cons_String">states</span>
        [{<a href="#State_148_153" id="State_430_435" title="Defined at line 16, 47">State</a> <span class="cons_Lit">"\n\n"</span>}*]

      <span class="cons_String">initial</span> [<a href="#StateRef_166_174" id="StateRef_462_470" title="Defined at line 18, 54">StateRef</a>]
  ]


<span class="keyword">context-free syntax</span> <span class="layout">// States</span>

  <a href="#State_430_435" id="State_511_516" title="Referenced at line 39">State</a>.<span class="cons_Constructor"><span id="State_517_522" title="Not referenced locally, nor via imports">State</span></span> = &lt;
    &lt;<a href="#StateId_156_163" id="StateId_532_539" title="Defined at line 17, 53">StateId</a>&gt;<span class="cons_String">:</span>
      &lt;{<a href="#RStep_178_183" id="RStep_550_555" title="Defined at line 20, 58">RStep</a> <span class="cons_Lit">"\n"</span>}+&gt;
      <span class="cons_String">return</span> &lt;<a href="#RVar_193_197" id="RVar_578_582" title="Defined at line 22, 72">RVar</a>&gt;
  &gt;

  <a href="#StateId_532_539" id="StateId_591_598" title="Referenced at line 48">StateId</a>  = <a href="../Common.sdf3/#LCID_131_135" id="LCID_602_606" title="Defined at ../Common.sdf3 line 9">LCID</a>
  <a href="#StateRef_462_470" id="StateRef_609_617" title="Referenced at line 41, 64">StateRef</a> = <a href="../Common.sdf3/#LCID_131_135" id="LCID_620_624" title="Defined at ../Common.sdf3 line 9">LCID</a>

<span class="keyword">context-free syntax</span> <span class="layout">// Resolution steps</span>

  <a href="#RStep_550_555" id="RStep_669_674" title="Referenced at line 49">RStep</a>.<span class="cons_Constructor"><span id="Step_675_679" title="Not referenced locally, nor via imports">Step</span></span>     = &lt;&lt;<a href="#RVar_193_197" id="RVar_688_692" title="Defined at line 22, 72">RVar</a>&gt; <span class="cons_String">:=</span> &lt;<a href="#RExp_186_190" id="RExp_698_702" title="Defined at line 21, 62, 64, 66, 68, 70">RExp</a>&gt;&gt;

<span class="keyword">context-free syntax</span> <span class="layout">// Resolution expressions</span>

  <a href="#RExp_698_702" id="RExp_755_759" title="Referenced at line 58, 70">RExp</a>.<span class="cons_Constructor"><span id="Resolve_760_767" title="Not referenced locally, nor via imports">Resolve</span></span>   = &lt;<span class="cons_String">resolve</span>&gt;

  <a href="#RExp_698_702" id="RExp_785_789" title="Referenced at line 58, 70">RExp</a>.<span class="cons_Constructor"><span id="SubEnv_790_796" title="Not referenced locally, nor via imports">SubEnv</span></span>    = &lt;<span class="cons_String">subenv</span> &lt;<a href="../Core.sdf3/#RelRef_3522_3528" id="RelRef_811_817" title="Defined at ../Core.sdf3 line 165">RelRef</a>&gt; &lt;<a href="#StateRef_166_174" id="StateRef_820_828" title="Defined at line 18, 54">StateRef</a>&gt;&gt;

  <a href="#RExp_698_702" id="RExp_834_838" title="Referenced at line 58, 70">RExp</a>.<span class="cons_Constructor"><span id="Merge_839_844" title="Not referenced locally, nor via imports">Merge</span></span>     = &lt;<span class="cons_String">merge(</span>&lt;{<a href="#RVar_193_197" id="RVar_860_864" title="Defined at line 22, 72">RVar</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span>&gt;

  <a href="#RExp_698_702" id="RExp_878_882" title="Referenced at line 58, 70">RExp</a>.<span class="cons_Constructor"><span id="Shadow_883_889" title="Not referenced locally, nor via imports">Shadow</span></span>    = &lt;<span class="cons_String">shadow(</span>&lt;<a href="#RVar_193_197" id="RVar_904_908" title="Defined at line 22, 72">RVar</a>&gt;<span class="cons_String">,</span> &lt;<a href="#RVar_193_197" id="RVar_912_916" title="Defined at line 22, 72">RVar</a>&gt;<span class="cons_String">)</span>&gt;

  <a href="#RExp_698_702" id="RExp_923_927" title="Referenced at line 58, 70">RExp</a>.<span class="cons_Constructor"><span id="CExp_928_932" title="Not referenced locally, nor via imports">CExp</span></span>      = &lt;<span class="cons_String">if</span> <span class="cons_String">not</span> <span class="cons_String">empty</span> &lt;<a href="#RVar_193_197" id="RVar_955_959" title="Defined at line 22, 72">RVar</a>&gt; <span class="cons_String">else</span> &lt;<a href="#RExp_186_190" id="RExp_967_971" title="Defined at line 21, 62, 64, 66, 68, 70">RExp</a>&gt;&gt;

  <a href="#RVar_578_582" id="RVar_977_981" title="Referenced at line 50, 58, 66, 68, 70">RVar</a>.<span class="cons_Constructor"><span id="RVar_982_986" title="Not referenced locally, nor via imports">RVar</span></span>      = <a href="#ENVID_99_104" id="ENVID_994_999" title="Defined at line 10, 27">ENVID</a>

</code></pre></td></tr></tbody></table></div>