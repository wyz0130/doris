(window.webpackJsonp=window.webpackJsonp||[]).push([[17],{1070:function(e,t,n){"use strict";n.r(t),n.d(t,"default",(function(){return p}));var r=n(0),a=n.n(r),o=n(154),i=n.n(o),u=(n(153),n(160)),l=n.n(u),c=(n(159),n(117)),s=n(169),f=function(e,t){var n="function"==typeof Symbol&&e[Symbol.iterator];if(!n)return e;var r,a,o=n.call(e),i=[];try{for(;(void 0===t||t-- >0)&&!(r=o.next()).done;)i.push(r.value)}catch(e){a={error:e}}finally{try{r&&!r.done&&(n=o.return)&&n.call(o)}finally{if(a)throw a.error}}return i},d=l.a.Text,m=l.a.Title;function p(e){var t,n=f(Object(r.useState)({column_names:[],rows:[]}),2),o=n[0],u=n[1];return Object(r.useEffect)((function(){var e=new AbortController;return function(e){Object(c.g)({signal:e.signal}).then((function(e){e&&"success"===e.msg&&u(e.data)})).catch((function(e){}))}(e),function(){return e.abort()}}),[]),a.a.createElement(l.a,{style:{padding:"30px"}},a.a.createElement(m,null,"Session Info"),a.a.createElement(i.a,{style:{paddingBottom:"15px"}},a.a.createElement(d,{strong:!0},"This page lists the session info, there are ",null===(t=null==o?void 0:o.rows)||void 0===t?void 0:t.length," active sessions.")),a.a.createElement(s.a,{isSort:!0,isFilter:!0,allTableData:o,rowKey:function(e){return e.Id}}))}},117:function(e,t,n){"use strict";n.d(t,"k",(function(){return _})),n.d(t,"j",(function(){return w})),n.d(t,"e",(function(){return E})),n.d(t,"h",(function(){return O})),n.d(t,"f",(function(){return T})),n.d(t,"l",(function(){return S})),n.d(t,"g",(function(){return x})),n.d(t,"d",(function(){return j})),n.d(t,"c",(function(){return k})),n.d(t,"i",(function(){return P})),n.d(t,"b",(function(){return C})),n.d(t,"a",(function(){return U}));var r=n(118),a=n(0),o=n.n(a),i=n(123),u=n.n(i),l=(n(124),n(137)),c=n.n(l),s=(n(136),n(1080)),f=n(1060),d=n(13),m=n(1075),p=n(1061),h=function(){return(h=Object.assign||function(e){for(var t,n=1,r=arguments.length;n<r;n++)for(var a in t=arguments[n])Object.prototype.hasOwnProperty.call(t,a)&&(e[a]=t[a]);return e}).apply(this,arguments)},b=function(e,t,n,r){return new(n||(n=Promise))((function(a,o){function i(e){try{l(r.next(e))}catch(e){o(e)}}function u(e){try{l(r.throw(e))}catch(e){o(e)}}function l(e){var t;e.done?a(e.value):(t=e.value,t instanceof n?t:new n((function(e){e(t)}))).then(i,u)}l((r=r.apply(e,t||[])).next())}))},v=function(e,t){var n,r,a,o,i={label:0,sent:function(){if(1&a[0])throw a[1];return a[1]},trys:[],ops:[]};return o={next:u(0),throw:u(1),return:u(2)},"function"==typeof Symbol&&(o[Symbol.iterator]=function(){return this}),o;function u(o){return function(u){return function(o){if(n)throw new TypeError("Generator is already executing.");for(;i;)try{if(n=1,r&&(a=2&o[0]?r.return:o[0]?r.throw||((a=r.return)&&a.call(r),0):r.next)&&!(a=a.call(r,o[1])).done)return a;switch(r=0,a&&(o=[2&o[0],a.value]),o[0]){case 0:case 1:a=o;break;case 4:return i.label++,{value:o[1],done:!1};case 5:i.label++,r=o[1],o=[0];continue;case 7:o=i.ops.pop(),i.trys.pop();continue;default:if(!(a=i.trys,(a=a.length>0&&a[a.length-1])||6!==o[0]&&2!==o[0])){i=0;continue}if(3===o[0]&&(!a||o[1]>a[0]&&o[1]<a[3])){i.label=o[1];break}if(6===o[0]&&i.label<a[1]){i.label=a[1],a=o;break}if(a&&i.label<a[2]){i.label=a[2],i.ops.push(o);break}a[2]&&i.ops.pop(),i.trys.pop();continue}o=t.call(e,i)}catch(e){o=[6,e],r=0}finally{n=a=0}if(5&o[0])throw o[1];return{value:o[0]?o[1]:void 0,done:!0}}([o,u])}}};function g(e,t,n,r,a){return void 0===t&&(t={}),void 0===n&&(n=!1),void 0===r&&(r=!0),void 0===a&&(a=!1),b(this,void 0,void 0,(function(){var i,l,b,g,y,_,w;return v(this,(function(v){switch(v.label){case 0:return localStorage.getItem("username")||!1!==e.includes("login")?(i=Object(d.b)(),"POST"!==(l=h({credentials:"include"},t)).method&&"PUT"!==l.method||(l.headers=l.isUpload?h({},l.headers):h({"Content-Type":"application/json; charset=utf-8"},l.headers)),"object"!=typeof l.body||l.isUpload||(l.body=JSON.stringify(l.body)),i&&"/"!==i&&(e=i+e),[4,fetch(e,l)]):(function(){var e=document.cookie.match(/[^ =;]+(?=\=)/g);if(e)for(var t=e.length;t--;)document.cookie=e[t]+"=0;expires="+new Date(0).toUTCString()}(),c.a.confirm({title:o.a.createElement(f.a,null,"tips"),icon:o.a.createElement(s.a,null),content:o.a.createElement(f.a,null,"loginExpirtMsg"),onOk:function(){window.location.href=window.location.origin+Object(d.b)()+"/login"},onCancel:function(){}}),[2]);case 1:return!(b=v.sent()).url.includes("dataIntegrationApi")||"PUT"!==l.method&&"POST"!==l.method&&"DELETE"!==l.method?(function(e){if(e.status>=200&&e.status<300)return e;if(401!==e.status){var t=new Error(e.statusText);throw t.response=e,u.a.error(e.statusText),t}c.a.confirm({title:o.a.createElement(f.a,null,"tips"),icon:o.a.createElement(s.a,null),content:o.a.createElement(f.a,null,"loginExpirtMsg"),onOk:function(){window.location.href=window.location.origin+Object(d.b)()+"/login"},onCancel:function(){}})}(b),t&&t.download?[2,b.blob()]:[4,b.json()]):[2,b];case 2:return("code"in(g=v.sent())||"msg"in g)&&(y=g.code,_=g.msg,401===y&&"Cookie is invalid"===g.data?c.a.confirm({title:o.a.createElement(f.a,null,"tips"),icon:o.a.createElement(s.a,null),content:o.a.createElement(f.a,null,"loginExpirtMsg"),onOk:function(){window.location.href=window.location.origin+Object(d.b)()+"/login"},onCancel:function(){}}):401===y&&"Cookie is invalid"!==g.data?u.a.error({message:o.a.createElement(f.a,null,"loginWarning")}):"success"===_||0===y||200===y?n&&u.a.success({message:o.a.createElement(f.a,null,"successfulOperation"),description:_}):r&&0!==y&&""!==_&&(w=o.a.createElement(m.a,{language:"sql",style:h(h({},p.a),{width:"300px"})},g.data),u.a.error({message:_,description:w}))),a?[2,{data:g,response:b}]:[2,g]}}))}))}var y=function(){return(y=Object.assign||function(e){for(var t,n=1,r=arguments.length;n<r;n++)for(var a in t=arguments[n])Object.prototype.hasOwnProperty.call(t,a)&&(e[a]=t[a]);return e}).apply(this,arguments)};function _(e){return g("/rest/v1/login",{method:"POST",headers:{Authorization:e.password?"Basic "+btoa(e.username+":"+e.password):"Basic "+btoa(e.username+":")}})}function w(){return g("/rest/v1/logout",{method:"POST"})}function E(){return g("/rest/v1/hardware_info/fe/",{method:"GET"})}function O(e){return g("/rest/v1/system"+e.path,y({method:"GET"},e))}function T(e){var t="/rest/v1/log";return e.add_verbose&&(t="/rest/v1/log?add_verbose="+e.add_verbose),e.del_verbose&&(t="/rest/v1/log?del_verbose="+e.del_verbose),g(t,y({method:e.add_verbose||e.del_verbose?"POST":"GET"},e))}function S(e){var t="/rest/v1/query_profile/";return e.path&&(t="/rest/v1/query_profile/"+e.path),g(t,e)}function x(e){return g("/rest/v1/session",e)}function j(e){return g("/rest/v1/config/fe/",e)}function k(e){var t={label:e.label,columns:e.columns,column_separator:e.column_separator};return t.columns||delete t.columns,g("/api/default_cluster/"+e.db_name+"/"+e.tbl_name+"/upload?file_id="+e.file_id+"&file_uuid="+e.file_uuid,{method:"PUT",headers:t})}function P(e){var t="/api/default_cluster/"+e.db_name+"/"+e.tbl_name+"/upload";return e.preview&&(t="/api/default_cluster/"+e.db_name+"/"+e.tbl_name+"/upload?file_id="+e.file_id+"&file_uuid="+e.file_uuid+"&preview=true"),g(t,{method:"GET"})}function C(e){return g("/api/default_cluster/"+e.db_name+"/"+e.tbl_name+"/upload?file_id="+e.file_id+"&file_uuid="+e.file_uuid,{method:"DELETE"})}var U={getDatabaseList:function(e){var t=r.a+"default_cluster/databases";return e&&(e.db_name&&(t+="/"+e.db_name+"/tables"),e.db_name&&e.tbl_name&&(t+="/"+e.tbl_name+"/schema")),g(t,e)},doQuery:function(e){return g("/api/query/default_cluster/"+e.db_name,y({method:"POST"},e))},doUp:k,getLog:T,queryProfile:S,logOut:w,getHardwareInfo:E,getUploadData:P,deleteUploadData:C}},118:function(e,t,n){"use strict";n.d(t,"a",(function(){return r})),n.d(t,"b",(function(){return a}));var r="/api/meta/namespaces/",a=150},169:function(e,t,n){"use strict";n.d(t,"a",(function(){return h}));var r=n(0),a=n.n(r),o=n(168),i=n.n(o),u=(n(167),n(201)),l=n.n(u),c=(n(195),n(152)),s=n.n(c),f=(n(144),n(1083)),d=n(18);function m(e,t,n,r,o,i,u){return r&&i&&-1!==i.indexOf(o)&&t.__hrefPaths?t.__hrefPaths[i.indexOf(o)].includes("http")?a.a.createElement("a",{href:t.__hrefPaths[i.indexOf(o)],target:"_blank"},e):"/"===location.search[location.search.length-1]?a.a.createElement(d.b,{to:u+location.search+e},e):a.a.createElement(d.b,{to:u+(location.search?location.search:r)+"/"+e},e):"\\N"===e?"-":e}n(51);var p=function(e,t){var n="function"==typeof Symbol&&e[Symbol.iterator];if(!n)return e;var r,a,o=n.call(e),i=[];try{for(;(void 0===t||t-- >0)&&!(r=o.next()).done;)i.push(r.value)}catch(e){a={error:e}}finally{try{r&&!r.done&&(n=o.return)&&n.call(o)}finally{if(a)throw a.error}}return i};function h(e){var t=e.isFilter,n=void 0!==t&&t,o=e.isSort,u=void 0!==o&&o,c=e.allTableData,d=e.isInner,h=e.isSystem,b=void 0!==h&&h,v=e.path,g=void 0===v?"":v,y=e.rowKey,_=p(Object(r.useState)([]),2),w=_[0],E=_[1],O=p(Object(r.useState)([]),2),T=O[0],S=O[1];function x(e){var t,n,r,a=(t=c.rows,n=e.target.value,r=[],t.forEach((function(e){Object.values(e).some((function(e){return"object"!=typeof e&&(e+"").includes(n)}))&&r.push(e)})),r);E(a)}var j=a.a.createElement(s.a,{placeholder:"Filter data",onChange:function(e){return x(e)}});return Object(r.useEffect)((function(){c.rows&&c.column_names&&(S(function(e,t,n,r,a){return e&&0!==e.length?e.map((function(e,o){return t?{title:e,dataIndex:e,className:"pr-25",key:e+o,sorter:function(t,n){return function(e,t,n){return"number"==typeof e[n]&&"number"==typeof t[n]?e[n]-t[n]:e[n].localeCompare(t[n])}(t,n,e)},render:function(t,o,i){return m(t,o,0,n,e,r,a)}}:{title:e,dataIndex:e,className:"pr-25",key:e+o,render:function(t,o,i){return m(t,o,0,n,e,r,a)}}})):[]}(c.column_names,u,d,c.href_columns||c.href_column,g)),E(c.rows))}),[c]),a.a.createElement("span",{className:"systemTable"},n?a.a.createElement(l.a,{className:b?"searchSystem":"search",content:j,trigger:"click"},a.a.createElement(f.a,null)):"",a.a.createElement(i.a,{columns:T,rowKey:function(e){return"function"==typeof y?y(e):"string"==typeof y?y:void 0},dataSource:w,scroll:{x:"max-content"},size:"small",bordered:!0,pagination:{size:"small",showTotal:function(e,t){return t[0]+"-"+t[1]+" of "+e+" items"},showSizeChanger:!0,showQuickJumper:!0,defaultPageSize:30}}))}}}]);