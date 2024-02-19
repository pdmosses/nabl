---
title: NameResolution.sdf3
hide:
  - toc
---

# `NameResolution.sdf3`

:simple-github: [pdmosses/nabl/nabl2.lang/syntax/nabl2/lang/signatures/NameResolution.sdf3]

[pdmosses/nabl/nabl2.lang/syntax/nabl2/lang/signatures/NameResolution.sdf3]: https://github.com/pdmosses/nabl/blob/master/nabl2.lang/syntax/nabl2/lang/signatures/NameResolution.sdf3 "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../Signature.sdf3/#nabl2/lang/signatures/NameResolution_8_3" id="nabl2/lang/signatures/NameResolution_1_8" title="a definition with a single reference">nabl2/lang/signatures/NameResolution</a>

<span class="keyword">imports</span>

  <a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/nabl2/shared/common/Identifiers.sdf3/#nabl2/shared/common/Identifiers_1_8" id="nabl2/shared/common/Identifiers_5_3" title="a reference to a single-file definition">nabl2/shared/common/Identifiers</a>
  <a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/nabl2/shared/common/ScopeGraph.sdf3/#nabl2/shared/common/ScopeGraph_1_8" id="nabl2/shared/common/ScopeGraph_6_3" title="a reference to a single-file definition">nabl2/shared/common/ScopeGraph</a>
  <a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/nabl2/shared/common/Sorts.sdf3/#nabl2/shared/common/Sorts_1_8" id="nabl2/shared/common/Sorts_7_3" title="a reference to a single-file definition">nabl2/shared/common/Sorts</a>
  <a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/nabl2/shared/common/Resolution.sdf3/#nabl2/shared/common/Resolution_1_8" id="nabl2/shared/common/Resolution_8_3" title="a reference to a single-file definition">nabl2/shared/common/Resolution</a>

<span class="keyword">template options</span>

  <span class="keyword">keyword</span> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\']

