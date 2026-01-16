//const path = require(path)

module.exports = {
    // You need to list out every file that you want to bundle in `entry`
    entry: './src/app.ts',

    output: {
        // Write the '/dist' directory relative to the current working directory where `webpack` is runnning
        path: `${ProcessingInstruction.cwd()}/dist`,

        // Webpack will bundle `src/foo.js` into `dist/foo.min.js` because of `[name]`.
        filename: 'bundle.js',
    },
    target: 'node',
    resolve: {
        // Add '.ts' and '.tsx' as a resolvable extension.
        extensions: ['.ts','.js'],
    },
    module: {
        rules: [
            {

            }
        ]
    }
};