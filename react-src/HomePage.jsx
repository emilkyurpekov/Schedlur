import React from "react";

export default function HomePage() {
    return (
        <div style={styles.container}>
            <header style={styles.header}>
                <h1 style={styles.title}>Schedlur</h1>
                <p style={styles.subtitle}>Лесно запазване на час за бизнеси и клиенти</p>

                <div style={styles.buttons}>
                    <a href="/register" style={styles.btnPrimary}>Създай акаунт</a>
                    <a href="/login" style={styles.btnSecondary}>Вход</a>
                </div>
            </header>

            <section style={styles.section}>
                <h2 style={styles.sectionTitle}>Защо Schedlur?</h2>
                <ul style={styles.features}>
                    <li>✔ Опростено запазване на часове и насрочване на срещи</li>
                    <li>✔ Бизнес анализи и табло за лесно управление на запазени часове</li>
                    <li>✔ Удобни за клиента процеси и функционалности </li>
                    <li>✔ Интеграция за Android, Google и iOS календар </li>
                    <li>✔ Автоматично напомняне чрез СМС и имейл 24ч преди часа </li>
                </ul>
            </section>
        </div>
    );
}

const styles = {
    container: {
        padding: "40px",
        fontFamily: "Arial, sans-serif"
    },
    header: {
        textAlign: "center",
        marginBottom: "50px"
    },
    title: {
        fontSize: "48px",
        fontWeight: "bold",
    },
    subtitle: {
        fontSize: "20px",
        marginTop: "10px"
    },
    buttons: {
        marginTop: "20px"
    },
    btnPrimary: {
        padding: "12px 20px",
        marginRight: "10px",
        backgroundColor: "black",
        color: "#fff",
        textDecoration: "none",
        borderRadius: "6px",
    },
    btnSecondary: {
        padding: "12px 20px",
        backgroundColor: "#6c757d",
        color: "#fff",
        textDecoration: "none",
        borderRadius: "6px",
    },
    section: {
        maxWidth: "600px",
        margin: "0 auto",
        textAlign: "center",
        textDecoration:"bold"

    },
    sectionTitle: {
        fontSize: "28px",
        marginBottom: "20px"
    },
    features: {
        listStyle: "none",
        padding: 0,
        fontSize: "18px",
        lineHeight: "32px"
    }
};
