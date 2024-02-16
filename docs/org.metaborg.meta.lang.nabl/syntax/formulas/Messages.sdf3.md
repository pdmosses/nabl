---
title: Messages.sdf3
hide:
  - toc
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
<td class="code"><pre><code><span class="keyword">module</span> <span id="formulas/Messages_1_8" title="a definition with no references">formulas/Messages</span>

<span class="keyword">imports</span>

  <a href="../../terms/Terms.sdf3/#terms/Terms_1_8" id="terms/Terms_5_3" title="a reference to a single-file definition">terms/Terms</a>

<span class="keyword">context-free syntax</span>

  <span id="Message_9_3" title="a definition with no references">Message</span>.<span class="cons_Constructor"><span id="Message_9_11" title="a definition with no references">Message</span></span> = &lt;&lt;<a href="#MessageKind_11_3" id="MessageKind_9_23" title="a reference to a single-file definition">MessageKind</a>&gt; &lt;<a href="../../terms/Terms.sdf3/#Term_29_3" id="Term_9_37" title="a reference to a single-file definition">Term</a>&gt; <span class="cons_String">on</span> &lt;<a href="../../terms/Terms.sdf3/#Term_29_3" id="Term_9_47" title="a reference to a single-file definition">Term</a>&gt;&gt; 
  
  <a href="#MessageKind_9_23" id="MessageKind_11_3" title="a definition with a single reference">MessageKind</a>.<span class="cons_Constructor"><span id="Error_11_15" title="a definition with no references">Error</span></span> = &lt;<span class="cons_String">error</span>&gt; 
  <a href="#MessageKind_9_23" id="MessageKind_12_3" title="a definition with a single reference">MessageKind</a>.<span class="cons_Constructor"><span id="Warning_12_15" title="a definition with no references">Warning</span></span> = &lt;<span class="cons_String">warning</span>&gt; 
  <a href="#MessageKind_9_23" id="MessageKind_13_3" title="a definition with a single reference">MessageKind</a>.<span class="cons_Constructor"><span id="Note_13_15" title="a definition with no references">Note</span></span> = &lt;<span class="cons_String">note</span>&gt; 

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
