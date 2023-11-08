// Modal to display links to occurrences of a name in multiple files

// Comments and suggestions for improvment: p.d.mosses@tudelft.nl
// Caveat: Novice JS author

// TODO: Replace by a CSS-only modal (or add a no-js fallback)

// Get the modal elements
const modal = document.getElementById("modal-content");
const h2    = document.getElementById("modal-h2");
const p     = document.getElementById("modal-p");
const ul    = document.getElementById("modal-ul");
const close = document.getElementById("modal-close");
// TODO: If any of them are null, the rest of this file should be skipped.

// Get the buttona that open the modal
const btns =  document.getElementsByClassName("modal-open");

// Opening the modal

// Create a <li><a> element for a url
// TODO: Make more concise
function urlItem(url) {
  const href = document.createAttribute("href");
  href.value = url;

  const classAttr = document.createAttribute("class");
  classAttr.value = "modal-anchor";

  const a = document.createElement("a");
  let text = url.split("#")[0];
  if (text === "") {
    text = "this file";
  }
  else {
    text = text.slice(0, -1);
  }
  a.setAttributeNode(href);
  a.setAttributeNode(classAttr);
  a.textContent = text;

  const li = document.createElement("li");
  li.appendChild(a);
  return li;
}

// When the user clicks in any button, open the modal 
function btnClick(event) {
  const node = event.target.closest("button.modal-open");

  // Copy the button contents to a code element in the modal heading
  h2.replaceChildren();
  if (node.hasChildNodes()) {
    const code = document.createElement("code");
    const children = node.cloneNode(true).childNodes;
    for (const child of children) {
      code.appendChild(child);
    };
    h2.appendChild(code);
    // h2.insertAdjacentText("beforeend", " links");
  }
  // Copy the title to the paragraph element
  p.textContent = `${node.title}:`;
  // Copy the data-urls to hrefs of anchor items
  ul.replaceChildren();
  if (node) {
    const urls = node.dataset.urls.split(" ");
    for (const url of urls) {
      ul.appendChild(urlItem(url));
    };
  }
  // When the user clicks on any link, close the modal
  const anchors = document.getElementsByClassName("modal-anchor");
  for (const anchor of anchors) {
    anchor.addEventListener("click", closeModal);
  }
  // Move the modal below the button
  const nodeRect = node.getBoundingClientRect();
  const marginLeft = nodeRect.left + window.scrollX;
  const marginTop = nodeRect.bottom + window.scrollY;
  modal.style.margin = `${marginTop + "px"} 0 0 ${marginLeft + "px"}`;
  const pageLengthBefore = document.documentElement.scrollHeight;
  // Make the modal contents visible
  modal.style.display = "block";
  // If the modal is outside the page, show it above the button
  // Unfortunately, there is no reliable way to know this before changing the display
  if (document.documentElement.scrollHeight > pageLengthBefore) {
    const newMarginTop = marginTop - nodeRect.height - modal.getBoundingClientRect().height;
    modal.style.margin = `${newMarginTop + "px"} 0 0 ${marginLeft + "px"}`;
  }
}

for (const btn of btns) {
    btn.addEventListener("click", btnClick);
}

// Closing the modal

// When the user clicks on <span> (x), close the modal

function closeModal(event) {
  modal.style.display = "none";
  if (event.target.tagName === "A") {
    location = event.target.href;
  }
}

if (close) {
  close.addEventListener("click", closeModal);
}

// When the user clicks anywhere outside the modal, close it

function windowClick(event) {
  // Only close the modal when:
  // - it is currently open and
  // - the click is not aimed at a button that opens the modal and
  // - the click is outside the modal
  if (modal.style.display != "none"
      && event.target.parentNode.tagName != "BUTTON"
      && event.target.closest('#modal-content') == null) {
    closeModal(event);
  }
}

window.addEventListener("click", windowClick);
