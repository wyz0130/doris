(window.webpackJsonp=window.webpackJsonp||[]).push([[22],{1064:function(e,n,t){"use strict";t.r(n);var r=t(0),a=t.n(r),o=t(420),i=t.n(o),l=(t(419),t(152)),u=t.n(l),c=(t(144),t(131)),s=t.n(c),d=(t(133),t(381),t(1)),f=t(1062),m=t(117),p=t(91),b=t.n(p),h=(t(92),function(){return(h=Object.assign||function(e){for(var n,t=1,r=arguments.length;t<r;t++)for(var a in n=arguments[t])Object.prototype.hasOwnProperty.call(n,a)&&(e[a]=n[a]);return e}).apply(this,arguments)}),v=function(e,n){var t="function"==typeof Symbol&&e[Symbol.iterator];if(!t)return e;var r,a,o=t.call(e),i=[];try{for(;(void 0===n||n-- >0)&&!(r=o.next()).done;)i.push(r.value)}catch(e){a={error:e}}finally{try{r&&!r.done&&(t=o.return)&&t.call(o)}finally{if(a)throw a.error}}return i};n.default=function(){var e=Object(f.a)().t,n=v(Object(r.useState)(),2),t=n[0],o=n[1],l=Object(d.g)(),c={labelCol:{span:8},wrapperCol:{span:24},layout:c};return a.a.createElement("div",{className:[b.a.background,"login"].join(" ")},a.a.createElement("div",{className:b.a.logo}),a.a.createElement(i.a,h({},c,{name:"basic",initialValues:{remember:!0},onFinish:function(e){Object(m.k)(e).then((function(e){200===e.code&&(l.push("/home"),localStorage.setItem("username",t))}))},layout:"vertical",requiredMark:!1,onFinishFailed:function(e){console.log("Failed:",e)},className:b.a["login-form"]}),a.a.createElement(i.a.Item,{label:e("username"),name:"username",rules:[{required:!0,message:"Please input your username!"}]},a.a.createElement(u.a,{value:t,onChange:function(e){o(e.target.value)}})),a.a.createElement(i.a.Item,{label:e("password"),name:"password",rules:[{required:!1,message:"Please input your password!"}]},a.a.createElement(u.a.Password,null)),a.a.createElement(i.a.Item,h({},{wrapperCol:{span:24}}),a.a.createElement(s.a,{type:"primary",shape:"round",style:{width:"100%"},htmlType:"submit"},e("login")))))}},117:function(e,n,t){"use strict";t.d(n,"k",(function(){return y})),t.d(n,"j",(function(){return _})),t.d(n,"e",(function(){return E})),t.d(n,"h",(function(){return O})),t.d(n,"f",(function(){return T})),t.d(n,"l",(function(){return j})),t.d(n,"g",(function(){return k})),t.d(n,"d",(function(){return P})),t.d(n,"c",(function(){return S})),t.d(n,"i",(function(){return x})),t.d(n,"b",(function(){return C})),t.d(n,"a",(function(){return U}));var r=t(118),a=t(0),o=t.n(a),i=t(123),l=t.n(i),u=(t(124),t(137)),c=t.n(u),s=(t(136),t(1080)),d=t(1060),f=t(13),m=t(1075),p=t(1061),b=function(){return(b=Object.assign||function(e){for(var n,t=1,r=arguments.length;t<r;t++)for(var a in n=arguments[t])Object.prototype.hasOwnProperty.call(n,a)&&(e[a]=n[a]);return e}).apply(this,arguments)},h=function(e,n,t,r){return new(t||(t=Promise))((function(a,o){function i(e){try{u(r.next(e))}catch(e){o(e)}}function l(e){try{u(r.throw(e))}catch(e){o(e)}}function u(e){var n;e.done?a(e.value):(n=e.value,n instanceof t?n:new t((function(e){e(n)}))).then(i,l)}u((r=r.apply(e,n||[])).next())}))},v=function(e,n){var t,r,a,o,i={label:0,sent:function(){if(1&a[0])throw a[1];return a[1]},trys:[],ops:[]};return o={next:l(0),throw:l(1),return:l(2)},"function"==typeof Symbol&&(o[Symbol.iterator]=function(){return this}),o;function l(o){return function(l){return function(o){if(t)throw new TypeError("Generator is already executing.");for(;i;)try{if(t=1,r&&(a=2&o[0]?r.return:o[0]?r.throw||((a=r.return)&&a.call(r),0):r.next)&&!(a=a.call(r,o[1])).done)return a;switch(r=0,a&&(o=[2&o[0],a.value]),o[0]){case 0:case 1:a=o;break;case 4:return i.label++,{value:o[1],done:!1};case 5:i.label++,r=o[1],o=[0];continue;case 7:o=i.ops.pop(),i.trys.pop();continue;default:if(!(a=i.trys,(a=a.length>0&&a[a.length-1])||6!==o[0]&&2!==o[0])){i=0;continue}if(3===o[0]&&(!a||o[1]>a[0]&&o[1]<a[3])){i.label=o[1];break}if(6===o[0]&&i.label<a[1]){i.label=a[1],a=o;break}if(a&&i.label<a[2]){i.label=a[2],i.ops.push(o);break}a[2]&&i.ops.pop(),i.trys.pop();continue}o=n.call(e,i)}catch(e){o=[6,e],r=0}finally{t=a=0}if(5&o[0])throw o[1];return{value:o[0]?o[1]:void 0,done:!0}}([o,l])}}};function g(e,n,t,r,a){return void 0===n&&(n={}),void 0===t&&(t=!1),void 0===r&&(r=!0),void 0===a&&(a=!1),h(this,void 0,void 0,(function(){var i,u,h,g,w,y,_;return v(this,(function(v){switch(v.label){case 0:return localStorage.getItem("username")||!1!==e.includes("login")?(i=Object(f.b)(),"POST"!==(u=b({credentials:"include"},n)).method&&"PUT"!==u.method||(u.headers=u.isUpload?b({},u.headers):b({"Content-Type":"application/json; charset=utf-8"},u.headers)),"object"!=typeof u.body||u.isUpload||(u.body=JSON.stringify(u.body)),i&&"/"!==i&&(e=i+e),[4,fetch(e,u)]):(function(){var e=document.cookie.match(/[^ =;]+(?=\=)/g);if(e)for(var n=e.length;n--;)document.cookie=e[n]+"=0;expires="+new Date(0).toUTCString()}(),c.a.confirm({title:o.a.createElement(d.a,null,"tips"),icon:o.a.createElement(s.a,null),content:o.a.createElement(d.a,null,"loginExpirtMsg"),onOk:function(){window.location.href=window.location.origin+Object(f.b)()+"/login"},onCancel:function(){}}),[2]);case 1:return!(h=v.sent()).url.includes("dataIntegrationApi")||"PUT"!==u.method&&"POST"!==u.method&&"DELETE"!==u.method?(function(e){if(e.status>=200&&e.status<300)return e;if(401!==e.status){var n=new Error(e.statusText);throw n.response=e,l.a.error(e.statusText),n}c.a.confirm({title:o.a.createElement(d.a,null,"tips"),icon:o.a.createElement(s.a,null),content:o.a.createElement(d.a,null,"loginExpirtMsg"),onOk:function(){window.location.href=window.location.origin+Object(f.b)()+"/login"},onCancel:function(){}})}(h),n&&n.download?[2,h.blob()]:[4,h.json()]):[2,h];case 2:return("code"in(g=v.sent())||"msg"in g)&&(w=g.code,y=g.msg,401===w&&"Cookie is invalid"===g.data?c.a.confirm({title:o.a.createElement(d.a,null,"tips"),icon:o.a.createElement(s.a,null),content:o.a.createElement(d.a,null,"loginExpirtMsg"),onOk:function(){window.location.href=window.location.origin+Object(f.b)()+"/login"},onCancel:function(){}}):401===w&&"Cookie is invalid"!==g.data?l.a.error({message:o.a.createElement(d.a,null,"loginWarning")}):"success"===y||0===w||200===w?t&&l.a.success({message:o.a.createElement(d.a,null,"successfulOperation"),description:y}):r&&0!==w&&""!==y&&(_=o.a.createElement(m.a,{language:"sql",style:b(b({},p.a),{width:"300px"})},g.data),l.a.error({message:y,description:_}))),a?[2,{data:g,response:h}]:[2,g]}}))}))}var w=function(){return(w=Object.assign||function(e){for(var n,t=1,r=arguments.length;t<r;t++)for(var a in n=arguments[t])Object.prototype.hasOwnProperty.call(n,a)&&(e[a]=n[a]);return e}).apply(this,arguments)};function y(e){return g("/rest/v1/login",{method:"POST",headers:{Authorization:e.password?"Basic "+btoa(e.username+":"+e.password):"Basic "+btoa(e.username+":")}})}function _(){return g("/rest/v1/logout",{method:"POST"})}function E(){return g("/rest/v1/hardware_info/fe/",{method:"GET"})}function O(e){return g("/rest/v1/system"+e.path,w({method:"GET"},e))}function T(e){var n="/rest/v1/log";return e.add_verbose&&(n="/rest/v1/log?add_verbose="+e.add_verbose),e.del_verbose&&(n="/rest/v1/log?del_verbose="+e.del_verbose),g(n,w({method:e.add_verbose||e.del_verbose?"POST":"GET"},e))}function j(e){var n="/rest/v1/query_profile/";return e.path&&(n="/rest/v1/query_profile/"+e.path),g(n,e)}function k(e){return g("/rest/v1/session",e)}function P(e){return g("/rest/v1/config/fe/",e)}function S(e){var n={label:e.label,columns:e.columns,column_separator:e.column_separator};return n.columns||delete n.columns,g("/api/default_cluster/"+e.db_name+"/"+e.tbl_name+"/upload?file_id="+e.file_id+"&file_uuid="+e.file_uuid,{method:"PUT",headers:n})}function x(e){var n="/api/default_cluster/"+e.db_name+"/"+e.tbl_name+"/upload";return e.preview&&(n="/api/default_cluster/"+e.db_name+"/"+e.tbl_name+"/upload?file_id="+e.file_id+"&file_uuid="+e.file_uuid+"&preview=true"),g(n,{method:"GET"})}function C(e){return g("/api/default_cluster/"+e.db_name+"/"+e.tbl_name+"/upload?file_id="+e.file_id+"&file_uuid="+e.file_uuid,{method:"DELETE"})}var U={getDatabaseList:function(e){var n=r.a+"default_cluster/databases";return e&&(e.db_name&&(n+="/"+e.db_name+"/tables"),e.db_name&&e.tbl_name&&(n+="/"+e.tbl_name+"/schema")),g(n,e)},doQuery:function(e){return g("/api/query/default_cluster/"+e.db_name,w({method:"POST"},e))},doUp:S,getLog:T,queryProfile:j,logOut:_,getHardwareInfo:E,getUploadData:x,deleteUploadData:C}},118:function(e,n,t){"use strict";t.d(n,"a",(function(){return r})),t.d(n,"b",(function(){return a}));var r="/api/meta/namespaces/",a=150}}]);