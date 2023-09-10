---
title: CGen.sdf3
---

# `CGen.sdf3`

:simple-github: [pdmosses/nabl/org.metaborg.meta.nabl2.lang/syntax/nabl2/lang/signatures/CGen.sdf3]

[pdmosses/nabl/org.metaborg.meta.nabl2.lang/syntax/nabl2/lang/signatures/CGen.sdf3]: https://github.com/pdmosses/nabl/blob/master/org.metaborg.meta.nabl2.lang/syntax/nabl2/lang/signatures/CGen.sdf3 "The source file on GitHub"

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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../Signature.sdf3#nabl2/lang/signatures/CGen_51_77" id="nabl2/lang/signatures/CGen_7_33" title="Referenced at ../Signature.sdf3 line 5">nabl2/lang/signatures/CGen</a>

<span class="keyword">imports</span>

  <a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20230609-133100-master/target/unpacked/latest/syntax/nabl2/shared/common/Sorts.sdf3#nabl2/shared/common/Sorts_7_32" id="nabl2/shared/common/Sorts_46_71" title="Defined at ../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20230609-133100-master/target/unpacked/latest/syntax/nabl2/shared/common/Sorts.sdf3 line 1">nabl2/shared/common/Sorts</a>
  <a href="../../rules/Names.sdf3#nabl2/lang/rules/Names_7_29" id="nabl2/lang/rules/Names_74_96" title="Defined at ../../rules/Names.sdf3 line 1">nabl2/lang/rules/Names</a>
  <a href="../../rules/CGen.sdf3#nabl2/lang/rules/CGen_7_28" id="nabl2/lang/rules/CGen_99_120" title="Defined at ../../rules/CGen.sdf3 line 1">nabl2/lang/rules/CGen</a>

<span class="keyword">template options</span>

  <span class="keyword">keyword</span> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\']

<span class="keyword">context-free syntax</span>

  <span id="NaBL2-Signature_192_207" title="Not referenced locally, nor via imports">NaBL2-Signature</span>.<span class="cons_Constructor"><span id="CGen_208_212" title="Not referenced locally, nor via imports">CGen</span></span> = &lt;
    <span class="cons_String">constraint</span> <span class="cons_String">generator</span>
      &lt;{<a href="#NaBL2-CGenSig_280_293" id="NaBL2-CGenSig_250_263" title="Defined at line 21, 22">NaBL2-CGenSig</a> <span class="cons_Lit">"\n"</span>}*&gt;

  &gt;

  <a href="#NaBL2-CGenSig_250_263" id="NaBL2-CGenSig_280_293" title="Referenced at line 17">NaBL2-CGenSig</a>.<span class="cons_Constructor"><span id="CGenInitSig_294_305" title="Not referenced locally, nor via imports">CGenInitSig</span></span> = &lt;<span class="cons_String">init</span> &lt;<a href="#NaBL2-CGenSigParams_477_496" id="NaBL2-CGenSigParams_315_334" title="Defined at line 24, 25">NaBL2-CGenSigParams</a>&gt; &lt;<a href="#NaBL2-CGenSigType_602_619" id="NaBL2-CGenSigType_337_354" title="Defined at line 27, 28">NaBL2-CGenSigType</a>&gt;&gt;
  <a href="#NaBL2-CGenSig_250_263" id="NaBL2-CGenSig_359_372" title="Referenced at line 17">NaBL2-CGenSig</a>.<span class="cons_Constructor"><span id="CGenSig_373_380" title="Not referenced locally, nor via imports">CGenSig</span></span>     = &lt;&lt;<a href="../../rules/Names.sdf3#NaBL2-CGenRuleDef_164_181" id="NaBL2-CGenRuleDef_389_406" title="Defined at ../../rules/Names.sdf3 line 14, 15, 16, 17">NaBL2-CGenRuleDef</a>&gt; <span class="cons_String">[[</span> &lt;<a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20230609-133100-master/target/unpacked/latest/syntax/nabl2/shared/common/Sorts.sdf3#NaBL2-SortRef_194_207" id="NaBL2-SortRef_412_425" title="Defined at ../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20230609-133100-master/target/unpacked/latest/syntax/nabl2/shared/common/Sorts.sdf3 line 15, 16, 17, 18, 19, 20, 21, 22, 23">NaBL2-SortRef</a>&gt; &lt;<a href="#NaBL2-CGenSigParams_477_496" id="NaBL2-CGenSigParams_428_447" title="Defined at line 24, 25">NaBL2-CGenSigParams</a>&gt; &lt;<a href="#NaBL2-CGenSigType_602_619" id="NaBL2-CGenSigType_450_467" title="Defined at line 27, 28">NaBL2-CGenSigType</a>&gt; <span class="cons_String">]]</span>&gt;
 
  <a href="#NaBL2-CGenSigParams_428_447" id="NaBL2-CGenSigParams_477_496" title="Referenced at line 22">NaBL2-CGenSigParams</a>   =                               {ast("[]")}
  <a href="#NaBL2-CGenSigParams_428_447" id="NaBL2-CGenSigParams_545_564" title="Referenced at line 22">NaBL2-CGenSigParams</a>   = &lt;<span class="cons_String">^</span> <span class="cons_String">(</span>&lt;{<a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20230609-133100-master/target/unpacked/latest/syntax/nabl2/shared/common/Sorts.sdf3#NaBL2-SortRef_194_207" id="NaBL2-SortRef_575_588" title="Defined at ../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20230609-133100-master/target/unpacked/latest/syntax/nabl2/shared/common/Sorts.sdf3 line 15, 16, 17, 18, 19, 20, 21, 22, 23">NaBL2-SortRef</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span>&gt;

  <a href="#NaBL2-CGenSigType_450_467" id="NaBL2-CGenSigType_602_619" title="Referenced at line 22">NaBL2-CGenSigType</a>.<span class="cons_Constructor"><span id="NoType_620_626" title="Not referenced locally, nor via imports">NoType</span></span> = &lt;&gt;
  <a href="#NaBL2-CGenSigType_450_467" id="NaBL2-CGenSigType_634_651" title="Referenced at line 22">NaBL2-CGenSigType</a>.<span class="cons_Constructor"><span id="Type_652_656" title="Not referenced locally, nor via imports">Type</span></span>   = &lt;<span class="cons_String">:</span> &lt;<a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20230609-133100-master/target/unpacked/latest/syntax/nabl2/shared/common/Sorts.sdf3#NaBL2-SortRef_194_207" id="NaBL2-SortRef_665_678" title="Defined at ../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20230609-133100-master/target/unpacked/latest/syntax/nabl2/shared/common/Sorts.sdf3 line 15, 16, 17, 18, 19, 20, 21, 22, 23">NaBL2-SortRef</a>&gt;&gt;

</code></pre></td></tr></tbody></table></div>