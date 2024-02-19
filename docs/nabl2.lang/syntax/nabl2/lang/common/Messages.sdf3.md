---
title: Messages.sdf3
hide:
  - toc
---

# `Messages.sdf3`

:simple-github: [pdmosses/nabl/nabl2.lang/syntax/nabl2/lang/common/Messages.sdf3]

[pdmosses/nabl/nabl2.lang/syntax/nabl2/lang/common/Messages.sdf3]: https://github.com/pdmosses/nabl/blob/master/nabl2.lang/syntax/nabl2/lang/common/Messages.sdf3 "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../Main.sdf3/#nabl2/lang/common/Messages_8_3" id="nabl2/lang/common/Messages_1_8" title="a definition with a single reference">nabl2/lang/common/Messages</a>

<span class="keyword">imports</span>

  <a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/nabl2/shared/common/CTerms.sdf3/#nabl2/shared/common/CTerms_1_8" id="nabl2/shared/common/CTerms_5_3" title="a reference to a single-file definition">nabl2/shared/common/CTerms</a>
  <a href="../Terms.sdf3/#nabl2/lang/common/Terms_1_8" id="nabl2/lang/common/Terms_6_3" title="a reference to a single-file definition">nabl2/lang/common/Terms</a>

<span class="keyword">template options</span>

  <span class="keyword">keyword</span> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\_]

<span class="keyword">syntax</span>

  <span id="NaBL2-MessageContent_14_3" title="a definition with no references">NaBL2-MessageContent</span><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="Formatted_14_27" title="a definition with no references">Formatted</span></span> = <span class="cons_Lit">"$["</span> <a href="#NaBL2-MessageContentPart_21_3" id="NaBL2-MessageContentPart_14_44" title="a reference to a single-file definition">NaBL2-MessageContentPart</a><span class="keyword">-CF</span>* <span class="cons_Lit">"]"</span>

<span class="keyword">context-free syntax</span>

  <span id="NaBL2-MessageContent_18_3" title="a definition with no references">NaBL2-MessageContent</span>.<span class="cons_Constructor"><span id="Default_18_24" title="a definition with no references">Default</span></span>  =
  <span id="NaBL2-MessageContent_19_3" title="a definition with no references">NaBL2-MessageContent</span>          = <a href="../Terms.sdf3/#NaBL2-StringTerm_38_3" id="NaBL2-StringTerm_19_35" title="a reference to a single-file definition">NaBL2-StringTerm</a>

  <a href="#NaBL2-MessageContentPart_14_44" id="NaBL2-MessageContentPart_21_3" title="a definition with a single reference">NaBL2-MessageContentPart</a>.<span class="cons_Constructor"><span id="Term_21_28" title="a definition with no references">Term</span></span> = &lt;<span class="cons_String">[</span>&lt;<a href="../../../../../../../file:/Users/pdm/eclipse/spoofax-dev/Eclipse.app/Contents/Eclipse/plugins/org.metaborg.meta.nabl2.shared.eclipse_2.6.0.20231130-170231-master/target/unpacked/latest/syntax/nabl2/shared/common/CTerms.sdf3/#NaBL2-CTerm_13_3" id="NaBL2-CTerm_21_38" title="a reference to a single-file definition">NaBL2-CTerm</a>&gt;<span class="cons_String">]</span>&gt;
  <a href="#NaBL2-MessageContentPart_14_44" id="NaBL2-MessageContentPart_22_3" title="a definition with a single reference">NaBL2-MessageContentPart</a>.<span class="cons_Constructor"><span id="Text_22_28" title="a definition with no references">Text</span></span> = <a href="#NaBL2-MessageChars_26_3" id="NaBL2-MessageChars_22_35" title="a reference to a single-file definition">NaBL2-MessageChars</a>

<span class="keyword">lexical syntax</span>

  <button class="modal-open" id="NaBL2-MessageChars_26_3" title="a definition with multiple references" data-urls="#NaBL2-MessageChars line 22_35, 32_3">NaBL2-MessageChars</button> = <a href="#NaBL2-MessageChar_27_3" id="NaBL2-MessageChar_26_24" title="a reference to a single-file definition">NaBL2-MessageChar</a>+
  <a href="#NaBL2-MessageChar_26_24" id="NaBL2-MessageChar_27_3" title="a definition with a single reference">NaBL2-MessageChar</a>  = ~[\[\]\\\t\r\n]
  <a href="#NaBL2-MessageChar_26_24" id="NaBL2-MessageChar_28_3" title="a definition with a single reference">NaBL2-MessageChar</a>  = <span class="cons_Lit">"\\["</span> | <span class="cons_Lit">"\\]"</span> | <span class="cons_Lit">"\\\\"</span>

<span class="keyword">lexical restrictions</span>

  <a href="#NaBL2-MessageChars_26_3" id="NaBL2-MessageChars_32_3" title="a reference to a single-file definition">NaBL2-MessageChars</a> -/- ~[\[\]]

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