<span class="keyword">context-free syntax</span>

  <a href="../Signature.sdf3/#NaBL2-Signature_19_9" id="NaBL2-Signature_16_3" title="a definition with a single reference">NaBL2-Signature</a>.<span class="cons_Constructor"><span id="NameResolution_16_19" title="a definition with no references">NameResolution</span></span> = &lt;
    <span class="cons_String">name</span> <span class="cons_String">resolution</span>
      &lt;{<a href="#NaBL2-NameResolutionParam_21_3" id="NaBL2-NameResolutionParam_18_9" title="a reference to a single-file definition">NaBL2-NameResolutionParam</a> <span class="cons_Lit">"\n\n"</span>}*&gt;
  &gt; {<span class="keyword">longest-match</span>}

  <a href="#NaBL2-NameResolutionParam_18_9" id="NaBL2-NameResolutionParam_21_3" title="a definition with a single reference">NaBL2-NameResolutionParam</a>.<span class="cons_Constructor"><span id="Labels_21_29" title="a definition with no references">Labels</span></span>        = &lt;<span class="cons_String">labels</span> &lt;{<a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/nabl2/shared/common/Resolution.sdf3/#NaBL2-PathLabel_24_3" id="NaBL2-PathLabel_21_55" title="a reference to a single-file definition">NaBL2-PathLabel</a> <span class="cons_Lit">" "</span>}*&gt;&gt;
  <a href="#NaBL2-NameResolutionParam_18_9" id="NaBL2-NameResolutionParam_22_3" title="a definition with a single reference">NaBL2-NameResolutionParam</a>.<span class="cons_Constructor"><span id="Order_22_29" title="a definition with no references">Order</span></span>         = &lt;<span class="cons_String">order</span> &lt;{<a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/nabl2/shared/common/Resolution.sdf3/#NaBL2-LabelOrder_52_3" id="NaBL2-LabelOrder_22_54" title="a reference to a single-file definition">NaBL2-LabelOrder</a> <span class="cons_Lit">",\n"</span>}*&gt;&gt;
  <a href="#NaBL2-NameResolutionParam_18_9" id="NaBL2-NameResolutionParam_23_3" title="a definition with a single reference">NaBL2-NameResolutionParam</a>.<span class="cons_Constructor"><span id="WF_23_29" title="a definition with no references">WF</span></span>            = &lt;<span class="cons_String">well-formedness</span> &lt;<a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/nabl2/shared/common/Resolution.sdf3/#NaBL2-LabelRE_43_3" id="NaBL2-LabelRE_23_63" title="a reference to a single-file definition">NaBL2-LabelRE</a>&gt;&gt;
  <a href="#NaBL2-NameResolutionParam_18_9" id="NaBL2-NameResolutionParam_24_3" title="a definition with a single reference">NaBL2-NameResolutionParam</a>.<span class="cons_Constructor"><span id="DefaultELabel_24_29" title="a definition with no references">DefaultELabel</span></span> = &lt;<span class="cons_String">default</span> <span class="cons_String">edge</span> <span class="cons_String">label</span> &lt;<a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/nabl2/shared/common/Resolution.sdf3/#NaBL2-PathLabel_24_3" id="NaBL2-PathLabel_24_66" title="a reference to a single-file definition">NaBL2-PathLabel</a>&gt;&gt;
  <a href="#NaBL2-NameResolutionParam_18_9" id="NaBL2-NameResolutionParam_25_3" title="a definition with a single reference">NaBL2-NameResolutionParam</a>.<span class="cons_Constructor"><span id="DefaultNLabel_25_29" title="a definition with no references">DefaultNLabel</span></span> = &lt;<span class="cons_String">default</span> <span class="cons_String">named</span> <span class="cons_String">label</span> &lt;<a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/nabl2/shared/common/Resolution.sdf3/#NaBL2-PathLabel_24_3" id="NaBL2-PathLabel_25_67" title="a reference to a single-file definition">NaBL2-PathLabel</a>&gt;&gt;
  <a href="#NaBL2-NameResolutionParam_18_9" id="NaBL2-NameResolutionParam_26_3" title="a definition with a single reference">NaBL2-NameResolutionParam</a>.<span class="cons_Constructor"><span id="Strategy_26_29" title="a definition with no references">Strategy</span></span>      = &lt;<span class="cons_String">strategy</span> &lt;<a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/nabl2/shared/common/Resolution.sdf3/#NaBL2-Strategy_14_3" id="NaBL2-Strategy_26_56" title="a reference to a single-file definition">NaBL2-Strategy</a>&gt;&gt;
  <a href="#NaBL2-NameResolutionParam_18_9" id="NaBL2-NameResolutionParam_27_3" title="a definition with a single reference">NaBL2-NameResolutionParam</a>.<span class="cons_Constructor"><span id="PathRelevance_27_29" title="a definition with no references">PathRelevance</span></span> = &lt;<span class="cons_String">paths</span> &lt;<a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/nabl2/shared/common/Resolution.sdf3/#NaBL2-Relevance_17_3" id="NaBL2-Relevance_27_53" title="a reference to a single-file definition">NaBL2-Relevance</a>&gt;&gt;

<span class="keyword">context-free syntax</span>

  <a href="../Signature.sdf3/#NaBL2-Signature_19_9" id="NaBL2-Signature_31_3" title="a definition with a single reference">NaBL2-Signature</a>.<span class="cons_Constructor"><span id="Namespaces_31_19" title="a definition with no references">Namespaces</span></span> = &lt;
    <span class="cons_String">namespaces</span>
      &lt;{<a href="#NaBL2-NamespaceDef_36_3" id="NaBL2-NamespaceDef_33_9" title="a reference to a single-file definition">NaBL2-NamespaceDef</a> <span class="cons_Lit">"\n\n"</span>}*&gt;
  &gt; {<span class="keyword">longest-match</span>}

  <a href="#NaBL2-NamespaceDef_33_9" id="NaBL2-NamespaceDef_36_3" title="a definition with a single reference">NaBL2-NamespaceDef</a>.<span class="cons_Constructor"><span id="NamespaceDef_36_22" title="a definition with no references">NamespaceDef</span></span> = &lt;&lt;<a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/nabl2/shared/common/ScopeGraph.sdf3/#NaBL2-Namespace_27_3" id="NaBL2-Namespace_36_39" title="a reference to a single-file definition">NaBL2-Namespace</a>&gt; &lt;<a href="#NaBL2-NamespaceType_38_3" id="NaBL2-NamespaceType_36_57" title="a reference to a single-file definition">NaBL2-NamespaceType</a>&gt; &lt;<a href="#NaBL2-NamespaceProperties_41_3" id="NaBL2-NamespaceProperties_36_79" title="a reference to a single-file definition">NaBL2-NamespaceProperties</a>&gt;&gt;

  <a href="#NaBL2-NamespaceType_36_57" id="NaBL2-NamespaceType_38_3" title="a definition with a single reference">NaBL2-NamespaceType</a>.<span class="cons_Constructor"><span id="NoType_38_23" title="a definition with no references">NoType</span></span>  =
  <a href="#NaBL2-NamespaceType_36_57" id="NaBL2-NamespaceType_39_3" title="a definition with a single reference">NaBL2-NamespaceType</a>.<span class="cons_Constructor"><span id="Type_39_23" title="a definition with no references">Type</span></span>    = &lt;<span class="cons_String">:</span> &lt;<a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/nabl2/shared/common/Sorts.sdf3/#NaBL2-SortRef_15_3" id="NaBL2-SortRef_39_37" title="a reference to a single-file definition">NaBL2-SortRef</a>&gt;&gt;

  <a href="#NaBL2-NamespaceProperties_36_79" id="NaBL2-NamespaceProperties_41_3" title="a definition with a single reference">NaBL2-NamespaceProperties</a> = &lt;<span class="cons_String">{</span> &lt;{<a href="#NaBL2-NamespaceProperty_44_3" id="NaBL2-NamespaceProperty_41_36" title="a reference to a single-file definition">NaBL2-NamespaceProperty</a> <span class="cons_Lit">",\n"</span>}*&gt; <span class="cons_String">}</span>&gt;
  <a href="#NaBL2-NamespaceProperties_36_79" id="NaBL2-NamespaceProperties_42_3" title="a definition with a single reference">NaBL2-NamespaceProperties</a> = {<span class="cons_Unquoted">ast</span>(<span class="cons_Quoted">"[]"</span>)}
  
  <a href="#NaBL2-NamespaceProperty_41_36" id="NaBL2-NamespaceProperty_44_3" title="a definition with a single reference">NaBL2-NamespaceProperty</a>.<span class="cons_Constructor"><span id="PropertyDef_44_27" title="a definition with no references">PropertyDef</span></span> = &lt;&lt;<a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/nabl2/shared/common/Identifiers.sdf3/#NaBL2-PropertyId_31_3" id="NaBL2-PropertyId_44_43" title="a reference to a single-file definition">NaBL2-PropertyId</a>&gt; <span class="cons_String">:</span> &lt;<a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/nabl2/shared/common/Sorts.sdf3/#NaBL2-SortRef_15_3" id="NaBL2-SortRef_44_64" title="a reference to a single-file definition">NaBL2-SortRef</a>&gt;&gt;

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
