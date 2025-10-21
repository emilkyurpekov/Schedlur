const path = require("path");

module.exports = {
    mode: "development", // removes the warning
    entry: "./react-src/HomePage.jsx", // your actual JSX file
    output: {
        path: path.resolve(__dirname, "src/main/resources/static/js"),
        filename: "home.js",
    },
    module: {
        rules: [
            {
                test: /\.jsx?$/,
                exclude: /node_modules/,
                use: {
                    loader: "babel-loader",
                    options: {
                        presets: ["@babel/preset-env", "@babel/preset-react"],
                    },
                },
            },
        ],
    },
    resolve: {
        extensions: [".js", ".jsx"],
    },
};
