<template>
	<div class="hello">
		<h2>Hello there, {{ user.name }}!</h2>
		<h1>{{ msg }}</h1>
		<p>
			For a guide and recipes on how to configure / customize this
			project,<br />
			check out the
			<a
				href="https://cli.vuejs.org"
				target="_blank"
				rel="noopener noreferrer"
				>vue-cli documentation</a
			>.
		</p>
		<h3>Installed CLI Plugins</h3>
		<ul>
			<li>
				<a
					href="https://github.com/vuejs/vue-cli/tree/dev/packages/%40vue/cli-plugin-babel"
					target="_blank"
					rel="noopener noreferrer"
					>babel</a
				>
			</li>
			<li>
				<a
					href="https://github.com/vuejs/vue-cli/tree/dev/packages/%40vue/cli-plugin-eslint"
					target="_blank"
					rel="noopener noreferrer"
					>eslint</a
				>
			</li>
		</ul>
		<h3>Essential Links</h3>
		<ul>
			<li>
				<a
					href="https://vuejs.org"
					target="_blank"
					rel="noopener noreferrer"
					>Core Docs</a
				>
			</li>
			<li>
				<a
					href="https://forum.vuejs.org"
					target="_blank"
					rel="noopener noreferrer"
					>Forum</a
				>
			</li>
			<li>
				<a
					href="https://chat.vuejs.org"
					target="_blank"
					rel="noopener noreferrer"
					>Community Chat</a
				>
			</li>
			<li>
				<a
					href="https://twitter.com/vuejs"
					target="_blank"
					rel="noopener noreferrer"
					>Twitter</a
				>
			</li>
			<li>
				<a
					href="https://news.vuejs.org"
					target="_blank"
					rel="noopener noreferrer"
					>News</a
				>
			</li>
		</ul>
		<h3>Ecosystem</h3>
		<ul>
			<li>
				<a
					href="https://router.vuejs.org"
					target="_blank"
					rel="noopener noreferrer"
					>vue-router</a
				>
			</li>
			<li>
				<a
					href="https://vuex.vuejs.org"
					target="_blank"
					rel="noopener noreferrer"
					>vuex</a
				>
			</li>
			<li>
				<a
					href="https://github.com/vuejs/vue-devtools#vue-devtools"
					target="_blank"
					rel="noopener noreferrer"
					>vue-devtools</a
				>
			</li>
			<li>
				<a
					href="https://vue-loader.vuejs.org"
					target="_blank"
					rel="noopener noreferrer"
					>vue-loader</a
				>
			</li>
			<li>
				<a
					href="https://github.com/vuejs/awesome-vue"
					target="_blank"
					rel="noopener noreferrer"
					>awesome-vue</a
				>
			</li>
		</ul>
		<div class="button is-large" v-on:click="logout">Logout</div>
	</div>
</template>

<script>
import { LOG_OUT } from "@/store/action-types";
import { mapActions } from "vuex";

export default {
	name: "HelloWorld",
	props: {
		msg: String,
		user: Object
	},
	methods: {
		...mapActions({ logout: LOG_OUT })
	}
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h3 {
	margin: 40px 0 0;
}

ul {
	list-style-type: none;
	padding: 0;
}

li {
	display: inline-block;
	margin: 0 10px;
}

a {
	color: khaki;
}
</style>
