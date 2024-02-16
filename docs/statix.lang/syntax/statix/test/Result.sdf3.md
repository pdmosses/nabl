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
<td class="code"><pre><code><span class="keyword">module</span> <span id="statix/test/Result_1_8" title="a definition with no references">statix/test/Result</span>

<span class="keyword">imports</span>

  <a href="../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/statix.runtime.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/statix/API.sdf3/#statix/API_1_8" id="statix/API_5_3" title="a reference to a single-file definition">statix/API</a>

  <a href="../../lang/Layout.sdf3/#statix/lang/Layout_1_8" id="statix/lang/Layout_7_3" title="a reference to a single-file definition">statix/lang/Layout</a>
  <a href="../../lang/Common.sdf3/#statix/lang/Common_1_8" id="statix/lang/Common_8_3" title="a reference to a single-file definition">statix/lang/Common</a>
  <a href="../../lang/Core.sdf3/#statix/lang/Core_1_8" id="statix/lang/Core_9_3" title="a reference to a single-file definition">statix/lang/Core</a>
  <a href="../../lang/Sugar.sdf3/#statix/lang/Sugar_1_8" id="statix/lang/Sugar_10_3" title="a reference to a single-file definition">statix/lang/Sugar</a>
  <a href="../../lang/Deprecated.sdf3/#statix/lang/Deprecated_1_8" id="statix/lang/Deprecated_11_3" title="a reference to a single-file definition">statix/lang/Deprecated</a>

  <a href="../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/statix.runtime.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/statix/runtime/ATerm.sdf3/#statix/runtime/ATerm_1_8" id="statix/runtime/ATerm_13_3" title="a reference to a single-file definition">statix/runtime/ATerm</a>
  <a href="../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/statix.runtime.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/statix/runtime/ScopeGraph.sdf3/#statix/runtime/ScopeGraph_1_8" id="statix/runtime/ScopeGraph_14_3" title="a reference to a single-file definition">statix/runtime/ScopeGraph</a>


<span class="keyword">context-free syntax</span>

  <span id="TestResult_19_3" title="a definition with no references">TestResult</span>.<span class="cons_Constructor"><span id="EvalResult_19_14" title="a definition with no references">EvalResult</span></span> = &lt;
    &lt;<a href="#Solution_32_3" id="Solution_20_6" title="a reference to a single-file definition">Solution</a>&gt;

    <span class="cons_String">errors</span>
      &lt;{<a href="#EditorMessage_54_3" id="EditorMessage_23_9" title="a reference to a single-file definition">EditorMessage</a> <span class="cons_Lit">"\n"</span>}*&gt;

    <span class="cons_String">warnings</span>
      &lt;{<a href="#EditorMessage_54_3" id="EditorMessage_26_9" title="a reference to a single-file definition">EditorMessage</a> <span class="cons_Lit">"\n"</span>}*&gt;

    <span class="cons_String">notes</span>
      &lt;{<a href="#EditorMessage_54_3" id="EditorMessage_29_9" title="a reference to a single-file definition">EditorMessage</a> <span class="cons_Lit">"\n"</span>}*&gt;
  &gt;

  <a href="#Solution_20_6" id="Solution_32_3" title="a definition with a single reference">Solution</a>.<span class="cons_Constructor"><span id="Solution_32_12" title="a definition with no references">Solution</span></span> = &lt;
    <span class="cons_String">substitution</span>
      &lt;{<a href="#SubstEntry_50_3" id="SubstEntry_34_9" title="a reference to a single-file definition">SubstEntry</a> <span class="cons_Lit">"\n"</span>}*&gt;

    &lt;<a href="#Analysis_43_3" id="Analysis_36_6" title="a reference to a single-file definition">Analysis</a>&gt;
  &gt;

<span class="keyword">context-free syntax</span>

  <span class="layout">// special pretty print rule in statix/runtime/pp to support printing blob analyses too</span>

  <a href="#Analysis_36_6" id="Analysis_43_3" title="a definition with a single reference">Analysis</a>.<span class="cons_Constructor"><span id="Analysis_43_12" title="a definition with no references">Analysis</span></span> = &lt;
    <span class="cons_String">analysis</span>
      &lt;<a href="../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/statix.runtime.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/statix/runtime/ScopeGraph.sdf3/#Stx-ScopeGraph_12_3" id="Stx-ScopeGraph_45_8" title="a reference to a single-file definition">Stx-ScopeGraph</a>&gt;
  &gt;

<span class="keyword">context-free syntax</span>

  <a href="#SubstEntry_34_9" id="SubstEntry_50_3" title="a definition with a single reference">SubstEntry</a> = [[<a href="../../lang/Core.sdf3/#Var_337_3" id="Var_50_18" title="a reference to a single-file definition">Var</a>] <span class="cons_String">|-&gt;</span> [<a href="../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/statix.runtime.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/statix/runtime/ATerm.sdf3/#Stx-ATerm_18_3" id="Stx-ATerm_50_28" title="a reference to a single-file definition">Stx-ATerm</a>]]
  
<span class="keyword">context-free syntax</span>

  <button class="modal-open" id="EditorMessage_54_3" title="a definition with multiple references" data-urls="#EditorMessage line 23_9, 26_9, 29_9">EditorMessage</button> = [[<a href="#MessagePos_56_3" id="MessagePos_54_21" title="a reference to a single-file definition">MessagePos</a>] <span class="cons_String">:</span> [<a href="../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/statix.runtime.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/statix/API.sdf3/#Stx-STRING_6_3" id="Stx-STRING_54_36" title="a reference to a single-file definition">Stx-STRING</a>]]

  <a href="#MessagePos_54_21" id="MessagePos_56_3" title="a definition with a single reference">MessagePos</a> = <span class="cons_Lit">"*"</span>

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
