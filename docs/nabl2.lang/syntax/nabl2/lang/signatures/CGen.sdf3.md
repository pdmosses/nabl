---
title: CGen.sdf3
hide:
  - toc
---

# `CGen.sdf3`

:simple-github: [pdmosses/nabl/nabl2.lang/syntax/nabl2/lang/signatures/CGen.sdf3]

[pdmosses/nabl/nabl2.lang/syntax/nabl2/lang/signatures/CGen.sdf3]: https://github.com/pdmosses/nabl/blob/master/nabl2.lang/syntax/nabl2/lang/signatures/CGen.sdf3 "The source file on GitHub"

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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../Signature.sdf3/#nabl2/lang/signatures/CGen_5_3" id="nabl2/lang/signatures/CGen_1_8" title="Referenced at ../Signature.sdf3 line 5">nabl2/lang/signatures/CGen</a>

<span class="keyword">imports</span>

  <span title="External reference">nabl2/shared/common/Sorts</span>
  <a href="../../rules/Names.sdf3/#nabl2/lang/rules/Names_1_8" id="nabl2/lang/rules/Names_6_3" title="Defined at ../../rules/Names.sdf3 line 1">nabl2/lang/rules/Names</a>
  <a href="../../rules/CGen.sdf3/#nabl2/lang/rules/CGen_1_8" id="nabl2/lang/rules/CGen_7_3" title="Defined at ../../rules/CGen.sdf3 line 1">nabl2/lang/rules/CGen</a>

<span class="keyword">template options</span>

  <span class="keyword">keyword</span> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\']

<span class="keyword">context-free syntax</span>

  <span id="NaBL2-Signature_15_3" title="Not referenced">NaBL2-Signature</span>.<span class="cons_Constructor"><span id="CGen_15_19" title="Not referenced">CGen</span></span> = &lt;
    <span class="cons_String">constraint</span> <span class="cons_String">generator</span>
      &lt;{<a href="#NaBL2-CGenSig_21_3" id="NaBL2-CGenSig_17_9" title="Defined at line 21, 22">NaBL2-CGenSig</a> <span class="cons_Lit">"\n"</span>}*&gt;

  &gt;

  <a href="#NaBL2-CGenSig_17_9" id="NaBL2-CGenSig_21_3" title="Referenced at line 17">NaBL2-CGenSig</a>.<span class="cons_Constructor"><span id="CGenInitSig_21_17" title="Not referenced">CGenInitSig</span></span> = &lt;<span class="cons_String">init</span> &lt;<a href="#NaBL2-CGenSigParams_24_3" id="NaBL2-CGenSigParams_21_38" title="Defined at line 24, 25">NaBL2-CGenSigParams</a>&gt; &lt;<a href="#NaBL2-CGenSigType_27_3" id="NaBL2-CGenSigType_21_60" title="Defined at line 27, 28">NaBL2-CGenSigType</a>&gt;&gt;
  <a href="#NaBL2-CGenSig_17_9" id="NaBL2-CGenSig_22_3" title="Referenced at line 17">NaBL2-CGenSig</a>.<span class="cons_Constructor"><span id="CGenSig_22_17" title="Not referenced">CGenSig</span></span>     = &lt;&lt;<a href="../../rules/Names.sdf3/#NaBL2-CGenRuleDef_14_3" id="NaBL2-CGenRuleDef_22_33" title="Defined at ../../rules/Names.sdf3 line 14, 15, 16, 17">NaBL2-CGenRuleDef</a>&gt; <span class="cons_String">[[</span> &lt;<span title="External reference">NaBL2-SortRef</span>&gt; &lt;<a href="#NaBL2-CGenSigParams_24_3" id="NaBL2-CGenSigParams_22_72" title="Defined at line 24, 25">NaBL2-CGenSigParams</a>&gt; &lt;<a href="#NaBL2-CGenSigType_27_3" id="NaBL2-CGenSigType_22_94" title="Defined at line 27, 28">NaBL2-CGenSigType</a>&gt; <span class="cons_String">]]</span>&gt;
 
  <a href="#NaBL2-CGenSigParams_21_38" id="NaBL2-CGenSigParams_24_3" title="Referenced at line 21, 22">NaBL2-CGenSigParams</a>   =                               {<span class="cons_Unquoted">ast</span>(<span class="cons_Quoted">"[]"</span>)}
  <a href="#NaBL2-CGenSigParams_21_38" id="NaBL2-CGenSigParams_25_3" title="Referenced at line 21, 22">NaBL2-CGenSigParams</a>   = &lt;<span class="cons_String">^</span> <span class="cons_String">(</span>&lt;{<span title="External reference">NaBL2-SortRef</span> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span>&gt;

  <a href="#NaBL2-CGenSigType_21_60" id="NaBL2-CGenSigType_27_3" title="Referenced at line 21, 22">NaBL2-CGenSigType</a>.<span class="cons_Constructor"><span id="NoType_27_21" title="Not referenced">NoType</span></span> = &lt;&gt;
  <a href="#NaBL2-CGenSigType_21_60" id="NaBL2-CGenSigType_28_3" title="Referenced at line 21, 22">NaBL2-CGenSigType</a>.<span class="cons_Constructor"><span id="Type_28_21" title="Not referenced">Type</span></span>   = &lt;<span class="cons_String">:</span> &lt;<span title="External reference">NaBL2-SortRef</span>&gt;&gt;

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
