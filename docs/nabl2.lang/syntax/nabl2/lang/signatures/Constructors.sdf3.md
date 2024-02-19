---
title: Constructors.sdf3
hide:
  - toc
---

# `Constructors.sdf3`

:simple-github: [pdmosses/nabl/nabl2.lang/syntax/nabl2/lang/signatures/Constructors.sdf3]

[pdmosses/nabl/nabl2.lang/syntax/nabl2/lang/signatures/Constructors.sdf3]: https://github.com/pdmosses/nabl/blob/master/nabl2.lang/syntax/nabl2/lang/signatures/Constructors.sdf3 "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../Signature.sdf3/#nabl2/lang/signatures/Constructors_6_3" id="nabl2/lang/signatures/Constructors_1_8" title="a definition with a single reference">nabl2/lang/signatures/Constructors</a>

<span class="keyword">imports</span>

  <a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/nabl2/shared/common/Identifiers.sdf3/#nabl2/shared/common/Identifiers_1_8" id="nabl2/shared/common/Identifiers_5_3" title="a reference to a single-file definition">nabl2/shared/common/Identifiers</a>
  <a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/nabl2/shared/common/Sorts.sdf3/#nabl2/shared/common/Sorts_1_8" id="nabl2/shared/common/Sorts_6_3" title="a reference to a single-file definition">nabl2/shared/common/Sorts</a>

<span class="keyword">template options</span>

  <span class="keyword">keyword</span> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\_\']

<span class="keyword">context-free syntax</span>

  <span id="NaBL2-Signature_14_3" title="a definition with no references">NaBL2-Signature</span>.<span class="cons_Constructor"><span id="Sorts_14_19" title="a definition with no references">Sorts</span></span> = &lt;
    <span class="cons_String">sorts</span>
      &lt;{<a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/nabl2/shared/common/Sorts.sdf3/#NaBL2-Sort_13_3" id="NaBL2-Sort_16_9" title="a reference to a single-file definition">NaBL2-Sort</a> <span class="cons_Lit">"\n"</span>}*&gt;
  &gt; {<span class="keyword">longest-match</span>}

  <span id="NaBL2-Signature_19_3" title="a definition with no references">NaBL2-Signature</span>.<span class="cons_Constructor"><span id="Constructors_19_19" title="a definition with no references">Constructors</span></span> = &lt;
    <span class="cons_String">constructors</span>
      &lt;{<a href="#NaBL2-OpDecl_24_3" id="NaBL2-OpDecl_21_9" title="a reference to a single-file definition">NaBL2-OpDecl</a> <span class="cons_Lit">"\n"</span>}*&gt;
  &gt; {<span class="keyword">longest-match</span>}

  <a href="#NaBL2-OpDecl_21_9" id="NaBL2-OpDecl_24_3" title="a definition with a single reference">NaBL2-OpDecl</a>.<span class="cons_Constructor"><span id="OpDecl_24_16" title="a definition with no references">OpDecl</span></span>        = [[<a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/nabl2/shared/common/Identifiers.sdf3/#NaBL2-OpId_22_3" id="NaBL2-OpId_24_34" title="a reference to a single-file definition">NaBL2-OpId</a>] <span class="cons_String">:</span> [{<a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/nabl2/shared/common/Sorts.sdf3/#NaBL2-SortRef_15_3" id="NaBL2-SortRef_24_50" title="a reference to a single-file definition">NaBL2-SortRef</a> <span class="cons_Lit">" * "</span>}*] <span class="cons_String">-&gt;</span> [<a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/nabl2/shared/common/Sorts.sdf3/#NaBL2-Sort_13_3" id="NaBL2-Sort_24_77" title="a reference to a single-file definition">NaBL2-Sort</a>]]
  <a href="#NaBL2-OpDecl_21_9" id="NaBL2-OpDecl_25_3" title="a definition with a single reference">NaBL2-OpDecl</a>.<span class="cons_Constructor"><span id="NullaryOpDecl_25_16" title="a definition with no references">NullaryOpDecl</span></span> = [[<a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/nabl2/shared/common/Identifiers.sdf3/#NaBL2-OpId_22_3" id="NaBL2-OpId_25_34" title="a reference to a single-file definition">NaBL2-OpId</a>] <span class="cons_String">:</span> [<a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/nabl2/shared/common/Sorts.sdf3/#NaBL2-Sort_13_3" id="NaBL2-Sort_25_49" title="a reference to a single-file definition">NaBL2-Sort</a>]]

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
