---
title: Result.sdf3
hide:
  - toc
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
<td class="code"><pre><code><span class="keyword">module</span> <span id="statix/test/Result_1_8" title="Not referenced">statix/test/Result</span>

<span class="keyword">imports</span>

  <span title="External reference">statix/API</span>

  <a href="../../lang/Layout.sdf3/#statix/lang/Layout_1_8" id="statix/lang/Layout_7_3" title="Defined at ../../lang/Layout.sdf3 line 1">statix/lang/Layout</a>
  <a href="../../lang/Common.sdf3/#statix/lang/Common_1_8" id="statix/lang/Common_8_3" title="Defined at ../../lang/Common.sdf3 line 1">statix/lang/Common</a>
  <a href="../../lang/Core.sdf3/#statix/lang/Core_1_8" id="statix/lang/Core_9_3" title="Defined at ../../lang/Core.sdf3 line 1">statix/lang/Core</a>
  <a href="../../lang/Sugar.sdf3/#statix/lang/Sugar_1_8" id="statix/lang/Sugar_10_3" title="Defined at ../../lang/Sugar.sdf3 line 1">statix/lang/Sugar</a>
  <a href="../../lang/Deprecated.sdf3/#statix/lang/Deprecated_1_8" id="statix/lang/Deprecated_11_3" title="Defined at ../../lang/Deprecated.sdf3 line 1">statix/lang/Deprecated</a>

  <span title="External reference">statix/runtime/ATerm</span>
  <span title="External reference">statix/runtime/ScopeGraph</span>


<span class="keyword">context-free syntax</span>

  <span id="TestResult_19_3" title="Not referenced">TestResult</span>.<span class="cons_Constructor"><span id="EvalResult_19_14" title="Not referenced">EvalResult</span></span> = &lt;
    &lt;<a href="#Solution_32_3" id="Solution_20_6" title="Defined at line 32">Solution</a>&gt;

    <span class="cons_String">errors</span>
      &lt;{<a href="#EditorMessage_54_3" id="EditorMessage_23_9" title="Defined at line 54">EditorMessage</a> <span class="cons_Lit">"\n"</span>}*&gt;

    <span class="cons_String">warnings</span>
      &lt;{<a href="#EditorMessage_54_3" id="EditorMessage_26_9" title="Defined at line 54">EditorMessage</a> <span class="cons_Lit">"\n"</span>}*&gt;

    <span class="cons_String">notes</span>
      &lt;{<a href="#EditorMessage_54_3" id="EditorMessage_29_9" title="Defined at line 54">EditorMessage</a> <span class="cons_Lit">"\n"</span>}*&gt;
  &gt;

  <a href="#Solution_20_6" id="Solution_32_3" title="Referenced at line 20">Solution</a>.<span class="cons_Constructor"><span id="Solution_32_12" title="Not referenced">Solution</span></span> = &lt;
    <span class="cons_String">substitution</span>
      &lt;{<a href="#SubstEntry_50_3" id="SubstEntry_34_9" title="Defined at line 50">SubstEntry</a> <span class="cons_Lit">"\n"</span>}*&gt;

    &lt;<a href="#Analysis_43_3" id="Analysis_36_6" title="Defined at line 43">Analysis</a>&gt;
  &gt;

<span class="keyword">context-free syntax</span>

  <span class="layout">// special pretty print rule in statix/runtime/pp to support printing blob analyses too</span>

  <a href="#Analysis_36_6" id="Analysis_43_3" title="Referenced at line 36">Analysis</a>.<span class="cons_Constructor"><span id="Analysis_43_12" title="Not referenced">Analysis</span></span> = &lt;
    <span class="cons_String">analysis</span>
      &lt;<span title="External reference">Stx-ScopeGraph</span>&gt;
  &gt;

<span class="keyword">context-free syntax</span>

  <a href="#SubstEntry_34_9" id="SubstEntry_50_3" title="Referenced at line 34">SubstEntry</a> = [[<a href="../../lang/Core.sdf3/#Var_337_3" id="Var_50_18" title="Defined at ../../lang/Core.sdf3 line 337, 338">Var</a>] <span class="cons_String">|-&gt;</span> [<span title="External reference">Stx-ATerm</span>]]
  
<span class="keyword">context-free syntax</span>

  <a href="#EditorMessage_23_9" id="EditorMessage_54_3" title="Referenced at line 23, 26, 29">EditorMessage</a> = [[<a href="#MessagePos_56_3" id="MessagePos_54_21" title="Defined at line 56">MessagePos</a>] <span class="cons_String">:</span> [<span title="External reference">Stx-STRING</span>]]

  <a href="#MessagePos_54_21" id="MessagePos_56_3" title="Referenced at line 54">MessagePos</a> = <span class="cons_Lit">"*"</span>

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
