import React from "react";

const HomePage = ({ appName }) => {
    return (
        <div className="flex flex-col min-h-screen font-sans">
            {/* Hero Section */}
            <section className="bg-blue-600 text-white py-20 px-6 text-center">
                <h1 className="text-4xl md:text-5xl font-bold mb-4">
                    Manage Your Appointments Effortlessly
                </h1>
                <p className="text-lg md:text-xl mb-8">
                    {appName} is the easiest way to schedule, track, and manage appointments online.
                </p>
                <div className="flex justify-center gap-4">
                    <button className="bg-white text-blue-600 px-6 py-3 rounded font-semibold hover:bg-gray-100 transition">
                        Get Started
                    </button>
                    <button className="border border-white px-6 py-3 rounded font-semibold hover:bg-white hover:text-blue-600 transition">
                        Learn More
                    </button>
                </div>
            </section>

            {/* Features Section */}
            <section className="py-20 px-6 bg-gray-50 text-center">
                <h2 className="text-3xl font-bold mb-12">Features</h2>
                <div className="grid grid-cols-1 md:grid-cols-3 gap-8">
                    {[
                        { title: "Easy Scheduling", desc: "Schedule appointments quickly and easily with our intuitive interface." },
                        { title: "Notifications", desc: "Automatic email and SMS notifications to keep your clients on track." },
                        { title: "Analytics", desc: "Track appointment trends and improve your workflow with detailed reports." }
                    ].map((feature, idx) => (
                        <div key={idx} className="bg-white p-6 rounded shadow hover:shadow-lg transition">
                            <h3 className="font-semibold text-xl mb-2">{feature.title}</h3>
                            <p>{feature.desc}</p>
                        </div>
                    ))}
                </div>
            </section>

            {/* Call-to-Action Section */}
            <section className="py-20 px-6 bg-blue-600 text-white text-center">
                <h2 className="text-3xl font-bold mb-4">Ready to streamline your appointments?</h2>
                <button className="bg-white text-blue-600 px-8 py-3 rounded font-semibold hover:bg-gray-100 transition">
                    Sign Up Now
                </button>
            </section>
        </div>
    );
};

export default HomePage;
