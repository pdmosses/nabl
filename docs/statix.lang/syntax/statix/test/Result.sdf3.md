---
title: Result.sdf3
---

# `Result.sdf3`

:simple-github: [pdmosses/nabl/statix.lang/syntax/statix/test/Result.sdf3]

[pdmosses/nabl/statix.lang/syntax/statix/test/Result.sdf3]: https://github.com/pdmosses/nabl/blob/master/statix.lang/syntax/statix/test/Result.sdf3 "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <span id="statix/test/Result_7_25" title="Not referenced locally, nor via imports">statix/test/Result</span>

<span class="keyword">imports</span>

  <a href="../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/statix.runtime.eclipse_2.6.0.20230609-133100-master/target/unpacked/latest/syntax/statix/API.sdf3#statix/API_7_17" id="statix/API_38_48" title="Defined at ../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/statix.runtime.eclipse_2.6.0.20230609-133100-master/target/unpacked/latest/syntax/statix/API.sdf3 line 1">statix/API</a>

  <a href="../../lang/Layout.sdf3#statix/lang/Layout_7_25" id="statix/lang/Layout_52_70" title="Defined at ../../lang/Layout.sdf3 line 1">statix/lang/Layout</a>
  <a href="../../lang/Common.sdf3#statix/lang/Common_7_25" id="statix/lang/Common_73_91" title="Defined at ../../lang/Common.sdf3 line 1">statix/lang/Common</a>
  <a href="../../lang/Core.sdf3#statix/lang/Core_7_23" id="statix/lang/Core_94_110" title="Defined at ../../lang/Core.sdf3 line 1">statix/lang/Core</a>
  <a href="../../lang/Sugar.sdf3#statix/lang/Sugar_7_24" id="statix/lang/Sugar_113_130" title="Defined at ../../lang/Sugar.sdf3 line 1">statix/lang/Sugar</a>
  <a href="../../lang/Deprecated.sdf3#statix/lang/Deprecated_7_29" id="statix/lang/Deprecated_133_155" title="Defined at ../../lang/Deprecated.sdf3 line 1">statix/lang/Deprecated</a>

  <a href="../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/statix.runtime.eclipse_2.6.0.20230609-133100-master/target/unpacked/latest/syntax/statix/runtime/ATerm.sdf3#statix/runtime/ATerm_7_27" id="statix/runtime/ATerm_159_179" title="Defined at ../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/statix.runtime.eclipse_2.6.0.20230609-133100-master/target/unpacked/latest/syntax/statix/runtime/ATerm.sdf3 line 1">statix/runtime/ATerm</a>
  <a href="../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/statix.runtime.eclipse_2.6.0.20230609-133100-master/target/unpacked/latest/syntax/statix/runtime/ScopeGraph.sdf3#statix/runtime/ScopeGraph_7_32" id="statix/runtime/ScopeGraph_182_207" title="Defined at ../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/statix.runtime.eclipse_2.6.0.20230609-133100-master/target/unpacked/latest/syntax/statix/runtime/ScopeGraph.sdf3 line 1">statix/runtime/ScopeGraph</a>


<span class="keyword">context-free syntax</span>

  <span id="TestResult_233_243" title="Not referenced locally, nor via imports">TestResult</span>.<span class="cons_Constructor"><span id="EvalResult_244_254" title="Not referenced locally, nor via imports">EvalResult</span></span> = &lt;
    &lt;<a href="#Solution_408_416" id="Solution_264_272" title="Defined at line 32">Solution</a>&gt;

    <span class="cons_String">errors</span>
      &lt;{<a href="#EditorMessage_758_771" id="EditorMessage_294_307" title="Defined at line 54">EditorMessage</a> <span class="cons_Lit">"\n"</span>}*&gt;

    <span class="cons_String">warnings</span>
      &lt;{<a href="#EditorMessage_758_771" id="EditorMessage_338_351" title="Defined at line 54">EditorMessage</a> <span class="cons_Lit">"\n"</span>}*&gt;

    <span class="cons_String">notes</span>
      &lt;{<a href="#EditorMessage_758_771" id="EditorMessage_379_392" title="Defined at line 54">EditorMessage</a> <span class="cons_Lit">"\n"</span>}*&gt;
  &gt;

  <a href="#Solution_264_272" id="Solution_408_416" title="Referenced at line 20">Solution</a>.<span class="cons_Constructor"><span id="Solution_417_425" title="Not referenced locally, nor via imports">Solution</span></span> = &lt;
    <span class="cons_String">substitution</span>
      &lt;{<a href="#SubstEntry_695_705" id="SubstEntry_455_465" title="Defined at line 50">SubstEntry</a> <span class="cons_Lit">"\n"</span>}*&gt;

    &lt;<a href="#Analysis_609_617" id="Analysis_480_488" title="Defined at line 43">Analysis</a>&gt;
  &gt;

<span class="keyword">context-free syntax</span>

  <span class="layout">// special pretty print rule in statix/runtime/pp to support printing blob analyses too</span>

  <a href="#Analysis_480_488" id="Analysis_609_617" title="Referenced at line 36">Analysis</a>.<span class="cons_Constructor"><span id="Analysis_618_626" title="Not referenced locally, nor via imports">Analysis</span></span> = &lt;
    <span class="cons_String">analysis</span>
      &lt;<a href="../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/statix.runtime.eclipse_2.6.0.20230609-133100-master/target/unpacked/latest/syntax/statix/runtime/ScopeGraph.sdf3#Stx-ScopeGraph_105_119" id="Stx-ScopeGraph_651_665" title="Defined at ../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/statix.runtime.eclipse_2.6.0.20230609-133100-master/target/unpacked/latest/syntax/statix/runtime/ScopeGraph.sdf3 line 12">Stx-ScopeGraph</a>&gt;
  &gt;

<span class="keyword">context-free syntax</span>

  <a href="#SubstEntry_455_465" id="SubstEntry_695_705" title="Referenced at line 34">SubstEntry</a> = [[<a href="../../lang/Core.sdf3#Var_7912_7915" id="Var_710_713" title="Defined at ../../lang/Core.sdf3 line 337, 338">Var</a>] <span class="cons_String">|-&gt;</span> [<a href="../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/statix.runtime.eclipse_2.6.0.20230609-133100-master/target/unpacked/latest/syntax/statix/runtime/ATerm.sdf3#Stx-ATerm_438_447" id="Stx-ATerm_720_729" title="Defined at ../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/statix.runtime.eclipse_2.6.0.20230609-133100-master/target/unpacked/latest/syntax/statix/runtime/ATerm.sdf3 line 18, 39, 40, 41, 42">Stx-ATerm</a>]]
  
<span class="keyword">context-free syntax</span>

  <a href="#EditorMessage_379_392" id="EditorMessage_758_771" title="Referenced at line 29">EditorMessage</a> = [[<a href="#MessagePos_807_817" id="MessagePos_776_786" title="Defined at line 56">MessagePos</a>] <span class="cons_String">:</span> [<a href="../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/statix.runtime.eclipse_2.6.0.20230609-133100-master/target/unpacked/latest/syntax/statix/API.sdf3#Stx-STRING_52_62" id="Stx-STRING_791_801" title="Defined at ../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/statix.runtime.eclipse_2.6.0.20230609-133100-master/target/unpacked/latest/syntax/statix/API.sdf3 line 6">Stx-STRING</a>]]

  <a href="#MessagePos_776_786" id="MessagePos_807_817" title="Referenced at line 54">MessagePos</a> = <span class="cons_Lit">"*"</span>

</code></pre></td></tr></tbody></table></div>