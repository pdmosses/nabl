---
title: Messages.sdf3
---

# `Messages.sdf3`

:simple-github: [pdmosses/nabl/org.metaborg.meta.lang.nabl/syntax/formulas/Messages.sdf3]

[pdmosses/nabl/org.metaborg.meta.lang.nabl/syntax/formulas/Messages.sdf3]: https://github.com/pdmosses/nabl/blob/master/org.metaborg.meta.lang.nabl/syntax/formulas/Messages.sdf3 "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <span id="formulas/Messages_7_24" title="Not referenced locally, nor via imports">formulas/Messages</span>

<span class="keyword">imports</span>

  <a href="../../terms/Terms.sdf3#terms/Terms_7_18" id="terms/Terms_37_48" title="Defined at ../../terms/Terms.sdf3 line 1">terms/Terms</a>

<span class="keyword">context-free syntax</span>

  <span id="Message_73_80" title="Not referenced locally, nor via imports">Message</span>.<span class="cons_Constructor"><span id="Message_81_88" title="Not referenced locally, nor via imports">Message</span></span> = &lt;&lt;<a href="#MessageKind_130_141" id="MessageKind_93_104" title="Defined at line 11, 12, 13">MessageKind</a>&gt; &lt;<a href="../../terms/Terms.sdf3#Term_523_527" id="Term_107_111" title="Defined at ../../terms/Terms.sdf3 line 29, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42">Term</a>&gt; <span class="cons_String">on</span> &lt;<a href="../../terms/Terms.sdf3#Term_523_527" id="Term_117_121" title="Defined at ../../terms/Terms.sdf3 line 29, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42">Term</a>&gt;&gt; 
  
  <a href="#MessageKind_93_104" id="MessageKind_130_141" title="Referenced at line 9">MessageKind</a>.<span class="cons_Constructor"><span id="Error_142_147" title="Not referenced locally, nor via imports">Error</span></span> = &lt;<span class="cons_String">error</span>&gt; 
  <a href="#MessageKind_93_104" id="MessageKind_161_172" title="Referenced at line 9">MessageKind</a>.<span class="cons_Constructor"><span id="Warning_173_180" title="Not referenced locally, nor via imports">Warning</span></span> = &lt;<span class="cons_String">warning</span>&gt; 
  <a href="#MessageKind_93_104" id="MessageKind_196_207" title="Referenced at line 9">MessageKind</a>.<span class="cons_Constructor"><span id="Note_208_212" title="Not referenced locally, nor via imports">Note</span></span> = &lt;<span class="cons_String">note</span>&gt; 

</code></pre></td></tr></tbody></table></div>